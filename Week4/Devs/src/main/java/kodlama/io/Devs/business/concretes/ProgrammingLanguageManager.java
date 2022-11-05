package kodlama.io.Devs.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Service
public class ProgrammingLanguageManager implements ProgrammingLanguageService {

	private ProgrammingLanguageRepository programmingLanguageRepository;

	@Autowired
	public ProgrammingLanguageManager(ProgrammingLanguageRepository programmingLanguageRepository) {
		this.programmingLanguageRepository = programmingLanguageRepository;
	}

	@Override
	public List<ProgrammingLanguage> getall() {
		return programmingLanguageRepository.getall();
	}

	@Override
	public String getById(int id) {

		for (ProgrammingLanguage programmingLanguage : programmingLanguageRepository.getall()) {

			if (programmingLanguage.getId() == id) {
				return programmingLanguage.getName();

			}

		}
		throw new IllegalArgumentException("Geçersiz ID");

	}

	@Override
	public void add(int id, String name) {

		if (name.isEmpty()) {
			throw new IllegalArgumentException("Eklenmek istenen dilin isim bilgisi boş olamaz!");

		} else {

			for (int i = 0; i < programmingLanguageRepository.getall().size(); i++) {

				if (programmingLanguageRepository.getall().get(i).getId() == id) {
					throw new IllegalArgumentException("ID zaten mevcut!");
				}
				if (programmingLanguageRepository.getall().get(i).getName().equals(name)) {
					throw new IllegalArgumentException("İsim zaten mevcut!");
				}
			}
			programmingLanguageRepository.add(id, name);

		}

	}

	@Override
	public void deleteById(int id) {
		

		for (int i = 0; i < programmingLanguageRepository.getall().size(); i++) {

			if (programmingLanguageRepository.getall().get(i).getId() == id) {

				programmingLanguageRepository.getall().remove(programmingLanguageRepository.getall().get(i));

			}

		}  
		
	}

	@Override
	public void update(String name,String newName) {
		
		for(int i = 0 ; i<programmingLanguageRepository.getall().size();i++) {
			
			if( programmingLanguageRepository.getall().get(i).getName().equals(name)) {
				
				programmingLanguageRepository.getall().get(i).setName(newName);
			}
		}

	}

}
