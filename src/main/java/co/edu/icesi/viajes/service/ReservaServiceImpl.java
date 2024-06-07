package co.edu.icesi.viajes.service;

import co.edu.icesi.viajes.domain.Reserva;
import co.edu.icesi.viajes.repository.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Scope("singleton")
@Service
public class ReservaServiceImpl implements ReservaService{

    @Autowired
    private ReservaRepository reservaRepository;

    @Override
    public List<Reserva> findAll() {
        return reservaRepository.findAll();
    }

    @Override
    public Optional<Reserva> findById(Integer integer) {
        return reservaRepository.findById(integer);
    }

    @Override
    public Reserva save(Reserva entity) throws Exception {
        return reservaRepository.save(entity);
    }

    @Override
    public Reserva update(Reserva entity) throws Exception {
        Optional<Reserva> existingReserva = reservaRepository.findById(entity.getIdReserva());
        if (existingReserva.isPresent()) {
            Reserva updatedReserva = existingReserva.get();
            updatedReserva.setPersonas(entity.getPersonas());
            updatedReserva.setValor(entity.getValor());
            updatedReserva.setIdPlan(entity.getIdPlan());
            return reservaRepository.save(updatedReserva);
        } else {
            throw new Exception("Reserva con id " + entity.getIdReserva() + "  not existe");
        }
    }

    @Override
    public void delete(Reserva entity) throws Exception {
        if (entity == null) {
            throw new Exception("La reserva a eliminar no puede ser nula");
        }
        Optional<Reserva> existingReserva = reservaRepository.findById(entity.getIdReserva());
        if (!existingReserva.isPresent()) {
            throw new Exception("La reserva con id " + entity.getIdReserva() + " no existe");
        }
        reservaRepository.delete(entity);
    }

    @Override
    public void deleteById(Integer id) throws Exception {
        if (id == null) {
            throw new Exception("El id de la reserva a eliminar no puede ser nulo");
        }
        Optional<Reserva> existingReserva = reservaRepository.findById(id);
        if (!existingReserva.isPresent()) {
            throw new Exception("La reserva con id " + id + " no existe");
        }
        reservaRepository.deleteById(id);
    }

    @Override
    public void validate(Reserva entity) throws Exception {
        if (entity == null) {
            throw new Exception("La reserva no puede ser nula");
        }
    }

    @Override
    public Long count() {
        return reservaRepository.count();
    }
}
