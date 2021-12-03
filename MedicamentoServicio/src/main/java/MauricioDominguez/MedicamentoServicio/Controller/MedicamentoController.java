package MauricioDominguez.MedicamentoServicio.Controller;

import MauricioDominguez.MedicamentoServicio.Model.Medicamento;
import MauricioDominguez.MedicamentoServicio.Repository.MedicamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MedicamentoController {

    @Autowired
    MedicamentoRepository medicamentoRepository;

    @GetMapping(value = "/listaMedicamentos")
    public List<Medicamento> getListMedicamento(){
        return medicamentoRepository.findAll();
    }
    @PostMapping(value = "/Medicamentos/new")
    public Medicamento addMedicamentos(@RequestBody Medicamento medicamentos){
        return medicamentoRepository.save(medicamentos);
    }


}