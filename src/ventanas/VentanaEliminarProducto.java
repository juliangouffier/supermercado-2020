/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import clases.ProductoCongelado;
import clases.ProductoFresco;
import clases.ProductoRefrigerado;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import rojerusan.RSAnimation;

/**
 *
 * @author Guffy
 */
public class VentanaEliminarProducto extends javax.swing.JFrame {

    /**
     * Creates new form VentanaEliminarProducto
     */
    int xMouse;
    int yMouse;
    DefaultTableModel modelo=new DefaultTableModel();
    private final char constante = 'ð';
    List<ProductoCongelado> Pc =new ArrayList<ProductoCongelado>();
    List<ProductoRefrigerado> Pr = new ArrayList<ProductoRefrigerado>();
    List<ProductoFresco> Pf = new ArrayList<ProductoFresco>();
    
    public VentanaEliminarProducto() {
        initComponents();
        this.setLocationRelativeTo(null);
        RSAnimation.setBajar(-50, 200, 2, 2, this);
        char g ='-';
        modelo.setColumnIdentifiers(new Object[]{"Codigo","Nombre","Precio","Descripcion","Fecha De Caducidad","Numero de Lote","Tipo de Producto","Codigo de Organismo","Temperatura recomendada","Fecha de Envasado","Pais de Origen"});
        Tabla.setModel(modelo);
        modelo.setRowCount(0);
        Tabla.setOpaque(false); 
        
        try{
            
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            
        }
        catch (Exception e){
            
        }
        try{
            
            File archivo1 = new File("D:/Escritorio/Proyecto-Final/src/archivos/productosCongelados.txt");
            FileReader reader = new FileReader(archivo1);
            BufferedReader breader = new BufferedReader(reader);
            if(archivo1.exists()){
                
                String linea;
               
                    
                    
                while((linea = breader.readLine()) !=null){
                    Pc.add(new ProductoCongelado(linea.split("ð")));
                    System.out.println("entro");
                   // System.out.println(PCongelados.toString());
                }
                
                breader.close();
                reader.close();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
                try{
            
            File archivo2 = new File("D:/Escritorio/Proyecto-Final/src/archivos/productosFrescos.txt");
            FileReader reader = new FileReader(archivo2);
            BufferedReader breader = new BufferedReader(reader);
            if(archivo2.exists()){
                
                String linea;
               
                    
                    
                while((linea = breader.readLine()) !=null){
                    Pf.add(new ProductoFresco(linea.split("ð")));
                    System.out.println("entro");
                   // System.out.println(PCongelados.toString());
                }
                
                breader.close();
                reader.close();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        try{
            
            File archivo3 = new File("D:/Escritorio/Proyecto-Final/src/archivos/productosRefrigerados.txt");
            FileReader reader = new FileReader(archivo3);
            BufferedReader breader = new BufferedReader(reader);
            if(archivo3.exists()){
                
                String linea;
               
                    
                    
                while((linea = breader.readLine()) !=null){
                    Pr.add(new ProductoRefrigerado(linea.split("ð")));
                    System.out.println("entro");
                   // System.out.println(PCongelados.toString());
                }
                
                breader.close();
                reader.close();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        
        
            for(ProductoRefrigerado r : Pr ){
            modelo.addRow(new Object[]{
                r.getCodigoDeProducto(),
                r.getNombre(),
                r.getPrecio(),
                r.getDescripcion(),
                r.getFechaCaducidad(),
                r.getNumLote(),
                r.getTipoDeProducto(),
                r.getCodigoDeOrganismo(),
                g,
                g,
                g,
                });
        }
            for(ProductoCongelado c : Pc ){
            modelo.addRow(new Object[]{
                c.getCodigoDeProducto(),
                c.getNombre(),
                c.getPrecio(),
                c.getDescripcion(),
                c.getFechaCaducidad(),
                c.getNumLote(),
                c.getTipoDeProducto(),
                g,
                c.getTempRecomendada(),
                g,
                g,
                });
        }
            for(ProductoFresco f : Pf ){
            modelo.addRow(new Object[]{
                f.getCodigoDeProducto(),
                f.getNombre(),
                f.getPrecio(),
                f.getDescripcion(),
                f.getFechaCaducidad(),
                f.getNumLote(),
                f.getTipoDeProducto(),
                g,
                g,
                f.getFechaEnvasado(),
                f.getPaisOrigen(),
                });
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedor = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla = new rojerusan.RSTableMetro1();
        btnEliminarProducto = new javax.swing.JButton();
        jPanelRound1 = new LIB.JPanelRound();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        LabelAñadirNuevoProducto = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        contenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tabla=new rojerusan.RSTableMetro1(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7", "Title 8"
            }
        ));
        Tabla.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        Tabla.setBackgoundHead(new java.awt.Color(204, 0, 0));
        Tabla.setBackgoundHover(new java.awt.Color(204, 222, 236));
        Tabla.setColorPrimaryText(new java.awt.Color(136, 69, 121));
        Tabla.setColorSecondary(new java.awt.Color(240, 248, 255));
        Tabla.setColorSecundaryText(new java.awt.Color(204, 51, 0));
        Tabla.setShowVerticalLines(true);
        Tabla.setSurrendersFocusOnKeystroke(true);
        Tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla);

        contenedor.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1300, 400));

        btnEliminarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/EliminarProducto.png"))); // NOI18N
        btnEliminarProducto.setBorderPainted(false);
        btnEliminarProducto.setContentAreaFilled(false);
        btnEliminarProducto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/EliminarProductoOVER.png"))); // NOI18N
        btnEliminarProducto.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnEliminarProductoMouseMoved(evt);
            }
        });
        btnEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProductoActionPerformed(evt);
            }
        });
        contenedor.add(btnEliminarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 540, 200, 50));

        jPanelRound1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanelRound1MouseDragged(evt);
            }
        });
        jPanelRound1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelRound1MousePressed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/back_arrow_35px.png"))); // NOI18N
        jButton6.setBorder(null);
        jButton6.setBorderPainted(false);
        jButton6.setContentAreaFilled(false);
        jButton6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton6.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/shutdown35px.png"))); // NOI18N
        jButton7.setBorder(null);
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.setFocusPainted(false);
        jButton7.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        LabelAñadirNuevoProducto.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        LabelAñadirNuevoProducto.setForeground(new java.awt.Color(255, 255, 255));
        LabelAñadirNuevoProducto.setText("Eliminar Productos");

        javax.swing.GroupLayout jPanelRound1Layout = new javax.swing.GroupLayout(jPanelRound1);
        jPanelRound1.setLayout(jPanelRound1Layout);
        jPanelRound1Layout.setHorizontalGroup(
            jPanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRound1Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 526, Short.MAX_VALUE)
                .addComponent(LabelAñadirNuevoProducto)
                .addGap(513, 513, 513)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110))
        );
        jPanelRound1Layout.setVerticalGroup(
            jPanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelAñadirNuevoProducto)
                    .addComponent(jButton7)
                    .addComponent(jButton6))
                .addContainerGap())
        );

        contenedor.add(jPanelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 0, 1450, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/carrito1300x731.png"))); // NOI18N
        contenedor.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -50, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 1300, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        VentanaGestionarProductos nuevo = new VentanaGestionarProductos();
        nuevo.setVisible(true);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jPanelRound1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelRound1MouseDragged
        // TODO add your handling code here:
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_jPanelRound1MouseDragged

    private void jPanelRound1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelRound1MousePressed
        // TODO add your handling code here:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanelRound1MousePressed

    private void btnEliminarProductoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarProductoMouseMoved
        // TODO add your handling code here:
        RSAnimation.setMoverDerecha(550, 551, 1, 1, btnEliminarProducto);
    }//GEN-LAST:event_btnEliminarProductoMouseMoved

    private void btnEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductoActionPerformed
        // TODO add your handling code here:
        int fsel =Tabla.getSelectedRow();
        String congelado= "congelado";
        String fresco ="fresco";
        String refrigerado= "refrigerado";
            String Tipo;
            if(modelo.getRowCount()==0){
                // poner que no hay nada en la tabla
                JOptionPane.showMessageDialog(null, "No hay ningun producto en el catalogo","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            else if(fsel==-1){
                    JOptionPane.showMessageDialog(null, "Debe de seleccionar un producto","Advertencia",JOptionPane.WARNING_MESSAGE);
                }else{
         int n = JOptionPane.showConfirmDialog(contenedor,"Esta seguro que desea eliminar el producto?","Confirmacion",JOptionPane.YES_NO_OPTION);
                    if(n != 0){
                        System.out.println("se cancelo");
                    }else{
                        modelo=(DefaultTableModel)Tabla.getModel();
              Tipo=Tabla.getValueAt(fsel,6).toString();
              if(Tipo.equals(congelado)){
                        for(int i = 0; i< Pc.size();i++){
                            ProductoCongelado conge = Pc.get(i);
                            if(conge.getCodigoDeProducto() == (Tabla.getValueAt(fsel, 0).toString())){
                                Pc.remove(i);
                                modelo.removeRow(fsel);
                                File archivo1 = new File("D:/Escritorio/Proyecto-Final/src/archivos/productosCongelados.txt");
                                File outputFile = new File("D:/Escritorio/Proyecto-Final/src/archivos/productosCongelados.txt");
                                archivo1.delete();
                                
                                    ProductoCongelado p1;
                                    try{
                                    BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
                                    for(int j=0;j<Pc.size();j++){
                                        p1=Pc.get(j);
                                    writer.append(p1.getNombre()+constante+p1.getDescripcion()+constante+p1.getCodigoDeProducto()+constante+p1.getFechaCaducidad()+constante+p1.getNumLote()+constante+p1.getPrecio()+constante+p1.getTempRecomendada()+constante+p1.getTipoDeProducto());
                                    writer.newLine();
                                    }
                                    writer.close();
                                    writer.close();
                                
                                    }catch (Exception e){
                            e.printStackTrace();
                   }

                                
                            }
                        }
                    }else {
                  if(Tipo.equals(fresco)){
                      
                      File archivo1 = new File("D:/Escritorio/Proyecto-Final/src/archivos/productosFrescos.txt");
                      File outputFile = new File("D:/Escritorio/Proyecto-Final/src/archivos/productosFrescos.txt");
                      
                      for(int i = 0; i< Pf.size();i++){
                            ProductoFresco Fres = Pf.get(i);
                            if(Fres.getCodigoDeProducto() == (Tabla.getValueAt(fsel, 0).toString())){
                                Pf.remove(i);
                                modelo.removeRow(fsel);
                                
                                archivo1.delete();
                                
                                    ProductoFresco p2;
                                    try{
                                        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
                                    for(int j=0;j<Pf.size();j++){
                                    
                                    p2=Pf.get(j);
                                    writer.append(p2.getNombre()+constante+p2.getDescripcion()+constante+p2.getCodigoDeProducto()+constante+p2.getFechaCaducidad()+constante+p2.getNumLote()+constante+p2.getPrecio()+constante+p2.getFechaEnvasado()+constante+p2.getPaisOrigen()+constante+p2.getTipoDeProducto());
                                    writer.newLine();
                                    }
                                    writer.close();
                                    writer.close();
                                
                                    }catch (Exception e){
                            e.printStackTrace();
                   }

                                
                            }
                        }
                  }else{
                      if(Tipo.equals(refrigerado)){
                      File archivo1 = new File("C:\\Users\\Luca Andrada\\Documents\\NetBeansProjects\\Proyecto\\src\\archivos\\productosRefrigerados.txt");
                      File outputFile = new File("C:\\Users\\Luca Andrada\\Documents\\NetBeansProjects\\Proyecto\\src\\archivos\\productosRefrigerados.txt");
                      
                      for(int i = 0; i< Pr.size();i++){
                            ProductoRefrigerado Refri = Pr.get(i);
                            if(Refri.getCodigoDeProducto() == (Tabla.getValueAt(fsel, 0).toString())){
                                Pr.remove(i);
                                modelo.removeRow(fsel);
                                
                                archivo1.delete();
                                
                                    ProductoRefrigerado p3;
                                    try{
                                        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
                                    for(int j=0;j<Pr.size();j++){
                                    
                                    p3=Pr.get(j);
                                    writer.append(p3.getNombre()+constante+p3.getDescripcion()+constante+p3.getCodigoDeProducto()+constante+p3.getFechaCaducidad()+constante+p3.getNumLote()+constante+p3.getPrecio()+constante+p3.getCodigoDeOrganismo()+constante+p3.getTipoDeProducto());
                                    writer.newLine();
                                    }
                                    writer.close();
                                    writer.close();
                                
                                    }catch (Exception e){
                            e.printStackTrace();
                   }

                                
                            }
                        }
                      }
                  }
              }
        }                                             
            }
            Tabla.clearSelection();

    }//GEN-LAST:event_btnEliminarProductoActionPerformed

    private void TablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_TablaMouseClicked

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        Tabla.clearSelection();
    }//GEN-LAST:event_formMouseClicked

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
            java.util.logging.Logger.getLogger(VentanaEliminarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaEliminarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaEliminarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaEliminarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaEliminarProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelAñadirNuevoProducto;
    private rojerusan.RSTableMetro1 Tabla;
    private javax.swing.JButton btnEliminarProducto;
    private javax.swing.JPanel contenedor;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel2;
    private LIB.JPanelRound jPanelRound1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
