package equipo8.project.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {

    @GetMapping(value = "/prueba")
    public String prueba() {
        return "proyecto funcionando";
    }
}
