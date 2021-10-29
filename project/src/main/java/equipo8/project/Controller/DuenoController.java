package equipo8.project.Controller;

import equipo8.project.Repository.DuenoRepository;
import equipo8.project.model.Dueno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DuenoController {

    @Autowired
    DuenoRepository duenoRepository;

    @GetMapping(value = "/listaDueno")
    public List<Dueno> getListDueno(){
        return duenoRepository.findAll();
    }
    @PostMapping(value = "/autor/new")
    public Dueno addDueno(@RequestBody Dueno dueno){
        return duenoRepository.save(dueno);
    }


}