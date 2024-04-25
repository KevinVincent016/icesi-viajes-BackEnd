package co.edu.icesi.viajes.service;

import co.edu.icesi.viajes.domain.TipoDestino;
import java.util.List;
import java.util.Map;


public interface TipoDestinoService extends GenericService<TipoDestino,Integer>{

    //14. Consultar los tipos de destino ordenados alfabéticamente.
    List<TipoDestino> consultarLosTipoDestino();
	
}
