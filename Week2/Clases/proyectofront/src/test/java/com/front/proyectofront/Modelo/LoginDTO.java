package com.front.proyectofront.Modelo;

public class LoginDTO {
    
    private String nombreUsuario;
    private String password;
    
    
    public LoginDTO() {
    }


    public LoginDTO(String nombreUsuario, String password) {
        this.nombreUsuario = nombreUsuario;
        this.password = password;
    }


    public String getNombreUsuario() {
        return nombreUsuario;
    }


    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }


    public String getPassword() {
        return password;
    }


    public void setPassword(String password) {
        this.password = password;
    }

    
    
}
