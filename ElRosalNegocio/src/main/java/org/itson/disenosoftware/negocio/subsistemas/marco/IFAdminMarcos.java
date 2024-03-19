/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.itson.disenosoftware.negocio.subsistemas.marco;

import java.util.List;
import org.itson.disenosoftware.negocio.dtos.MarcoNuevoDTO;

/**
 *
 * @author JoseH
 */
public interface IFAdminMarcos {
    
    public void registrarMarco(MarcoNuevoDTO datos);
    public List<String> recuperarCatalogoMarcos();
    
}
