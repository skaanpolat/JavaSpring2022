package kodlama.io.Devs.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlama.io.Devs.entities.Subtech;
@Repository
public interface SubtechRepository extends JpaRepository<Subtech, Integer> {

}
