package RSL.services.implementation;

import RSL.entities.Resume;
import RSL.repositories.ResumeRepository;
import RSL.services.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "resumeService")
public class ResumeServiceImplementation implements ResumeService {

    @Autowired
    private ResumeRepository resumeRepository;

    @Override
    public List<Resume> getResumeList() {
        return (List<Resume>)resumeRepository.findAll();
    }

    @Override
    public Resume save(Resume resume) {
        return resumeRepository.save(resume);
    }

    @Override
    public Resume get(Integer id) {
        return resumeRepository.findById(id).orElse(null);
    }
}
