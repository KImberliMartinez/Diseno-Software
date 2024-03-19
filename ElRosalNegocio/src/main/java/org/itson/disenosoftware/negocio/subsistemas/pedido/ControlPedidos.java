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
    static ArrayList<OrdenNuevaDTO> pedidos = new ArrayList<>();
    
    public void confirmarPedido(OrdenNuevaDTO datos) {
        pedidos.add(datos);
        for (int i = 0; i < pedidos.size(); i++) {
            System.out.println(pedidos.get(i).toString());
        }
        // Lógica para confirmar el pedido
        System.out.println("Pedido confirmado: Marco " + datos.toString());
    }
    
    public float calcularPrecioPedido(OrdenNuevaDTO datos) {
        float precio = 0;
        if (datos.getMarco() != null && datos.getFoto() != null) {
            precio += calcularPrecioFoto(datos);
            precio += calcularPrecioMarco(datos);
        } else if (datos.getMarco() == null) {
            precio += calcularPrecioFoto(datos);
        } else if (datos.getFoto() == null) {
            precio += calcularPrecioMarco(datos);
        }
        return precio;
    }
   
    public float calcularPrecioFoto(OrdenNuevaDTO datos) {
        float precio = 500;
        if (!datos.getFoto().getEdicionDeseada().isBlank() || !datos.getFoto().getEdicionDeseada().isEmpty()) {
            return precio + 300;
        }
        return precio;
    }
        
    public float calcularPrecioMarco(OrdenNuevaDTO datos){
        float precioUnidad = 0;
        float precio;
        if (datos.getMarco().getTipoDetalle().equals("Roble")){
            precioUnidad = 15;
        } else if (datos.getMarco().getTipoDetalle().equals("Maple")){
            precioUnidad = 12;
        } else if(datos.getMarco().getTipoDetalle().equals("Abedul")){
            precioUnidad = 10;
        } else if(datos.getMarco().getTipoDetalle().equals("Pino")){
            precioUnidad = 5;
        }
        
        float perimetro = (float) (2 * (datos.getMarco().getAncho() + datos.getMarco().getLargo()));
        precio = perimetro * precioUnidad;
        return precioUnidad; 

    }
    
}
