package RSL.services.implementation;

import RSL.entities.Resume;
import RSL.entities.User;
import RSL.repositories.UserRepository;
import RSL.services.ResumeService;
import RSL.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "userService")
public class UserServiceImplementation implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ResumeService resumeService;



    // CREATE

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    // READ

    @Override
    public User getById(Integer id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User getByLogin(String login) {
        return userRepository.findByLogin(login);
    }

    @Override
    public List<User> getUserList() {
        return (List<User>) userRepository.findAll();
    }

    // UPDATE

    @Override
    public User update(User user) {
        return userRepository.save(user);
    }

    public Resume addResume (User user, Resume resume) {

//        Resume dbResume = resumeService.save(resume);

        List<Resume> resumeList = user.getResumeList();
        resumeList.add(resume);

        save(user);

        return resumeList.get(resumeList.size() - 1);
    }

    public Resume deleteResume (User user, Resume resume) {

//        Resume dbResume = resumeService.save(resume);

        List<Resume> resumeList = user.getResumeList();
        resumeList.remove(resume);

        save(user);

        return resume;
    }

    // DELETE

    @Override
    public User delete(User user) {
        userRepository.delete(user);
        return user;
    }
}

