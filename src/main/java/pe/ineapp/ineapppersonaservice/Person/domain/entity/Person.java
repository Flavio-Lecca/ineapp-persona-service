package pe.ineapp.ineapppersonaservice.Person.domain.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity(name="Person")
@Table(
        name = "Person",
        uniqueConstraints = {
                @UniqueConstraint(name="person_mail_unique", columnNames = "email"),
                @UniqueConstraint(name="person_dni_unique", columnNames = "dni")
        }
)
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Person {

    @SequenceGenerator(
            name = "person_sequence",
            sequenceName = "person_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "person_sequence"
    )
    @Id
    Long id;
    String name;
    String lastName;
    String dni;
    String email;
    LocalDate birthDate;
}