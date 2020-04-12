package RSL.services;

import RSL.entities.Resume;
import RSL.entities.User;

import java.sql.PreparedStatement;
import java.util.List;

public interface UserService {

    // CREATE
    User save(User user);

    // READ
    User getById(Integer id);

    User getByLogin(String login);

    List<User> getUserList();

   // UPDATE
    User update(User user);

    Resume addResume(User user, Resume resume);

    Resume deleteResume(User user, Resume resume);

    // DELETE
    User delete(User user);



}
