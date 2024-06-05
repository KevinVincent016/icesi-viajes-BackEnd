package co.edu.icesi.viajes.controller;


import co.edu.icesi.viajes.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/roles")
@CrossOrigin(origins = "http://localhost:3000")
public class RolController {

    @Autowired
    private RolService rolService;

    @GetMapping("nombre/{id}")
    public String findNombreById(@PathVariable Integer id) {
        return rolService.findNombreById(id);
    }
}
