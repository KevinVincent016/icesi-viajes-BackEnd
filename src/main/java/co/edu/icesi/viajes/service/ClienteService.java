package co.edu.icesi.viajes.service;

import co.edu.icesi.viajes.domain.Cliente;
import co.edu.icesi.viajes.dto.ClienteDTO;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;


public interface ClienteService extends GenericService<Cliente,Integer>{

    //2.Consultar a todos los clientes por estado. Esta consulta debe ser paginada y ordenada de forma ascendente por número de identificación
    List<Cliente> consultarClientesPorEstado(String estado, Pageable pageable);

    //3.Consultar a un cliente por correo electrónico. Esta consulta debe ignorar las mayúsculas y minúsculas.
    List<Cliente> consultarClientePorCorreoElectronico(String correo);

    //4.Consultar cliente por número de identificación, usando LIKE
    List<Cliente> consultarClientePorNumeroDeIdentificacion(String numeroIdentificacion);

    //5.Consultar al cliente por nombre, ignorando Mayúsculas y minúsculas, usando LIKE.
    List<Cliente> consultarClientePorNombre(String nombre);

    //6.Consultar clientes por rango de fecha (Se debe pasar dos fechas y traer los clientes cuya fecha de nacimiento se encuentre entre el rango ingresado).
    List<Cliente> consultarClientePorRangoDeFecha(Date fecha1, Date fecha2);

    //8.Consultar el total de clientes por estado.
    int consultarTotalClientesPorEstado(String estado);

    //9.Consultar clientes por tipo de identificación. Debe de ser paginado
    List<Cliente> consultarClientesPorTipoIdentificacion(int idTiid, Pageable pageable);

    //10.Consultar clientes por apellido (tener en cuenta los campos primer y segundo apellido)
    List<Cliente> consultarClientesPorApellido(String primerApellido, String segundoApellido);

    List<ClienteDTO> consultarClientesSegunCriterios(@Param("pEstado") String estado, @Param("pNumeroIdentificacion") String numeroIdentificacion, @Param("pTipoIdentificacion") Integer tipoIdentificacion, @Param("pNombre") String nombre);

}