package RSL.entities;

import javax.persistence.*;
import java.util.List;

@Entity
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
    @OneToMany
    private List<Resume> resumeList;
}
