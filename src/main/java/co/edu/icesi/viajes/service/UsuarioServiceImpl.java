package co.edu.icesi.viajes.service;

import co.edu.icesi.viajes.domain.Usuario;
import co.edu.icesi.viajes.dto.UsuarioDTO;
import co.edu.icesi.viajes.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Scope("singleton")
@Service
public class UsuarioServiceImpl implements UsuarioService{

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Override
	public List<Usuario> findAll() {
		List<Usuario> lstUsuario = usuarioRepository.findAll();
		return lstUsuario;
	}

	@Override
	public Optional<Usuario> findById(Integer id) {
		return usuarioRepository.findById(id);
	}

	@Override
	public Usuario save(Usuario entity) throws Exception {
		return usuarioRepository.save(entity);
	}

	@Override
	public Usuario update(Usuario entity) throws Exception {
		return usuarioRepository.save(entity);
	}

	@Override
	public void delete(Usuario entity) throws Exception {
		usuarioRepository.delete(entity);
	}

	@Override
	public void deleteById(Integer id) throws Exception {
		usuarioRepository.deleteById(id);
	}

	@Override
	public void validate(Usuario entity) throws Exception {

	}

	@Override
	public Long count() {
		return usuarioRepository.count();
	}

	@Override
	public Usuario logearUsuario(String login, String password) {

		Usuario usuario = usuarioRepository.findByLoginU(login);
		System.out.println(usuario);
		if (usuario != null && usuario.getPasswordU().equals(password)) {
			return usuario;
		}
		return null;
	}
	
	@Override
    public Usuario crearUsuario(Usuario usuario) throws Exception {
        if (usuario.getIdRol() == null) {
            throw new Exception("El campo idRol no puede estar vacío");
        }
        usuario.setFechaCreacion(new Date());
        usuario.setFechaModificacion(new Date());
        usuario.setUsuCreador("CLOPEZ");
        usuario.setUsuModificador("CLOPEZ");
        return usuarioRepository.save(usuario);
    }

	@Override
	public Usuario modificarUsuario(Integer id, UsuarioDTO usuarioDTO) throws Exception {
		Optional<Usuario> optionalUsuario = usuarioRepository.findById(id);
		if (optionalUsuario.isPresent()) {
			Usuario usuario = optionalUsuario.get();
			usuario.setLoginU(usuarioDTO.getLoginU());
			usuario.setPasswordU(usuarioDTO.getPasswordU());
			usuario.setNombre(usuarioDTO.getNombre());
			usuario.setApellido(usuarioDTO.getApellido());
			usuario.setCorreo(usuarioDTO.getCorreo());
			usuario.setFechaModificacion(new Date());
			usuario.setUsuModificador("alguien");
			usuario.setIdRol(usuarioDTO.getIdRol());

			return usuarioRepository.save(usuario);
		} else {
			throw new Exception("El usuario con ID " + id + " no fue encontrado");
		}
	}
	
}