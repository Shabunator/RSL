package RSL.entities;

import javax.persistence.*;
import javax.xml.crypto.Data;
import java.util.Date;

/**
 * Метсто работы
 */
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
