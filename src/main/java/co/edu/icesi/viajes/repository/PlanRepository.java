package co.edu.icesi.viajes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.icesi.viajes.domain.Plan;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PlanRepository extends JpaRepository<Plan, Integer>{

    @Query(value = "SELECT * FROM Plan ORDER BY fecha_creacion DESC LIMIT 3", nativeQuery = true)
    List<Plan> findTop3ByOrderByFechaCreacionDesc();

    @Query(value = "SELECT * FROM Plan WHERE id_usua = ?1", nativeQuery = true)
    List<Plan> findByUsuarioId(Integer id);

}
