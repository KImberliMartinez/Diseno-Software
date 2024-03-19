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
public interface IFAdminPedidos {
    public void confirmarPedido(OrdenNuevaDTO datos);
    public float calcularPrecioPedido(OrdenNuevaDTO datos);
    public float calcularPrecioFoto(OrdenNuevaDTO datos);
    public float calcularPrecioMarco(OrdenNuevaDTO datos);
}
