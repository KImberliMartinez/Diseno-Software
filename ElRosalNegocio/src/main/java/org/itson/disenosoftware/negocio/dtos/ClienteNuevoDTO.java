package org.itson.disenosoftware.negocio.dtos;

/**
 *
 * @author José Karim Franco Valencia - 245138
 * @author Jesus Rene Gonzalez Castro - 247336
 * @author Gael Rafael Castro Molina - 244802
 */
public class ClienteNuevoDTO {
    private String nombres;
    private String apellidos;
    private String correo;
    private String telefono;

    public ClienteNuevoDTO() {
    }

    
    public ClienteNuevoDTO(String nombres, String apellidos, String correo, String telefono) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "ClienteNuevoDTO{" + "nombres=" + nombres + ", apellidos=" + apellidos + ", correo=" + correo + ", telefono=" + telefono + '}';
    }
 
}
