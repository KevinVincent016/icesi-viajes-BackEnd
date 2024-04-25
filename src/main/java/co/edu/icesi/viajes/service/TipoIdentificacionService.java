package co.edu.icesi.viajes.service;

import co.edu.icesi.viajes.domain.TipoIdentificacion;
import co.edu.icesi.viajes.dto.TipoIdentificacionDTO;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface TipoIdentificacionService extends GenericService<TipoIdentificacion,Integer>{

    //1.Consultar todos los tipo de identificación por estado ordenados alfabéticamente.
    public List<TipoIdentificacionDTO> consultarTipoIdentificacionPorEstado(@Param("pEstado") String estado);

    //7.Consultar tipo de identificación por código y estado.
    public List<TipoIdentificacionDTO> consultarTipoIdentificacionPorCodigoYEstado(@Param("pCodigo") String codigo, @Param("pEstado") String estado);

}