package kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Devs.business.requests.CreateLanguageRequest;
import kodlama.io.Devs.business.requests.DeleteLanguageRequest;
import kodlama.io.Devs.business.requests.UpdateLanguageRequest;
import kodlama.io.Devs.business.responses.GetAllLanguagesResponse;

public interface LanguageService {

	List<GetAllLanguagesResponse> getAll();
	
	void add(CreateLanguageRequest createLanguageRequest);
	void delete(DeleteLanguageRequest deleteLanguagesRequest);
	void update(UpdateLanguageRequest updateLanguageRequest);
}
