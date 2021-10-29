package equipo8.project.Repository;

import equipo8.project.model.Dueno;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DuenoRepository extends CrudRepository<Dueno, String>{
    List<Dueno> findAll();
    Dueno save(Dueno dueno);
}