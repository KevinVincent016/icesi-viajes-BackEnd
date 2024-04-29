package co.edu.icesi.viajes.service;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import co.edu.icesi.viajes.domain.TipoIdentificacion;

@SpringBootTest
class TipoIdentificacionTest {
	
	@Autowired
	private TipoIdentificacionService tipoIdentificacionService;

	@Test
    void debeRetornarListaTiposIdentificacionPorEstadoAlfabeticamente() {
		
		List<TipoIdentificacion> lstTipoIdentificacion = tipoIdentificacionService.findByEstadoOrderByNombreAsc("A");
		
		for(TipoIdentificacion tipoIdentificacion: lstTipoIdentificacion) {
			System.out.println(tipoIdentificacion.getCodigo() + " - " + tipoIdentificacion.getNombre());
		}
		
	}
	
	@Test
    void debeRetornarTipoIdentificacionPorCodigoYEstado() {
		
		TipoIdentificacion tipoIdentificacion = tipoIdentificacionService.findByCodigoAndEstado("CE", "A");

		System.out.println(tipoIdentificacion.getCodigo() + " - " + tipoIdentificacion.getNombre() + " - " + tipoIdentificacion.getEstado());
		
	}
	
	

}
