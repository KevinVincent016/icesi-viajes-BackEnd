package co.edu.icesi.viajes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import co.edu.icesi.viajes.domain.Destino;

public interface DestinoRepository extends JpaRepository<Destino, Integer>{
	
	public Destino findByCodigoAndEstado(String codigo, String estado);
	
	public List<Destino> findByIdTide(Integer id_tide);
	
	// @Query("SELECT d FROM Destino d WHERE d.estado = 'A'")
	// List<Destino> findDestinoActivo();
	
	//TRABAJO FINAL
	
	//public Destino crearDestino(Destino nuevoDestino);
	
    //public Destino editarDestino(Integer idDestino, Destino destinoActualizado);
    
    //public Boolean eliminarDestino(Integer idDestino);

}
