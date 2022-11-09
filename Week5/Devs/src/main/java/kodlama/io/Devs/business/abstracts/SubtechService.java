package kodlama.io.Devs.business.abstracts;

import java.util.List;

import kodlama.io.Devs.business.requests.CreateSubtechRequest;
import kodlama.io.Devs.business.requests.DeleteSubtechRequest;
import kodlama.io.Devs.business.requests.UpdateSubtechRequest;
import kodlama.io.Devs.business.responses.GetAllSubtechsResponse;

public interface SubtechService {

	List<GetAllSubtechsResponse> getAll();
	
	void add(CreateSubtechRequest createSubtechRequest);
	void update(UpdateSubtechRequest updateSubtechRequest);
	void delete(DeleteSubtechRequest deleteSubtechRequest);
}
