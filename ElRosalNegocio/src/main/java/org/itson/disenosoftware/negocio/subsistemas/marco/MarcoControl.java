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
public class MarcoControl {
    public void registrarMarco(MarcoNuevoDTO datos) {
        // Lógica para registrar un nuevo marco
        System.out.println("Marco registrado: " + datos.toString());
    }
    
    public void recuperarCatalogoMarcos() {
        // Lógica para recuperar el catálogo de marcos
        System.out.println("Recuperando catálogo de marcos...");
    }
}
