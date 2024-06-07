package co.edu.icesi.viajes.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ServicioDTO {

    private Integer idAdd;
    private Boolean hospedajes;
    private Boolean comidas;
    private Boolean transportes;
    private Boolean descripcion;

}