package co.edu.icesi.viajes.service;

import co.edu.icesi.viajes.dto.TipoIdentificacionDTO;
import co.edu.icesi.viajes.repository.ClienteRepository;
import co.edu.icesi.viajes.repository.TipoIdentificacionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;

@SpringBootTest
public class TipoIdentificacionTest {

    @Autowired
    TipoIdentificacionService tipoIdentificacionService;

    @Test
    void consultarTipoIdentificacionPorEstado() {

        List<TipoIdentificacionDTO> lstTipoIdentificacion = tipoIdentificacionService.consultarTipoIdentificacionPorEstado("A");

        for (TipoIdentificacionDTO tipoIdentificacion : lstTipoIdentificacion) {
            System.out.println("Tipo de Identificacion: " + tipoIdentificacion.getIdTiid() + " - Nombre: " + tipoIdentificacion.getNombre() + " - Estado: " + tipoIdentificacion.getEstado());
        }
    }

    @Test
    void consultarTipoIdentificacionPorCodigoYEstado() {

        List<TipoIdentificacionDTO> lstTipoIdentificacion = tipoIdentificacionService.consultarTipoIdentificacionPorCodigoYEstado("CC","A");

        for (TipoIdentificacionDTO tipoIdentificacion : lstTipoIdentificacion) {
            System.out.println("Tipo de Identificacion: " + tipoIdentificacion.getIdTiid() + " - Nombre: " + tipoIdentificacion.getNombre() + " - Estado: " + tipoIdentificacion.getEstado() + " - Codigo: " + tipoIdentificacion.getCodigo());
        }
    }

}
