package co.edu.icesi.viajes.mapper;

import co.edu.icesi.viajes.domain.Servicio;
import co.edu.icesi.viajes.dto.ServicioDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ServicioMapper {

    ServicioMapper INSTANCE = Mappers.getMapper(ServicioMapper.class);

    @Mapping(source = "idAdd", target = "idAdd")
    @Mapping(source = "hospedajes", target = "hospedajes")
    @Mapping(source = "comidas", target = "comidas")
    @Mapping(source = "transportes", target = "transportes")
    @Mapping(source = "descripcion", target = "descripcion")
    @Mapping(source = "nombre", target = "nombre")
    ServicioDTO toDto(Servicio servicio);

    @Mapping(source = "idAdd", target = "idAdd")
    @Mapping(source = "hospedajes", target = "hospedajes")
    @Mapping(source = "comidas", target = "comidas")
    @Mapping(source = "transportes", target = "transportes")
    @Mapping(source = "descripcion", target = "descripcion")
    @Mapping(source = "nombre", target = "nombre")
    Servicio toEntity(ServicioDTO dto);

}