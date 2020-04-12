package RSL.entities;

import javax.persistence.*;
import java.util.List;

/**
 * Опыт работы
 */
@Entity
@Table(name = "work_experience")
public class WorkExperience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * Места работы
     */
    @OneToMany
    private List<WorkPlace> workPlaceList;

    /**
     * Информация о себе
     */
    private String aboutMe;

    /**
     * Ключевые навыки
     */
    private String skills;

}