package pe.ineapp.ineapppersonaservice.Persona;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/persona")
public class PersonaController {

    @GetMapping
    @RequestMapping("/getAll")
    public String getPersona(){
        return "Hola";
    }

    //PUT

    //POST

    //DELETE
}
