package org.itson.disenosoftware.navegacion;

import javax.swing.JFrame;
import org.itson.disenosoftware.negocio.dtos.ClienteNuevoDTO;
import org.itson.disenosoftware.negocio.dtos.FotoNuevaDTO;
import org.itson.disenosoftware.negocio.dtos.MarcoNuevoDTO;

/**
 * Interfaz que define métodos para la navegación entre ventanas en una aplicación de software.
 * 
 * @author José Karim Franco Valencia - 245138
 * @author Kimberli Joana Martinez Sandoval - 244802
 * @author Víctor Humberto Encinas Guzmán - 244821
 * @author José Ángel Huerta Amparán - 245345
 * @author Alexa Maria Picos Valenzuela - 244893
 */
public interface INavegacion {

      /**
     * Cambia a la ventana de opciones de cliente.
     * @param ventana La ventana actual.
     */
    public void cambiarFrmOpcionesCliente(JFrame ventana);

    /**
     * Cambia a la ventana de registro de cliente.
     * @param ventana La ventana actual.
     */
    public void cambiarFrmRegistroCliente(JFrame ventana);

    /**
     * Cambia a la ventana de búsqueda de cliente.
     * @param ventana La ventana actual.
     */
    public void cambiarFrmBuscarCliente(JFrame ventana);

    /**
     * Cambia a la ventana de tipo de orden para un cliente dado.
     * @param ventana La ventana actual.
     * @param clienteDTO El DTO del cliente asociado.
     */
    public void cambiarFrmTipoOrden(JFrame ventana, ClienteNuevoDTO clienteDTO);

    /**
     * Cambia a la ventana de detalles de una foto para un cliente dado.
     * @param ventana La ventana actual.
     * @param clienteDTO El DTO del cliente asociado.
     * @param marcoDTO El DTO del marco asociado.
     */
    public void cambiarFrmDetallesFoto(JFrame ventana, ClienteNuevoDTO clienteDTO, MarcoNuevoDTO marcoDTO);

    /**
     * Cambia a la ventana de detalles de un marco para un cliente dado.
     * @param ventana La ventana actual.
     * @param clienteDTO El DTO del cliente asociado.
     * @param isCompleto Boleano para corrobar que sea un servicio completo.
     */
    public void cambiarFrmDetallesMarco(JFrame ventana, ClienteNuevoDTO clienteDTO, boolean isCompleto);

    /**
     * Cambia a la ventana de información del pedido para un cliente, una foto y un marco dados.
     * @param ventana La ventana actual.
     * @param clienteDTO El DTO del cliente asociado.
     * @param fotoDTO El DTO de la foto asociada.
     * @param marcoDTO El DTO del marco asociado.
     */
    public void cambiarFrmPedidoInfo(JFrame ventana, ClienteNuevoDTO clienteDTO, FotoNuevaDTO fotoDTO, MarcoNuevoDTO marcoDTO);
    
}
