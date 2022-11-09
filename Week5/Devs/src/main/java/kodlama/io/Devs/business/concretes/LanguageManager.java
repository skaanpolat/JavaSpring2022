package kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Devs.business.abstracts.LanguageService;
import kodlama.io.Devs.business.requests.CreateLanguageRequest;
import kodlama.io.Devs.business.requests.DeleteLanguageRequest;
import kodlama.io.Devs.business.requests.UpdateLanguageRequest;
import kodlama.io.Devs.business.responses.GetAllLanguagesResponse;
import kodlama.io.Devs.dataAccess.abstracts.LanguageRepository;
import kodlama.io.Devs.entities.Language;

@Service
public class LanguageManager implements LanguageService {

	private LanguageRepository languageRepository;

	@Autowired
	public LanguageManager(LanguageRepository languageRepository) {
		super();
		this.languageRepository = languageRepository;
	}

	@Override
	public List<GetAllLanguagesResponse> getAll() {

		List<Language> languages = languageRepository.findAll();

		List<GetAllLanguagesResponse> languagesResponse = new ArrayList<>();

		for (Language language : languages) {
			GetAllLanguagesResponse responseItem = new GetAllLanguagesResponse();
			responseItem.setId(language.getId());
			responseItem.setName(language.getName());
			languagesResponse.add(responseItem);
		}

		return languagesResponse;
	}

	@Override
	public void add(CreateLanguageRequest createLanguageRequest) {
		Language language = new Language();
		language.setName(createLanguageRequest.getName());
		this.languageRepository.save(language);

	}

	@Override
	public void update(UpdateLanguageRequest updateLanguageRequest) {
		// Bedo warned.. id tutarsız olabilir
		for (Language existingLanguage : languageRepository.findAll()) {

			if (existingLanguage.getId() == updateLanguageRequest.getId()) {
				existingLanguage.setName(updateLanguageRequest.getName());
			}
		}
	}

	@Override
	public void delete(DeleteLanguageRequest deleteLanguagesRequest) {
		languageRepository.deleteById(deleteLanguagesRequest.getId());

	}

}
