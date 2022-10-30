package kodlama.io.Devs.dataAccess.abstracts;

import java.util.List;


import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;


public interface ProgrammingLanguageRepository {

	
	List<ProgrammingLanguage> getall();
	
	void add(int id,String name);
	void update();
	void delete(int id);
	
	
	}

