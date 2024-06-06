package co.edu.icesi.viajes.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PlanDTO implements Serializable{
    


    private Integer idPlan;
    private String codigo;
    private String descripcionSolicitud;
    private String nombre;
    private Integer cantidadPersonas;
    private Date fechaSolicitud;
    private Date fechaInicioViaje;
    private Date fechaFinViaje;
    private BigDecimal valorTotal;
    private Date fechaCreacion;
    private Date fechaModificacion;
    private String usuCreador;
    private String usuModificador;
    private String estado;
    private ClienteDTO cliente;
    private UsuarioDTO usuario;



    
}