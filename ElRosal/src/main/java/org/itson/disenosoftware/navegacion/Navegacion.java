package org.itson.disenosoftware.navegacion;

import javax.swing.JFrame;
import org.itson.disenosoftware.negocio.dtos.ClienteNuevoDTO;
import org.itson.disenosoftware.negocio.dtos.FotoNuevaDTO;
import org.itson.disenosoftware.negocio.dtos.MarcoNuevoDTO;
import org.itson.disenosoftware.presentacion.FrmBuscarCliente;
import org.itson.disenosoftware.presentacion.FrmDetallesFoto;
import org.itson.disenosoftware.presentacion.FrmDetallesMarco;
import org.itson.disenosoftware.presentacion.FrmOpcionesCliente;
import org.itson.disenosoftware.presentacion.FrmPedidoInfo;
import org.itson.disenosoftware.presentacion.FrmRegistroCliente;
import org.itson.disenosoftware.presentacion.FrmTipoOrden;

/**
 *
 * @author José Karim Franco Valencia - 245138
 * @author Kimberli Joana Martinez Sandoval - 244802
 * @author Víctor Humberto Encinas Guzmán - 244821
 * @author José Ángel Huerta Amparán - 245345
 * @author Alexa Maria Picos Valenzuela - 244893
 */
public class Navegacion implements INavegacion{

     /**
     * Cambia a la ventana de opciones de cliente.
     * @param ventana La ventana actual.
     */
    @Override
    public void cambiarFrmOpcionesCliente(JFrame ventana) {
        ventana.dispose();
        FrmOpcionesCliente opcionesCliente = new FrmOpcionesCliente();
        opcionesCliente.setVisible(true);
    }

    /**
     * Cambia a la ventana de registro de cliente.
     * @param ventana La ventana actual.
     */
    @Override
    public void cambiarFrmRegistroCliente(JFrame ventana) {
        ventana.dispose();
        FrmRegistroCliente registroCliente = new FrmRegistroCliente();
        registroCliente.setVisible(true);
    }

    /**
     * Cambia a la ventana de búsqueda de cliente.
     * @param ventana La ventana actual.
     */
    @Override
    public void cambiarFrmBuscarCliente(JFrame ventana) {
        ventana.dispose();
        FrmBuscarCliente buscarCliente = new FrmBuscarCliente();
        buscarCliente.setVisible(true);
    }

    /**
     * Cambia a la ventana de tipo de orden para un cliente dado.
     * @param ventana La ventana actual.
     * @param clienteDTO El DTO del cliente asociado.
     */
    @Override
    public void cambiarFrmTipoOrden(JFrame ventana, ClienteNuevoDTO clienteDTO) {
        ventana.dispose();
        FrmTipoOrden tipoOrden = new FrmTipoOrden();
        tipoOrden.setVisible(true);
    }

    /**
     * Cambia a la ventana de detalles de una foto para un cliente dado.
     * @param ventana La ventana actual.
     * @param clienteDTO El DTO del cliente asociado.
     */
    @Override
    public void cambiarFrmDetallesFoto(JFrame ventana, ClienteNuevoDTO clienteDTO) {
        ventana.dispose();
        FrmDetallesFoto detallesFoto = new FrmDetallesFoto();
        detallesFoto.setVisible(true);
    }

    /**
     * Cambia a la ventana de detalles de un marco para un cliente dado.
     * @param ventana La ventana actual.
     * @param clienteDTO El DTO del cliente asociado.
     */
    @Override
    public void cambiarFrmDetallesMarco(JFrame ventana, ClienteNuevoDTO clienteDTO) {
        ventana.dispose();
        FrmDetallesMarco detallesMarco = new FrmDetallesMarco();
        detallesMarco.setVisible(true);
    }

    /**
     * Cambia a la ventana de información del pedido para un cliente, una foto y un marco dados.
     * @param ventana La ventana actual.
     * @param clienteDTO El DTO del cliente asociado.
     * @param fotoDTO El DTO de la foto asociada.
     * @param marcoDTO El DTO del marco asociado.
     */
    @Override
    public void cambiarFrmPedidoInfo(JFrame ventana, ClienteNuevoDTO clienteDTO, FotoNuevaDTO fotoDTO, MarcoNuevoDTO marcoDTO) {
        ventana.dispose();
        FrmPedidoInfo pedidoInfo = new FrmPedidoInfo();
        pedidoInfo.setVisible(true);
    }

}
