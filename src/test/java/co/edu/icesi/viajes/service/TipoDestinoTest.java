package co.edu.icesi.viajes.service;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import co.edu.icesi.viajes.domain.TipoDestino;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest
class TipoDestinoTest {
	
	@Autowired
	private TipoDestinoService tipoDestinoService;

	//findAll
	@Test
	@Order(1)
	void debeRetornarListaDeTiposDestino() {
		
		List<TipoDestino> lstTipoDestino = tipoDestinoService.findAll();
		
		for(TipoDestino tipoDestino: lstTipoDestino) {
			System.out.println(tipoDestino.getCodigo() + " - " + tipoDestino.getNombre());
		}
		
	}
	
	//findById
	@Test
	@Order(2)
    void debeEncontrarUnTipoDestinoPorId() {
        
        Integer tipoDestinoId = 2;
        
        Optional<TipoDestino> tipoDestinoOptional = tipoDestinoService.findById(tipoDestinoId);
        
        assertTrue(tipoDestinoOptional.isPresent());
        assertEquals(tipoDestinoId, tipoDestinoOptional.get().getIdTide());
    }
	
	@Test
	@Order(3)
	void debeGuardarUnTipoDestino() {
	    TipoDestino tipoDestino = new TipoDestino();
	    tipoDestino.setIdTide(1); 
	    tipoDestino.setCodigo("MARES"); 
	    tipoDestino.setNombre("Mar");
	    tipoDestino.setDescripcion("Mar Bonito");
	    LocalDate localDate = LocalDate.of(2020, 1, 8);
        Date fechaCreacion = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        tipoDestino.setFechaCreacion(fechaCreacion);
	    tipoDestino.setUsuCreador("CLOPEZ");
	    tipoDestino.setEstado("A");

	    try {
	        TipoDestino savedTipoDestino = tipoDestinoService.save(tipoDestino);
	        assertNotNull(savedTipoDestino);
	        assertNotNull(savedTipoDestino.getIdTide());
	    } catch (Exception e) {
	        fail("Error al guardar el TipoDestino: " + e.getMessage());
	    }
	}

	@Test
	@Order(4)
    void debeActualizarUnTipoDestino() {
      
        Integer tipoDestinoId = 9;
        
        try {
            Optional<TipoDestino> tipoDestinoOptional = tipoDestinoService.findById(tipoDestinoId);
            assertTrue(tipoDestinoOptional.isPresent());
            
            TipoDestino tipoDestino = tipoDestinoOptional.get();
            String nuevaDescripcion = "Lagunas espectaculares";

            tipoDestino.setDescripcion(nuevaDescripcion);

            TipoDestino updatedTipoDestino = tipoDestinoService.update(tipoDestino);
            assertNotNull(updatedTipoDestino);
            assertEquals(nuevaDescripcion, updatedTipoDestino.getDescripcion());
        } catch (Exception e) {
            fail("Error al actualizar el TipoDestino: " + e.getMessage());
        }
    }
    
    //Delete
	@Test
	@Order(5)
	void debeEliminarUnTipoDestino() {
	    try {
	        
	    	TipoDestino tipoDestino = new TipoDestino();
	        tipoDestino.setIdTide(11); 
	        tipoDestino.setCodigo("codi4");
	        tipoDestino.setNombre("nombre4");
	        tipoDestino.setDescripcion("descripcion4");
	        LocalDate localDate = LocalDate.of(2022, 1, 8);
	        Date fechaCreacion = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
	        tipoDestino.setFechaCreacion(fechaCreacion);
	        tipoDestino.setUsuCreador("CLOPEZ");
	        tipoDestino.setEstado("A");

	        TipoDestino savedTipoDestino = tipoDestinoService.save(tipoDestino);
	        assertNotNull(savedTipoDestino);

	        Integer tipoDestinoId = savedTipoDestino.getIdTide();

	        
	        Optional<TipoDestino> tipoDestinoOptional = tipoDestinoService.findById(tipoDestinoId);
	        assertTrue(tipoDestinoOptional.isPresent());

	        tipoDestinoService.delete(savedTipoDestino);

	        tipoDestinoOptional = tipoDestinoService.findById(tipoDestinoId);
	        assertFalse(tipoDestinoOptional.isPresent());
	    } catch (Exception e) {
	        fail("Error al eliminar el TipoDestino: " + e.getMessage());
	    }
	}

    
    //DeleteById
    @Test
    @Order(6)
    void debeEliminarUnTipoDestinoPorId() {
        TipoDestino tipoDestino = new TipoDestino();
        tipoDestino.setIdTide(10); 
        tipoDestino.setCodigo("codi3");
        tipoDestino.setNombre("nombre3");
        tipoDestino.setDescripcion("descripcion3");
        LocalDate localDate = LocalDate.of(2021, 1, 8);
        Date fechaCreacion = Date.from(localDate.atStartOfDay(ZoneId.systemDefault()).toInstant());
        tipoDestino.setFechaCreacion(fechaCreacion);
        tipoDestino.setUsuCreador("CLOPEZ");
        tipoDestino.setEstado("A");

        try {
            TipoDestino savedTipoDestino = tipoDestinoService.save(tipoDestino);
            assertNotNull(savedTipoDestino);

            Integer tipoDestinoId = savedTipoDestino.getIdTide();
            tipoDestinoService.deleteById(tipoDestinoId);

            Optional<TipoDestino> deletedTipoDestino = tipoDestinoService.findById(tipoDestinoId);
            assertFalse(deletedTipoDestino.isPresent());

            long expectedCount = 9;
            long actualCount = tipoDestinoService.count();
            assertEquals(expectedCount, actualCount);
        } catch (Exception e) {
            fail("Error al eliminar el TipoDestino: " + e.getMessage());
        }
    }
    
    //Count
    @Test
    @Order(7)
    void debeContarLaCantidadDeTiposDestino() {
     
        long expectedCount = 9;

        long actualCount = tipoDestinoService.count();
        assertEquals(expectedCount, actualCount);
    }
    
    //ListaPorCodigo
    @Test
    @Order(8)
    void debeRetornarListaTiposDestinoPorCodigo() {
		
		List<TipoDestino> lstTipoDestino = tipoDestinoService.findByCodigo("PLAYA");
		
		for(TipoDestino tipoDestino: lstTipoDestino) {
			System.out.println(tipoDestino.getCodigo() + " - " + tipoDestino.getNombre());
		}
		
	}
    
    //ListaPorCodigoYEstado
    @Test
    @Order(9)
    void debeRetornarListaTiposDestinoPorCodigoEstado() {
		
		List<TipoDestino> lstTipoDestino = tipoDestinoService.findByCodigoAndEstado("PLAYA", "A");
		
		for(TipoDestino tipoDestino: lstTipoDestino) {
			System.out.println(tipoDestino.getCodigo() + " - " + tipoDestino.getNombre());
		}
		
	}
    
    //QUERIES
    
    @Test
    @Order(10)
    void debeRetornarListaTiposDestinoPorNombreAscendente() {
		
    	List<TipoDestino> lstTipoDestino = tipoDestinoService.tipoDestinoAlf();
		
		for(TipoDestino tipoDestino: lstTipoDestino) {
			
			System.out.println(tipoDestino.getNombre() + " - - " + tipoDestino.getDescripcion());
			
		}
		
	}
    
    

}
