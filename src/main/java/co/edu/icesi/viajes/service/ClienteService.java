package co.edu.icesi.viajes.service;

import java.util.Date;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import co.edu.icesi.viajes.domain.Cliente;
import co.edu.icesi.viajes.dto.ClienteDTO;

public interface ClienteService extends GenericService<Cliente, Integer>{
	
	public Page<Cliente> findByEstadoOrderByNumeroIdentificacionAsc(String estado, Pageable pageable);
	
	public Cliente findByCorreoIgnoreCase(String correo);
	
	public Cliente findByNumeroIdentificacionLike(String numeroIdentificacion);
	
	public Cliente findByNombreIgnoreCaseLike(String nombre);
	
	public List<Cliente> findByFechaNacimientoBetween(Date fechaInicio, Date fechaFin);
	
	@Query("SELECT COUNT(c) FROM Cliente c WHERE c.estado = ?1")
    public Long countByEstado(String estado);
	
	//public Page<Cliente> findByIdTiid(Integer idTiid, Pageable pageable);
	
	//public List<Cliente> findByPrimerApellidoAndSegundoApellido(String primerApellido, String segundoApellido);

	//public Page<ClienteDTO> obtenerClientesConUltimoPlanContratado(Pageable pageable);
	
	//public List<ClienteDTO> consultarClientesSegunCriterios(@Param("pEstado") String estado, @Param("pNumeroIdentificacion") String numeroIdentificacion, @Param("pTipoIdentificacion") Integer tipoIdentificacion, @Param("pNombre") String nombre);

}
