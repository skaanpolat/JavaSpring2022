package kodlama.io.Devs.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import kodlama.io.Devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@Repository // Data access 
public class InMemoryProgrammingLangugeRepository implements ProgrammingLanguageRepository{
	
	List<ProgrammingLanguage> programmingLanguages;
	
	
	
	public InMemoryProgrammingLangugeRepository() {
		
		programmingLanguages = new ArrayList<ProgrammingLanguage>();
		
		programmingLanguages.add(new ProgrammingLanguage(1,"Java"));
		programmingLanguages.add(new ProgrammingLanguage(2,"Rust"));
		programmingLanguages.add(new ProgrammingLanguage(3,"Python"));
		programmingLanguages.add(new ProgrammingLanguage(4,"C++"));
		programmingLanguages.add(new ProgrammingLanguage(5,"C#"));
		
		
	}

	@Override
	public List<ProgrammingLanguage> getall() {
	
		return programmingLanguages;
	}

	

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void add(int id, String name) {
		programmingLanguages.add(new ProgrammingLanguage(id,name));
		
	}

	

}
