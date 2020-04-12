package RSL.entities;

import RSL.models.EducationLevel;
import RSL.models.LanguageProficiencyLevel;

import javax.persistence.*;

@Entity
@Table(name = "language")
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * Название языка
     */
    private String name;

    /**
     * Уровень владения языком
     */
    private LanguageProficiencyLevel languageProficiencyLevel;
}
