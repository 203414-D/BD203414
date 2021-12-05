package com.DiegoChacon.MascotaServicio.Repository;

import com.DiegoChacon.MascotaServicio.Model.Mascota;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MascotaRepository extends CrudRepository<Mascota, Integer> {

    void delete(Mascota mascota);
    List<Mascota> findAll();

    Mascota save(Mascota mascota);

    Mascota findByidmascotas(int idmascotas);


    @Query(
            value = "SELECT * FROM mascotas WHERE idmedicamento =:idmedicamento",
            nativeQuery = true
    )
    List<Mascota> findByidmedicamento(@Param("idmedicamento") int idmedicamento);

    @Query(
            value = "SELECT * FROM mascotas WHERE iddueno=:iddueno",
            nativeQuery = true
    )
    List<Mascota> findByiddueno(@Param("iddueno")int iddueno);




}




