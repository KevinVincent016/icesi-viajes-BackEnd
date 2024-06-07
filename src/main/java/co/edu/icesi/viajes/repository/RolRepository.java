package co.edu.icesi.viajes.repository;

import co.edu.icesi.viajes.domain.Rol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface RolRepository extends JpaRepository<Rol, Integer> {
    @Query("SELECT r.nombre FROM Rol r WHERE r.idRol= :id")
    String findNombreById(@Param("id") Integer id);
}