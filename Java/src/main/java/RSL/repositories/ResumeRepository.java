package RSL.repositories;

import RSL.entities.Resume;
import org.springframework.data.repository.CrudRepository;

public interface ResumeRepository extends CrudRepository<Resume, Integer> {
}
