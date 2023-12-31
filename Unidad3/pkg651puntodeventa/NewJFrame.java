package pkg651puntodeventa;

import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;


public class NewJFrame extends javax.swing.JFrame {
String productos []={"Maruchan","cigarros","Café","Galletas"};
double precios []={17.50,75.00,20.00,17.00};

double precio=0;
int cantidad=0;

//modelo del combobox
DefaultComboBoxModel comboModel=new DefaultComboBoxModel(productos);
DefaultTableModel tableModel = new DefaultTableModel();

ArrayList<Ventas>  listaVentas = new ArrayList<Ventas>();
    
    public NewJFrame() {
        initComponents();
        
        this.setTitle("Punto de venta Doña Pelos");
        this.setLocationRelativeTo(null);
        
        //inyectar modelo de datos al combo box
        cboProductos.setModel(comboModel);
        
        tableModel.addColumn("Descripcion");
        tableModel.addColumn("Precio Unitario");
        tableModel.addColumn("Cantidad");
        tableModel.addColumn("Importe");
        
                
        actualizar();
        calcularPrecio();
    }
    public void actualizar(){
    tblProductos.setModel(tableModel);
    
    
        while (tableModel.getRowCount()>0) {
         tableModel.removeRow(0);
            
        }
        double subtotal = 0;
        for (Ventas v:listaVentas) {
            Object x[]=new Object[4];
            x[0]=v.getDescripcion();
            x[1]=v.getPrecio();
            x[2]=v.getCantidad();
            x[3]=v.getImporte();
            
            tableModel.addRow(x);
            subtotal += v.getImporte();
            
        }
        // Calcula el IVA (por ejemplo, 16% del subtotal)
    double iva = subtotal * 0.16;

    // Calcula el total sumando el subtotal y el IVA
    double total = subtotal + iva;

    // Actualiza las etiquetas en la interfaz gráfica
    lblSubtotal.setText(String.format("%.2fMX", subtotal));
    lblIva.setText(String.format("%.2fMX", iva));
    lblTotal.setText(String.format("%.2fMX", total));
    
    }
    public void calcularPrecio(){
    precio=precios[cboProductos.getSelectedIndex()];
    cantidad=Integer.parseInt(spnCantidad.getValue().toString());
    lblPrecio.setText(String.valueOf(precio));
    lblImporte.setText(String.valueOf(precio*cantidad));
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        lblProducto = new javax.swing.JLabel();
        lblCantidad = new javax.swing.JLabel();
        cboProductos = new javax.swing.JComboBox<>();
        spnCantidad = new javax.swing.JSpinner();
        lblnp = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        lblImporte = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lblSubtotal = new javax.swing.JLabel();
        lblIva = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblProducto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblProducto.setText("Producto:");

        lblCantidad.setText("Cantidad");

        cboProductos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboProductosActionPerformed(evt);
            }
        });

        spnCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        spnCantidad.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                spnCantidadComponentHidden(evt);
            }
        });

        lblnp.setText("Precio:");

        jLabel4.setText("Importe:");

        lblPrecio.setText("0.0MX");

        lblImporte.setText("0.0MX");

        btnAgregar.setText("+");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblProductos);

        jLabel7.setText("Subtotal:");

        jLabel8.setText("Iva:");

        jLabel9.setText("Total:");

        lblSubtotal.setText("0.0MX");

        lblIva.setText("0.0MX");

        lblTotal.setText("0.0MX");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblProducto)
                            .addComponent(lblCantidad))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(spnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(cboProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addComponent(lblnp)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblImporte)
                                    .addComponent(lblPrecio)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAgregar)))))
                .addContainerGap(107, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTotal)
                    .addComponent(lblIva)
                    .addComponent(lblSubtotal))
                .addGap(165, 165, 165))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblProducto)
                    .addComponent(cboProductos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblnp)
                    .addComponent(lblPrecio))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCantidad)
                            .addComponent(spnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(lblImporte)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(btnAgregar)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(lblSubtotal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblIva))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(lblTotal))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboProductosActionPerformed
        // TODO add your handling code here:
         calcularPrecio();
    }//GEN-LAST:event_cboProductosActionPerformed
    
    private void spnCantidadComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_spnCantidadComponentHidden
        // TODO add your handling code here:
         calcularPrecio();
    }//GEN-LAST:event_spnCantidadComponentHidden

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
//        calcularPrecio();
//        Ventas ventas =new Ventas();
//        
//      ventas.setId(cboProductos.getSelectedIndex()); 
//      ventas.setDescripcion(cboProductos.getSelectedItem().toString());
//      ventas.setPrecio(precio);
//      ventas.setCantidad(cantidad);
//      ventas.setImporte(precio*cantidad);
//      
//      listaVentas.add(ventas);
//      actualizar();
// Calcula el precio e importe
    calcularPrecio();

    // Busca si ya existe una venta para el producto seleccionado
    boolean productoExistente = false;
    for (Ventas v : listaVentas) {
        if (v.getId() == cboProductos.getSelectedIndex()) {
          
            v.setCantidad(v.getCantidad() + cantidad);
            v.setImporte(v.getPrecio() * v.getCantidad());
            productoExistente = true;
            break;
        }
    }

    
    if (!productoExistente) {
        Ventas ventas = new Ventas();
        ventas.setId(cboProductos.getSelectedIndex());
        ventas.setDescripcion(cboProductos.getSelectedItem().toString());
        ventas.setPrecio(precio);
        ventas.setCantidad(cantidad);
        ventas.setImporte(precio * cantidad);

        listaVentas.add(ventas);
    }

    // Actualiza la interfaz gráfica
    actualizar();
    }//GEN-LAST:event_btnAgregarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JComboBox<String> cboProductos;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCantidad;
    private javax.swing.JLabel lblImporte;
    private javax.swing.JLabel lblIva;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblProducto;
    private javax.swing.JLabel lblSubtotal;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lblnp;
    private javax.swing.JSpinner spnCantidad;
    private javax.swing.JTable tblProductos;
    // End of variables declaration//GEN-END:variables
}
