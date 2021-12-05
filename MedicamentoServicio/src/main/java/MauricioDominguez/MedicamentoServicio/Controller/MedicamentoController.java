package MauricioDominguez.MedicamentoServicio.Controller;

import MauricioDominguez.MedicamentoServicio.Model.Mascota;
import MauricioDominguez.MedicamentoServicio.Model.Medicamento;
import MauricioDominguez.MedicamentoServicio.Repository.MedicamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@RestController
public class MedicamentoController {

    @Autowired
    MedicamentoRepository medicamentoRepository;
    @Autowired
    RestTemplate restTemplate;

    @GetMapping(value = "/listaMedicamentos")
    public List<Medicamento> getListMedicamento() {
        return medicamentoRepository.findAll();
    }

    @PostMapping(value = "/Medicamentos/new")
    public Medicamento addMedicamentos(@RequestBody Medicamento medicamentos) {
        return medicamentoRepository.save(medicamentos);

    }

    @GetMapping(value = "/{id}")
    public List<Mascota> getmedicamentomas(@PathVariable("id") int id) {
        Mascota[] m = restTemplate.getForObject("http://localhost:8888/masmedi/" + id, Mascota[].class);
        List<Mascota> lm = Arrays.asList(m);
        return lm;
    }

    @PutMapping(value = "/medi/upd")
    public Medicamento updateMedicamento(@RequestBody Medicamento medicamento) {
        Medicamento m = medicamentoRepository.findByid(medicamento.getId());
        if (m != null) {
            if (m.getId() > 0)
                m.setCodigo(medicamento.getCodigo());
            return medicamentoRepository.save(m);
        }
        return null;
    }

    @DeleteMapping(value = "/medi/delete")
    public boolean deletemedicamento(@RequestBody Medicamento medicamento) {
        Medicamento ma = medicamentoRepository.findByid(medicamento.getId());
        if (ma != null) {
            medicamentoRepository.delete(ma);
            return true;
        }
        return false;


    }
}