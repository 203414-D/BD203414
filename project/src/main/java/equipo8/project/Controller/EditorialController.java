package equipo8.project.Controller;

import equipo8.project.Repository.EditorialRepository;
import equipo8.project.model.Editorial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EditorialController {

    @Autowired
    EditorialRepository editorialRepository;

    @GetMapping(value = "/listaEditorial")
    public List<Editorial> getListEditorial(){
        return editorialRepository.findAll();
    }
    @PostMapping(value = "/editorial/new")
    public Editorial addEditorial(@RequestBody Editorial editorial){
        return editorialRepository.save(editorial);
    }


}