package co.edu.icesi.viajes.security;

import lombok.Data;

@Data
public class AuthCredentials {
    private String loginU;
    private String passwordU;
}