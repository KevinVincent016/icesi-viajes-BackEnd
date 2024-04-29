package co.edu.icesi.viajes.domain;

import java.util.Date;

import co.edu.icesi.viajes.dto.ClienteDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.NamedNativeQueries;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.SqlResultSetMapping;
import jakarta.persistence.SqlResultSetMappings;
import jakarta.persistence.ColumnResult;
import jakarta.persistence.ConstructorResult;

//@NamedNativeQueries({
	// @NamedNativeQuery(name = "Cliente.obtenerClientesConUltimoPlanContratado", query = "", resultSetMapping = "obtenerClientesConUltimoPlanContratado"),
    // @NamedNativeQuery(name = "Cliente.consultarClientesSegunCriterios", query = "", resultSetMapping = "consultarClientesSegunCriterios"),
    //})

//@SqlResultSetMappings({
	//  @SqlResultSetMapping(name = "obtenerClientesConUltimoPlanContratado", classes = {
    		//     @ConstructorResult(targetClass = ClienteDTO.class, columns = {
        		//       @ColumnResult(name = "idClie", type = Integer.class),
            //       @ColumnResult(name = "numeroIdentificacion", type = String.class),
            //       @ColumnResult(name = "primerApellido", type = String.class),
            //       @ColumnResult(name = "segundoApellido", type = String.class),
            //       @ColumnResult(name = "nombre", type = String.class),
            //       @ColumnResult(name = "telefono1", type = String.class),
            //       @ColumnResult(name = "telefono2", type = String.class),
            //       @ColumnResult(name = "correo", type = String.class),
            //       @ColumnResult(name = "sexo", type = String.class),
            //  @ColumnResult(name = "fechaNacimiento", type = Date.class),
            //   @ColumnResult(name = "fechaCreacion", type = Date.class),
            //  @ColumnResult(name = "fechaModificacion", type = Date.class),
            //  @ColumnResult(name = "usuCreador", type = String.class),
            //  @ColumnResult(name = "usuModificador", type = String.class),
            // @ColumnResult(name = "estado", type = String.class),
            //      @ColumnResult(name = "idDetallePlan", type = Integer.class),
            // Detalleplan
            //      @ColumnResult(name = "alimentacion", type = String.class),
            //        @ColumnResult(name = "hospedaje", type = String.class),
            //        @ColumnResult(name = "transporte", type = String.class),
            //         @ColumnResult(name = "traslados", type = String.class),
            //         @ColumnResult(name = "valor", type = Double.class),
            //         @ColumnResult(name = "cantidadNoches", type = Integer.class),
            //         @ColumnResult(name = "cantidadDias", type = Integer.class),
            //         @ColumnResult(name = "fechaCreacionDetallePlan", type = Date.class),
            //         @ColumnResult(name = "fechaModificacionDetallePlan", type = Date.class),
            //         @ColumnResult(name = "usuCreadorDetallePlan", type = String.class),
            //         @ColumnResult(name = "usuModificadorDetallePlan", type = String.class),
            //         @ColumnResult(name = "estadoDetallePlan", type = String.class),
            //    })
        // })})
//    @SqlResultSetMapping(name = "consultarClientesSegunCriterios", classes = {
    		//            @ConstructorResult(targetClass = ClienteDTO.class, columns = {
            		//                @ColumnResult(name = "numeroIdentificacion", type = String.class),
                //                @ColumnResult(name = "nombre", type = String.class),
                //               @ColumnResult(name = "estado", type = String.class),
                //       })
//})


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
    
}
