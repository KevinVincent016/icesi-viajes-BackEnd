package co.edu.icesi.viajes.dto;

public class LoginDataDTO {

    private String loginU;
    private String passwordU;

    public LoginDataDTO(String loginU, String passwordU) {
        this.loginU = loginU;
        this.passwordU = passwordU;
    }

    public String getLogin() {
        return loginU;
    }

    public void setLogin(String login) {
        this.loginU = login;
    }

    public String getPassword() {
        return passwordU;
    }

    public void setPassword(String password) {
        this.passwordU = password;
    }
    
}
