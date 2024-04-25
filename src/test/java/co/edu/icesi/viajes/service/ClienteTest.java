package co.edu.icesi.viajes.service;

import co.edu.icesi.viajes.domain.Cliente;
import co.edu.icesi.viajes.dto.ClienteDTO;
import jakarta.persistence.ColumnResult;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@SpringBootTest
public class ClienteTest {

    @Autowired
    ClienteService clienteservice;

    @Test
    void consultarClientesPorEstado() {
        Pageable pageable = PageRequest.of(0, 10);

        List<Cliente> lstCliente = clienteservice.consultarClientesPorEstado("A", pageable);

        for (Cliente cliente : lstCliente) {
            System.out.println("ID: " + cliente.getIdClie() +
                    " - Nombre: " + cliente.getNombre() + " - Estado " + cliente.getEstado());
        }
    }

    @Test
    void consultarClientePorCorreoElectronico(){
        List<Cliente> lstCliente = clienteservice.consultarClientePorCorreoElectronico("QwalKEr@he");

        for (Cliente cliente : lstCliente) {
            System.out.println("ID: " + cliente.getIdClie() +
                    " - Nombre: " + cliente.getNombre() + " - Correo " + cliente.getCorreo());
        }
    }

    @Test
    void consultarClientePorNumeroDeIdentificacion(){
        List<Cliente> lstCliente = clienteservice.consultarClientePorNumeroDeIdentificacion("8913212513");

        for (Cliente cliente : lstCliente) {
            System.out.println("ID: " + cliente.getIdClie() +
                    " - Nombre: " + cliente.getNombre() + " - Numero de Identificacion " + cliente.getNumeroIdentificacion());
        }
    }

    @Test
    void consultarClientePorNombre(){
        List<Cliente> lstCliente = clienteservice.consultarClientePorNombre("Carolyn");

        for (Cliente cliente : lstCliente) {
            System.out.println("ID: " + cliente.getIdClie() +
                    " - Nombre: " + cliente.getNombre());
        }
    }

    @Test
    void consultarClientePorRangoDeFecha() throws ParseException {

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date fecha1 = dateFormat.parse("1960/10/10");
        Date fecha2 = dateFormat.parse("1970/10/10");

        List<Cliente> lstCliente = clienteservice.consultarClientePorRangoDeFecha(fecha1,fecha2);

        for (Cliente cliente : lstCliente) {
            System.out.println("ID: " + cliente.getIdClie() +
                    " - Nombre: " + cliente.getNombre() + " - Fecha de naciemiento: " + cliente.getFechaNacimiento());
        }
    }

    @Test
    void consultarTotalClientesPorEstado(){
        int results = clienteservice.consultarTotalClientesPorEstado("I");
        System.out.println("Cantidad de clientes inactivos: " + results);
    }

    @Test
    void consultarClientesPorTipoIdentificacion(){
        Pageable pageable = PageRequest.of(0, 10);
        List<Cliente> lstCliente = clienteservice.consultarClientesPorTipoIdentificacion(3, pageable);

        for(Cliente cliente : lstCliente) {
            System.out.println("ID: " + cliente.getIdClie() + " - Nombre: " + cliente.getNombre() + " - idTiid: " + cliente.getIdTiid());
        }
    }

    @Test
    void consultarClientePorApellidos() {
        List<Cliente> lstCliente = clienteservice.consultarClientesPorApellido("Wagner", "Peck");

        for(Cliente cliente : lstCliente) {
            System.out.println("ID: " + cliente.getIdClie() + " - Nombre: " + cliente.getNombre() + " - Apellidos: " + cliente.getPrimerApellido() + " " + cliente.getSegundoApellido());
        }
    }

    @Test
    void consultarClientesSegunCriterios(){
        List<ClienteDTO> lstCliente = clienteservice.consultarClientesSegunCriterios("A",null,null,null);

        for (ClienteDTO cliente : lstCliente){
            System.out.println("N Identidicaion: " + cliente.getNumeroIdentificacion() + " - Nombre: " + cliente.getNombre() + " - Estado: " + cliente.getEstado());
        }
    }

    @Test
    void consultarClientesSegunCriterios2(){
        List<ClienteDTO> lstCliente = clienteservice.consultarClientesSegunCriterios("A",null,null,"Ana");

        for (ClienteDTO cliente : lstCliente){
            System.out.println("N Identidicaion: " + cliente.getNumeroIdentificacion() + " - Nombre: " + cliente.getNombre() + " - Estado: " + cliente.getEstado());
        }
    }
}
