package RSL.controllers;


import RSL.entities.*;
import RSL.models.EducationLevel;
import RSL.models.Gender;
import RSL.models.LanguageProficiencyLevel;
import RSL.models.RestResponse;
import RSL.services.ResumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@RestController(value = "resume")
@RequestMapping("resume")
@CrossOrigin(origins = "*", maxAge = 3600)
public class ResumeController {

    @Autowired
    private ResumeService resumeService;

    /**
     * GetMaping - get запрос
     * @return
     */
    @GetMapping
    public RestResponse<List<Resume>> getAll() {

        List<Resume> resumeList = new LinkedList<>();

        for (int i = 1; i <= 1; i++) {

            Integer id = i;

            ContactDetails contactDetails = new ContactDetails(
                    i,
                    "firstName " + i,
                    "lastName " + i,
                    "residenceCity " + i
            );

            BasicInformation basicInformation = new BasicInformation(
                    i,
                    new Date(),
                    Gender.male,
                    "nationality " + i,
                    true
            );

            Specialty specialty = new Specialty(
                    i,
                    "желаемая долженность",
                    100.99,
                    "профессиональная область"
            );

            List<WorkPlace> workPlaceList = new LinkedList<>();
            workPlaceList.add(new WorkPlace(
                    1,
                    new Date(),
                    new Date(),
                    "организация " + i,
                    "желаемая долженность " + i,
                    "Уборка помещений " + i
            ));

            WorkExperience workExperience = new WorkExperience(
                    i,
                    workPlaceList,
                    "танцор" + i,
                    "играю в манчкин" + i
            );

            List<Education> educationList = new LinkedList<>();
            educationList.add(new Education(
                    i,
                    EducationLevel.DOCTOR,
                    "Учебное заведение " + i,
                    "Факулльтет",
                    new Date()
            ));

             Language nativeLanguage = new Language(
                     i,
                     "Русский",
                     LanguageProficiencyLevel.A1
             );

            List<Language> foreignLanguageList = new LinkedList<>();
            foreignLanguageList.add(new Language(
                    i + 1,
                    "name " + (i + 1),
                    LanguageProficiencyLevel.A2
            ));

            String otherImportantInformation = "Дополнительная информация обо мне";


            Resume resume = new Resume (
                    id,
                    contactDetails,
                    basicInformation,
                    specialty,
                    workExperience,
                    educationList,
                    nativeLanguage,
                    foreignLanguageList,
                    otherImportantInformation
            );

            Resume dbResume = resumeService.save(resume);

            resumeList.add(dbResume);
        }

        return new RestResponse<>(
                HttpStatus.OK,
                "OK",
                resumeList
        );
    }

}
