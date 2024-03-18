package org.itson.disenosoftware.negocio.avisos;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author José Karim Franco Valencia - 245138
 * @author Kimberli Joana Martinez Sandoval - 244802
 * @author Víctor Humberto Encinas Guzmán - 244821
 * @author José Ángel Huerta Amparán - 245345
 * @author Alexa Maria Picos Valenzuela - 244893
 */
public class Avisos implements IAvisos{

    @Override
    public void mostrarAviso(JFrame ventana, String mensaje) {
        JOptionPane.showMessageDialog(ventana, mensaje, "Aviso", JOptionPane.WARNING_MESSAGE);
    }

    @Override
    public boolean mostrarConfirmacion(JFrame ventana, String mensaje, String titulo) {
        int respuesta = JOptionPane.showConfirmDialog(ventana, mensaje, titulo, JOptionPane.OK_CANCEL_OPTION);
        return respuesta == JOptionPane.OK_OPTION;
    }

    @Override
    public void mostrarInformacion(JFrame ventana, String mensaje, String titulo) {
        JOptionPane.showMessageDialog(ventana, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
    }

}
