package co.edu.icesi.viajes.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

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

    public PlanDTO(Integer idPlan, String codigo, String descripcionSolicitud, String nombre, Integer cantidadPersonas,
                   Date fechaSolicitud, Date fechaInicioViaje, Date fechaFinViaje, BigDecimal valorTotal, Date fechaCreacion,
                   Date fechaModificacion, String usuCreador, String usuModificador, String estado, ClienteDTO cliente,
                   UsuarioDTO usuario) {
        this.idPlan = idPlan;
        this.codigo = codigo;
        this.descripcionSolicitud = descripcionSolicitud;
        this.nombre = nombre;
        this.cantidadPersonas = cantidadPersonas;
        this.fechaSolicitud = fechaSolicitud;
        this.fechaInicioViaje = fechaInicioViaje;
        this.fechaFinViaje = fechaFinViaje;
        this.valorTotal = valorTotal;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
        this.usuCreador = usuCreador;
        this.usuModificador = usuModificador;
        this.estado = estado;
        this.cliente = cliente;
        this.usuario = usuario;
    }


    
}
