package org.itson.disenosoftware.negocio.dtos;

/**
 *
 * @author José Karim Franco Valencia - 245138
 * @author Jesus Rene Gonzalez Castro - 247336
 * @author Gael Rafael Castro Molina - 244802
 */
public class OrdenNuevaDTO {
private ClienteNuevoDTO cliente;
private MarcoNuevoDTO marco;
private FotoNuevaDTO foto;
private float precio;
private String fechaRealizacion;

    public OrdenNuevaDTO() {
    }

    public OrdenNuevaDTO(ClienteNuevoDTO cliente, MarcoNuevoDTO marco, FotoNuevaDTO foto) {
        this.cliente = cliente;
        this.marco = marco;
        this.foto = foto;
    }

    public ClienteNuevoDTO getCliente() {
        return cliente;
    }

    public void setCliente(ClienteNuevoDTO cliente) {
        this.cliente = cliente;
    }

    public MarcoNuevoDTO getMarco() {
        return marco;
    }

    public void setMarco(MarcoNuevoDTO marco) {
        this.marco = marco;
    }

    public FotoNuevaDTO getFoto() {
        return foto;
    }

    public void setFoto(FotoNuevaDTO foto) {
        this.foto = foto;
    }

    public float getPrecio() {
        return precio;
    }

    public String getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setFechaRealizacion(String fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    @Override
    public String toString() {
        return "OrdenNuevaDTO{" + "cliente=" + cliente + ", marco=" + marco + ", foto=" + foto + ", precio=" + precio + ", fechaRealizacion=" + fechaRealizacion + '}';
    }

    

    


}
