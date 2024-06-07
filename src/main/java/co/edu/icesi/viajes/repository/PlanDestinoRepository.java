package co.edu.icesi.viajes.repository;

import co.edu.icesi.viajes.domain.PlanDestino;
import co.edu.icesi.viajes.domain.PlanDestinoId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanDestinoRepository extends JpaRepository<PlanDestino, PlanDestinoId> {

    @Query(value = "SELECT id_dest FROM plan_destino GROUP BY id_dest ORDER BY COUNT(*) DESC LIMIT 1", nativeQuery = true)
    Integer findMostFrequentDestinationId();

}