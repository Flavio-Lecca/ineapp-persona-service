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
        //LocalDate date = LocalDate.of(2002, Month.JULY, 31);

        Person person = Person.builder()
                .id(1L)
                .name("Flavio")
                .lastName("Lecca")
                .dni("72115773")
                .course("Matematica")
                .build();

        Person person2 = Person.builder()
                .id(2L)
                .name("Claudia")
                .lastName("Lecca")
                .dni("72115764")
                .course("Lenguaje")
                .build();

        return List.of(person,person2);
    }

    @GetMapping
    @RequestMapping("/getbyid")
    public Person getById(){
        //LocalDate date = LocalDate.of(2002, Month.JULY, 31);

        Person person = Person.builder()
                .id(1L)
                .name("Flavio")
                .lastName("Lecca")
                .dni("72115773")
                .course("fla.lecca31@gmail.com")
                .build();

        return person;
    }

    //PUT

    //POST

    //DELETE
}
