package co.edu.icesi.viajes.dto;

import java.io.Serializable;
import java.util.Date;

public class ClienteDTO implements Serializable {

	private static final long serialVersionUID = 8460626525156785057L;
	
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

	public Integer getIdClie() {
		return id_clie;
	}
	public void setIdClie(Integer id_clie) {
		this.id_clie = id_clie;
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
	public Integer getIdTiid() {
		return idTiid;
	}
	public void setIdTiid(Integer idTiid) {
		this.idTiid = idTiid;
	}
	public Integer getIdDetallePlan() {
		return idDetallePlan;
	}
	public void setIdDetallePlan(Integer idDetallePlan) {
		this.idDetallePlan = idDetallePlan;
	}
	public String getAlimentacion() {
		return alimentacion;
	}
	public void setAlimentacion(String alimentacion) {
		this.alimentacion = alimentacion;
	}
	public String getHospedaje() {
		return hospedaje;
	}
	public void setHospedaje(String hospedaje) {
		this.hospedaje = hospedaje;
	}
	public String getTransporte() {
		return transporte;
	}
	public void setTransporte(String transporte) {
		this.transporte = transporte;
	}
	public String getTraslados() {
		return traslados;
	}
	public void setTraslados(String traslados) {
		this.traslados = traslados;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Integer getCantidadNoches() {
		return cantidadNoches;
	}
	public void setCantidadNoches(Integer cantidadNoches) {
		this.cantidadNoches = cantidadNoches;
	}
	public Integer getCantidadDias() {
		return cantidadDias;
	}
	public void setCantidadDias(Integer cantidadDias) {
		this.cantidadDias = cantidadDias;
	}
	public Date getFechaCreacionDetallePlan() {
		return fechaCreacionDetallePlan;
	}
	public void setFechaCreacionDetallePlan(Date fechaCreacionDetallePlan) {
		this.fechaCreacionDetallePlan = fechaCreacionDetallePlan;
	}
	public Date getFechaModificacionDetallePlan() {
		return fechaModificacionDetallePlan;
	}
	public void setFechaModificacionDetallePlan(Date fechaModificacionDetallePlan) {
		this.fechaModificacionDetallePlan = fechaModificacionDetallePlan;
	}
	public String getUsuCreadorDetallePlan() {
		return usuCreadorDetallePlan;
	}
	public void setUsuCreadorDetallePlan(String usuCreadorDetallePlan) {
		this.usuCreadorDetallePlan = usuCreadorDetallePlan;
	}
	public String getUsuModificadorDetallePlan() {
		return usuModificadorDetallePlan;
	}
	public void setUsuModificadorDetallePlan(String usuModificadorDetallePlan) {
		this.usuModificadorDetallePlan = usuModificadorDetallePlan;
	}
	public String getEstadoDetallePlan() {
		return estadoDetallePlan;
	}
	public void setEstadoDetallePlan(String estadoDetallePlan) {
		this.estadoDetallePlan = estadoDetallePlan;
	}
    
}
