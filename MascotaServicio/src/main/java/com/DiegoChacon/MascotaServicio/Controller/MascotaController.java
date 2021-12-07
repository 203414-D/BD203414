package com.DiegoChacon.MascotaServicio.Controller;


import com.DiegoChacon.MascotaServicio.Model.Dueno;
import com.DiegoChacon.MascotaServicio.Model.Mascota;
import com.DiegoChacon.MascotaServicio.Repository.MascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.awt.*;
import java.util.Arrays;
import java.util.List;


@RestController
public class MascotaController {


    @Autowired
    MascotaRepository mascotaRepository;
    @Autowired
    RestTemplate restTemplate;

    @CrossOrigin
    @GetMapping(value = "/listaMascota")
    public List<Mascota> getListMascota(){
        return mascotaRepository.findAll();
    }
    @CrossOrigin
    @PostMapping(value = "/mascota/new")
    public Mascota addMascota(@RequestBody Mascota mascota){
        return mascotaRepository.save(mascota);
    }

    @GetMapping (value = "/mascota/{idmascota}")
    public Mascota getidmascota(@PathVariable ("idmascotas") int idmascota){
        Mascota mascota= mascotaRepository.findByidmascota(idmascota);
        return mascota;
    }

    @GetMapping(value = "/masmedi/{idmedicamento}")
    public List<Mascota> getidmedicamento(@PathVariable("idmedicamento") int idmedicamento){
        return mascotaRepository.findByidmedicamento(idmedicamento);
    }

    @GetMapping(value = "/mas/{iddueno}")
    public List<Mascota> getiddueno(@PathVariable("iddueno") int iddueno){
        return mascotaRepository.findByiddueno(iddueno);
    }
    @GetMapping(value = "/listar")
    public List<Dueno> getListDueno(){
        Dueno[] duenos =restTemplate.getForObject(
                "http://localhost:8088/listaDueno",
                Dueno[].class);
        List<Dueno> ld = Arrays.asList(duenos);
        return ld;
    }
    @GetMapping(value = "/{idduenos}")
    public Dueno getDueno(@PathVariable("idduenos") int idduenos){
        Dueno d = restTemplate.getForObject("http://localhost:8088/dueno/"+idduenos,Dueno.class);
        return d;
    }

    @PutMapping (value = "/mas/upd")
    public Mascota updateMascota(@RequestBody Mascota mascota){
        Mascota m = mascotaRepository.findByidmascota(mascota.getIdmascota());
        if (m!=null){
            if (m.getIdmedicamento() > 0)
                m.setIdmedicamento(mascota.getIdmedicamento());
            return mascotaRepository.save(m);
        }
        return null;
    }

    @DeleteMapping(value = "/mas/delete")
    public boolean deleteMascota(@RequestBody Mascota mascota){
        Mascota ma=mascotaRepository.findByidmascota(mascota.getIdmascota());
        if (ma!=null){
        mascotaRepository.delete(ma);
        return true;
        }
    return false;
}

   // @Autowired
   // RestTemplate restTemplate;
  //  @GetMapping(value = "/list")
  //  public List<Mascota> getListaMascota(){
  //      Mascota[] mascotas=restTemplate.getForObject("http://localhost:8080/listaMascota", Mascota[].class);
  //      List<Mascota> lp = Arrays.asList(mascotas);
  //      return lp;
  //  }


}
