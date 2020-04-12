package RSL.repositories;

import RSL.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {

    User findByLogin (String login);

}
