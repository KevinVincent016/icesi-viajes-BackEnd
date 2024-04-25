package co.edu.icesi.viajes.service;

import co.edu.icesi.viajes.domain.Destino;
import co.edu.icesi.viajes.dto.DestinoDTO;

import java.util.List;


public interface DestinoService extends GenericService<Destino,Integer>{

    //11. Consultar un destino por código y estado activo.
    Destino consultarDestinoPorCodigoYEstadoActivo(String codigo);

    //12. Consultar los destinos por tipo de destino
    List<Destino> consultarDestinosPorTipoDestino(String id_tide);

    //13. Consultar todos los destinos activos, mostrando que tipo de destino es.
    List<Destino> consultarDestinosActivos();

    List<DestinoDTO> consultarDestinosYPlanesAsociadosYValor();

}
