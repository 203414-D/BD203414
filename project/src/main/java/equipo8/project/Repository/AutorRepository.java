package equipo8.project.Repository;

import equipo8.project.model.Autor;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AutorRepository extends CrudRepository<Autor, String>{
    List<Autor> findAll();
    Autor save(Autor autor);
}