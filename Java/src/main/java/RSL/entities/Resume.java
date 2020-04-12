package RSL.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

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

    @OneToOne
    private ContactDetails contactDetails;

    @OneToOne
    private BasicInformation basicInformation;

    /**
     * Дополнительня информация
     */
    @OneToOne
    private Specialty specialty;

    /**
     * Опыт работы
     */
    @OneToOne
    private WorkExperience workExperience;

    /**
     * Образование
     */
    @OneToOne
    private Education education;

    /**
     * Родной язык
     */
    @OneToOne
    private  Language nativeLanguage;

    /**
     * Список иностранных языков
     */
    @OneToOne
    private List<Language> foreignLanguageList;

    /**
     * Другая важная информация
     */
    private String otherImportantInformation;
}
