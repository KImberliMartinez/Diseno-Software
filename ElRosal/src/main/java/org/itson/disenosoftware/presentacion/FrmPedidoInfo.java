package org.itson.disenosoftware.presentacion;

import org.itson.disenosoftware.navegacion.INavegacion;
import org.itson.disenosoftware.navegacion.Navegacion;
import org.itson.disenosoftware.negocio.avisos.Avisos;
import org.itson.disenosoftware.negocio.dtos.ClienteNuevoDTO;
import org.itson.disenosoftware.negocio.dtos.FotoNuevaDTO;
import org.itson.disenosoftware.negocio.dtos.MarcoNuevoDTO;
import org.itson.disenosoftware.negocio.dtos.OrdenNuevaDTO;
import org.itson.disenosoftware.negocio.subsistemas.marco.FAdminMarcos;
import org.itson.disenosoftware.negocio.subsistemas.marco.IFAdminMarcos;


/**
 *
 * @author José Karim Franco Valencia - 245138
 * @author Kimberli Joana Martinez Sandoval - 244802
 * @author Víctor Humberto Encinas Guzmán - 244821
 * @author José Ángel Huerta Amparán - 245345
 * @author Alexa Maria Picos Valenzuela - 244893
 */
public class FrmPedidoInfo extends javax.swing.JFrame {

    INavegacion navegacion;
    ClienteNuevoDTO clienteDTO;
    MarcoNuevoDTO marcoDTO;
    FotoNuevaDTO fotoDTO;
    OrdenNuevaDTO ordenDTO;
    
    /** Creates new form FrmOpcionesCliente */
    public FrmPedidoInfo(ClienteNuevoDTO clienteDTO, FotoNuevaDTO fotoDTO, MarcoNuevoDTO marcoDTO) {
        navegacion = new Navegacion();
        this.clienteDTO = clienteDTO;
        this.marcoDTO = marcoDTO;
        this.fotoDTO = fotoDTO;
        initComponents();
    }

    private void confirmarPedidos(){
        IFAdminMarcos adminMarcos = new FAdminMarcos();
        adminMarcos.registrarMarco(marcoDTO);
    
    }
    
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblOpciones = new javax.swing.JLabel();
        panelEncabezado = new javax.swing.JPanel();
        lblEncabezado = new javax.swing.JLabel();
        logoRosa1 = new javax.swing.JLabel();
        logoRosa2 = new javax.swing.JLabel();
        panelOpciones = new javax.swing.JPanel();
        lblTituloSeccion1 = new javax.swing.JLabel();
        lblFechaRealizacion = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        lblTotalInfo = new javax.swing.JLabel();
        lblTotalPagar = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtInfo = new javax.swing.JTextArea();
        lblOpciones1 = new javax.swing.JLabel();
        lblNombreCliente1 = new javax.swing.JLabel();
        lblTituloSeccion = new javax.swing.JLabel();

        lblOpciones.setFont(new java.awt.Font("Amazon Ember", 0, 24)); // NOI18N
        lblOpciones.setForeground(new java.awt.Color(64, 53, 44));
        lblOpciones.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOpciones.setText("Diseño:");

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

        lblTituloSeccion1.setFont(new java.awt.Font("Amazon Ember", 1, 48)); // NOI18N
        lblTituloSeccion1.setForeground(new java.awt.Color(64, 53, 44));
        lblTituloSeccion1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloSeccion1.setText("Detalles del pedido");
        panelOpciones.add(lblTituloSeccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 800, -1));

        lblFechaRealizacion.setFont(new java.awt.Font("Amazon Ember", 1, 18)); // NOI18N
        lblFechaRealizacion.setForeground(new java.awt.Color(64, 53, 44));
        lblFechaRealizacion.setText("Fecha realización pedido");
        panelOpciones.add(lblFechaRealizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 280, 130));

        lblTelefono.setFont(new java.awt.Font("Amazon Ember Light", 0, 18)); // NOI18N
        lblTelefono.setForeground(new java.awt.Color(64, 53, 44));
        lblTelefono.setText("6447778889");
        panelOpciones.add(lblTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, -1, -1));

        lblCorreo.setFont(new java.awt.Font("Amazon Ember Light", 0, 18)); // NOI18N
        lblCorreo.setForeground(new java.awt.Color(64, 53, 44));
        lblCorreo.setText("luismiguel@elmejorartistadelmundo.com");
        panelOpciones.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, -1, -1));

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

        btnRegistrar.setBackground(new java.awt.Color(64, 53, 44));
        btnRegistrar.setFont(new java.awt.Font("Amazon Ember", 0, 24)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(242, 224, 201));
        btnRegistrar.setText("Registrar");
        btnRegistrar.setBorderPainted(false);
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrar.setFocusable(false);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        panelOpciones.add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 400, 160, 50));

        lblTotalInfo.setFont(new java.awt.Font("Amazon Ember", 1, 18)); // NOI18N
        lblTotalInfo.setForeground(new java.awt.Color(64, 53, 44));
        lblTotalInfo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTotalInfo.setText("Total a pagar:");
        panelOpciones.add(lblTotalInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 210, -1));

        lblTotalPagar.setFont(new java.awt.Font("Amazon Ember", 0, 18)); // NOI18N
        lblTotalPagar.setForeground(new java.awt.Color(64, 53, 44));
        lblTotalPagar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTotalPagar.setText("$777.00 MXN");
        panelOpciones.add(lblTotalPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 110, 210, -1));

<<<<<<< HEAD
        lblSubtotal.setFont(new java.awt.Font("Amazon Ember", 0, 18)); // NOI18N
        lblSubtotal.setForeground(new java.awt.Color(64, 53, 44));
        lblSubtotal.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSubtotal.setText("$77.00 MXN");
        panelOpciones.add(lblSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 140, 210, -1));

        jTextArea1.setBackground(new java.awt.Color(242, 224, 201));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Amazon Ember Light", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Yo que ni un momento puedo estar lejos de ti\nCómo soportar la vida entera ya sin ti\nTe quiero, te quiero, te juro que yo\nNo puedo vivir sin tu amor");
        jTextArea1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 53, 44), 2, true));
        jTextArea1.setEnabled(false);
        jScrollPane1.setViewportView(jTextArea1);
=======
        txtInfo.setBackground(new java.awt.Color(242, 224, 201));
        txtInfo.setColumns(20);
        txtInfo.setFont(new java.awt.Font("Amazon Ember Light", 0, 18)); // NOI18N
        txtInfo.setRows(5);
        txtInfo.setText("Yo que ni un momento puedo estar lejos de ti\nCómo soportar la vida entera ya sin ti\nTe quiero, te quiero, te juro que yo\nNo puedo vivir sin tu amor");
        txtInfo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 53, 44), 2, true));
        jScrollPane1.setViewportView(txtInfo);
>>>>>>> main

        panelOpciones.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 430, 130));

        lblOpciones1.setFont(new java.awt.Font("Amazon Ember", 0, 18)); // NOI18N
        lblOpciones1.setForeground(new java.awt.Color(64, 53, 44));
        lblOpciones1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblOpciones1.setText("Información:");
        panelOpciones.add(lblOpciones1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 140, -1));

        lblNombreCliente1.setFont(new java.awt.Font("Amazon Ember", 1, 18)); // NOI18N
        lblNombreCliente1.setForeground(new java.awt.Color(64, 53, 44));
        lblNombreCliente1.setText("José Wacho Amparan Marquez");
        panelOpciones.add(lblNombreCliente1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, -1));

        getContentPane().add(panelOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1000, 480));

        lblTituloSeccion.setFont(new java.awt.Font("Amazon Ember", 1, 48)); // NOI18N
        lblTituloSeccion.setForeground(new java.awt.Color(64, 53, 44));
        lblTituloSeccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloSeccion.setText("Detalles marco");
        getContentPane().add(lblTituloSeccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 800, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
        if(lblCorreo.getText().isEmpty()||lblCorreo.getText().isEmpty()||lblNombreCliente1.getText().isEmpty()||txtInfo.getText().isEmpty()){
              new Avisos().mostrarAviso(this, "complete todos los espacios");
        }else{
          
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        if(new Avisos().mostrarConfirmacion(this, "¿Seguro quiere cancelar el pedido?", "Cancelar pedido")){
            navegacion.cambiarFrmOpcionesCliente(this);
        }
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblEncabezado;
    private javax.swing.JLabel lblFechaRealizacion;
    private javax.swing.JLabel lblNombreCliente1;
    private javax.swing.JLabel lblOpciones;
    private javax.swing.JLabel lblOpciones1;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblTituloSeccion;
    private javax.swing.JLabel lblTituloSeccion1;
    private javax.swing.JLabel lblTotalInfo;
    private javax.swing.JLabel lblTotalPagar;
    private javax.swing.JLabel logoRosa1;
    private javax.swing.JLabel logoRosa2;
    private javax.swing.JPanel panelEncabezado;
    private javax.swing.JPanel panelOpciones;
    private javax.swing.JTextArea txtInfo;
    // End of variables declaration//GEN-END:variables

}
