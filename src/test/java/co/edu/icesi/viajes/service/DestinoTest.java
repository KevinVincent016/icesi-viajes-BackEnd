package co.edu.icesi.viajes.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import co.edu.icesi.viajes.domain.Destino;

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

	

}
