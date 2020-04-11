package RSL.controllers;


import RSL.entities.Resume;
import RSL.models.RestResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

@RestController(value = "resume")
@RequestMapping("resume")
public class ResumeController {

    /**
     * GetMaping - get запрос
     * @return
     */
    @GetMapping
    public RestResponse<List<Resume>> getAll() {

        List<Resume> resumeList = new LinkedList<>();

        for (int i = 1; i <= 10; i++) {
            resumeList.add(new Resume(i, "resume #" + i));
        }

        return new RestResponse<>(HttpStatus.OK, "OK", resumeList);
    }

}
