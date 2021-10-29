package equipo8.project.Controller;

import equipo8.project.Repository.AutorRepository;
import equipo8.project.model.Autor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AutorController {

    @Autowired
    AutorRepository autorRepository;

    @GetMapping(value = "/listaAutor")
    public List<Autor> getListAutor(){
        return autorRepository.findAll();
    }
    @PostMapping(value = "/autor/new")
    public Autor addAutor(@RequestBody Autor autor){
        return autorRepository.save(autor);
    }


}