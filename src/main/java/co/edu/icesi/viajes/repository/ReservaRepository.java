package co.edu.icesi.viajes.repository;

import co.edu.icesi.viajes.domain.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ReservaRepository extends JpaRepository<Reserva, Integer> {
    @Query(value = "SELECT id_plan FROM reserva GROUP BY id_plan ORDER BY COUNT(*) DESC LIMIT 1", nativeQuery = true)
    Integer findMostReservedPlanId();


    @Query(value = "SELECT id_clie FROM reserva GROUP BY id_clie ORDER BY COUNT(*) DESC LIMIT 3", nativeQuery = true)
    List<Integer> findTop3ClientsWithMostReservations();
}
