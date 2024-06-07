package co.edu.icesi.viajes.mapper;

import co.edu.icesi.viajes.domain.Plan;
import co.edu.icesi.viajes.dto.PlanDTO;
import org.mapstruct.IterableMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface PlanMapper {

    PlanMapper INSTANCE = Mappers.getMapper(PlanMapper.class);

    @Mapping(source = "plan.idPlan", target = "idPlan")
    @Mapping(source = "plan.codigo", target = "codigo")
    @Mapping(source = "plan.descripcionSolicitud", target = "descripcionSolicitud")
    @Mapping(source = "plan.nombre", target = "nombre")
    @Mapping(source = "plan.cantidadPersonas", target = "cantidadPersonas")
    @Mapping(source = "plan.fechaSolicitud", target = "fechaSolicitud")
    @Mapping(source = "plan.fechaInicioViaje", target = "fechaInicioViaje")
    @Mapping(source = "plan.fechaFinViaje", target = "fechaFinViaje")
    @Mapping(source = "plan.valorTotal", target = "valorTotal")
    @Mapping(source = "plan.fechaCreacion", target = "fechaCreacion")
    @Mapping(source = "plan.fechaModificacion", target = "fechaModificacion")
    @Mapping(source = "plan.usuCreador", target = "usuCreador")
    @Mapping(source = "plan.usuModificador", target = "usuModificador")
    @Mapping(source = "plan.estado", target = "estado")
    @Mapping(source = "plan.usuario", target = "usuario")
    PlanDTO toDTO(Plan plan);

    @Mapping(source = "planDTO.idPlan", target = "idPlan")
    @Mapping(source = "planDTO.codigo", target = "codigo")
    @Mapping(source = "planDTO.descripcionSolicitud", target = "descripcionSolicitud")
    @Mapping(source = "planDTO.nombre", target = "nombre")
    @Mapping(source = "planDTO.cantidadPersonas", target = "cantidadPersonas")
    @Mapping(source = "planDTO.fechaSolicitud", target = "fechaSolicitud")
    @Mapping(source = "planDTO.fechaInicioViaje", target = "fechaInicioViaje")
    @Mapping(source = "planDTO.fechaFinViaje", target = "fechaFinViaje")
    @Mapping(source = "planDTO.valorTotal", target = "valorTotal")
    @Mapping(source = "planDTO.fechaCreacion", target = "fechaCreacion")
    @Mapping(source = "planDTO.fechaModificacion", target = "fechaModificacion")
    @Mapping(source = "planDTO.usuCreador", target = "usuCreador")
    @Mapping(source = "planDTO.usuModificador", target = "usuModificador")
    @Mapping(source = "planDTO.estado", target = "estado")
    @Mapping(source = "planDTO.usuario", target = "usuario")
    Plan toEntity(PlanDTO planDTO);

    @IterableMapping(elementTargetType = Plan.class)
    List<Plan> toEntityList(List<PlanDTO> planDTOList);

    @IterableMapping(elementTargetType = PlanDTO.class)
    List<PlanDTO> toDTOList(List<Plan> planList);

}