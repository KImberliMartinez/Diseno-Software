package org.itson.disenosoftware.presentacion;

import java.util.ArrayList;
import java.util.List;
import org.itson.disenosoftware.navegacion.INavegacion;
import org.itson.disenosoftware.navegacion.Navegacion;
import org.itson.disenosoftware.negocio.avisos.Avisos;
import org.itson.disenosoftware.negocio.dtos.ClienteNuevoDTO;
import org.itson.disenosoftware.negocio.dtos.MarcoNuevoDTO;
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
public class FrmDetallesMarco extends javax.swing.JFrame {

    INavegacion navegacion;
    ClienteNuevoDTO clienteDTO;
    MarcoNuevoDTO marcoDTO;
    boolean isCompleto;

    /**
     * Creates new form FrmOpcionesCliente
     */
    public FrmDetallesMarco(ClienteNuevoDTO clienteDTO, boolean isCompleto) {
        navegacion = new Navegacion();
        this.clienteDTO = clienteDTO;
        this.isCompleto = isCompleto;
        marcoDTO = new MarcoNuevoDTO();
        initComponents();
        llenarComboBox();
    }

    private void llenarComboBox (){
        List<String> listaMarcos = new ArrayList<>();
        
        IFAdminMarcos adminMarcos = new FAdminMarcos();
        listaMarcos = adminMarcos.recuperarCatalogoMarcos();
        
        for (String listaMarco : listaMarcos) {
            cbxTipo.addItem(listaMarco);
        }
    }
    
    private void guardarMarco(){
        String material = cbxTipo.getSelectedItem().toString();
        int largo = Integer.parseInt(txtLargo.getText());
        int ancho = Integer.parseInt(txtAncho.getText());
        String detalles = txaDisenio.getText();
        
        marcoDTO.setTipoDetalle(material);
        marcoDTO.setLargo(largo);
        marcoDTO.setAncho(ancho);
        marcoDTO.setDisenio(detalles);
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
        lblCm = new javax.swing.JLabel();
        lblCm2 = new javax.swing.JLabel();
        lblTituloSeccion = new javax.swing.JLabel();
        lblOpciones1 = new javax.swing.JLabel();
        lblOpciones2 = new javax.swing.JLabel();
        cbxTipo = new javax.swing.JComboBox<>();
        txtAncho = new javax.swing.JTextField();
        txtLargo = new javax.swing.JTextField();
        lblAncho = new javax.swing.JLabel();
        lblLargo = new javax.swing.JLabel();
        lblOpciones = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaDisenio = new javax.swing.JTextArea();
        btnCancelar = new javax.swing.JButton();
        btnContinuar = new javax.swing.JButton();
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

        lblCm.setFont(new java.awt.Font("Amazon Ember", 0, 14)); // NOI18N
        lblCm.setForeground(new java.awt.Color(64, 53, 44));
        lblCm.setText("cm");
        panelOpciones.add(lblCm, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 175, -1, -1));

        lblCm2.setFont(new java.awt.Font("Amazon Ember", 0, 14)); // NOI18N
        lblCm2.setForeground(new java.awt.Color(64, 53, 44));
        lblCm2.setText("cm");
        panelOpciones.add(lblCm2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 175, -1, -1));

        lblTituloSeccion.setFont(new java.awt.Font("Amazon Ember", 1, 48)); // NOI18N
        lblTituloSeccion.setForeground(new java.awt.Color(64, 53, 44));
        lblTituloSeccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloSeccion.setText("Detalles marco");
        panelOpciones.add(lblTituloSeccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 800, -1));

        lblOpciones1.setFont(new java.awt.Font("Amazon Ember", 0, 24)); // NOI18N
        lblOpciones1.setForeground(new java.awt.Color(64, 53, 44));
        lblOpciones1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOpciones1.setText("Tipo de material:");
        panelOpciones.add(lblOpciones1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 105, 240, -1));

        lblOpciones2.setFont(new java.awt.Font("Amazon Ember", 0, 24)); // NOI18N
        lblOpciones2.setForeground(new java.awt.Color(64, 53, 44));
        lblOpciones2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOpciones2.setText("Dimensiones:");
        panelOpciones.add(lblOpciones2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 240, -1));

        cbxTipo.setBackground(new java.awt.Color(242, 224, 201));
        cbxTipo.setFont(new java.awt.Font("Amazon Ember Light", 0, 18)); // NOI18N
        cbxTipo.setForeground(new java.awt.Color(157, 134, 90));
        cbxTipo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cbxTipo.setFocusable(false);
        cbxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTipoActionPerformed(evt);
            }
        });
        panelOpciones.add(cbxTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 230, 40));

        txtAncho.setBackground(new java.awt.Color(242, 224, 201));
        txtAncho.setFont(new java.awt.Font("Amazon Ember Light", 0, 20)); // NOI18N
        txtAncho.setForeground(new java.awt.Color(34, 33, 33));
        txtAncho.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtAncho.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 53, 44), 2));
        panelOpciones.add(txtAncho, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 160, 100, 40));

        txtLargo.setBackground(new java.awt.Color(242, 224, 201));
        txtLargo.setFont(new java.awt.Font("Amazon Ember Light", 0, 20)); // NOI18N
        txtLargo.setForeground(new java.awt.Color(34, 33, 33));
        txtLargo.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtLargo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 53, 44), 2));
        panelOpciones.add(txtLargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, 100, 40));

        lblAncho.setFont(new java.awt.Font("Amazon Ember", 0, 14)); // NOI18N
        lblAncho.setForeground(new java.awt.Color(64, 53, 44));
        lblAncho.setText("Ancho");
        panelOpciones.add(lblAncho, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 200, -1, -1));

        lblLargo.setFont(new java.awt.Font("Amazon Ember", 0, 14)); // NOI18N
        lblLargo.setForeground(new java.awt.Color(64, 53, 44));
        lblLargo.setText("Largo");
        panelOpciones.add(lblLargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 200, -1, -1));

        lblOpciones.setFont(new java.awt.Font("Amazon Ember", 0, 24)); // NOI18N
        lblOpciones.setForeground(new java.awt.Color(64, 53, 44));
        lblOpciones.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOpciones.setText("Diseño:");
        panelOpciones.add(lblOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 140, -1));

        txaDisenio.setBackground(new java.awt.Color(242, 224, 201));
        txaDisenio.setColumns(20);
        txaDisenio.setRows(5);
        txaDisenio.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 53, 44), 2, true));
        jScrollPane1.setViewportView(txaDisenio);

        panelOpciones.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 250, 430, 130));

        btnCancelar.setBackground(new java.awt.Color(64, 53, 44));
        btnCancelar.setFont(new java.awt.Font("Amazon Ember", 0, 24)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(242, 224, 201));
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorderPainted(false);
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.setFocusable(false);
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

        jPanel1.setBackground(new java.awt.Color(242, 224, 201));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(64, 53, 44), 2, true));
        panelOpciones.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 210, 280));

        getContentPane().add(panelOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1000, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTipoActionPerformed

    }//GEN-LAST:event_cbxTipoActionPerformed

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        if (txtAncho.getText().isEmpty() || txtLargo.getText().isEmpty() || cbxTipo.getSelectedIndex() == -1 || txaDisenio.getText().isEmpty()) {
            new Avisos().mostrarAviso(this, "complete toda la informacion");
        } else {
            if (isCompleto) {
                navegacion.cambiarFrmDetallesFoto(this, clienteDTO, marcoDTO);
            } else {
                guardarMarco();
                navegacion.cambiarFrmPedidoInfo(this, clienteDTO, null, marcoDTO);
            }
        }
    }//GEN-LAST:event_btnContinuarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAncho;
    private javax.swing.JLabel lblCm;
    private javax.swing.JLabel lblCm2;
    private javax.swing.JLabel lblEncabezado;
    private javax.swing.JLabel lblLargo;
    private javax.swing.JLabel lblOpciones;
    private javax.swing.JLabel lblOpciones1;
    private javax.swing.JLabel lblOpciones2;
    private javax.swing.JLabel lblTituloSeccion;
    private javax.swing.JLabel logoRosa1;
    private javax.swing.JLabel logoRosa2;
    private javax.swing.JPanel panelEncabezado;
    private javax.swing.JPanel panelOpciones;
    private javax.swing.JTextArea txaDisenio;
    private javax.swing.JTextField txtAncho;
    private javax.swing.JTextField txtLargo;
    // End of variables declaration//GEN-END:variables

}
