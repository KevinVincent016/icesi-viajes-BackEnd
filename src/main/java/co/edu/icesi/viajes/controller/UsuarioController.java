package co.edu.icesi.viajes.controller;

import co.edu.icesi.viajes.dto.LoginDataDTO;
import co.edu.icesi.viajes.dto.UsuarioDTO;
import co.edu.icesi.viajes.mapper.UsuarioMapper;
import co.edu.icesi.viajes.service.UsuarioService;
import co.edu.icesi.viajes.domain.Usuario;
import co.edu.icesi.viajes.service.UsuarioServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/user")
@CrossOrigin(origins = "http://localhost:3000")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/logear")
    public ResponseEntity<?> logearUsuario(@RequestBody LoginDataDTO loginData) {
        Usuario usuario = usuarioService.logearUsuario(loginData.getLogin(), loginData.getPassword());
        if (usuario != null) {
            return ResponseEntity.ok(usuario);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Credenciales inválidas");
        }
    }

    @PostMapping("/crear")
    public ResponseEntity<String> createUser(@RequestBody Usuario usuario) {
        try {
            usuarioService.crearUsuario(usuario);
            return new ResponseEntity<>("Usuario creado exitosamente", HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>("Error al crear el usuario: " + e.getMessage(), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/ver-usuarios")
    public ResponseEntity<List<UsuarioDTO>> getAllUsers() {
        List<Usuario> usuarios = usuarioService.findAll();
        List<UsuarioDTO> usuarioDTOs = usuarios.stream().map(UsuarioMapper.INSTANCE::toDTO).collect(Collectors.toList());
        return new ResponseEntity<>(usuarioDTOs, HttpStatus.OK);
    }

    @PutMapping("/modificar-usuario/{id}")
    public ResponseEntity<?> modificarrUsuario(@PathVariable("id") Integer id, @RequestBody UsuarioDTO usuarioDTO) {
        try {
            Usuario usuarioModificado = usuarioService.modificarUsuario(id, usuarioDTO);
            return ResponseEntity.ok(usuarioModificado);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }

    @GetMapping("/buscar-usuario/{id}")
    public ResponseEntity<UsuarioDTO> getUser(@PathVariable("id") Integer id) {
        Usuario usuario = usuarioService.findById(id).orElse(null);
        if (usuario != null) {
            UsuarioDTO usuarioDTO = UsuarioMapper.INSTANCE.toDTO(usuario);
            return new ResponseEntity<>(usuarioDTO, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/eliminar-usuario/{id}")
    public ResponseEntity<?> eliminarUsuario(@PathVariable("id") Integer id) {
        try {
            usuarioService.eliminarUsuario(id);
            return ResponseEntity.ok("Usuario eliminado exitosamente");
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
        }
    }


}
