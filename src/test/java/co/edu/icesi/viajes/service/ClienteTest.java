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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootTest
class ClienteTest {

    private static final Logger logger = LoggerFactory.getLogger(ClienteTest.class);


    @Autowired
	private ClienteService clienteService;
	
	PageRequest pageable = PageRequest.of(0, 10);

	@Test
    void debeRetornarPaginaDeNumeroIdentificacionPorEstadoAscendente() {
        PageRequest pageable = PageRequest.of(0, 10); 

        Page<Cliente> clientePage = clienteService.findByEstadoOrderByNumeroIdentificacionAsc("A", pageable);

        List<Cliente> lstCliente = clientePage.getContent();

        for(Cliente cliente: lstCliente) {
            logger.info("{} - {}", cliente.getNumeroIdentificacion(), cliente.getNombre());
        }
    }
	
	@Test
    void debeRetornarListaClientePorCorreoIgnorando() {

        Cliente cliente = clienteService.findByCorreoIgnoreCase("luisa@example.com");

        logger.info("{} - {} - {}", cliente.getNumeroIdentificacion(), cliente.getNombre(), cliente.getCorreo());
        
    }
	
	@Test
    void debeRetornarClientePorIdentificacionLike() {

        Cliente cliente = clienteService.findByNumeroIdentificacionLike("444555666");

        logger.info("{} - {} - {}", cliente.getNumeroIdentificacion(), cliente.getNombre(), cliente.getCorreo());
        
    }
	
	@Test
    void debeRetornarClientePorNombreIgnoreCaseLike() {

        Cliente cliente = clienteService.findByNombreIgnoreCaseLike("JuAn");

        logger.info("{} - {} - {}", cliente.getNumeroIdentificacion(), cliente.getNombre(), cliente.getCorreo());
        
    }
	
	@Test
    void debeRetornarClientesPorFechaNacimientoBetween() {
        
        LocalDate localDate = LocalDate.of(1984, 10, 19);
        Date fechaInicio = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        
        LocalDate localDate2 = LocalDate.of(1994, 10, 19);
        Date fechaFin = Date.from(localDate2.atStartOfDay(ZoneId.systemDefault()).toInstant());

		List<Cliente> lstCliente = clienteService.findByFechaNacimientoBetween(fechaInicio, fechaFin);
		
        for(Cliente cliente: lstCliente) {

            logger.info("{} - {} - {}", cliente.getFechaNacimiento(), cliente.getNombre(), cliente.getCorreo());
        
        }
        
    }
	
	@Test
    void debeRetornarTotalClientesPorEstado() {
        long count = clienteService.countByEstado("A");

        logger.info("Total clients with state 'A': {}", count);
        
    }

	
}
