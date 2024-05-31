package co.edu.icesi.viajes.controller;

import co.edu.icesi.viajes.domain.Destino;
import co.edu.icesi.viajes.service.DestinoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/destinos")
@CrossOrigin(origins = "http://localhost:3000")
public class DestinoController {

    @Autowired
    private DestinoService destinoService;

    @PostMapping("/crear")
    public ResponseEntity<?> crearDestino(@RequestBody Destino destino) {
        try {
            Destino destinoCreado = destinoService.crearDestino(destino);
            return ResponseEntity.ok(destinoCreado);
        } catch (Exception e) {
            String mensajeError = "Error al crear el destino: " + e.getMessage();
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(mensajeError);
        }
    }
}