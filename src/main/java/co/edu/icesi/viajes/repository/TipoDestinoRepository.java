package co.edu.icesi.viajes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import co.edu.icesi.viajes.domain.TipoDestino;
import co.edu.icesi.viajes.dto.TipoDestinoDTO;

public interface TipoDestinoRepository extends JpaRepository<TipoDestino, Integer>{
	
	public List<TipoDestino> findByCodigo(String codigo);
	
	public List<TipoDestino> findByCodigoAndEstado(String codigo, String estado);

	@Query("select tp from TipoDestino tp where tp.codigo = ?1")
	public List<TipoDestino> consultarPorCodigo(String codigo);
	
	//orm.xml
	@Query(nativeQuery = true)
	public List<TipoDestinoDTO> consultarTipoDestinoPorEstado(@Param("pEstado")String estado);
	
	@Query("select tp from TipoDestino tp order by tp.nombre")
	public List<TipoDestino> tipoDestinoAlf();
	
}
