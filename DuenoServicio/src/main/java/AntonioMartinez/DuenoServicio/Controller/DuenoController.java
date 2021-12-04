package AntonioMartinez.DuenoServicio.Controller;

import AntonioMartinez.DuenoServicio.Model.Dueno;
import AntonioMartinez.DuenoServicio.Model.Mascota;
import AntonioMartinez.DuenoServicio.Repository.DuenoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
public class DuenoController {

    @Autowired
    DuenoRepository duenoRepository;
    @Autowired
    RestTemplate restTemplate;

    @GetMapping(value = "/listaDueno")
    public List<Dueno> getListDueno(){
        return duenoRepository.findAll();
    }
    @PostMapping(value = "/dueno/new")
    public Dueno addDueno(@RequestBody Dueno dueno){
        return duenoRepository.save(dueno);
    }

    @GetMapping(value = "/listado")
    public List<Mascota> getListMascota(){
        Mascota[] mascotas =restTemplate.getForObject(
                "http://localhost:8888/listaMascota",
                Mascota[].class);
        List<Mascota> lm = Arrays.asList(mascotas);
        return lm;
    }
    @GetMapping (value = "/dueno/{idduenos}")
    public Dueno getDueno(@PathVariable("idduenos") int idduenos){
        Dueno dueno= duenoRepository.findByidduenos(idduenos);
        return dueno;
    }
    @GetMapping(value = "/{iddueno}")
    public List<Mascota> getiddueno(@PathVariable("iddueno") int iddueno){
        Mascota[] mascotas = restTemplate.getForObject(
                "http://localhost:8888/mas/"+iddueno,
                Mascota[].class);
        List<Mascota> m = Arrays.asList(mascotas);

        return m;
    }
    @PutMapping (value = "/dueno/upd")
    public Dueno updateDueno(@RequestBody Dueno dueno){
        Dueno dno = duenoRepository.findByidduenos(dueno.getIdduenos());
        if (dno!=null){
            if (dno.getTelefono()!=null)
                dno.setTelefono(dueno.getTelefono());
            return duenoRepository.save(dno);
        }
        return null;
    }
    @DeleteMapping(value = "dueno/delete")
    public boolean deleteDueno(@RequestBody Dueno dueno){
        Dueno du=duenoRepository.findByidduenos(dueno.getIdduenos());
        if (du!=null){
            duenoRepository.delete(du);
            return true;
        }
        return false;
    }






}