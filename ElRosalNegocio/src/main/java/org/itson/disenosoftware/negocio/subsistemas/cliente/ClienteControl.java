/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.disenosoftware.negocio.subsistemas.cliente;

import org.itson.disenosoftware.negocio.dtos.ClienteNuevoDTO;

/**
 *
 * @author JoseH
 */
public class ClienteControl {
    
    public void registrarCliente(ClienteNuevoDTO datos) {
        // Lógica para registrar el cliente
        System.out.println("Cliente registrado: " + datos.toString());
    }
}
