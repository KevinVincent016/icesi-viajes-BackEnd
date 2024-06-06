package co.edu.icesi.viajes.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import co.edu.icesi.viajes.domain.Usuario;
import co.edu.icesi.viajes.dto.UsuarioDTO;

@Mapper
public interface UsuarioMapper {

    UsuarioMapper INSTANCE = Mappers.getMapper(UsuarioMapper.class);

    @Mapping(source = "idUsua", target = "idUsua")
    @Mapping(source = "loginU", target = "loginU")
    @Mapping(source = "passwordU", target = "passwordU")
    @Mapping(source = "nombre", target = "nombre")
    @Mapping(source = "apellido", target = "apellido")
    @Mapping(source = "correo", target = "correo")
    @Mapping(source = "fechaCreacion", target = "fechaCreacion")
    @Mapping(source = "fechaModificacion", target = "fechaModificacion")
    @Mapping(source = "usuCreador", target = "usuCreador")
    @Mapping(source = "usuModificador", target = "usuModificador")
    @Mapping(source = "idRol", target = "idRol")
    UsuarioDTO toDTO(Usuario usuario);

    @Mapping(source = "idUsua", target = "idUsua")
    @Mapping(source = "loginU", target = "loginU")
    @Mapping(source = "passwordU", target = "passwordU")
    @Mapping(source = "nombre", target = "nombre")
    @Mapping(source = "apellido", target = "apellido")
    @Mapping(source = "correo", target = "correo")
    @Mapping(source = "fechaCreacion", target = "fechaCreacion")
    @Mapping(source = "fechaModificacion", target = "fechaModificacion")
    @Mapping(source = "usuCreador", target = "usuCreador")
    @Mapping(source = "usuModificador", target = "usuModificador")
    @Mapping(source = "idRol", target = "idRol")
    Usuario toEntity(UsuarioDTO usuarioDTO);
}