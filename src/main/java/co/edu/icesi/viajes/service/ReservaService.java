package co.edu.icesi.viajes.service;

import co.edu.icesi.viajes.domain.Reserva;

import java.util.List;

public interface ReservaService extends GenericService<Reserva, Integer>{
    Integer findMostReservedPlanId();
    List<Integer> findTop3ClientsWithMostReservations();

}
