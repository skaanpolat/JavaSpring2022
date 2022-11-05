package kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.Devs.entities.concretes.ProgrammingLanguage;

@RestController
@RequestMapping("/api/ProgrammingLanguages")
public class ProgrammingLanguagesController {

	private ProgrammingLanguageService programmingLanguageService;

	@Autowired
	public ProgrammingLanguagesController(ProgrammingLanguageService programmingLanguageService) {
		super();
		this.programmingLanguageService = programmingLanguageService;
	}
	
	@GetMapping("/getAll")
	public List<ProgrammingLanguage> getAll(){
		
		return programmingLanguageService.getall();
	};
	
	@GetMapping("/getById={id}")
	public String getById(@PathVariable int id) {
		
		return programmingLanguageService.getById(id);
		
	}
	
	@PostMapping("/addNew/{id}/{name}")
	public void add(@PathVariable int id, @PathVariable String name) {
		programmingLanguageService.add(id, name);
	}
	
	@DeleteMapping("/deleteById={id}")
	public void delete(@PathVariable int id) {
		programmingLanguageService.deleteById(id);
	}
	
	@PostMapping("/updateByName/{name}/{newName}")
	public void update(@PathVariable String name, @PathVariable String newName) {
		programmingLanguageService.update(name, newName);
	}
	
	
	
	
	
}
