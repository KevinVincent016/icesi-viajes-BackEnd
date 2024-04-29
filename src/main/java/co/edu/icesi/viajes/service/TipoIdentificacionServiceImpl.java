package co.edu.icesi.viajes.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import co.edu.icesi.viajes.domain.TipoIdentificacion;
import co.edu.icesi.viajes.repository.TipoIdentificacionRepository;

@Scope("singleton")
@Service
public class TipoIdentificacionServiceImpl implements TipoIdentificacionService{
	
	@Autowired
	private TipoIdentificacionRepository tipoIdentificacionRepository;

	@Override
	public List<TipoIdentificacion> findAll() {
		
		List<TipoIdentificacion> lstTipoIdentificacion = tipoIdentificacionRepository.findAll();
		
		return lstTipoIdentificacion;
	}

	@Override
	public Optional<TipoIdentificacion> findById(Integer id) {
		// TODO Auto-generated method stub
		return tipoIdentificacionRepository.findById(id);
	}

	@Override
	public TipoIdentificacion save(TipoIdentificacion entity) throws Exception {
		// TODO Auto-generated method stub
		return tipoIdentificacionRepository.save(entity);
	}

	@Override
	public TipoIdentificacion update(TipoIdentificacion entity) throws Exception {
		// TODO Auto-generated method stub
		return tipoIdentificacionRepository.save(entity);
	}

	@Override
	public void delete(TipoIdentificacion entity) throws Exception {
		// TODO Auto-generated method stub
		tipoIdentificacionRepository.delete(entity);
	}

	@Override
	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		tipoIdentificacionRepository.deleteById(id);
	}

	@Override
	public void validate(TipoIdentificacion entity) throws Exception {
		// TODO Auto-generated method stub
	}

	@Override
	public Long count() {
		// TODO Auto-generated method stub
		return tipoIdentificacionRepository.count();
	}

	@Override
	public List<TipoIdentificacion> findByEstadoOrderByNombreAsc(String estado) {
		return tipoIdentificacionRepository.findByEstadoOrderByNombreAsc(estado);
	}

	@Override
	public TipoIdentificacion findByCodigoAndEstado(String codigo, String estado) {
		return tipoIdentificacionRepository.findByCodigoAndEstado(codigo, estado);
	}
	
	

}
