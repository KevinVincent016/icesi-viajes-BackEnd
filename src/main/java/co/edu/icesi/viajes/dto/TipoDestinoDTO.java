package co.edu.icesi.viajes.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TipoDestinoDTO implements Serializable{

	private static final long serialVersionUID = 6334646226855431916L;
	


	private Integer idTide;

	private String codigo;

	private String nombre;

	private String descripcion;

	private Date fechaCreacion;

	private Date fechaModificacion;

	private String usuCreador;

	private String usuModificador;

	private String estado;


	public TipoDestinoDTO(Integer idTide, String codigo, String nombre, String descripcion) {
		super();
		this.idTide = idTide;
		this.codigo = codigo;
		this.nombre = nombre;
		this.descripcion = descripcion;
	}


}
