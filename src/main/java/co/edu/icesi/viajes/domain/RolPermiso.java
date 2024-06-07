package co.edu.icesi.viajes.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "rol_permiso")
@IdClass(RolPermisoId.class)
public class RolPermiso {

    @Id
    @ManyToOne
    @JoinColumn(name = "idRol", referencedColumnName = "idRol")
    private Rol rol;

    @Id
    @ManyToOne
    @JoinColumn(name = "idPermiso", referencedColumnName = "idPermiso")
    private Permiso permiso;


}
