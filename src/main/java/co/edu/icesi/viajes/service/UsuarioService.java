package co.edu.icesi.viajes.service;

import co.edu.icesi.viajes.domain.Usuario;
import co.edu.icesi.viajes.dto.UsuarioDTO;

public interface UsuarioService extends GenericService<Usuario, Integer> {
    Usuario logearUsuario(String login, String password);
    Usuario crearUsuario(Usuario usuario) throws Exception;
    Usuario modificarUsuario(Integer id, UsuarioDTO usuarioDTO) throws Exception;
    Usuario eliminarUsuario(Integer id) throws Exception;
}

