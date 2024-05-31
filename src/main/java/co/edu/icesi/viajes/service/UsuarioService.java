package co.edu.icesi.viajes.service;

import co.edu.icesi.viajes.domain.Usuario;

public interface UsuarioService extends GenericService<Usuario, Integer> {
    Usuario logearUsuario(String login, String password);
    Usuario crearUsuario(Usuario usuario) throws Exception;
}
