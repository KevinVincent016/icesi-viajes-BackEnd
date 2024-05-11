package co.edu.icesi.viajes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import co.edu.icesi.viajes.service.ClienteService;
import co.edu.icesi.viajes.dto.ClienteDTO;

@RestController
@RequestMapping("/api/user")
public class ClienteController {
    
    @Autowired
	private ClienteService clienteService;
	
	/* 
	@PostMapping("/login")
	public ResponseEntity<?> authLogin(@RequestBody ClienteDTO cliente){

        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));

        SecurityContextHolder.getContext().setAuthentication(authentication);

        String jwt = jwtProvider.generateJwtToken(authentication);
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();

        return ResponseEntity.ok(new JwtResponse(jwt, userDetails.getUsername(), userDetails.getAuthorities()));

	}
    */

}