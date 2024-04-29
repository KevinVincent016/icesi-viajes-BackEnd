package co.edu.icesi.viajes.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
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

    public Integer getIdAdd() {
        return idAdd;
    }

    public void setIdAdd(Integer idAdd) {
        this.idAdd = idAdd;
    }

    public Boolean getHospedajes() {
        return hospedajes;
    }

    public void setHospedajes(Boolean hospedajes) {
        this.hospedajes = hospedajes;
    }

    public Boolean getComidas() {
        return comidas;
    }

    public void setComidas(Boolean comidas) {
        this.comidas = comidas;
    }

    public Boolean getTransportes() {
        return transportes;
    }

    public void setTransportes(Boolean transportes) {
        this.transportes = transportes;
    }
}
