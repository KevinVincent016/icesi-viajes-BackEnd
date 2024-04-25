package co.edu.icesi.viajes.repository;

import co.edu.icesi.viajes.domain.Cliente;
import co.edu.icesi.viajes.dto.ClienteDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.Date;
import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.query.Param;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

    //2.Consultar a todos los clientes por estado. Esta consulta debe ser paginada y ordenada de forma ascendente por número de identificación
    @Query("SELECT c FROM Cliente c WHERE c.estado = ?1 ORDER BY c.numeroIdentificacion ASC")
    List<Cliente> consultarClientesPorEstado(String estado, Pageable pageable);

    //3.Consultar a un cliente por correo electrónico. Esta consulta debe ignorar las mayúsculas y minúsculas.
    @Query("SELECT c FROM Cliente c WHERE UPPER(c.correo) = UPPER(?1)")
    List<Cliente> consultarClientePorCorreoElectronico(String correo);

    //4.Consultar cliente por número de identificación, usando LIKE
    @Query("SELECT c FROM Cliente c WHERE c.numeroIdentificacion LIKE %?1%")
    List<Cliente> consultarClientePorNumeroDeIdentificacion(String numeroIdentificacion);

    //5.Consultar al cliente por nombre, ignorando Mayúsculas y minúsculas, usando LIKE.
    @Query("SELECT c FROM Cliente c WHERE UPPER(c.nombre) LIKE UPPER(CONCAT('%',?1,'%'))")
    List<Cliente> consultarClientePorNombre(String nombre);

    //6.Consultar clientes por rango de fecha (Se debe pasar dos fechas y traer los clientes cuya fecha de nacimiento se encuentre entre el rango ingresado).
    @Query("SELECT c FROM Cliente c WHERE c.fechaNacimiento BETWEEN ?1 AND ?2")
    List<Cliente> consultarClientePorRangoDeFecha(Date fecha1, Date fecha2);

    //8.Consultar el total de clientes por estado.
    @Query("SELECT COUNT(c) FROM Cliente c WHERE c.estado = ?1")
    int consultarTotalClientesPorEstado(String estado);

    //9.Consultar clientes por tipo de identificación. Debe de ser paginado
    @Query("SELECT c FROM Cliente c WHERE c.idTiid =?1 ORDER BY c.idClie ASC")
    List<Cliente> consultarClientesPorTipoIdentificacion(int idTiid, Pageable pageable);

    //10.Consultar clientes por apellido (tener en cuenta los campos primer y segundo apellido)
    @Query("SELECT c FROM Cliente c WHERE c.primerApellido = ?1 AND c.segundoApellido = ?2")
    List<Cliente> consultarClientesPorApellido(String primerApellido, String segundoApellido);

    @Query(nativeQuery = true)
    List<ClienteDTO> consultarClientesSegunCriterios(@Param("pEstado") String estado, @Param("pNumeroIdentificacion") String numeroIdentificacion, @Param("pTipoIdentificacion") Integer tipoIdentificacion, @Param("pNombre") String nombre);
}