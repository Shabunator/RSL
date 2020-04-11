package RSL.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;

@Entity
@Table(name = "resume")
@Data
@AllArgsConstructor
@NoArgsConstructor
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
