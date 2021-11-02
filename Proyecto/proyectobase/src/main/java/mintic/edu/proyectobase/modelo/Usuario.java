package mintic.edu.proyectobase.modelo;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuario {
    
    // Atributos
    @Id
    private int idUsuario;
    private String nombreUsuario;
    private String clave;
    private String correo;
    private String tipoUsuario;
    
    
    public Usuario() {
    }


    public Usuario(int idUsuario, String nombreUsuario, String clave, String correo, String tipoUsuario) {
        this.idUsuario = idUsuario;
        this.nombreUsuario = nombreUsuario;
        this.clave = clave;
        this.correo = correo;
        this.tipoUsuario = tipoUsuario;
    }

    
}
