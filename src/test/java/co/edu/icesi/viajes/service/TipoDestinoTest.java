package co.edu.icesi.viajes.service;
import co.edu.icesi.viajes.domain.TipoDestino;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class TipoDestinoTest {

    @Autowired
    private TipoDestinoService tipoDestinoService;

    @Test
    void testParaVerificarRetornoDeListaDeTipoDestino() {
        List<TipoDestino> lstTipoDestino = tipoDestinoService.findAll();
        
        assertNotNull(lstTipoDestino, "La lista de tipos de destino no debería ser null");
        assertFalse(lstTipoDestino.isEmpty(), "La lista de tipos de destino no debería estar vacía");
    }

    @Test
    void testParaVerificarRetornoPorCodigoDeTipoDestino() {
        TipoDestino tipoDestino = tipoDestinoService.findById(7).get();
        
        assertEquals(tipoDestino.getCodigo(),"CULTU");
    }

    @Test
    void testParaVerificarGuardadoDeTipoDestino() throws Exception {

        TipoDestino tipoDestino = new TipoDestino();
        tipoDestino.setIdTide(10);
        tipoDestino.setCodigo("TST");
        tipoDestino.setNombre("TEST");
        tipoDestino.setDescripcion("DESTINO QUE CUENTA CON MUCHAS ACTIVIDADES EXTREMAS Y EMOCINANTES");

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = dateFormat.parse("10/10/2024");

        tipoDestino.setFechaCreacion(fecha);
        tipoDestino.setFechaModificacion(null);
        tipoDestino.setUsuCreador("TESTER2");
        tipoDestino.setEstado("A");
        tipoDestinoService.save(tipoDestino);

        assertEquals(tipoDestino.getCodigo(),"TST");
        assertEquals(tipoDestino.getEstado(),"A");

    }

    @Test
    void testPAraRetornarTipoDestinoActualizado() throws Exception {

        TipoDestino tipoDestino = tipoDestinoService.findById(10).get();

        tipoDestino.setNombre("EVENTOTEST");
        tipoDestino.setDescripcion("DESTINO SOLO PARA AVENTUREROS, CUENTA CON ACTIVIDADES EXTREMAS Y EMOCIONANTES!");

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = formato.parse("10/10/2024");

        tipoDestino.setFechaCreacion(fecha);
        tipoDestino.setFechaModificacion(null);
        tipoDestino.setUsuCreador("TESTER3");
        tipoDestino.setEstado("A");
        tipoDestinoService.update(tipoDestino);
        
        assertEquals(tipoDestino.getNombre(),"EVENTOTEST");
        assertEquals(tipoDestino.getUsuCreador(),"TESTER3");

    }

    @Test
    void testParaEliminarUnTipoDestino() throws Exception {
        TipoDestino tipoDestino = tipoDestinoService.findById(10).get();
        tipoDestinoService.delete(tipoDestino);
        System.out.println( "El destino:" + tipoDestino.getCodigo() + "-" + tipoDestino.getNombre() + " ha sido eliminado\n");

        assertFalse(tipoDestinoService.findById(10).isPresent());
    }

    @Test
    void consultarLosTipoDestinoAlfabeticamente() {
        List<TipoDestino> lstTipoDestino = tipoDestinoService.consultarLosTipoDestino();

        for (TipoDestino tipoDestino : lstTipoDestino) {
            System.out.println("Nombre: " + tipoDestino.getNombre() + " - Descripcion: " + tipoDestino.getDescripcion() + " - Estado: " + tipoDestino.getEstado());
        }
    }

}