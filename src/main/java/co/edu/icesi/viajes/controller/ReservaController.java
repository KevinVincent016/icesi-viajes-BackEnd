package co.edu.icesi.viajes.controller;

import co.edu.icesi.viajes.domain.Reserva;
import co.edu.icesi.viajes.dto.ReservaDTO;
import co.edu.icesi.viajes.mapper.ReservaMapper;
import co.edu.icesi.viajes.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/reservas")
@CrossOrigin(origins = "http://localhost:3000")
public class ReservaController {

    @Autowired
    private ReservaService reservaService;

    @Autowired
    private ReservaMapper reservaMapper;

    @PostMapping("/crear")
    public ResponseEntity<ReservaDTO> crearReserva(@RequestBody ReservaDTO reservaDTO) throws Exception {
        Reserva createdReserva = reservaService.save(reservaMapper.toEntity(reservaDTO));
        return new ResponseEntity<>(reservaMapper.toDTO(createdReserva), HttpStatus.CREATED);
    }

    @GetMapping("/buscarReserva/{id}")
    public ResponseEntity<ReservaDTO> obtenerReserva(@PathVariable Integer id) {
        Reserva reserva = reservaService.findById(id).orElse(null);
        return new ResponseEntity<>(reservaMapper.toDTO(reserva), HttpStatus.OK);
    }

    @GetMapping("/obtenerReservas")
    public ResponseEntity<List<ReservaDTO>> getAllReservas() {
        List<Reserva> reservas = reservaService.findAll();
        List<ReservaDTO> reservaDTOs = reservas.stream().map(reservaMapper::toDTO).collect(Collectors.toList());
        return new ResponseEntity<>(reservaDTOs, HttpStatus.OK);
    }

    @PutMapping("/actualizarReserva/{id}")
    public ResponseEntity<ReservaDTO> actualizarReserva(@PathVariable Integer id, @RequestBody ReservaDTO reservaDTO) throws Exception {
        if (!reservaDTO.getIdReserva().equals(id)) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        Reserva updatedReserva = reservaService.update(reservaMapper.toEntity(reservaDTO));
        return new ResponseEntity<>(reservaMapper.toDTO(updatedReserva), HttpStatus.OK);
    }

    @DeleteMapping("/eliminarReserva/{id}")
    public ResponseEntity<Void> eliminarReserva(@PathVariable Integer id) throws Exception {
        reservaService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}