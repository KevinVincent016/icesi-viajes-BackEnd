package co.edu.icesi.viajes.dto;


public class PermisoDTO {
    
    public PermisoDTO(Integer idPermiso, String nombre, String descripcion){
        this.idPermiso = idPermiso;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    private Integer idPermiso;
    private String nombre;
    private String descripcion;
    
    public Integer getIdPermiso() {
        return idPermiso;
    }
    public void setIdPermiso(Integer idPermiso) {
        this.idPermiso = idPermiso;
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

}
