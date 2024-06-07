package co.edu.icesi.viajes.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import co.edu.icesi.viajes.domain.Reserva;
import co.edu.icesi.viajes.dto.ReservaDTO;

@Mapper
public interface ReservaMapper {

    ReservaMapper INSTANCE = Mappers.getMapper(ReservaMapper.class);

    @Mapping(source = "idReserva", target = "idReserva")
    @Mapping(source = "personas", target = "personas")
    @Mapping(source = "valor", target = "valor")
    @Mapping(source = "idPlan", target = "plan.idPlan")
    ReservaDTO toDTO(Reserva reserva);

    @Mapping(source = "idReserva", target = "idReserva")
    @Mapping(source = "personas", target = "personas")
    @Mapping(source = "valor", target = "valor")
    @Mapping(source = "plan.idPlan", target = "idPlan")
    Reserva toEntity(ReservaDTO reservaDTO);
}