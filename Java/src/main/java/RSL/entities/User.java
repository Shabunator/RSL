package RSL.entities;

import RSL.models.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * Данные пользователя
     */

    private String login;

    private String password;

    private String email;

    /**
     * Список резюме пользователя
     */
    @OneToMany(cascade = CascadeType.ALL)
    private List<Resume> resumeList;
}
