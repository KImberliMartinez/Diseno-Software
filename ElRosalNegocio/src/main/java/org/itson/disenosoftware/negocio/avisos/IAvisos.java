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
public interface IAvisos {
    /**
     * Método para mostrar un aviso al usuario mediante una ventana emergente.
     *
     * @param ventana
     * @param mensaje El mensaje a mostrar en el aviso.
     */
    public void mostrarAviso(JFrame ventana, String mensaje);

    /**
     * Método para mostrar una ventana emergente de confirmación al usuario.
     *
     * @param ventana
     * @param mensaje El mensaje a mostrar en la ventana de confirmación.
     * @param titulo El título de la ventana de confirmación.
     * @return true si el usuario selecciona "OK", false si selecciona
     * "Cancelar".
     */
    public boolean mostrarConfirmacion(JFrame ventana, String mensaje, String titulo);

    /**
     * Método para mostrar una ventana emergente de información al usuario.
     *
     * @param ventana
     * @param mensaje El mensaje a mostrar en la ventana de información.
     * @param titulo El título de la ventana de información.
     */
    public void mostrarInformacion(JFrame ventana,String mensaje, String titulo);
}
