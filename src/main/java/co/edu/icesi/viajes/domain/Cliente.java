package co.edu.icesi.viajes.domain;

import java.util.Date;

import co.edu.icesi.viajes.dto.ClienteDTO;
import jakarta.persistence.*;

@NamedNativeQueries({
        @NamedNativeQuery(name="Cliente.consultarClientesSegunCriterios", query = "", resultSetMapping = "consultarClientesSegunCriterios")
})

@SqlResultSetMappings({
        @SqlResultSetMapping(name = "consultarClientesSegunCriterios",
                classes = {@ConstructorResult(targetClass = ClienteDTO.class,
                        columns = {
                                @ColumnResult(name="estado", type=String.class),
                                @ColumnResult(name="numero_identificacion", type=String.class),
                                @ColumnResult(name="id_tiid", type=Integer.class),
                                @ColumnResult(name="nombre", type=String.class)
                        })})
})

@Entity
@Table(name = "cliente")
public class Cliente {
    
    @Id
    @Column(name = "id_clie", nullable = false)
    private Integer idClie;
    
    @Column(name = "numero_identificacion", nullable = false)
    private String numeroIdentificacion;
    
    @Column(name = "primer_apellido", nullable = false)
    private String primerApellido;

    @Column(name = "segundo_apellido")
    private String segundoApellido;
    
    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "telefono1")
    private String telefono1;

    @Column(name = "telefono2")
    private String telefono2;

    @Column(name = "correo")
    private String correo;

    @Column(name = "sexo", nullable = false)
    private String sexo;

    @Column(name = "fecha_nacimiento", nullable = false)
    private Date fechaNacimiento;

    @Column(name = "fecha_creacion", nullable = false)
    private Date fechaCreacion;

    @Column(name = "fecha_modificacion")
    private Date fechaModificacion;

    @Column(name = "usu_creador", nullable = false)
    private String usuCreador;
        
    @Column(name = "usu_modificador")
    private String usuModificador;
    
    @Column(name = "estado", nullable = false)
    private String estado;

    @Column(name = "id_tiid", nullable = false)
    private Integer idTiid;

    public Integer getIdClie() {
        return idClie;
    }

    public void setIdClie(Integer idClie) {
        this.idClie = idClie;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono1() {
        return telefono1;
    }

    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    public String getTelefono2() {
        return telefono2;
    }

    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
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

    public int getIdTiid() {
        return idTiid;
    }

    public void setIdTiid(int idTiid) {
        this.idTiid = idTiid;
    }
}