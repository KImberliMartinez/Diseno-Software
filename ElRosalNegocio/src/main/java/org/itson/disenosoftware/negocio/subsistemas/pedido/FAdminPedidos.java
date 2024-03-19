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
    
    @Override
    public void confirmarPedido(OrdenNuevaDTO datos) {
        control.confirmarPedido(datos);
    }
    
    @Override
    public float calcularPrecioPedido(OrdenNuevaDTO datos){
        return control.calcularPrecioPedido(datos);
    }
    
    @Override
    public float calcularPrecioFoto(OrdenNuevaDTO datos){
        return control.calcularPrecioFoto(datos);
    }
    
    @Override
    public float calcularPrecioMarco(OrdenNuevaDTO datos){
        return control.calcularPrecioMarco(datos);
    }
    
}
