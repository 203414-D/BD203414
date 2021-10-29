package equipo8.project.Repository;

import equipo8.project.model.Mascota;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MascotaRepository extends CrudRepository<Mascota, String>{
    List<Mascota> findAll();
    Mascota save(Mascota mascota);
}
