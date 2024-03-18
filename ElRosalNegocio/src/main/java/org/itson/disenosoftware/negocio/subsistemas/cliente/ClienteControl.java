/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.disenosoftware.negocio.subsistemas.cliente;

import java.util.ArrayList;
import org.itson.disenosoftware.negocio.dtos.ClienteNuevoDTO;

/**
 *
 * @author JoseH
 */
public class ClienteControl {
    ArrayList<ClienteNuevoDTO> clientes = new ArrayList<>();
    
    public void registrarCliente(ClienteNuevoDTO datos) {
        clientes.add(datos);
        for (int i = 0; i < clientes.size(); i++) {
            System.out.println(clientes.get(i).getNombres());
        }
        
        // Lógica para registrar el cliente
        System.out.println("Cliente registrado: " + datos.toString());
    }
}
