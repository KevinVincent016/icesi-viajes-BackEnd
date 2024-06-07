package co.edu.icesi.viajes.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReservaDTO {



    private Integer idReserva;
    private Integer personas;
    private BigDecimal valor;
    private PlanDTO plan;


}
