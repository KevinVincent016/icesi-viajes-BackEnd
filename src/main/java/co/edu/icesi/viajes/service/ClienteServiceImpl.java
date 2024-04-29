package co.edu.icesi.viajes.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import co.edu.icesi.viajes.domain.Cliente;
import co.edu.icesi.viajes.dto.ClienteDTO;
import co.edu.icesi.viajes.repository.ClienteRepository;

@Scope("singleton")
@Service
public class ClienteServiceImpl implements ClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;

	@Override
	public List<Cliente> findAll() {
		
		List<Cliente> lstCliente = clienteRepository.findAll();
		
		return lstCliente;
	}

	@Override
	public Optional<Cliente> findById(Integer id) {
		// TODO Auto-generated method stub
		return clienteRepository.findById(id);
	}

	@Override
	public Cliente save(Cliente entity) throws Exception {
		// TODO Auto-generated method stub
		return clienteRepository.save(entity);
	}

	@Override
	public Cliente update(Cliente entity) throws Exception {
		// TODO Auto-generated method stub
		return clienteRepository.save(entity);
	}

	@Override
	public void delete(Cliente entity) throws Exception {
		// TODO Auto-generated method stub
		clienteRepository.delete(entity);
	}

	@Override
	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		clienteRepository.deleteById(id);
	}

	@Override
	public void validate(Cliente entity) throws Exception {
		// TODO Auto-generated method stub
	}

	@Override
	public Long count() {
		// TODO Auto-generated method stub
		return clienteRepository.count();
	}

	@Override
	public Page<Cliente> findByEstadoOrderByNumeroIdentificacionAsc(String estado, Pageable pageable) {
		return clienteRepository.findByEstadoOrderByNumeroIdentificacionAsc(estado, pageable);
	}

	@Override
	public Cliente findByCorreoIgnoreCase(String correo) {
		return clienteRepository.findByCorreoIgnoreCase(correo);
	}

	@Override
	public Cliente findByNumeroIdentificacionLike(String numeroIdentificacion) {
		return clienteRepository.findByNumeroIdentificacionLike(numeroIdentificacion);
	}

	@Override
	public Cliente findByNombreIgnoreCaseLike(String nombre) {
		return clienteRepository.findByNombreIgnoreCaseLike(nombre);
	}

	@Override
	public List<Cliente> findByFechaNacimientoBetween(Date fechaInicio, Date fechaFin) {
		return clienteRepository.findByFechaNacimientoBetween(fechaInicio, fechaFin);
	}

	@Override
	public Long countByEstado(String estado) {
		return clienteRepository.countByEstado(estado);
	}

	@Override
	public Page<Cliente> findByIdTiid(Integer idTiid, Pageable pageable) {
		return clienteRepository.findByIdTiid(idTiid, pageable);
	}

	@Override
	public List<Cliente> findByPrimerApellidoAndSegundoApellido(String primerApellido, String segundoApellido) {
		return clienteRepository.findByPrimerApellidoAndSegundoApellido(primerApellido, segundoApellido);
	}

	@Override
	public Page<ClienteDTO> obtenerClientesConUltimoPlanContratado(Pageable pageable) {
		return clienteRepository.obtenerClientesConUltimoPlanContratado(pageable);
	}

	@Override
	public List<ClienteDTO> consultarClientesSegunCriterios(String estado, String numeroIdentificacion, Integer tipoIdentificacion, String nombre) {
		return clienteRepository.consultarClientesSegunCriterios(estado, numeroIdentificacion, tipoIdentificacion, nombre);
	}

	

	
	

}
