/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.disenosoftware.negocio.subsistemas.pedido;

import org.itson.disenosoftware.negocio.dtos.ClienteNuevoDTO;
import org.itson.disenosoftware.negocio.dtos.OrdenNuevaDTO;

/**
 *
 * @author JoseH
 */
public class FAdminPedidos implements IFAdminPedidos{
    private ControlPedidos control = new ControlPedidos();
    
    public void confirmarPedido(OrdenNuevaDTO datos) {
        control.confirmarPedido(datos);
    }
    
}
