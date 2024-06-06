package co.edu.icesi.viajes.controller;

import co.edu.icesi.viajes.dto.LoginDataDTO;
import co.edu.icesi.viajes.dto.UsuarioDTO;
import co.edu.icesi.viajes.mapper.UsuarioMapper;
import co.edu.icesi.viajes.service.UsuarioService;
import co.edu.icesi.viajes.domain.Usuario;
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

    @GetMapping("/usuarios")
    public ResponseEntity<List<UsuarioDTO>> getAllUsers() {
        List<Usuario> usuarios = usuarioService.findAll();
        List<UsuarioDTO> usuarioDTOs = usuarios.stream().map(UsuarioMapper.INSTANCE::toDTO).collect(Collectors.toList());
        return new ResponseEntity<>(usuarioDTOs, HttpStatus.OK);
    }
}
