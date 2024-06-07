package co.edu.icesi.viajes.domain;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class PlanDestinoId implements Serializable {

    @Column(name = "id_plan")
    private Integer idPlan;

    @Column(name = "id_dest")
    private Integer idDest;

    // Constructor, getters y setters, equals() y hashCode()
}
