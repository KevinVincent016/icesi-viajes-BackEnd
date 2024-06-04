package co.edu.icesi.viajes.domain;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "usuario")
public class Usuario {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Generación automática del ID
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

    @Column(name = "idrol", nullable = false)
    private Integer idRol;


    
    
}
