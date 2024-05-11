package co.edu.icesi.viajes.dto;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class PlanDTO implements Serializable{
    
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
    
    public Integer getIdPlan() {
        return idPlan;
    }
    public void setIdPlan(Integer idPlan) {
        this.idPlan = idPlan;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getDescripcionSolicitud() {
        return descripcionSolicitud;
    }
    public void setDescripcionSolicitud(String descripcionSolicitud) {
        this.descripcionSolicitud = descripcionSolicitud;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getCantidadPersonas() {
        return cantidadPersonas;
    }
    public void setCantidadPersonas(Integer cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }
    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }
    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }
    public Date getFechaInicioViaje() {
        return fechaInicioViaje;
    }
    public void setFechaInicioViaje(Date fechaInicioViaje) {
        this.fechaInicioViaje = fechaInicioViaje;
    }
    public Date getFechaFinViaje() {
        return fechaFinViaje;
    }
    public void setFechaFinViaje(Date fechaFinViaje) {
        this.fechaFinViaje = fechaFinViaje;
    }
    public BigDecimal getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }
    public Date getFechaCreacion() {
        return fechaCreacion;
    }
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    public Date getFechaModificacion() {
        return fechaModificacion;
    }
    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }
    public String getUsuCreador() {
        return usuCreador;
    }
    public void setUsuCreador(String usuCreador) {
        this.usuCreador = usuCreador;
    }
    public String getUsuModificador() {
        return usuModificador;
    }
    public void setUsuModificador(String usuModificador) {
        this.usuModificador = usuModificador;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public ClienteDTO getCliente() {
        return cliente;
    }
    public void setCliente(ClienteDTO cliente) {
        this.cliente = cliente;
    }
    public UsuarioDTO getUsuario() {
        return usuario;
    }
    public void setUsuario(UsuarioDTO usuario) {
        this.usuario = usuario;
    }

    
}
