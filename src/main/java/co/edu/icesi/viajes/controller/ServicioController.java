package co.edu.icesi.viajes.controller;

import co.edu.icesi.viajes.domain.Servicio;
import co.edu.icesi.viajes.dto.ServicioDTO;
import co.edu.icesi.viajes.mapper.ServicioMapper;
import co.edu.icesi.viajes.service.ServicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/servicios")
@CrossOrigin(origins = "http://localhost:3000")
public class ServicioController {

    @Autowired
    private ServicioService servicioService;

    @Autowired
    private ServicioMapper servicioMapper;

    @GetMapping("/obtenerServicios")
    public ResponseEntity<List<ServicioDTO>> getAllServicios() {
        List<Servicio> servicios = servicioService.findAll();
        List<ServicioDTO> servicioDTOs = servicios.stream()
                .map(servicioMapper::toDto)
                .collect(Collectors.toList());
        return ResponseEntity.ok(servicioDTOs);
    }

    @GetMapping("/obtenerServicioPorId/{id}")
    public ResponseEntity<ServicioDTO> getServicioById(@PathVariable Integer id) {
        return servicioService.findById(id)
                .map(servicioMapper::toDto)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/crearServicio")
    public ResponseEntity<ServicioDTO> createServicio(@RequestBody ServicioDTO servicioDTO) throws Exception {
        Servicio servicio = servicioMapper.toEntity(servicioDTO);
        Servicio savedServicio = servicioService.save(servicio);
        return ResponseEntity.ok(servicioMapper.toDto(savedServicio));
    }

    @PutMapping("/actualizarServicio/{id}")
    public ResponseEntity<ServicioDTO> updateServicio(@PathVariable Integer id, @RequestBody ServicioDTO servicioDTO) throws Exception {
        if (!id.equals(servicioDTO.getIdAdd())) {
            return ResponseEntity.badRequest().build();
        }
        Servicio servicio = servicioMapper.toEntity(servicioDTO);
        Servicio updatedServicio = servicioService.update(servicio);
        return ResponseEntity.ok(servicioMapper.toDto(updatedServicio));
    }

    @DeleteMapping("/eliminarServicio/{id}")
    public ResponseEntity<Void> deleteServicio(@PathVariable Integer id) throws Exception {
        servicioService.deleteById(id);
        return ResponseEntity.ok().build();
    }
}