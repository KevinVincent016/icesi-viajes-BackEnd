package co.edu.icesi.viajes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import co.edu.icesi.viajes.domain.TipoDestino;
import co.edu.icesi.viajes.service.TipoDestinoService;
import java.util.List;

@RestController
@RequestMapping("/api/tiposdestino")
@CrossOrigin(origins = "http://localhost:3000")
public class TipoDestinoController {

    @Autowired
    private TipoDestinoService tipoDestinoService;

    @GetMapping
    public List<TipoDestino> obtenerTiposDestino() {
        List<TipoDestino> tiposDestino = tipoDestinoService.obtenerTodos();
        // Imprimir los tipos de destino para depurar
        System.out.println("Tipos de destino obtenidos: " + tiposDestino);
        return tiposDestino;
    }
}
