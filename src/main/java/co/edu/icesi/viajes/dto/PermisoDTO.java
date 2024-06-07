package co.edu.icesi.viajes.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class PermisoDTO {
    


    private Integer idPermiso;
    private String nombre;
    private String descripcion;

    public PermisoDTO(Integer idPermiso, String nombre, String descripcion){
        this.idPermiso = idPermiso;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

}
