package kodlama.io.Devs.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlama.io.Devs.business.abstracts.SubtechService;
import kodlama.io.Devs.business.requests.CreateSubtechRequest;
import kodlama.io.Devs.business.requests.DeleteSubtechRequest;
import kodlama.io.Devs.business.requests.UpdateSubtechRequest;
import kodlama.io.Devs.business.responses.GetAllSubtechsResponse;
import kodlama.io.Devs.dataAccess.abstracts.SubtechRepository;
import kodlama.io.Devs.entities.Subtech;

@Service
public class SubtechManager implements SubtechService {

	private SubtechRepository subtechRepository;

	@Autowired
	public SubtechManager(SubtechRepository subtechRepository) {
		super();
		this.subtechRepository = subtechRepository;
	}

	@Override
	public List<GetAllSubtechsResponse> getAll() {

		List<Subtech> subtechs = subtechRepository.findAll();

		List<GetAllSubtechsResponse> subtechsResponse = new ArrayList<>();

		for (Subtech subtech : subtechs) {
			GetAllSubtechsResponse responseItem = new GetAllSubtechsResponse();
			responseItem.setId(subtech.getId());
			responseItem.setName(subtech.getName());
			subtechsResponse.add(responseItem);

		}

		return subtechsResponse;
	}

	@Override
	public void add(CreateSubtechRequest createSubtechRequest) {
		Subtech subtech = new Subtech();
		subtech.setName(createSubtechRequest.getName());
		this.subtechRepository.save(subtech);

	}

	@Override
	public void update(UpdateSubtechRequest updateSubtechRequest) {

		for (Subtech existingSubtech : subtechRepository.findAll()) {

			if (existingSubtech.getId() == updateSubtechRequest.getId()) {
				existingSubtech.setName(updateSubtechRequest.getName());
			}
		}
	}

	@Override
	public void delete(DeleteSubtechRequest deleteSubtechRequest) {
		subtechRepository.deleteById(deleteSubtechRequest.getId());

	}

}
