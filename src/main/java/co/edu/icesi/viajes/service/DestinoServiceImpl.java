package co.edu.icesi.viajes.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import co.edu.icesi.viajes.domain.Destino;
import co.edu.icesi.viajes.repository.DestinoRepository;

@Scope("singleton")
@Service
public class DestinoServiceImpl implements DestinoService{
	
	@Autowired
	private DestinoRepository destinoRepository;

	@Override
	public List<Destino> findAll() {
		
		List<Destino> lstDestino = destinoRepository.findAll();
		
		return lstDestino;
	}

	@Override
	public Optional<Destino> findById(Integer id) {
		// TODO Auto-generated method stub
		return destinoRepository.findById(id);
	}

	@Override
	public Destino save(Destino entity) throws Exception {
		// TODO Auto-generated method stub
		return destinoRepository.save(entity);
	}

	@Override
	public Destino update(Destino entity) throws Exception {
		// TODO Auto-generated method stub
		return destinoRepository.save(entity);
	}

	@Override
	public void delete(Destino entity) throws Exception {
		// TODO Auto-generated method stub
		destinoRepository.delete(entity);
	}

	@Override
	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		destinoRepository.deleteById(id);
	}

	@Override
	public void validate(Destino entity) throws Exception {
		// TODO Auto-generated method stub
	}

	@Override
	public Long count() {
		// TODO Auto-generated method stub
		return destinoRepository.count();
	}

	@Override
	public Destino findByCodigoAndEstado(String codigo, String estado) {
		return destinoRepository.findByCodigoAndEstado(codigo, estado);
	}

	@Override
	public List<Destino> findByIdTide(Integer id_tide) {
		return destinoRepository.findByIdTide(id_tide);
	}

	@Override
	public List<Destino> findDestinoActivo() {
		return destinoRepository.findDestinoActivo();
	}
	
	//TRABAJO FINAL
	
	@Override
	public Destino crearDestino(Destino nuevoDestino) {
	    nuevoDestino.setFechaCreacion(new Date());
	    nuevoDestino.setEstado("A");
	    return destinoRepository.save(nuevoDestino);
	}

	@Override
	public Destino editarDestino(Integer idDestino, Destino destinoActualizado) {
	    Destino destinoExistente = destinoRepository.findById(idDestino).orElse(null);
	    if (destinoExistente != null) {
	        destinoActualizado.setIdDest(idDestino);
	        destinoActualizado.setFechaModificacion(new Date());
	        return destinoRepository.save(destinoActualizado);
	    } else {
	        
	        return null;
	    }
	}

	@Override
	public Boolean eliminarDestino(Integer idDestino) {
	    Destino destinoEliminar = destinoRepository.findById(idDestino).orElse(null);
	    if (destinoEliminar != null) {
	        destinoRepository.delete(destinoEliminar);
	        return true; 
	    } else {
	        return false;
	    }
	}

}
