package equipo8.project.Repository;

import equipo8.project.model.Medicamentos;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MedicamentosRepository extends CrudRepository<Medicamentos, String>{
    List<Medicamentos> findAll();
    Medicamentos save(Medicamentos medicamentos);
}