package equipo8.project.Repository;

import equipo8.project.model.Editorial;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EditorialRepository extends CrudRepository<Editorial, String>{
    List<Editorial> findAll();
    Editorial save(Editorial editorial);
}