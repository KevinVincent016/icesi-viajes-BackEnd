package co.edu.icesi.viajes.service;

import co.edu.icesi.viajes.domain.Servicio;
import co.edu.icesi.viajes.repository.ServicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicioServiceImpl implements ServicioService{
    @Autowired
    private  ServicioRepository servicioRepository;



    @Override
    public List<Servicio> findAll() {
        return servicioRepository.findAll();
    }

    @Override
    public Optional<Servicio> findById(Integer id) {
        return servicioRepository.findById(id);
    }

    @Override
    public Servicio save(Servicio entity) throws Exception {
        validate(entity);
        return servicioRepository.save(entity);
    }

    @Override
    public Servicio update(Servicio entity) throws Exception {
        validate(entity);
        if (!servicioRepository.existsById(entity.getIdAdd())) {
            throw new Exception("El servicio con id " + entity.getIdAdd() + "  no existe");
        }
        return servicioRepository.save(entity);
    }

    @Override
    public void delete(Servicio entity) throws Exception {
        if (entity == null) {
            throw new Exception("El servicio es null");
        }
        validate(entity);
        if (!servicioRepository.existsById(entity.getIdAdd())) {
            throw new Exception("El servicio con id " + entity.getIdAdd() + "  no existe");
        }
        servicioRepository.delete(entity);
    }

    @Override
    public void deleteById(Integer id) throws Exception {
        if (!servicioRepository.existsById(id)) {
            throw new Exception("El servicio con id " + id + "  no existe");
        }
        servicioRepository.deleteById(id);
    }

    @Override
    public void validate(Servicio entity) throws Exception {
        if (entity == null) {
            throw new Exception("El servicio es null");
        }
    }

    @Override
    public Long count() {
        return servicioRepository.count();
    }
}