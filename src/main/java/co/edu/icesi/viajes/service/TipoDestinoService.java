package co.edu.icesi.viajes.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import co.edu.icesi.viajes.domain.TipoDestino;

public interface TipoDestinoService extends GenericService<TipoDestino, Integer> {

	public List<TipoDestino> findByCodigo(String codigo);
	
	public List<TipoDestino> findByCodigoAndEstado(String codigo, String estado);
	
	@Query("select tp from TipoDestino tp order by tp.nombre")
	public List<TipoDestino> tipoDestinoAlf();

	List<TipoDestino> obtenerTodos();
	
}
