package RSL.controllers;


import RSL.entities.*;
import RSL.models.EducationLevel;
import RSL.models.Gender;
import RSL.models.LanguageProficiencyLevel;
import RSL.models.RestResponse;
import RSL.services.ResumeService;
import RSL.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@RestController
@RequestMapping("user")
@CrossOrigin(origins = "*", maxAge = 3600)
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * Получить по логину
     * @param login
     * @return
     */
    @GetMapping
    public RestResponse<User> getByLogin(String login) {

        return new RestResponse<>(
                HttpStatus.OK,
                "getByLogin",
                userService.getByLogin(login)
        );
    }

    @PostMapping
    public RestResponse<User> save(User user) {
        return new RestResponse<>(
                HttpStatus.OK,
                "save",
                userService.save(user)
        );
    }

    /**
     * Удаление пользователя
     * @param user
     * @return
     */
    @DeleteMapping("(id)")
    public RestResponse<User> delete (@PathVariable("id") User user) {
        return new RestResponse<>(
                HttpStatus.OK,
                "delete",
                userService.delete(user)
        );
    }

    /**
     * <----------------------РЕЗЮМЕ ПОЛЬЗОВАТЕЛЯ------------------------->
     */

    /**
     * Добавление резюме пользователю.
     * @param user
     * @param resume
     * @return
     */
    @PutMapping("user={id}")
    public RestResponse<Resume> addResume(@PathVariable("id") User user, @RequestBody Resume resume) {
        return new RestResponse<>(
                HttpStatus.OK,
                "OKOK",
                userService.addResume(user, resume)
        );
    }

    @DeleteMapping("user={user_id}&resume={resume_id}")
    public RestResponse<Resume> deleteResume(@PathVariable("user_id") User user, @PathVariable("resume_id") Resume resume) {
        return new RestResponse<>(
                HttpStatus.OK,
                "deleteResume",
                userService.deleteResume(user, resume)
        );
    }




}

