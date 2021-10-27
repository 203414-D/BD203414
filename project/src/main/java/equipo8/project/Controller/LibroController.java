package equipo8.project.Controller;

import equipo8.project.Repository.LibroRepository;
import equipo8.project.model.Libro;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class LibroController {

    @Autowired
    LibroRepository libroRepository;

    @GetMapping(value = "/listaLibro")
    public List<Libro> getListLibro(){
        return libroRepository.findAll();
    }
    @PostMapping(value = "/libro/new")
    public Libro addLibro(@RequestBody Libro libro){
        return libroRepository.save(libro);
    }


}
