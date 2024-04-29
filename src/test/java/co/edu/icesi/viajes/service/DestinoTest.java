package co.edu.icesi.viajes.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import co.edu.icesi.viajes.domain.Destino;

@SpringBootTest
class DestinoTest {
	
	@Autowired
	private DestinoService destinoService;

	@Test
    void debeRetornarClientesPorPrimerOSegundoApellido() {
		
		Destino destino = destinoService.findByCodigoAndEstado("CARTA", "A");
		
		System.out.println(destino.getNombre() + " - " + destino.getDescripcion());
		
	}
	
	@Test
    void debeRetornarDestinosPorTipoDestino() {
		
		Integer id = 2; 
		
		List<Destino> lstDestino = destinoService.findByIdTide(id);
		
		for(Destino destino: lstDestino) {
			System.out.println(destino.getIdTide() + " - " + destino.getNombre() + " - " + destino.getDescripcion());
		}
		
	}
	
	@Test
    void debeRetornarDestinosActivos() {
		
		List<Destino> lstDestino = destinoService.findDestinoActivo();
		
		for(Destino destino: lstDestino) {
			System.out.println(destino.getIdTide() + " - H " + destino.getNombre());
		}
		
	}
	
}
