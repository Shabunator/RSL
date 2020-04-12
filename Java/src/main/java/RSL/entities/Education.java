package RSL.entities;

import RSL.models.EducationLevel;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "education")
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * Увроень образование
     */
    private EducationLevel educationLevel;

    /**
     * Учебное заведение
     */
    private String educationInstitution;
    /**
     * Факультет
     */
    private String faculty;

    /**
     * Год окончания
     */
    private Date endDate;

}
