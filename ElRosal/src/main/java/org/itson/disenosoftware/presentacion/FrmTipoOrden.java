package org.itson.disenosoftware.presentacion;

import org.itson.disenosoftware.navegacion.INavegacion;
import org.itson.disenosoftware.navegacion.Navegacion;
import org.itson.disenosoftware.negocio.avisos.Avisos;
import org.itson.disenosoftware.negocio.dtos.ClienteNuevoDTO;

/**
 *
 * @author José Karim Franco Valencia - 245138
 * @author Kimberli Joana Martinez Sandoval - 244802
 * @author Víctor Humberto Encinas Guzmán - 244821
 * @author José Ángel Huerta Amparán - 245345
 * @author Alexa Maria Picos Valenzuela - 244893
 */
public class FrmTipoOrden extends javax.swing.JFrame {

    INavegacion navegacion;
    ClienteNuevoDTO clienteDTO;

    /**
     * Creates new form FrmOpcionesCliente
     */
    public FrmTipoOrden(ClienteNuevoDTO clienteDTO) {
        navegacion = new Navegacion();
        this.clienteDTO = clienteDTO;
        initComponents();
        quitarX();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEncabezado = new javax.swing.JPanel();
        lblEncabezado = new javax.swing.JLabel();
        logoRosa1 = new javax.swing.JLabel();
        logoRosa2 = new javax.swing.JLabel();
        panelOpciones = new javax.swing.JPanel();
        lblTituloSeccion = new javax.swing.JLabel();
        lblOpciones1 = new javax.swing.JLabel();
        lblOpciones2 = new javax.swing.JLabel();
        lblOpciones3 = new javax.swing.JLabel();
        panelOpcion3 = new javax.swing.JPanel();
        btnOpcion3 = new javax.swing.JButton();
        panelOpcion2 = new javax.swing.JPanel();
        btnOpcion2 = new javax.swing.JButton();
        panelOpcion1 = new javax.swing.JPanel();
        btnOpcion1 = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnContinuar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelEncabezado.setBackground(new java.awt.Color(64, 53, 44));
        panelEncabezado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblEncabezado.setFont(new java.awt.Font("Cambria Math", 1, 48)); // NOI18N
        lblEncabezado.setForeground(new java.awt.Color(242, 224, 201));
        lblEncabezado.setText("EL ROSAL");
        panelEncabezado.add(lblEncabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(398, 30, -1, -1));

        logoRosa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconRosa.png"))); // NOI18N
        panelEncabezado.add(logoRosa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 20, 64, 64));

        logoRosa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconRosa.png"))); // NOI18N
        panelEncabezado.add(logoRosa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 64, 64));

        getContentPane().add(panelEncabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 100));

        panelOpciones.setBackground(new java.awt.Color(242, 224, 201));
        panelOpciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloSeccion.setFont(new java.awt.Font("Amazon Ember", 1, 48)); // NOI18N
        lblTituloSeccion.setForeground(new java.awt.Color(64, 53, 44));
        lblTituloSeccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloSeccion.setText("Tipo de orden:");
        panelOpciones.add(lblTituloSeccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 800, -1));

        lblOpciones1.setFont(new java.awt.Font("Amazon Ember", 0, 36)); // NOI18N
        lblOpciones1.setForeground(new java.awt.Color(64, 53, 44));
        lblOpciones1.setText("Servicio completo");
        panelOpciones.add(lblOpciones1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 275, -1, -1));

        lblOpciones2.setFont(new java.awt.Font("Amazon Ember", 0, 36)); // NOI18N
        lblOpciones2.setForeground(new java.awt.Color(64, 53, 44));
        lblOpciones2.setText("Enmarcar una foto");
        panelOpciones.add(lblOpciones2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 135, -1, -1));

        lblOpciones3.setFont(new java.awt.Font("Amazon Ember", 0, 36)); // NOI18N
        lblOpciones3.setForeground(new java.awt.Color(64, 53, 44));
        lblOpciones3.setText("Restaurar una foto");
        panelOpciones.add(lblOpciones3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 205, -1, -1));

        panelOpcion3.setBackground(new java.awt.Color(242, 224, 201));
        panelOpcion3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 53, 44), 2, true));
        panelOpcion3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnOpcion3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconX.png"))); // NOI18N
        btnOpcion3.setBorder(null);
        btnOpcion3.setBorderPainted(false);
        btnOpcion3.setContentAreaFilled(false);
        btnOpcion3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOpcion3.setFocusPainted(false);
        btnOpcion3.setFocusable(false);
        btnOpcion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpcion3ActionPerformed(evt);
            }
        });
        panelOpcion3.add(btnOpcion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        panelOpciones.add(panelOpcion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 50, 50));

        panelOpcion2.setBackground(new java.awt.Color(242, 224, 201));
        panelOpcion2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 53, 44), 2, true));
        panelOpcion2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnOpcion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconX.png"))); // NOI18N
        btnOpcion2.setBorder(null);
        btnOpcion2.setBorderPainted(false);
        btnOpcion2.setContentAreaFilled(false);
        btnOpcion2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOpcion2.setFocusPainted(false);
        btnOpcion2.setFocusable(false);
        btnOpcion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpcion2ActionPerformed(evt);
            }
        });
        panelOpcion2.add(btnOpcion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        panelOpciones.add(panelOpcion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 50, 50));

        panelOpcion1.setBackground(new java.awt.Color(242, 224, 201));
        panelOpcion1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 53, 44), 2, true));
        panelOpcion1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnOpcion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconX.png"))); // NOI18N
        btnOpcion1.setBorder(null);
        btnOpcion1.setBorderPainted(false);
        btnOpcion1.setContentAreaFilled(false);
        btnOpcion1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOpcion1.setFocusPainted(false);
        btnOpcion1.setFocusable(false);
        btnOpcion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOpcion1ActionPerformed(evt);
            }
        });
        panelOpcion1.add(btnOpcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 50, 50));

        panelOpciones.add(panelOpcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 50, 50));

        btnCancelar.setBackground(new java.awt.Color(64, 53, 44));
        btnCancelar.setFont(new java.awt.Font("Amazon Ember", 0, 24)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(242, 224, 201));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorderPainted(false);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.setFocusPainted(false);
        panelOpciones.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, 160, 50));

        btnContinuar.setBackground(new java.awt.Color(64, 53, 44));
        btnContinuar.setFont(new java.awt.Font("Amazon Ember", 0, 24)); // NOI18N
        btnContinuar.setForeground(new java.awt.Color(242, 224, 201));
        btnContinuar.setText("Continuar");
        btnContinuar.setBorderPainted(false);
        btnContinuar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnContinuar.setFocusPainted(false);
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        panelOpciones.add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 380, 160, 50));

        getContentPane().add(panelOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1000, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        if (btnOpcion1.getIcon() != null) {
            navegacion.cambiarFrmDetallesMarco(this, clienteDTO, false);
        } else if (btnOpcion2.getIcon() != null) {
            navegacion.cambiarFrmDetallesFoto(this, clienteDTO, null);
        } else if (btnOpcion3.getIcon() != null) {
            navegacion.cambiarFrmDetallesMarco(this, clienteDTO, true);
        } else {
            new Avisos().mostrarAviso(this, "Seleccione un tipo de orden");
        }
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void btnOpcion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpcion1ActionPerformed
        btnOpcion3.setIcon(null);
        btnOpcion2.setIcon(null);
        btnOpcion1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconX.png")));
    }//GEN-LAST:event_btnOpcion1ActionPerformed

    private void btnOpcion3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpcion3ActionPerformed
        btnOpcion1.setIcon(null);
        btnOpcion2.setIcon(null);
        btnOpcion3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconX.png")));
    }//GEN-LAST:event_btnOpcion3ActionPerformed

    private void btnOpcion2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOpcion2ActionPerformed
        btnOpcion1.setIcon(null);
        btnOpcion3.setIcon(null);
        btnOpcion2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconX.png")));
    }//GEN-LAST:event_btnOpcion2ActionPerformed

    private void quitarX() {
        btnOpcion1.setIcon(null);
        btnOpcion2.setIcon(null);
        btnOpcion3.setIcon(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnOpcion1;
    private javax.swing.JButton btnOpcion2;
    private javax.swing.JButton btnOpcion3;
    private javax.swing.JLabel lblEncabezado;
    private javax.swing.JLabel lblOpciones1;
    private javax.swing.JLabel lblOpciones2;
    private javax.swing.JLabel lblOpciones3;
    private javax.swing.JLabel lblTituloSeccion;
    private javax.swing.JLabel logoRosa1;
    private javax.swing.JLabel logoRosa2;
    private javax.swing.JPanel panelEncabezado;
    private javax.swing.JPanel panelOpcion1;
    private javax.swing.JPanel panelOpcion2;
    private javax.swing.JPanel panelOpcion3;
    private javax.swing.JPanel panelOpciones;
    // End of variables declaration//GEN-END:variables

}
