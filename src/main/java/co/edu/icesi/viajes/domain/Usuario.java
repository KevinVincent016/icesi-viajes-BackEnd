package co.edu.icesi.viajes.domain;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "usuario")
public class Usuario {
    
    @Id
    @Column(name = "id_usua", nullable = false)
    private Integer idUsua;
    
    @Column(name = "loginU", nullable = false)
    private String loginU;
    
    @Column(name = "passwordU", nullable = false)
    private String passwordU;

    @Column(name = "nombre", nullable = false)
    private String nombre;
    
    @Column(name = "apellido", nullable = false)
    private String apellido;

    @Column(name = "fecha_creacion", nullable = false)
    private Date fechaCreacion;

    @Column(name = "fecha_modificacion")
    private Date fechaModificacion;

    @Column(name = "usu_creador", nullable = false)
    private String usuCreador;
        
    @Column(name = "usu_modificador")
    private String usuModificador;
    
    @Column(name = "correo", nullable = false)
    private String correo;
    
    @Column(name = "idRol", nullable = false)
    private String idRol;
    
}
