package RSL.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "resume")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Resume {
    /**
     * Анотация ID - генерирует id
     * GeneratedValue - автоинкреминация
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne(cascade = CascadeType.ALL)
    private ContactDetails contactDetails;

    @OneToOne(cascade = CascadeType.ALL)
    private BasicInformation basicInformation;

    /**
     * Дополнительня информация
     */
    @OneToOne(cascade = CascadeType.ALL)
    private Specialty specialty;

    /**
     * Опыт работы
     */
    @OneToOne(cascade = CascadeType.ALL)
    private WorkExperience workExperience;

    /**
     * Образование
     */
    @OneToMany(cascade = CascadeType.ALL)
    private List<Education> educationList;

    /**
     * Родной язык
     */
    @OneToOne(cascade = CascadeType.ALL)
    private  Language nativeLanguage;

    /**
     * Список иностранных языков
     */
    @OneToMany(cascade = CascadeType.ALL)
    private List<Language> foreignLanguageList;

    /**
     * Другая важная информация
     */
    private String otherImportantInformation;
}
