package co.edu.icesi.viajes.security;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.MediaType;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import co.edu.icesi.viajes.domain.Usuario;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;

public class JWTAuthenticationFilter extends UsernamePasswordAuthenticationFilter {
/*
    private final AuthenticationManager authenticationManager;

    public JWTAuthenticationFilter(AuthenticationManager authenticationManager) {
        this.authenticationManager = authenticationManager;
    }

    @Override
    public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
        try {
            AuthCredentials authCredentials = new ObjectMapper().readValue(request.getInputStream(), AuthCredentials.class);
            return authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            authCredentials.getLoginU(),
                            authCredentials.getPasswordU(),
                            Collections.emptyList()
                    )
            );
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, Authentication authResult) {
        UserDetailsImpl userDetails = (UserDetailsImpl) authResult.getPrincipal();
        String token = TokenUtils.createToken(userDetails.getUsername());
        response.addHeader("Authorization", "Bearer " + token);
        response.setContentType(MediaType.APPLICATION_JSON_VALUE);
        try {
            response.getWriter().flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

 */
}

