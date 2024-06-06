package co.edu.icesi.viajes.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DestinoDTO implements Serializable {

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

    public DestinoDTO(String nombre, String descripcion, int total_planes, int promedio_valor_plan) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.total_planes = total_planes;
        this.promedio_valor_plan = promedio_valor_plan;
    }

}

