package equipo8.project.Controller;

import equipo8.project.Repository.MedicamentosRepository;
import equipo8.project.model.Medicamentos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MedicamentosController {

    @Autowired
    MedicamentosRepository medicamentosRepository;

    @GetMapping(value = "/listaMedicamentos")
    public List<Medicamentos> getListMedicamentos(){
        return medicamentosRepository.findAll();
    }
    @PostMapping(value = "/Medicamentos/new")
    public Medicamentos addMedicamentos(@RequestBody Medicamentos medicamentos){
        return medicamentosRepository.save(medicamentos);
    }


}