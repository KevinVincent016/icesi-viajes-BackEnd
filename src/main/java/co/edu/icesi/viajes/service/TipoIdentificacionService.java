package co.edu.icesi.viajes.service;

import java.util.List;

import co.edu.icesi.viajes.domain.TipoIdentificacion;

public interface TipoIdentificacionService extends GenericService<TipoIdentificacion, Integer>{
	
	public List<TipoIdentificacion> findByEstadoOrderByNombreAsc(String estado);
	
	public TipoIdentificacion findByCodigoAndEstado(String codigo, String estado);

}
