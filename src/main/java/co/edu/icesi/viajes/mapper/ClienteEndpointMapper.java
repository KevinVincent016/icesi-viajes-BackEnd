package co.edu.icesi.viajes.mapper;

import co.edu.icesi.viajes.domain.Cliente;
import co.edu.icesi.viajes.dto.ClienteDTOEndpoint;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ClienteEndpointMapper {

    ClienteEndpointMapper INSTANCE = Mappers.getMapper(ClienteEndpointMapper.class);

    @Mapping(source = "idClie", target = "idClie")
    @Mapping(source = "numeroIdentificacion", target = "numeroIdentificacion")
    @Mapping(source = "primerApellido", target = "primerApellido")
    @Mapping(source = "segundoApellido", target = "segundoApellido")
    @Mapping(source = "nombre", target = "nombre")
    @Mapping(source = "telefono1", target = "telefono1")
    @Mapping(source = "telefono2", target = "telefono2")
    @Mapping(source = "correo", target = "correo")
    @Mapping(source = "sexo", target = "sexo")
    @Mapping(source = "fechaNacimiento", target = "fechaNacimiento")
    @Mapping(source = "fechaCreacion", target = "fechaCreacion")
    @Mapping(source = "fechaModificacion", target = "fechaModificacion")
    @Mapping(source = "usuCreador", target = "usuCreador")
    @Mapping(source = "usuModificador", target = "usuModificador")
    @Mapping(source = "estado", target = "estado")
    ClienteDTOEndpoint clienteToClienteDTOEndpoint(Cliente cliente);

    @Mapping(source = "idClie", target = "idClie")
    @Mapping(source = "numeroIdentificacion", target = "numeroIdentificacion")
    @Mapping(source = "primerApellido", target = "primerApellido")
    @Mapping(source = "segundoApellido", target = "segundoApellido")
    @Mapping(source = "nombre", target = "nombre")
    @Mapping(source = "telefono1", target = "telefono1")
    @Mapping(source = "telefono2", target = "telefono2")
    @Mapping(source = "correo", target = "correo")
    @Mapping(source = "sexo", target = "sexo")
    @Mapping(source = "fechaNacimiento", target = "fechaNacimiento")
    @Mapping(source = "fechaCreacion", target = "fechaCreacion")
    @Mapping(source = "fechaModificacion", target = "fechaModificacion")
    @Mapping(source = "usuCreador", target = "usuCreador")
    @Mapping(source = "usuModificador", target = "usuModificador")
    @Mapping(source = "estado", target = "estado")
    Cliente clienteDTOEndpointToCliente(ClienteDTOEndpoint clienteDTOEndpoint);
}