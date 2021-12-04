package com.DiegoChacon.MascotaServicio.Repository;

import com.DiegoChacon.MascotaServicio.Model.Mascota;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MascotaRepository extends CrudRepository<Mascota, String> {
    List<Mascota> findAll();

    Mascota save(Mascota mascota);

    Mascota findByidmascota(int idmascota);



    @Query(
            value = "SELECT * FROM mascotas WHERE medicamentomas =:medicamentomas",
            nativeQuery = true
    )
    List<Mascota> findBymedicamentomas(@Param("medicamentomas") String medicamentomas);

    @Query(
            value = "SELECT * FROM mascotas WHERE iddueno=:iddueno",
            nativeQuery = true
    )
    List<Mascota> findByiddueno(@Param("iddueno")int iddueno);




}




