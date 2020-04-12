package RSL.entities;

import javax.persistence.*;

/**
 * Специальность (если есть опыт работы)
 */
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