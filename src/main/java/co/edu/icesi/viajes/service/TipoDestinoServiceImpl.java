package co.edu.icesi.viajes.service;

import co.edu.icesi.viajes.domain.TipoDestino;
import co.edu.icesi.viajes.repository.TipoDestinoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

@Scope ("singleton")
@Service
public class TipoDestinoServiceImpl implements TipoDestinoService {

    @Autowired 
    private TipoDestinoRepository tipoDestinoRepository;
    private Collectors Collectors;
    @Override
    public List<TipoDestino> findAll() {
        List<TipoDestino> lstTipoDestino = tipoDestinoRepository.findAll();
        return lstTipoDestino;
    }

    @Override
    public Optional<TipoDestino> findById(Integer id) {
        return tipoDestinoRepository.findById(id);
    }

    @Override
    public TipoDestino save(TipoDestino entity) throws Exception {
        return tipoDestinoRepository.save(entity);
    }

    @Override
    public TipoDestino update(TipoDestino entity) throws Exception {
        return tipoDestinoRepository.save(entity);
    }

    @Override
    public void delete(TipoDestino entity) throws Exception{
        tipoDestinoRepository.delete(entity);
    }
    @Override
    public void deleteById(Integer id) throws Exception {
        tipoDestinoRepository.deleteById(id);
    }

    @Override
    public void validate(TipoDestino entity) throws Exception {
    }

    @Override
    public Long count() {
        return tipoDestinoRepository.count();
    }

    @Override
    public List<TipoDestino> consultarLosTipoDestino() {
        return tipoDestinoRepository.consultarLosTipoDestino();
    }

}

