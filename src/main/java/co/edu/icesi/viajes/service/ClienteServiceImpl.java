package co.edu.icesi.viajes.service;

import co.edu.icesi.viajes.domain.Cliente;
import co.edu.icesi.viajes.dto.ClienteDTO;
import co.edu.icesi.viajes.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Scope("singleton")
@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<Cliente> findAll() {
        List<Cliente> lstCliente = clienteRepository.findAll();
        return lstCliente;
    }

    @Override
    public Optional<Cliente> findById(Integer id) {
        return clienteRepository.findById(id);
    }

    @Override
    public Cliente save(Cliente entity) throws Exception {
        return clienteRepository.save(entity);
    }

    @Override
    public Cliente update(Cliente entity) throws Exception {
        return clienteRepository.save(entity);
    }

    @Override
    public void delete(Cliente entity) throws Exception {
        clienteRepository.delete(entity);
    }

    @Override
    public void deleteById(Integer id) throws Exception {
        clienteRepository.deleteById(id);
    }

    @Override
    public void validate(Cliente entity) throws Exception {

    }

    @Override
    public Long count() {
        return clienteRepository.count();
    }

    @Override
    public List<Cliente> consultarClientesPorEstado(String estado, Pageable pageable) {
        return clienteRepository.consultarClientesPorEstado(estado, pageable);
    }

    @Override
    public List<Cliente> consultarClientePorCorreoElectronico(String correo) {
        return clienteRepository.consultarClientePorCorreoElectronico(correo);
    }

    @Override
    public List<Cliente> consultarClientePorNumeroDeIdentificacion(String numeroIdentificacion) {
        return clienteRepository.consultarClientePorNumeroDeIdentificacion(numeroIdentificacion);
    }

    @Override
    public List<Cliente> consultarClientePorNombre(String nombre) {
        return clienteRepository.consultarClientePorNombre(nombre);
    }

    @Override
    public List<Cliente> consultarClientePorRangoDeFecha(Date fecha1, Date fecha2) {
        return clienteRepository.consultarClientePorRangoDeFecha(fecha1, fecha2);
    }

    @Override
    public int consultarTotalClientesPorEstado(String estado) {
        return clienteRepository.consultarTotalClientesPorEstado(estado);
    }

    @Override
    public List<Cliente> consultarClientesPorTipoIdentificacion(int idTiid, Pageable pageable) {
        return clienteRepository.consultarClientesPorTipoIdentificacion(idTiid, pageable);
    }

    @Override
    public List<Cliente> consultarClientesPorApellido(String primerApellido, String segundoApellido) {
        return clienteRepository.consultarClientesPorApellido(primerApellido, segundoApellido);
    }

    @Override
    public List<ClienteDTO> consultarClientesSegunCriterios(String estado, String numeroIdentificacion, Integer tipoIdentificacion, String nombre) {
        return clienteRepository.consultarClientesSegunCriterios(estado, numeroIdentificacion, tipoIdentificacion, nombre);
    }
}
