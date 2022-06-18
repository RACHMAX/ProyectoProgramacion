
package SupermercadoJava;


import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;



public class Principal_supermercadojava extends javax.swing.JFrame {

    String productos [] = { "Arroz", "Frijoles","Lentejas", "Atun", "Coca Cola", "Cafe", "Te Frio", "Pasta Dental", "Hilo dental", "Enjuague bucal"};
    double precios []= {2.000, 1.500, 1.900, 2.500, 800, 1.000, 2.300, 700, 2.700, 1.000, 3.000};
    double precio=0;
    int cantidad=0;
    DefaultTableModel modelo = new DefaultTableModel();
    ArrayList<Venta> listaVentas = new ArrayList<Venta> ();
    
    
    
    
    
    
    public Principal_supermercadojava() {
        initComponents ();
        this.setTitle("SUPERMERCADO JAVA");
        this.setLocationRelativeTo(null); 
        this.setSize(580, 650);
        
    
        DefaultComboBoxModel comboModel= new DefaultComboBoxModel(productos);
        cboProducto.setModel(comboModel);
        modelo.addColumn("DESCRIPCIÓN");
        modelo.addColumn("PRECIO UNITARIO");
        modelo.addColumn("CANTIDAD");
        modelo.addColumn("IMPORTE");
        actualizarTabla();
        CalcularPrecio();
        
        
        
      
        
        
        
                
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cboProducto = new javax.swing.JComboBox<>();
        spnCantidad = new javax.swing.JSpinner();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblSubtotal = new javax.swing.JLabel();
        lblIva = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        lblImporte = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("PRODUCTO");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("CANTIDAD");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("PRECIO");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("IMPORTE");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 120, -1, -1));

        cboProducto.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cboProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cboProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboProductoActionPerformed(evt);
            }
        });
        getContentPane().add(cboProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 120, 20));

        spnCantidad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        spnCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        spnCantidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnCantidadStateChanged(evt);
            }
        });
        getContentPane().add(spnCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 100, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("SUBTOTAL");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, -1, -1));

        tblProductos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 460, 170));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("IVA");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 380, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setText("TOTAL");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 400, -1, -1));

        lblSubtotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblSubtotal.setText("0.00 COLONES");
        getContentPane().add(lblSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, -1, -1));

        lblIva.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblIva.setText("0.00 COLONES");
        getContentPane().add(lblIva, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 380, -1, -1));

        lblTotal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblTotal.setText("0.00 COLONES");
        getContentPane().add(lblTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 400, -1, -1));

        lblImporte.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblImporte.setText("0.00 COLONES");
        getContentPane().add(lblImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, -1, -1));

        lblPrecio.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblPrecio.setText("0.00 COLONES");
        getContentPane().add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, -1, -1));

        jLabel13.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel13.setText("SUPERMERCADO JAVA");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon("C:\\Users\\fab22\\Desktop\\carrito.jpg")); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 60, 60));

        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\fab22\\Desktop\\agregar2.jpg")); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(473, 83, 90, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboProductoActionPerformed
        CalcularPrecio();
        
    }//GEN-LAST:event_cboProductoActionPerformed

    private void spnCantidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnCantidadStateChanged
         CalcularPrecio();     
    }//GEN-LAST:event_spnCantidadStateChanged

    
    public void  CalcularPrecio(){
        precio=precios[cboProducto.getSelectedIndex()];
        cantidad=Integer.parseInt(spnCantidad.getValue().toString());
        lblPrecio.setText(aMoneda(precio));
        lblImporte.setText(aMoneda(precio*cantidad));
        
               
    }
    
    public String aMoneda (double precio){
        return "₡  " + Math.round(precio*100.0)/100.0 + "  colones";
     }
    
 
            
           
            
            
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       Venta venta = new Venta();
       venta.setId(cboProducto.getSelectedIndex());
       venta.setDescripcion(cboProducto.getSelectedItem().toString());
       venta.setPrecio(precio);
       venta.setCantidad(cantidad);
       venta.setImporte(precio*cantidad);
       if(!buscarVenta(venta)){
           listaVentas.add(venta);
           
       }
      
       actualizarTabla();
       Borrar_Venta();
    }//GEN-LAST:event_jButton2ActionPerformed

    public boolean buscarVenta(Venta nueva){
        for (Venta v: listaVentas){
            if (v.getId()==nueva.getId()){
                int nuevaCantidad=v.getCantidad()+nueva.getCantidad();
                v.setCantidad(nuevaCantidad);
                v.setImporte(v.getPrecio()*nuevaCantidad);
                return true;
                
            }
        }
        return false;
    }
    
    public void Borrar_Venta(){
        precio = 0;
        cantidad =1;
        cboProducto.setSelectedIndex(0);
        spnCantidad.setValue(1);
        CalcularPrecio();
        
    
    
    }
    
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
            java.util.logging.Logger.getLogger(Principal_supermercadojava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal_supermercadojava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal_supermercadojava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal_supermercadojava.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal_supermercadojava().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cboProducto;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImporte;
    private javax.swing.JLabel lblIva;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblSubtotal;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JSpinner spnCantidad;
    private javax.swing.JTable tblProductos;
    // End of variables declaration//GEN-END:variables

    private void actualizarTabla() {
        while(modelo.getRowCount()>0){
            modelo.removeRow(0);
            
        }
        double Subtotal=0;
        
        for (Venta v : listaVentas){
            Object x[]= new Object [4];
            x[0]=v.getDescripcion();
            x[1]=aMoneda(v.getPrecio());
            x[2]=v.getCantidad();
            x[3]=aMoneda(v.getImporte());
            Subtotal+=v.getImporte();
            modelo.addRow(x);
        
        }
        double iva= Subtotal*0.13;
        double total= Subtotal+iva;
        lblSubtotal.setText(aMoneda(Subtotal));
        lblIva.setText(aMoneda(iva));
        lblTotal.setText(aMoneda(total));
        tblProductos.setModel(modelo);
}
}