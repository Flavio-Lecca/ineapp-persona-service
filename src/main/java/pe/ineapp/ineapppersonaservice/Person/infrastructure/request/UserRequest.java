package pe.ineapp.ineapppersonaservice.Person.infrastructure.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserRequest {
    private String name;
    private String lastName;
    private String dni;
    private String email;
    private LocalDate birthDate;
    private String password;
}
