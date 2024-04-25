package co.edu.icesi.viajes.dto;

import java.io.Serializable;
import java.util.Date;

public class DestinoDTO implements Serializable {

    public DestinoDTO(String nombre, String descripcion, int total_planes, int promedio_valor_plan) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.total_planes = total_planes;
        this.promedio_valor_plan = promedio_valor_plan;
    }

    private Integer idDest;
    private String codigo;
    private String nombre;
    private String descripcion;
    private String tierra;
    private String aire;
    private String mar;
    private Date fechaCreacion;
    private Date fechaModificacion;
    private String usuCreador;
    private String usuModificador;
    private String estado;
    private Integer idTide;
    private Integer total_planes;
    private Integer promedio_valor_plan;

    public Integer getIdDest() {
        return idDest;
    }

    public void setIdDest(Integer idDest) {
        this.idDest = idDest;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTierra() {
        return tierra;
    }

    public void setTierra(String tierra) {
        this.tierra = tierra;
    }

    public String getAire() {
        return aire;
    }

    public void setAire(String aire) {
        this.aire = aire;
    }

    public String getMar() {
        return mar;
    }

    public void setMar(String mar) {
        this.mar = mar;
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

    public Integer getIdTide() {
        return idTide;
    }

    public void setIdTide(Integer idTide) {
        this.idTide = idTide;
    }

    public Integer getTotal_planes() {
        return total_planes;
    }

    public void setTotal_planes(Integer total_planes) {
        this.total_planes = total_planes;
    }

    public Integer getPromedio_valor_plan() {
        return promedio_valor_plan;
    }

    public void setPromedio_valor_plan(Integer promedio_valor_plan) {
        this.promedio_valor_plan = promedio_valor_plan;
    }
}
