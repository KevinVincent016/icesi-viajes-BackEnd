package co.edu.icesi.viajes.controller;

import co.edu.icesi.viajes.domain.Plan;
import co.edu.icesi.viajes.dto.PlanDTO;
import co.edu.icesi.viajes.mapper.PlanMapper;
import co.edu.icesi.viajes.service.PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/planes")
@CrossOrigin(origins = "http://localhost:3000")
public class PlanController {

    @Autowired
    private PlanService planService;

    @PostMapping("/crear")
    public ResponseEntity<PlanDTO> crearPlan(@RequestBody PlanDTO planDTO) throws Exception {
        Plan createdPlan = planService.save(PlanMapper.INSTANCE.toEntity(planDTO));
        return new ResponseEntity<>(PlanMapper.INSTANCE.toDTO(createdPlan), HttpStatus.CREATED);
    }

    @GetMapping("/buscarPlan/{id}")
    public ResponseEntity<PlanDTO> obtenerPlan(@PathVariable Integer id) {
        Plan plan = planService.findById(id).orElse(null);
        return new ResponseEntity<>(PlanMapper.INSTANCE.toDTO(plan), HttpStatus.OK);
    }

    @GetMapping("/obtenerPlanes")
    public ResponseEntity<List<PlanDTO>> getAllPlans() {
        List<Plan> plans = planService.findAll();
        List<PlanDTO> planDTOs = plans.stream().map(PlanMapper.INSTANCE::toDTO).collect(Collectors.toList());
        return new ResponseEntity<>(planDTOs, HttpStatus.OK);
    }

    @PutMapping("/actualizarPlan/{id}")
    public ResponseEntity<PlanDTO> actualizarPlan(@PathVariable Integer id, @RequestBody PlanDTO planDTO) throws Exception {
        if (!planDTO.getIdPlan().equals(id)) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        Plan updatedPlan = planService.update(PlanMapper.INSTANCE.toEntity(planDTO));
        return new ResponseEntity<>(PlanMapper.INSTANCE.toDTO(updatedPlan), HttpStatus.OK);
    }

    @DeleteMapping("/eliminarPlan/{id}")
    public ResponseEntity<Void> eliminarPlan(@PathVariable Integer id) throws Exception {
        planService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}