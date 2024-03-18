/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package org.itson.disenosoftware.negocio.dtos;

/**
 *
 * @author José Karim Franco Valencia - 245138
 * @author Jesus Rene Gonzalez Castro - 247336
 * @author Gael Rafael Castro Molina - 244802
 */
public class MarcoNuevoDTO {
private double ancho;
private double largo;
private String tipoDetalle;
private  int Cantidad;

    public MarcoNuevoDTO() {
    }


    public MarcoNuevoDTO(double ancho, double largo, String tipoDetalle, int Cantidad) {
        this.ancho = ancho;
        this.largo = largo;
        this.tipoDetalle = tipoDetalle;
        this.Cantidad = Cantidad;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public String getTipoDetalle() {
        return tipoDetalle;
    }

    public void setTipoDetalle(String tipoDetalle) {
        this.tipoDetalle = tipoDetalle;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    

}
