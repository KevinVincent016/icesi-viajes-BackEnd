package co.edu.icesi.viajes.domain;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "plan_destino")
public class PlanDestino {

    @EmbeddedId
    private PlanDestinoId id;

}