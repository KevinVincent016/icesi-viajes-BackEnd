package co.edu.icesi.viajes.security;
import co.edu.icesi.viajes.domain.Usuario; // Corregir la ruta del paquete
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.Collection;
import java.util.Collections;

@AllArgsConstructor
public class UserDetailsImpl {
    /*

    private final Usuario usuario;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.emptyList();
    }

    @Override
    public String getPassword() {
        return usuario.getPassword();
    }

    @Override
    public String getUsername() {
        return usuario.getLoginU(); // Asumiendo que "loginU" es el atributo de nombre de usuario
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }

    // Implementar los métodos restantes de UserDetails según sea necesario

     */
}
