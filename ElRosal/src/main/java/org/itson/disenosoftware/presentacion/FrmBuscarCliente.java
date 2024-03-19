package org.itson.disenosoftware.presentacion;

import org.itson.disenosoftware.navegacion.INavegacion;
import org.itson.disenosoftware.navegacion.Navegacion;
import org.itson.disenosoftware.negocio.avisos.Avisos;

/**
 *
 * @author José Karim Franco Valencia - 245138
 * @author Kimberli Joana Martinez Sandoval - 244802
 * @author Víctor Humberto Encinas Guzmán - 244821
 * @author José Ángel Huerta Amparán - 245345
 * @author Alexa Maria Picos Valenzuela - 244893
 */
public class FrmBuscarCliente extends javax.swing.JFrame {

    INavegacion navegacion;
    /** Creates new form FrmOpcionesCliente */
    public FrmBuscarCliente() {
        navegacion = new Navegacion();
        initComponents();
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
        cbxTipo = new javax.swing.JComboBox<>();
        txtNombre = new javax.swing.JTextField();
        lblOpciones = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnSeleccionar = new javax.swing.JButton();
        lblOpciones1 = new javax.swing.JLabel();
        lblOpciones2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

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
        lblTituloSeccion.setText("Busqueda cliente por");
        panelOpciones.add(lblTituloSeccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 800, -1));

        cbxTipo.setBackground(new java.awt.Color(242, 224, 201));
        cbxTipo.setFont(new java.awt.Font("Amazon Ember Light", 0, 18)); // NOI18N
        cbxTipo.setForeground(new java.awt.Color(157, 134, 90));
        cbxTipo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 53, 44), 2));
        cbxTipo.setFocusable(false);
        cbxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoActionPerformed(evt);
            }
        });
        panelOpciones.add(cbxTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 230, 40));

        txtNombre.setBackground(new java.awt.Color(242, 224, 201));
        txtNombre.setFont(new java.awt.Font("Amazon Ember Light", 0, 20)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(34, 33, 33));
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 53, 44), 2));
        panelOpciones.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 130, 550, 40));

        lblOpciones.setFont(new java.awt.Font("Amazon Ember", 0, 24)); // NOI18N
        lblOpciones.setForeground(new java.awt.Color(64, 53, 44));
        lblOpciones.setText("Coincidencia:");
        panelOpciones.add(lblOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, -1, -1));

        btnCancelar.setBackground(new java.awt.Color(64, 53, 44));
        btnCancelar.setFont(new java.awt.Font("Amazon Ember", 0, 24)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(242, 224, 201));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorderPainted(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        panelOpciones.add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 400, 160, 50));

        btnSeleccionar.setBackground(new java.awt.Color(64, 53, 44));
        btnSeleccionar.setFont(new java.awt.Font("Amazon Ember", 0, 24)); // NOI18N
        btnSeleccionar.setForeground(new java.awt.Color(242, 224, 201));
        btnSeleccionar.setText("Seleccionar");
        btnSeleccionar.setBorderPainted(false);
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });
        panelOpciones.add(btnSeleccionar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 400, 160, 50));

        lblOpciones1.setFont(new java.awt.Font("Amazon Ember", 0, 36)); // NOI18N
        lblOpciones1.setForeground(new java.awt.Color(64, 53, 44));
        lblOpciones1.setText("Opciones");
        panelOpciones.add(lblOpciones1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, -1, -1));

        lblOpciones2.setFont(new java.awt.Font("Amazon Ember", 0, 24)); // NOI18N
        lblOpciones2.setForeground(new java.awt.Color(64, 53, 44));
        lblOpciones2.setText("Tipo:");
        panelOpciones.add(lblOpciones2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        jPanel1.setBackground(new java.awt.Color(217, 195, 176));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 53, 44)));
        panelOpciones.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 810, 150));

        getContentPane().add(panelOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1000, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoActionPerformed

    }//GEN-LAST:event_cbxTipoActionPerformed

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        // TODO add your handling code here:
        if(cbxTipo.getSelectedIndex()==-1||txtNombre.getText().isEmpty()){
           // navegacion.cambiarFrmTipoOrden(this, clienteDTO);
           new Avisos().mostrarAviso(this, "complete todos los espacios");
      
        }else{
              FrmTipoOrden tp=new FrmTipoOrden();
        tp.setVisible(true);
        dispose();
        }
        
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        navegacion.cambiarFrmOpcionesCliente(this);
    }//GEN-LAST:event_btnCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblEncabezado;
    private javax.swing.JLabel lblOpciones;
    private javax.swing.JLabel lblOpciones1;
    private javax.swing.JLabel lblOpciones2;
    private javax.swing.JLabel lblTituloSeccion;
    private javax.swing.JLabel logoRosa1;
    private javax.swing.JLabel logoRosa2;
    private javax.swing.JPanel panelEncabezado;
    private javax.swing.JPanel panelOpciones;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables

}
