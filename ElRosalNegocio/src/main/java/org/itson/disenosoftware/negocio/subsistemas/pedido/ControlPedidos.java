/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.disenosoftware.negocio.subsistemas.pedido;

import org.itson.disenosoftware.negocio.dtos.OrdenNuevaDTO;

/**
 *
 * @author JoseH
 */
public class ControlPedidos {
    
    public void confirmarPedido(OrdenNuevaDTO datos) {
        // Lógica para confirmar el pedido
        System.out.println("Pedido confirmado: Marco " + datos.toString());
    }
    
    
    
}
