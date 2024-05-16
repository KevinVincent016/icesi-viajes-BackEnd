package co.edu.icesi.viajes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import co.edu.icesi.viajes.service.UsuarioService;
import co.edu.icesi.viajes.domain.Usuario;
import co.edu.icesi.viajes.dto.LoginDataDTO;

@RestController
@RequestMapping("/api/user")
@CrossOrigin(origins = "http://localhost:3000")
public class UsuarioController {
    
    @Autowired
	private UsuarioService usuarioService;

	@PostMapping("/logear")
    public ResponseEntity<?> logearUsuario(@RequestBody LoginDataDTO loginData) {
        Usuario usuario = usuarioService.autenticarUsuario(loginData.getLogin(), loginData.getPassword());
        if (usuario != null) {
            return ResponseEntity.ok(usuario);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Credenciales inválidas");
        }
    }

}