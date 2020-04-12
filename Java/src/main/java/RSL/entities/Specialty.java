package RSL.entities;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * Специальность (если есть опыт работы)
 */
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "specialty")
public class Specialty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // желаемая должность
    private String desiredPosition;

    // зарплата
    private Double salary;

    // профессиональная область
    private String professionalArea;
}