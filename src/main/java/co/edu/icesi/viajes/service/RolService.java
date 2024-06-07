package co.edu.icesi.viajes.service;

import co.edu.icesi.viajes.domain.Rol;

public interface RolService extends GenericService<Rol, Integer>{

    public String findNombreById(Integer id);
}
