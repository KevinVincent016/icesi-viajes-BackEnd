package co.edu.icesi.viajes.repository;

import co.edu.icesi.viajes.domain.TipoIdentificacion;
import co.edu.icesi.viajes.dto.TipoIdentificacionDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import java.util.List;

public interface TipoIdentificacionRepository extends JpaRepository<TipoIdentificacion, Integer> {

    //1.Consultar todos los tipo de identificación por estado ordenados alfabéticamente.
    @Query(nativeQuery = true)
    public List<TipoIdentificacionDTO> consultarTipoIdentificacionPorEstado(@Param("pEstado") String estado);

    //7.Consultar tipo de identificación por código y estado.
    @Query(nativeQuery = true)
    public List<TipoIdentificacionDTO> consultarTipoIdentificacionPorCodigoYEstado(@Param("pCodigo") String codigo, @Param("pEstado") String estado);

}
