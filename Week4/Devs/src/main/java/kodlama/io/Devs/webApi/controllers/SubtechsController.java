package kodlama.io.Devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlama.io.Devs.business.abstracts.SubtechService;
import kodlama.io.Devs.business.requests.CreateSubtechRequest;
import kodlama.io.Devs.business.requests.DeleteSubtechRequest;
import kodlama.io.Devs.business.requests.UpdateSubtechRequest;
import kodlama.io.Devs.business.responses.GetAllSubtechsResponse;

@RestController
@RequestMapping("/api/Subtechs")
public class SubtechsController {

	private SubtechService subtechService;

	@Autowired
	public SubtechsController(SubtechService subtechService) {
		this.subtechService = subtechService;
	}
	
	@GetMapping("/getall")
	public List<GetAllSubtechsResponse> getall(){
		return subtechService.getall();
	}
	
	@PostMapping("/add")
	public void add(@RequestBody CreateSubtechRequest createSubtechRequest) {
		this.subtechService.add(createSubtechRequest);
	}
	
	@PutMapping("/update")
	public void update(@RequestBody UpdateSubtechRequest updateSubtechRequest) {
		this.subtechService.update(updateSubtechRequest);
	}
	
	@DeleteMapping("/deleteByid)")
	public void delete(@RequestBody DeleteSubtechRequest deleteSubtechRequest){
		
		this.subtechService.delete(deleteSubtechRequest);
	}
	
	
	
}
