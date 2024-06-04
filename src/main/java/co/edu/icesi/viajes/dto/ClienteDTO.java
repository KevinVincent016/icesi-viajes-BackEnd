package co.edu.icesi.viajes.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor

public class ClienteDTO implements Serializable {

	private static final long serialVersionUID = 8460626525156785057L;
	




	private Integer id_clie;
    private String numeroIdentificacion;
    private String primerApellido;
    private String segundoApellido;
    private String nombre;
    private String telefono1;
    private String telefono2;
    private String correo;
    private String sexo;
    private Date fechaNacimiento;
    private Date fechaCreacion;
    private Date fechaModificacion;
    private String usuCreador;
    private String usuModificador;
    private String estado;
    private Integer idTiid;
    private Integer idDetallePlan;
    private String alimentacion;
    private String hospedaje;
    private String transporte;
    private String traslados;
    private Double valor;
    private Integer cantidadNoches;
    private Integer cantidadDias;
    private Date fechaCreacionDetallePlan;
    private Date fechaModificacionDetallePlan;
    private String usuCreadorDetallePlan;
    private String usuModificadorDetallePlan;
    private String estadoDetallePlan;

	public ClienteDTO(Integer id_clie, String numeroIdentificacion, String primerApellido, String segundoApellido,
					  String nombre, String telefono1, String telefono2, String correo, String sexo, Date fechaNacimiento,
					  Date fechaCreacion, Date fechaModificacion, String usuCreador, String usuModificador, String estado,
					  Integer idTiid, Integer idDetallePlan, String alimentacion, String hospedaje, String transporte,
					  String traslados, Double valor, Integer cantidadNoches, Integer cantidadDias, Date fechaCreacionDetallePlan,
					  Date fechaModificacionDetallePlan, String usuCreadorDetallePlan, String usuModificadorDetallePlan,
					  String estadoDetallePlan) {
		super();
		this.id_clie = id_clie;
		this.numeroIdentificacion = numeroIdentificacion;
		this.primerApellido = primerApellido;
		this.segundoApellido = segundoApellido;
		this.nombre = nombre;
		this.telefono1 = telefono1;
		this.telefono2 = telefono2;
		this.correo = correo;
		this.sexo = sexo;
		this.fechaNacimiento = fechaNacimiento;
		this.fechaCreacion = fechaCreacion;
		this.fechaModificacion = fechaModificacion;
		this.usuCreador = usuCreador;
		this.usuModificador = usuModificador;
		this.estado = estado;
		this.idTiid = idTiid;
		this.idDetallePlan = idDetallePlan;
		this.alimentacion = alimentacion;
		this.hospedaje = hospedaje;
		this.transporte = transporte;
		this.traslados = traslados;
		this.valor = valor;
		this.cantidadNoches = cantidadNoches;
		this.cantidadDias = cantidadDias;
		this.fechaCreacionDetallePlan = fechaCreacionDetallePlan;
		this.fechaModificacionDetallePlan = fechaModificacionDetallePlan;
		this.usuCreadorDetallePlan = usuCreadorDetallePlan;
		this.usuModificadorDetallePlan = usuModificadorDetallePlan;
		this.estadoDetallePlan = estadoDetallePlan;
	}

	public ClienteDTO(String numeroIdentificacion, String nombre, String estado, Integer idTiid) {
		super();
		this.numeroIdentificacion = numeroIdentificacion;
		this.nombre = nombre;
		this.estado = estado;
		this.idTiid = idTiid;
	}
}
