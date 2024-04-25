package co.edu.icesi.viajes.repository;

import co.edu.icesi.viajes.domain.Destino;
import co.edu.icesi.viajes.dto.DestinoDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DestinoRepository extends JpaRepository<Destino, Integer> {

    //11. Consultar un destino por código y estado activo.
    @Query("SELECT d FROM Destino d WHERE d.codigo =?1 AND d.estado = 'A'")
    Destino consultarDestinoPorCodigoYEstadoActivo(String codigo);

    //12. Consultar los destinos por tipo de destino
    @Query("SELECT d FROM Destino d JOIN TipoDestino td ON d.idTide = td.idTide WHERE d.idTide = ?1")
    List<Destino> consultarDestinosPorTipoDestino(String id_tide);

    //13. Consultar todos los destinos activos, mostrando que tipo de destino es.
    @Query("SELECT d FROM Destino d JOIN TipoDestino td ON d.idTide = td.idTide WHERE d.estado = 'A'")
    List<Destino> consultarDestinosActivos();

    @Query(nativeQuery = true)
    List<DestinoDTO> consultarDestinosYPlanesAsociadosYValor();
}