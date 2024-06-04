package co.edu.icesi.viajes.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
public class ReservaDTO {



    private Integer idReserva;
    private Integer personas;
    private BigDecimal valor;
    private PlanDTO plan;

    public ReservaDTO(Integer idReserva, Integer personas, BigDecimal valor, PlanDTO plan) {
        this.idReserva = idReserva;
        this.personas = personas;
        this.valor = valor;
        this.plan = plan;
    }
}
