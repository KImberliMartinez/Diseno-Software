/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.disenosoftware.negocio.subsistemas.pedido;

import java.util.ArrayList;
import org.itson.disenosoftware.negocio.dtos.OrdenNuevaDTO;

/**
 *
 * @author JoseH
 */
public class ControlPedidos {
    ArrayList<OrdenNuevaDTO> pedidos = new ArrayList<>();
    
    public void confirmarPedido(OrdenNuevaDTO datos) {
        pedidos.add(datos);
        for (int i = 0; i < pedidos.size(); i++) {
            System.out.println(pedidos.get(i).toString());
        }
        // Lógica para confirmar el pedido
        System.out.println("Pedido confirmado: Marco " + datos.toString());
    }
    
    public float calcularPrecioPedido(OrdenNuevaDTO datos){
        float precio = 500;
        if(datos.getMarco() != null && datos.getFoto() != null){
           precio += calcularPrecioFoto(datos);
           
           
        } else if (datos.getMarco() == null){
            
        } else if(datos.getFoto() == null){
            
        }
    }
   
    public float calcularPrecioFoto(OrdenNuevaDTO datos) {
        if (!datos.getFoto().getEdicionDeseada().isBlank() || !datos.getFoto().getEdicionDeseada().isEmpty()) {
            return 300;
        }
        return 0;
    }
        
    public float calcularPrecioMarco(OrdenNuevaDTO datos){
        float precioUnidad;
        float precio;
        if (datos.getMarco().getTipoDetalle().equals("Roble")){
            
        }
//        listaMarcos.add("Roble");
//        listaMarcos.add("Maple");
//        listaMarcos.add("Abedul");
//        listaMarcos.add("Pino");   

    }
    
}
