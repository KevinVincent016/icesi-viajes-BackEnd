package co.edu.icesi.viajes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.icesi.viajes.domain.TipoIdentificacion;

public interface TipoIdentificacionRepository extends JpaRepository<TipoIdentificacion, Integer>{
	
	public List<TipoIdentificacion> findByEstadoOrderByNombreAsc(String estado);
	
	public TipoIdentificacion findByCodigoAndEstado(String codigo, String estado);


}
