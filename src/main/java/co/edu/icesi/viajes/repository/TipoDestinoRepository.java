package co.edu.icesi.viajes.repository;

import co.edu.icesi.viajes.domain.TipoDestino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Map;

public interface TipoDestinoRepository extends JpaRepository<TipoDestino, Integer> {

    //14. Consultar los tipos de destino ordenados alfabéticamente.
    @Query("SELECT td FROM TipoDestino td ORDER BY td.nombre")
    List<TipoDestino> consultarLosTipoDestino();

}
