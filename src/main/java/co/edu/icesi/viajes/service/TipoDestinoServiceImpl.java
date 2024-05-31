package co.edu.icesi.viajes.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import co.edu.icesi.viajes.domain.TipoDestino;
import co.edu.icesi.viajes.repository.TipoDestinoRepository;

@Scope("singleton")
@Service
public class TipoDestinoServiceImpl implements TipoDestinoService {
	
	@Autowired
	private TipoDestinoRepository tipoDestinoRepository;

	@Override
	public List<TipoDestino> findAll() {
		
		List<TipoDestino> lstTipoDestino = tipoDestinoRepository.findAll();
		
		return lstTipoDestino;
	}

	@Override
	public Optional<TipoDestino> findById(Integer id) {
		// TODO Auto-generated method stub
		return tipoDestinoRepository.findById(id);
	}

	@Override
	public TipoDestino save(TipoDestino entity) throws Exception {
		// TODO Auto-generated method stub
		return tipoDestinoRepository.save(entity);
	}

	@Override
	public TipoDestino update(TipoDestino entity) throws Exception {
		// TODO Auto-generated method stub
		return tipoDestinoRepository.save(entity);
	}

	@Override
	public void delete(TipoDestino entity) throws Exception {
		// TODO Auto-generated method stub
		tipoDestinoRepository.delete(entity);
	}

	@Override
	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		tipoDestinoRepository.deleteById(id);
	}

	@Override
	public void validate(TipoDestino entity) throws Exception {
		// TODO Auto-generated method stub
	}

	@Override
	public Long count() {
		// TODO Auto-generated method stub
		return tipoDestinoRepository.count();
	}

	@Override
	public List<TipoDestino> findByCodigo(String codigo) {
		return tipoDestinoRepository.findByCodigo(codigo);
	}

	@Override
	public List<TipoDestino> findByCodigoAndEstado(String codigo, String estado) {
		return tipoDestinoRepository.findByCodigoAndEstado(codigo, estado);
	}
	
	@Override
	public List<TipoDestino> tipoDestinoAlf() {
		return tipoDestinoRepository.tipoDestinoAlf();
	}
	
	@Override
	public List<TipoDestino> obtenerTodos() {
        return tipoDestinoRepository.findAll();
    }

}
