package co.edu.icesi.viajes.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import co.edu.icesi.viajes.domain.Usuario;
import co.edu.icesi.viajes.repository.UsuarioRepository;

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
		// TODO Auto-generated method stub
		return usuarioRepository.findById(id);
	}

	@Override
	public Usuario save(Usuario entity) throws Exception {
		// TODO Auto-generated method stub
		return usuarioRepository.save(entity);
	}

	@Override
	public Usuario update(Usuario entity) throws Exception {
		// TODO Auto-generated method stub
		return usuarioRepository.save(entity);
	}

	@Override
	public void delete(Usuario entity) throws Exception {
		// TODO Auto-generated method stub
		usuarioRepository.delete(entity);
	}

	@Override
	public void deleteById(Integer id) throws Exception {
		// TODO Auto-generated method stub
		usuarioRepository.deleteById(id);
	}

	@Override
	public void validate(Usuario entity) throws Exception {
		// TODO Auto-generated method stub
	}

	@Override
	public Long count() {
		// TODO Auto-generated method stub
		return usuarioRepository.count();
	}

}
