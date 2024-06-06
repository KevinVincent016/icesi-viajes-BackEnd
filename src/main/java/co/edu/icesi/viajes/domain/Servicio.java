package co.edu.icesi.viajes.domain;

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
@Table(name = "servicio")
public class Servicio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_add")
    private Integer idAdd;

    @Column(name = "hospedajes", nullable = false)
    private Boolean hospedajes;

    @Column(name = "comidas", nullable = false)
    private Boolean comidas;

    @Column(name = "transportes", nullable = false)
    private Boolean transportes;

    @Column(name = "descripcion")
    private Boolean descripcion;

}
