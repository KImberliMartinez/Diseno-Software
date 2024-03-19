/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.disenosoftware.negocio.subsistemas.marco;

import java.util.ArrayList;
import java.util.List;
import org.itson.disenosoftware.negocio.dtos.MarcoNuevoDTO;

/**
 *
 * @author JoseH
 */
public class MarcoControl {
    
    List<String> listaMarcos = new ArrayList<>();
    
    public void registrarMarco(MarcoNuevoDTO datos) {
        // Lógica para registrar un nuevo marco
        System.out.println("Marco registrado: " + datos.toString());
    }
    
    public List<String> recuperarCatalogoMarcos() {
        // Lógica para recuperar el catálogo de marcos
        System.out.println("Recuperando catálogo de marcos...");
        listaMarcos.add("Roble");
        listaMarcos.add("Maple");
        listaMarcos.add("Abedul");
        listaMarcos.add("Pino");      
        
        return listaMarcos;
    }
}
