package pe.ineapp.ineapppersonaservice.Person;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @GetMapping
    @RequestMapping("/getAll")
    public List<Person> getAll(){
        LocalDate date = LocalDate.of(2002, Month.JULY, 31);

        Person person = Person.builder()
                .id(1L)
                .name("Flavio")
                .lastName("Lecca")
                .dni("72115773")
                .email("fla.lecca31@gmail.com")
                .birthDate(date).build();

        return List.of(person);
    }

    @GetMapping
    @RequestMapping("/getbyid")
    public Person getById(){
        LocalDate date = LocalDate.of(2002, Month.JULY, 31);

        Person person = Person.builder()
                .id(1L)
                .name("Flavio")
                .lastName("Lecca")
                .dni("72115773")
                .email("fla.lecca31@gmail.com")
                .birthDate(date).build();

        return person;
    }

    //PUT

    //POST

    //DELETE
}
