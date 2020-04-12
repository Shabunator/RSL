package RSL.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.checkerframework.checker.interning.qual.InternedDistinct;

import javax.persistence.*;

/**
 * Контактные данные
 */
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
@Table(name = "contact_details")
public class ContactDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * имя
     */
    private String firstName;

    /**
     * фамилия
     */
    private String lastName;

    /**
     * город проживания
     */
    private String residenceCity;
}