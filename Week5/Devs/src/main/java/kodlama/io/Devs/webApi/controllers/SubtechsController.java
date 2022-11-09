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
@RequestMapping("/api/subtechs")
public class SubtechsController {

	private SubtechService subtechService;

	@Autowired
	public SubtechsController(SubtechService subtechService) {
		super();
		this.subtechService = subtechService;
	}

	@GetMapping("/getAll")
	public List<GetAllSubtechsResponse> getAll() {
		return subtechService.getAll();
	}

	@PostMapping("/add")
	public void add(@RequestBody CreateSubtechRequest createSubtechRequest) {
		subtechService.add(createSubtechRequest);
	}

	@PutMapping("/update")
	public void update(@RequestBody UpdateSubtechRequest updateSubtechRequest) {
		subtechService.update(updateSubtechRequest);
	}

	@DeleteMapping("/delete")
	public void delete(@RequestBody DeleteSubtechRequest deleteSubtechRequest) {
		subtechService.delete(deleteSubtechRequest);
	}

}
