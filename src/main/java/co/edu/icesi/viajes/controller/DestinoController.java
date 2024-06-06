package co.edu.icesi.viajes.controller;

import co.edu.icesi.viajes.domain.Destino;
import co.edu.icesi.viajes.dto.DestinoDTOEndpoint;
import co.edu.icesi.viajes.mapper.DestinoEndpointMapper;
import co.edu.icesi.viajes.service.DestinoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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

    @GetMapping(value = "/destinos")
    public ResponseEntity<List<DestinoDTOEndpoint>> obtenerDestinos() {
        List<Destino> destinos = destinoService.findAll();
        List<DestinoDTOEndpoint> destinosDTO = DestinoEndpointMapper.INSTANCE.toDTOEndpointList(destinos);
        return new ResponseEntity<>(destinosDTO, HttpStatus.OK);
    }

    @GetMapping(value = "/buscarDestino/{id}")
    public ResponseEntity<?> buscarDestino( @PathVariable Integer id)
    {
        Optional<DestinoDTOEndpoint> destino = destinoService.findById(id).map(DestinoEndpointMapper.INSTANCE::toDTOEndpoint);
        if (destino.isPresent()) {
            return new ResponseEntity<>(destino, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("El destino que busca no existe", HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping(value = "/eliminarDestino/{id}")
    public ResponseEntity<?> eliminarDestino(@PathVariable Integer id) {
        try {
            destinoService.deleteById(id);
            return new ResponseEntity<>("Destino eliminado exitosamente", HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>("Error al eliminar el destino: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/modificar-destino/{id}")
    public ResponseEntity<?> modificarDestino(@PathVariable Integer id, @RequestBody DestinoDTOEndpoint destinoDTO) {
        try {
            Optional<DestinoDTOEndpoint> destinoOptional = destinoService.findById(id).map(DestinoEndpointMapper.INSTANCE::toDTOEndpoint);
            if (destinoOptional.isPresent()) {
                Destino destinoActualizado = DestinoEndpointMapper.INSTANCE.toEntity(destinoDTO);
                destinoActualizado.setIdDest(id);
                destinoService.update(destinoActualizado);
                return new ResponseEntity<>("Destino modificado exitosamente", HttpStatus.OK);
            } else {
                return new ResponseEntity<>("El destino que intenta modificar no existe", HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>("Error al modificar el destino: " + e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}