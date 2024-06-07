package co.edu.icesi.viajes.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import co.edu.icesi.viajes.domain.Destino;

public interface DestinoService extends GenericService<Destino, Integer>{
	
	public Destino findByCodigoAndEstado(String codigo, String estado);
	
	public List<Destino> findByIdTide(Integer id_tide);

	//@Query("SELECT d FROM Destino d WHERE d.estado = 'A'")
	//List<Destino> findDestinoActivo();
	
	//TRABAJO FINAL

	Integer findMostFrequentDestinationId();

	public Destino crearDestino(Destino nuevoDestino);

	public Destino editarDestino(Integer idDestino, Destino destinoActualizado);
    
    public Boolean eliminarDestino(Integer idDestino);

}
