package com.DiegoChacon.MascotaServicio.Controller;


import com.DiegoChacon.MascotaServicio.Model.Dueno;
import com.DiegoChacon.MascotaServicio.Model.Mascota;
import com.DiegoChacon.MascotaServicio.Repository.MascotaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.swing.*;
import java.util.Arrays;
import java.util.List;

@RestController
public class MascotaController {
    @Autowired
    MascotaRepository mascotaRepository;
    @Autowired
    RestTemplate restTemplate;

    @GetMapping(value = "/listaMascota")
    public List<Mascota> getListMascota(){
        return mascotaRepository.findAll();
    }
    @PostMapping(value = "/mascota/new")
    public Mascota addMascota(@RequestBody Mascota mascota){
        return mascotaRepository.save(mascota);
    }
    @GetMapping (value = "/mascota/{idmascota}")
    public Mascota getidmascota(@PathVariable ("idmascota") int idmascota){
        Mascota mascota= mascotaRepository.findByidmascota(idmascota);
        return mascota;
    }
    @GetMapping(value = "/masco/{medicamentomas}")
    public List<Mascota> getmedicamentomas(@PathVariable("medicamentomas") String medicamentomas){
        return mascotaRepository.findBymedicamentomas(medicamentomas);

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





   // @Autowired
   // RestTemplate restTemplate;
  //  @GetMapping(value = "/list")
  //  public List<Mascota> getListaMascota(){
  //      Mascota[] mascotas=restTemplate.getForObject("http://localhost:8080/listaMascota", Mascota[].class);
  //      List<Mascota> lp = Arrays.asList(mascotas);
  //      return lp;
  //  }


}
