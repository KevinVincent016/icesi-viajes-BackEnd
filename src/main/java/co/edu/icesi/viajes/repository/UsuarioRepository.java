package co.edu.icesi.viajes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.icesi.viajes.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
	
	

}
