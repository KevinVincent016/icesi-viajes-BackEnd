package co.edu.icesi.viajes.dto;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;

public class TipoIdentificacionDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = -2186121262170106886L;

    public TipoIdentificacionDTO(Integer idTiid, String codigo, String nombre, String estado) {
        this.idTiid = idTiid;
        this.codigo = codigo;
        this.nombre = nombre;
        this.estado = estado;
    }

    private Integer idTiid;
    private String codigo;
    private String nombre;
    private String fechaCreacion;
    private Date fechaModificacion;
    private String usuCreador;
    private String usuModificador;
    private String estado;
    private String idClie;
    private String idUsua;

    public Integer getIdTiid() {
        return idTiid;
    }

    public void setIdTiid(Integer idTiid) {
        this.idTiid = idTiid;
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

    public String getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(String fechaCreacion) {
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

    public String getIdClie() {
        return idClie;
    }

    public void setIdClie(String idClie) {
        this.idClie = idClie;
    }

    public String getIdUsua() {
        return idUsua;
    }

    public void setIdUsua(String idUsua) {
        this.idUsua = idUsua;
    }
}
