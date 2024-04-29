package co.edu.icesi.viajes.domain;

import java.util.Date;

import co.edu.icesi.viajes.dto.TipoDestinoDTO;

import jakarta.persistence.Column;

import jakarta.persistence.ColumnResult;

import jakarta.persistence.ConstructorResult;

import jakarta.persistence.Entity;

import jakarta.persistence.Id;

import jakarta.persistence.NamedNativeQueries;

import jakarta.persistence.NamedNativeQuery;

import jakarta.persistence.SqlResultSetMapping;

import jakarta.persistence.SqlResultSetMappings;

import jakarta. persistence. Table;

import lombok.Data;

@NamedNativeQueries ({
	@NamedNativeQuery (name="TipoDestino.consultarTipoDestinoPorEstado", query="", resultSetMapping="consultarTipoDestinoPorEstado"),
})
		
@SqlResultSetMappings({
	
	@SqlResultSetMapping(name = "consultarTipoDestinoPorEstado",
			
			classes = {@ConstructorResult(targetClass = TipoDestinoDTO.class,
			
			columns = {
					@ColumnResult (name = "idTide", type = Integer.class),
					@ColumnResult (name = "codigo", type = String. class),
					@ColumnResult (name = "nombre", type = String.class),
					@ColumnResult (name = "descripcion", type = String.class),
					
			})}),
	
})

@Entity
@Table(name = "tipo_destino")
public class TipoDestino {
	
	@Id
	@Column(name = "id_tide", nullable = false)
	private Integer idTide;
	
	@Column(name = "codigo", nullable = false)
	private String codigo;
	
	@Column(name = "nombre", nullable = false)
	private String nombre;

	@Column(name = "descripcion", nullable = false)
	private String descripcion;
	
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

	public Integer getIdTide() {
		return idTide;
	}

	public void setIdTide(Integer idTide) {
		this.idTide = idTide;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
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
	

}
