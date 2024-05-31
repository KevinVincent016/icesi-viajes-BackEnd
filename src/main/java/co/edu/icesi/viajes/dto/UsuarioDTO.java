package co.edu.icesi.viajes.dto;

import java.util.Date;

public class UsuarioDTO {
    
    public UsuarioDTO(Integer idUsua, String loginU, String passwordU, String nombre, String apellido,
            Date fechaCreacion, Date fechaModificacion, String usuCreador, String usuModificador, String correo,
            Integer idRol) {
        this.idUsua = idUsua;
        this.loginU = loginU;
        this.passwordU = passwordU;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaCreacion = fechaCreacion;
        this.fechaModificacion = fechaModificacion;
        this.usuCreador = usuCreador;
        this.usuModificador = usuModificador;
        this.correo = correo;
        this.idRol = idRol;
    }

    private Integer idUsua;
    private String loginU;
    private String passwordU;
    private String nombre;
    private String apellido;
    private Date fechaCreacion;
    private Date fechaModificacion;
    private String usuCreador;
    private String usuModificador;
    private String correo;
    private Integer idRol;
    
    public Integer getIdUsua() {
        return idUsua;
    }
    public void setIdUsua(Integer idUsua) {
        this.idUsua = idUsua;
    }
    public String getLoginU() {
        return loginU;
    }
    public void setLoginU(String loginU) {
        this.loginU = loginU;
    }
    public String getPasswordU() {
        return passwordU;
    }
    public void setPasswordU(String passwordU) {
        this.passwordU = passwordU;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
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
    public String getCorreo() {
        return correo;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    public Integer getIdRol() {
        return idRol;
    }
    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }

    
}
