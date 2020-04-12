package RSL.entities;

import RSL.models.Gender;

import javax.persistence.*;
import java.util.Date;

/**
 * Основная информация
 */
@Entity
@Table(name = "basic_information")
public class BasicInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // дата рождения
    private Date birthDate;

    // пол
    private Gender gender;

    // гражданство
    private String nationality;

    // опыт работы
    private Boolean workExperience;
}