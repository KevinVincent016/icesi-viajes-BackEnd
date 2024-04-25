package co.edu.icesi.viajes.dto;

import java.io.Serializable;

public class ClienteDTO implements Serializable {

    public ClienteDTO(String estado, String numeroIdentificacion, Integer idTiid, String nombre) {
        this.estado = estado;
        this.numero_identificacion = numeroIdentificacion;
        this.id_tiid = idTiid;
        this.nombre = nombre;
    }

    private String estado;
    private String numero_identificacion;
    private Integer id_tiid;
    private String nombre;

    public String getNumeroIdentificacion() {
        return numero_identificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numero_identificacion = numeroIdentificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Integer getIdTiid() {
        return id_tiid;
    }

    public void setIdTiid(Integer idTiid) {
        this.id_tiid = idTiid;
    }
}
