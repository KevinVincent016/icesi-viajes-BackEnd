package co.edu.icesi.viajes.domain;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Generación automática del ID
    @Column(name = "id_usua", nullable = false)
    private Integer idUsua;
    
    @Column(name = "loginU", nullable = false)
    private String loginU;
    
    @Column(name = "passwordU", nullable = false)
    private String passwordU;

    @Column(name = "nombre", nullable = false)
    private String nombre;
    
    @Column(name = "apellido", nullable = false)
    private String apellido;

    @Column(name = "fecha_creacion", nullable = false)
    private Date fechaCreacion;

    @Column(name = "fecha_modificacion")
    private Date fechaModificacion;

    @Column(name = "usu_creador", nullable = false)
    private String usuCreador;
        
    @Column(name = "usu_modificador")
    private String usuModificador;
    
    @Column(name = "correo", nullable = false)
    private String correo;

    @Column(name = "idrol", nullable = false)
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
