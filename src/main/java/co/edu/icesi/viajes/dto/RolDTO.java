package co.edu.icesi.viajes.dto;

public class RolDTO {
    
    public RolDTO(Integer idRol, String nombre) {
        this.idRol = idRol;
        this.nombre = nombre;
    }

    private Integer idRol;
    private String nombre;
    
    public Integer getIdRol() {
        return idRol;
    }
    public void setIdRol(Integer idRol) {
        this.idRol = idRol;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
