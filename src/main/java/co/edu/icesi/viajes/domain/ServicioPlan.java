package co.edu.icesi.viajes.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "servicio_plan")
public class ServicioPlan {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_add_plan")
    private Integer idAddPlan;

    @ManyToOne
    @JoinColumn(name = "id_plan", nullable = false)
    private Plan plan;

    @ManyToOne
    @JoinColumn(name = "id_add", nullable = false)
    private Servicio servicio;

    @Column(name = "cantidad", nullable = false)
    private Integer cantidad;

    public Integer getIdAddPlan() {
        return idAddPlan;
    }

    public void setIdAddPlan(Integer idAddPlan) {
        this.idAddPlan = idAddPlan;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public Servicio getAñadidos() {
        return servicio;
    }

    public void setAñadidos(Servicio añadidos) {
        this.servicio = añadidos;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}
