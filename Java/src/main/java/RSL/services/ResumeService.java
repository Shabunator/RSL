package RSL.services;

import RSL.entities.Resume;

import java.util.LinkedList;
import java.util.List;

public interface ResumeService {

    List<Resume> getResumeList();

    Resume save(Resume resume);

    Resume get(Integer id);
}
