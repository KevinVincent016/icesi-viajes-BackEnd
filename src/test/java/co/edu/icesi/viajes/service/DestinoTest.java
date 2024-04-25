package co.edu.icesi.viajes.service;

import co.edu.icesi.viajes.domain.Destino;
import co.edu.icesi.viajes.dto.DestinoDTO;
import co.edu.icesi.viajes.dto.TipoIdentificacionDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;

@SpringBootTest
public class DestinoTest {

    @Autowired
    DestinoService destinoService;

    @Test
    void consultarDestinoPorCodigoYEstadoActivo() {
        Destino resultado = destinoService.consultarDestinoPorCodigoYEstadoActivo("D001");

        System.out.println("Codigo: " + resultado.getCodigo() + " - Nombre: " + resultado.getNombre() + " - Descripcion " + resultado.getDescripcion() + " - Estado: " + resultado.getEstado());
    }

    @Test
    void consultarDestinoPorTipoDestino() {
        List<Destino> lstDestino = destinoService.consultarDestinosPorTipoDestino("7");

        for (Destino destino : lstDestino) {
            System.out.println("Nombre: " + destino.getNombre() + " - Descripcion " + destino.getDescripcion() + " - Tipo Destino: " + destino.getIdTide());
        }
    }

    @Test
    void consultarTodosLosDestinosActivos() {
        List<Destino> lstDestino = destinoService.consultarDestinosActivos();

        for (Destino destino : lstDestino) {
            System.out.println("Nombre: " + destino.getNombre() + " - Tipo Destino: " + destino.getIdTide() + " - Estado: " + destino.getEstado());
        }
    }

    @Test
    void consultarDestinosYPlanesAsociadosYValor(){
        List<DestinoDTO> lstDestinoDTO = destinoService.consultarDestinosYPlanesAsociadosYValor();

        for (DestinoDTO destino : lstDestinoDTO) {
            System.out.println("Nombre Destino: " + destino.getNombre() + " - Descripcion: " + destino.getDescripcion() + " - TotalPlanes: " + destino.getTotal_planes() + " - Promedio Valor Plan: " + destino.getPromedio_valor_plan());
        }
    }

}
