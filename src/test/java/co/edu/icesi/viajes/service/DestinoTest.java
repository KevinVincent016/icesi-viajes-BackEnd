package co.edu.icesi.viajes.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import co.edu.icesi.viajes.domain.Destino;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@SpringBootTest
class DestinoTest {
	private static final Logger logger = LoggerFactory.getLogger(DestinoTest.class);

	@Autowired
	private DestinoService destinoService;

	@Test
	void debeRetornarClientesPorPrimerOSegundoApellido() {

		Destino destino = destinoService.findByCodigoAndEstado("CARTA", "A");

		logger.info("{} - {} - {}", destino.getCodigo(), destino.getNombre(), destino.getEstado());
	}

	@Test
	void debeRetornarDestinosPorTipoDestino() {

		Integer id = 2;

		List<Destino> lstDestino = destinoService.findByIdTide(id);

		for (Destino destino : lstDestino) {
			logger.info("{} - {} - {}", destino.getCodigo(), destino.getNombre(), destino.getEstado());

		}


	}

	@Test
	void  debeRetornarListadeDestinos(){
        List<Destino> destinos = destinoService.findAll();
        ResponseEntity<Object> response = new ResponseEntity<>(destinos, HttpStatus.OK);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertNotNull(response.getBody());
        for(Destino destino: destinos){
            logger.info("{} - {} - {}", destino.getCodigo(), destino.getNombre(), destino.getEstado());
        }
    }

    @Test
    void  debeRetornarDestinoPorId(){
        Integer id = 1;
        Destino destino = destinoService.findById(id).get();
        ResponseEntity<Object> response = new ResponseEntity<>(destino, HttpStatus.OK);
        assertEquals(HttpStatus.OK, response.getStatusCode());
        assertNotNull(response.getBody());
        logger.info("{} - {} - {}", destino.getCodigo(), destino.getNombre(), destino.getEstado());
    }

	@Test
	void debeEliminarDestinoPorId() throws Exception {
		// Arrange
		Destino destino = new Destino();
		destino.setIdDest(777);
		destino.setCodigo("D7770");
		destino.setNombre("miproba");
		destino.setDescripcion("miproba");
		destino.setFechaCreacion(new Date());
		destino.setUsuCreador("CLOPEZ");
		destino.setEstado("A");
		destino.setIdTide(1);


		// Act
		Destino destinoCreado = destinoService.save(destino);
		Integer id = destinoCreado.getIdDest();
		destinoService.deleteById(id);

		// Assert
		Optional<Destino> destinoOptional = destinoService.findById(id);
		assertFalse(destinoOptional.isPresent());
	}

	@Test
	void debeCrearDestino() throws Exception {
		// Arrange
		Destino destino = new Destino();
		destino.setIdDest(777);
		destino.setCodigo("D7770");
		destino.setNombre("miproba");
		destino.setDescripcion("miproba");
		destino.setFechaCreacion(new Date());
		destino.setUsuCreador("CLOPEZ");
		destino.setEstado("A");
		destino.setIdTide(1);

		// Act
		Destino destinoCreado = destinoService.save(destino);

		// Assert
		assertNotNull(destinoCreado);
		assertEquals(destino.getCodigo(), destinoCreado.getCodigo());
		assertEquals(destino.getNombre(), destinoCreado.getNombre());
		assertEquals(destino.getDescripcion(), destinoCreado.getDescripcion());
		assertEquals(destino.getFechaCreacion(), destinoCreado.getFechaCreacion());
		assertEquals(destino.getUsuCreador(), destinoCreado.getUsuCreador());
		assertEquals(destino.getEstado(), destinoCreado.getEstado());
		assertEquals(destino.getIdTide(), destinoCreado.getIdTide());
		destinoService.deleteById(destinoCreado.getIdDest());
	}


	@Test
	void debeModificarDestino() throws Exception {
		// Arrange
		Destino destino = new Destino();
		destino.setIdDest(777);
		destino.setCodigo("D7770");
		destino.setNombre("miproba");
		destino.setDescripcion("miproba");
		destino.setFechaCreacion(new Date());
		destino.setUsuCreador("CLOPEZ");
		destino.setEstado("A");
		destino.setIdTide(1);

		Destino destinoCreado = destinoService.save(destino);
		Integer id = destinoCreado.getIdDest();
		destinoCreado.setNombre("miproba2");
		destinoCreado.setDescripcion("miproba2");
		destinoCreado.setFechaCreacion(new Date());
		destinoCreado.setUsuCreador("CLOPEZ2");
		destinoCreado.setEstado("I");
		destinoCreado.setIdTide(2);

		// Act
		Destino destinoActualizado = destinoService.update(destinoCreado);

		// Assert
		assertNotNull(destinoActualizado);
		assertEquals(destinoCreado.getCodigo(), destinoActualizado.getCodigo());
		assertEquals(destinoCreado.getNombre(), destinoActualizado.getNombre());
		assertEquals(destinoCreado.getDescripcion(), destinoActualizado.getDescripcion());
		assertEquals(destinoCreado.getFechaCreacion(), destinoActualizado.getFechaCreacion());
		assertEquals(destinoCreado.getUsuCreador(), destinoActualizado.getUsuCreador());
		assertEquals(destinoCreado.getEstado(), destinoActualizado.getEstado());
		assertEquals(destinoCreado.getIdTide(), destinoActualizado.getIdTide());
		destinoService.deleteById(id);
	}



}
