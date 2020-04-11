package RSL.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "resume")
@RequestMapping("resume")
public class ResumeController {

    /**
     * GetMaping - get запрос
     * @return
     */
    @GetMapping
    public String getAll() {
        return "All";
    }

}
