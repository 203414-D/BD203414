package equipo8.project.Controller;

import equipo8.project.Repository.MascotaRepository;
import equipo8.project.model.Mascota;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MascotaController {


    @Autowired
    MascotaRepository mascotaRepository;

    @GetMapping(value = "/listaMascota")
    public List<Mascota> getListMascota(){
        return mascotaRepository.findAll();
    }
    @PostMapping(value = "/mascota/new")
    public Mascota addMascota(@RequestBody Mascota mascota){
        return mascotaRepository.save(mascota);
    }


}
