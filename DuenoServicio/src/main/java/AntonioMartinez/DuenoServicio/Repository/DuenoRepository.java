package AntonioMartinez.DuenoServicio.Repository;

import AntonioMartinez.DuenoServicio.Model.Dueno;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DuenoRepository extends CrudRepository<Dueno,String> {
    List<Dueno> findAll();
    Dueno save(Dueno dueno);
    Dueno findByidduenos(int iddueno);

    void delete(Dueno dueno);

}