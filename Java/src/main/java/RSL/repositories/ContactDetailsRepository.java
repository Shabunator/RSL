package RSL.repositories;

import RSL.entities.ContactDetails;
import org.springframework.data.repository.CrudRepository;

public interface ContactDetailsRepository extends CrudRepository<ContactDetails, Integer> {
}
