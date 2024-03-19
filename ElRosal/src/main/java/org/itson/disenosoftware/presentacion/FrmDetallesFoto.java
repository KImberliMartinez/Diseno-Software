/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package org.itson.disenosoftware.presentacion;

import org.itson.disenosoftware.navegacion.INavegacion;
import org.itson.disenosoftware.navegacion.Navegacion;
import org.itson.disenosoftware.negocio.avisos.Avisos;
import org.itson.disenosoftware.negocio.dtos.ClienteNuevoDTO;
import org.itson.disenosoftware.negocio.dtos.FotoNuevaDTO;
import org.itson.disenosoftware.negocio.dtos.MarcoNuevoDTO;


/**
 *
 * @author José Karim Franco Valencia - 245138
 * @author Kimberli Joana Martinez Sandoval - 244802
 * @author Víctor Humberto Encinas Guzmán - 244821
 * @author José Ángel Huerta Amparán - 245345
 * @author Alexa Maria Picos Valenzuela - 244893
 */
public class FrmDetallesFoto extends javax.swing.JFrame {
    INavegacion navegacion;
    ClienteNuevoDTO clienteDTO;
    MarcoNuevoDTO marcoDTO;
    FotoNuevaDTO fotoDTO;
    
    /** Creates new form FrmOpcionesCliente
     * @param clienteDTO
     * @param marcoDTO */
    public FrmDetallesFoto(ClienteNuevoDTO clienteDTO, MarcoNuevoDTO marcoDTO) {
        navegacion = new Navegacion();
        clienteDTO = new ClienteNuevoDTO();
        this.marcoDTO = marcoDTO;
        fotoDTO = new FotoNuevaDTO();
        initComponents();

        btnAplicarEdicion.setIcon(null);
        quitarX();
    }

    private void guardarDatosFoto(){
        String danios = cbxTipo.getSelectedItem().toString();
        String edicion = txtAreaEdicion.getText();
        
        fotoDTO.setTipoReaparacion(danios);
        fotoDTO.setEdicionDeseada(edicion);
    }
    
     private void quitarX() {
        btnAplicarEdicion.setIcon(null);
     }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
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
        lblOpciones = new javax.swing.JLabel();
        lblOpciones1 = new javax.swing.JLabel();
        lblOpciones2 = new javax.swing.JLabel();
        cbxTipo = new javax.swing.JComboBox<>();
        panelOpcion3 = new javax.swing.JPanel();
        btnAplicarEdicion = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaEdicion = new javax.swing.JTextArea();
        btnCancelar = new javax.swing.JButton();
        btnContinuar = new javax.swing.JButton();
        btnCancelar1 = new javax.swing.JButton();
        btnContinuar1 = new javax.swing.JButton();

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
        lblTituloSeccion.setText("Detalles restauración");
        panelOpciones.add(lblTituloSeccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 800, -1));

        lblOpciones.setFont(new java.awt.Font("Amazon Ember", 0, 24)); // NOI18N
        lblOpciones.setForeground(new java.awt.Color(64, 53, 44));
        lblOpciones.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOpciones.setText("Edición deseada:");
        panelOpciones.add(lblOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 240, -1));

        lblOpciones1.setFont(new java.awt.Font("Amazon Ember", 0, 24)); // NOI18N
        lblOpciones1.setForeground(new java.awt.Color(64, 53, 44));
        lblOpciones1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOpciones1.setText("Daño(s) a reparar: ");
        panelOpciones.add(lblOpciones1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 105, 240, -1));

        lblOpciones2.setFont(new java.awt.Font("Amazon Ember", 0, 24)); // NOI18N
        lblOpciones2.setForeground(new java.awt.Color(64, 53, 44));
        lblOpciones2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOpciones2.setText("Aplicar edición:");
        panelOpciones.add(lblOpciones2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 240, -1));

        cbxTipo.setBackground(new java.awt.Color(242, 224, 201));
        cbxTipo.setFont(new java.awt.Font("Amazon Ember Light", 0, 18)); // NOI18N
        cbxTipo.setForeground(new java.awt.Color(157, 134, 90));
        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Humedad", "Rasgaduras y/o Arrugas", "Manchas", "Desvanecimiento de color" }));
        cbxTipo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cbxTipo.setFocusable(false);
        cbxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoActionPerformed(evt);
            }
        });
        panelOpciones.add(cbxTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 230, 40));

        panelOpcion3.setBackground(new java.awt.Color(242, 224, 201));
        panelOpcion3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 53, 44), 2, true));
        panelOpcion3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnAplicarEdicion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconXPequena.png"))); // NOI18N
        btnAplicarEdicion.setBorder(null);
        btnAplicarEdicion.setBorderPainted(false);
        btnAplicarEdicion.setContentAreaFilled(false);
        btnAplicarEdicion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAplicarEdicion.setFocusPainted(false);
        btnAplicarEdicion.setFocusable(false);
        btnAplicarEdicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAplicarEdicionActionPerformed(evt);
            }
        });
        panelOpcion3.add(btnAplicarEdicion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 30, 30));

        panelOpciones.add(panelOpcion3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, 30, 30));

        txtAreaEdicion.setBackground(new java.awt.Color(242, 224, 201));
        txtAreaEdicion.setColumns(20);
        txtAreaEdicion.setRows(5);
        txtAreaEdicion.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 53, 44), 2, true));
        jScrollPane1.setViewportView(txtAreaEdicion);

        panelOpciones.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 430, 130));

        btnCancelar.setBackground(new java.awt.Color(64, 53, 44));
        btnCancelar.setFont(new java.awt.Font("Amazon Ember", 0, 24)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(242, 224, 201));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorderPainted(false);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.setFocusable(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        panelOpciones.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 160, 50));

        btnContinuar.setBackground(new java.awt.Color(64, 53, 44));
        btnContinuar.setFont(new java.awt.Font("Amazon Ember", 0, 24)); // NOI18N
        btnContinuar.setForeground(new java.awt.Color(242, 224, 201));
        btnContinuar.setText("Continuar");
        btnContinuar.setBorderPainted(false);
        btnContinuar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnContinuar.setFocusable(false);
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        panelOpciones.add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 400, 160, 50));

        btnCancelar1.setBackground(new java.awt.Color(64, 53, 44));
        btnCancelar1.setFont(new java.awt.Font("Amazon Ember", 0, 24)); // NOI18N
        btnCancelar1.setForeground(new java.awt.Color(242, 224, 201));
        btnCancelar1.setText("Cancelar");
        btnCancelar1.setBorderPainted(false);
        panelOpciones.add(btnCancelar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 160, 50));

        btnContinuar1.setBackground(new java.awt.Color(64, 53, 44));
        btnContinuar1.setFont(new java.awt.Font("Amazon Ember", 0, 24)); // NOI18N
        btnContinuar1.setForeground(new java.awt.Color(242, 224, 201));
        btnContinuar1.setText("Continuar");
        btnContinuar1.setBorderPainted(false);
        btnContinuar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuar1ActionPerformed(evt);
            }
        });
        panelOpciones.add(btnContinuar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 400, 160, 50));

        getContentPane().add(panelOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1000, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoActionPerformed

    }//GEN-LAST:event_cbxTipoActionPerformed

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        // TODO add your handling code here:
        if((btnAplicarEdicion.getIcon()!= null && txtAreaEdicion.getText().isEmpty())||cbxTipo.getSelectedIndex()==-1){
           new Avisos().mostrarAviso(this, "complete todos los espacios");  
        }else{
            guardarDatosFoto();
            navegacion.cambiarFrmPedidoInfo(this, clienteDTO, fotoDTO, marcoDTO);
        }
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void btnContinuar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuar1ActionPerformed
        navegacion.cambiarFrmPedidoInfo(this, clienteDTO, fotoDTO, marcoDTO);
    }//GEN-LAST:event_btnContinuar1ActionPerformed

    private void btnAplicarEdicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAplicarEdicionActionPerformed
        // TODO add your handling code here:
        if(btnAplicarEdicion.getIcon() == null){
            btnAplicarEdicion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconXPequena.png")));
        }else{
            btnAplicarEdicion.setIcon(null);
        }
       btnAplicarEdicion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconX.png")));
    }//GEN-LAST:event_btnAplicarEdicionActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        navegacion.cambiarFrmOpcionesCliente(this);
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAplicarEdicion;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnContinuar1;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblEncabezado;
    private javax.swing.JLabel lblOpciones;
    private javax.swing.JLabel lblOpciones1;
    private javax.swing.JLabel lblOpciones2;
    private javax.swing.JLabel lblTituloSeccion;
    private javax.swing.JLabel logoRosa1;
    private javax.swing.JLabel logoRosa2;
    private javax.swing.JPanel panelEncabezado;
    private javax.swing.JPanel panelOpcion3;
    private javax.swing.JPanel panelOpciones;
    private javax.swing.JTextArea txtAreaEdicion;
    // End of variables declaration//GEN-END:variables

}
