package co.edu.icesi.viajes.mapper;

import co.edu.icesi.viajes.domain.Destino;
import co.edu.icesi.viajes.dto.DestinoDTOEndpoint;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface DestinoEndpointMapper {

    DestinoEndpointMapper INSTANCE = Mappers.getMapper(DestinoEndpointMapper.class);

    @Mapping(source = "destino.idDest", target = "idDest")
    @Mapping(source = "destino.codigo", target = "codigo")
    @Mapping(source = "destino.nombre", target = "nombre")
    @Mapping(source = "destino.descripcion", target = "descripcion")
    @Mapping(source = "destino.fechaCreacion", target = "fechaCreacion")
    @Mapping(source = "destino.fechaModificacion", target = "fechaModificacion")
    @Mapping(source = "destino.usuCreador", target = "usuCreador")
    @Mapping(source = "destino.usuModificador", target = "usuModificador")
    @Mapping(source = "destino.estado", target = "estado")
    @Mapping(source = "destino.idTide", target = "idTide")
    DestinoDTOEndpoint toDTOEndpoint(Destino destino);

    @Mapping(source = "destinoDTOEndpoint.idDest", target = "idDest")
    @Mapping(source = "destinoDTOEndpoint.codigo", target = "codigo")
    @Mapping(source = "destinoDTOEndpoint.nombre", target = "nombre")
    @Mapping(source = "destinoDTOEndpoint.descripcion", target = "descripcion")
    @Mapping(source = "destinoDTOEndpoint.fechaCreacion", target = "fechaCreacion")
    @Mapping(source = "destinoDTOEndpoint.fechaModificacion", target = "fechaModificacion")
    @Mapping(source = "destinoDTOEndpoint.usuCreador", target = "usuCreador")
    @Mapping(source = "destinoDTOEndpoint.usuModificador", target = "usuModificador")
    @Mapping(source = "destinoDTOEndpoint.estado", target = "estado")
    @Mapping(source = "destinoDTOEndpoint.idTide", target = "idTide")
    Destino toEntity(DestinoDTOEndpoint destinoDTOEndpoint);

    @IterableMapping(elementTargetType = Destino.class)
    List<Destino> toEntityList(List<DestinoDTOEndpoint> destinoDTOEndpointList);

    @IterableMapping(elementTargetType = DestinoDTOEndpoint.class)
    List<DestinoDTOEndpoint> toDTOEndpointList(List<Destino> destinoList);

}