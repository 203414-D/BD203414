package equipo8.project.Repository;

import equipo8.project.model.Libro;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LibroRepository extends CrudRepository<Libro, String>{
    List<Libro> findAll();
}
