/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.disenosoftware.negocio.subsistemas.foto;

import org.itson.disenosoftware.negocio.dtos.FotoNuevaDTO;

/**
 *
 * @author JoseH
 */
public class FAdminFotos implements IFAdminFotos{
    private FotoControl control = new FotoControl();
    
    public void agregarFoto(FotoNuevaDTO datos) {
        control.agregarFoto(datos);
    }

}
