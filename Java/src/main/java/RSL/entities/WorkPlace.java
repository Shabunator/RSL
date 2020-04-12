package RSL.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * Метсто работы
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name = "work_place")
public class WorkPlace {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * Окночание работы
     */
    private Date startDate;

    /**
     * Окночание работы
     */
    private Date endDate;

    /**
     * Название компании
     */
    private String organization;

    /**
     * должность
     */
    private String position;

    /**
     * Обязанности на рабочем месте
     */
    private String workplaceResponsibilities;
}
