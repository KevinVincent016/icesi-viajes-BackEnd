package co.edu.icesi.viajes.controller;

import co.edu.icesi.viajes.domain.Cliente;
import co.edu.icesi.viajes.dto.ClienteDTOEndpoint;
import co.edu.icesi.viajes.mapper.ClienteEndpointMapper;
import co.edu.icesi.viajes.service.ClienteService;
import co.edu.icesi.viajes.service.ReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/clientes")
@CrossOrigin(origins = "http://localhost:3000")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @Autowired
    ReservaService reservaService;

    @PostMapping("/crear")
    public ResponseEntity<ClienteDTOEndpoint> createCliente(@RequestBody ClienteDTOEndpoint clienteDTO) throws Exception {
        Cliente cliente = ClienteEndpointMapper.INSTANCE.clienteDTOEndpointToCliente(clienteDTO);
        Cliente createdCliente = clienteService.save(cliente);
        ClienteDTOEndpoint createdClienteDTO = ClienteEndpointMapper.INSTANCE.clienteToClienteDTOEndpoint(createdCliente);
        return new ResponseEntity<>(createdClienteDTO, HttpStatus.CREATED);
    }

    @GetMapping("/obtenerClientes")
    public ResponseEntity<List<ClienteDTOEndpoint>> getAllClientes() {
        List<Cliente> clientes = clienteService.findAll();
        List<ClienteDTOEndpoint> clienteDTOs = clientes.stream()
                .map(ClienteEndpointMapper.INSTANCE::clienteToClienteDTOEndpoint)
                .collect(Collectors.toList());
        return new ResponseEntity<>(clienteDTOs, HttpStatus.OK);
    }

    @GetMapping("/buscar/{id}")
    public ResponseEntity<ClienteDTOEndpoint> getClienteById(@PathVariable Integer id) {
        Optional<Cliente> clienteOptional = clienteService.findById(id);

        if (clienteOptional.isPresent()) {
            Cliente cliente = clienteOptional.get();
            ClienteDTOEndpoint clienteDTO = ClienteEndpointMapper.INSTANCE.clienteToClienteDTOEndpoint(cliente);
            return new ResponseEntity<>(clienteDTO, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/modificar/{id}")
    public ResponseEntity<ClienteDTOEndpoint> updateCliente(@PathVariable Integer id, @RequestBody ClienteDTOEndpoint clienteDTO) throws Exception {
        Cliente cliente = ClienteEndpointMapper.INSTANCE.clienteDTOEndpointToCliente(clienteDTO);
        cliente.setIdClie(id);
        Cliente updatedCliente = clienteService.update(cliente);
        ClienteDTOEndpoint updatedClienteDTO = ClienteEndpointMapper.INSTANCE.clienteToClienteDTOEndpoint(updatedCliente);
        return new ResponseEntity<>(updatedClienteDTO, HttpStatus.OK);
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Void> deleteCliente(@PathVariable Integer id) throws Exception {
        clienteService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/top3ClientesConMasReservas")
    public ResponseEntity<List<ClienteDTOEndpoint>> getTop3ClientesConMasReservas() {
        List<Integer> top3ClientesIds = reservaService.findTop3ClientsWithMostReservations();
        List<Cliente> top3Clientes = top3ClientesIds.stream()
                .map(clienteService::findById)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .collect(Collectors.toList());

        List<ClienteDTOEndpoint> top3ClienteDTOs = top3Clientes.stream()
                .map(ClienteEndpointMapper.INSTANCE::clienteToClienteDTOEndpoint)
                .collect(Collectors.toList());

        return new ResponseEntity<>(top3ClienteDTOs, HttpStatus.OK);
    }
}