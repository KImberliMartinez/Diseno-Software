/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.disenosoftware.negocio.subsistemas.marco;

import org.itson.disenosoftware.negocio.dtos.MarcoNuevoDTO;

/**
 *
 * @author JoseH
 */
public class FAdminMarcos implements IFAdminMarcos{
    private MarcoControl control = new MarcoControl();
    
    public void recuperarCatalogoMarcos() {
        control.recuperarCatalogoMarcos();
    }
    
    public void registrarMarco(MarcoNuevoDTO datos) {
        control.registrarMarco(datos);
    }
}
