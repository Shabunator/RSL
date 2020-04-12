package RSL.entities;

import RSL.models.EducationLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.checkerframework.checker.units.qual.A;

import javax.persistence.*;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Data
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
