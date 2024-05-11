package co.edu.icesi.viajes.dto;

import java.math.BigDecimal;

public class ReservaDTO {

    public ReservaDTO(Integer idReserva, Integer personas, BigDecimal valor, PlanDTO plan) {
        this.idReserva = idReserva;
        this.personas = personas;
        this.valor = valor;
        this.plan = plan;
    }

    private Integer idReserva;
    private Integer personas;
    private BigDecimal valor;
    private PlanDTO plan;
    
    public Integer getIdReserva() {
        return idReserva;
    }
    public void setIdReserva(Integer idReserva) {
        this.idReserva = idReserva;
    }
    public Integer getPersonas() {
        return personas;
    }
    public void setPersonas(Integer personas) {
        this.personas = personas;
    }
    public BigDecimal getValor() {
        return valor;
    }
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
    public PlanDTO getPlan() {
        return plan;
    }
    public void setPlan(PlanDTO plan) {
        this.plan = plan;
    }

    
}
