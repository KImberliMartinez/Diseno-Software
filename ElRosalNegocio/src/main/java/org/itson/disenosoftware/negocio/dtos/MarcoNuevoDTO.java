/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package org.itson.disenosoftware.negocio.dtos;

/**

 */
public class MarcoNuevoDTO {
private double ancho;
private double largo;
private String tipoDetalle;
private String disenio;

    public MarcoNuevoDTO() {
    }


    public MarcoNuevoDTO(double ancho, double largo, String tipoDetalle, String disenio) {
        this.ancho = ancho;
        this.largo = largo;
        this.tipoDetalle = tipoDetalle;
        this.disenio = disenio;
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

    public String getDisenio() {
        return disenio;
    }

    public void setDisenio(String disenio) {
        this.disenio = disenio;
    }

    @Override
    public String toString() {
        return "MarcoNuevoDTO{" + "ancho=" + ancho + ", largo=" + largo + ", tipoDetalle=" + tipoDetalle + ", disenio=" + disenio + '}';
    }
    

}
