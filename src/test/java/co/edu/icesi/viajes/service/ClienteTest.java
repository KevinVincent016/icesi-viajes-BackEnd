package co.edu.icesi.viajes.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import co.edu.icesi.viajes.domain.Cliente;
import co.edu.icesi.viajes.dto.ClienteDTO;

@SpringBootTest
class ClienteTest {

	@Autowired
	private ClienteService clienteService;
	
	PageRequest pageable = PageRequest.of(0, 10);

	@Test
    void debeRetornarPaginaDeNumeroIdentificacionPorEstadoAscendente() {
        PageRequest pageable = PageRequest.of(0, 10); 

        Page<Cliente> clientePage = clienteService.findByEstadoOrderByNumeroIdentificacionAsc("A", pageable);

        List<Cliente> lstCliente = clientePage.getContent();

        for(Cliente cliente: lstCliente) {
            System.out.println(cliente.getNumeroIdentificacion() + " - " + cliente.getNombre());
        }
    }
	
	@Test
    void debeRetornarListaClientePorCorreoIgnorando() {

        Cliente cliente = clienteService.findByCorreoIgnoreCase("luisa@example.com");

        System.out.println(cliente.getNumeroIdentificacion() + " - " + cliente.getNombre() + " - " + cliente.getCorreo());
        
    }
	
	@Test
    void debeRetornarClientePorIdentificacionLike() {

        Cliente cliente = clienteService.findByNumeroIdentificacionLike("444555666");

        System.out.println(cliente.getNumeroIdentificacion() + " - " + cliente.getNombre() + " - " + cliente.getCorreo());
        
    }
	
	@Test
    void debeRetornarClientePorNombreIgnoreCaseLike() {

        Cliente cliente = clienteService.findByNombreIgnoreCaseLike("JuAn");

        System.out.println(cliente.getNumeroIdentificacion() + " - " + cliente.getNombre() + " - " + cliente.getCorreo());
        
    }
	
	@Test
    void debeRetornarClientesPorFechaNacimientoBetween() {
        
        LocalDate localDate = LocalDate.of(1984, 10, 19);
        Date fechaInicio = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        
        LocalDate localDate2 = LocalDate.of(1994, 10, 19);
        Date fechaFin = Date.from(localDate2.atStartOfDay(ZoneId.systemDefault()).toInstant());

		List<Cliente> lstCliente = clienteService.findByFechaNacimientoBetween(fechaInicio, fechaFin);
		
        for(Cliente cliente: lstCliente) {
        	
        	System.out.println(cliente.getFechaNacimiento() + " - " + cliente.getNombre() + " - " + cliente.getCorreo());
        
        }
        
    }
	
	@Test
    void debeRetornarTotalClientesPorEstado() {
		
		System.out.println(clienteService.countByEstado("A"));
        
    }
	
	@Test
    void debeRetornarClientesPorTipoIdentificacion() {
       
        Integer idTiid = 1;

        Page<Cliente> clientePage = clienteService.findByIdTiid(idTiid, pageable);

        List<Cliente> lstCliente = clientePage.getContent();

        for (Cliente cliente : lstCliente) {
            System.out.println(cliente.getNumeroIdentificacion() + " - " + cliente.getNombre());
        }
        
    }	
	
	@Test
    void debeRetornarClientesPorPrimerOSegundoApellido() {
		
		List<Cliente> lstCliente = clienteService.findByPrimerApellidoAndSegundoApellido("Gomez", null);
		
		for(Cliente cliente: lstCliente) {
			System.out.println(cliente.getNombre() + " - " + cliente.getPrimerApellido() + " - " + cliente.getEstado());
		}
		
	}
	
	//NativeQueries
	
	//15
	@Test
    void debeRetornarClientesConUltimoPlanContratado() {
        PageRequest pageable = PageRequest.of(0, 10);
        Page<ClienteDTO> clientesConUltimoPlan = clienteService.obtenerClientesConUltimoPlanContratado(pageable);

        assertNotNull(clientesConUltimoPlan, "La página de clientes con último plan no debe ser nula");

        for (ClienteDTO clienteDTO : clientesConUltimoPlan) {
            System.out.println("Cliente: " + clienteDTO.getNombre() + " - " + clienteDTO.getNumeroIdentificacion() + " - " + clienteDTO.getEstado());
            System.out.println("Último plan contratado:");
            System.out.println("  - Estado: " + clienteDTO.getEstadoDetallePlan());
            System.out.println("  - Alimentacion: " + clienteDTO.getAlimentacion());
            System.out.println("  - Hospedaje: " + clienteDTO.getHospedaje());
        }
    }

	//Puntos finales
	
	@Test
    void consultarClientesSegunCriterios(){
        List<ClienteDTO> lstCliente = clienteService.consultarClientesSegunCriterios("A",null,null,null);

        for (ClienteDTO cliente : lstCliente){
            System.out.println("Nro. Identidicaion: " + cliente.getNumeroIdentificacion() + " - Nombre: " + cliente.getNombre() + " - Estado: " + cliente.getEstado());
        }
    }
	
}
