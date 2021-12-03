package MauricioDominguez.MedicamentoServicio.Repository;

import MauricioDominguez.MedicamentoServicio.Model.Medicamento;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MedicamentoRepository extends CrudRepository<Medicamento, String> {
    List<Medicamento> findAll();
    Medicamento save(Medicamento medicamentos);
}