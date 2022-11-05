package kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

public interface ProgrammingLanguageService {

	List<ProgrammingLanguage> getall();
	
	String getById(int id);
	
	void add(int id,String name);
	void deleteById(int id);
	void update(String name, String newName);
}
