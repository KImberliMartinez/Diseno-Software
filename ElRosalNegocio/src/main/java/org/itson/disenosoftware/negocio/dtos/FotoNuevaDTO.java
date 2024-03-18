/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package org.itson.disenosoftware.negocio.dtos;

/**
 *
 * @author José Karim Franco Valencia - 245138
 */
public class FotoNuevaDTO {
 
private String tipoReaparacion;
private String EdicionDeseada;

    public FotoNuevaDTO() {
    }


    public FotoNuevaDTO(String tipoReaparacion, String EdicionDeseada) {
        this.tipoReaparacion = tipoReaparacion;
        this.EdicionDeseada = EdicionDeseada;
    }

    public String getTipoReaparacion() {
        return tipoReaparacion;
    }

    public void setTipoReaparacion(String tipoReaparacion) {
        this.tipoReaparacion = tipoReaparacion;
    }

    public String getEdicionDeseada() {
        return EdicionDeseada;
    }

    public void setEdicionDeseada(String EdicionDeseada) {
        this.EdicionDeseada = EdicionDeseada;
    }
    
    

}
