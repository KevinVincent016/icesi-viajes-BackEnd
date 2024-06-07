package co.edu.icesi.viajes.mapper;

import co.edu.icesi.viajes.domain.Rol;
import co.edu.icesi.viajes.dto.RolDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface RolMapper {

    RolMapper INSTANCE = Mappers.getMapper(RolMapper.class);

    @Mapping(source = "rol.idRol", target = "idRol")
    @Mapping(source = "rol.nombre", target = "nombre")
    RolDTO toDTO(Rol rol);

    @Mapping(source = "rolDTO.idRol", target = "idRol")
    @Mapping(source = "rolDTO.nombre", target = "nombre")
    Rol toEntity(RolDTO rolDTO);

    List<Rol> toEntityList(List<RolDTO> rolDTOList);

    List<RolDTO> toDTOList(List<Rol> rolList);
}