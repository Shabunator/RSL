package RSL.entities;

import lombok.Data;
import lombok.NonNull;

import javax.persistence.*;

@Entity
@Table(name = "resume")
@Data
public class Resume {
    /**
     Анотация ID - генерирует id
     GeneratedValue - автоинкреминация
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NonNull
    private String name;

}
