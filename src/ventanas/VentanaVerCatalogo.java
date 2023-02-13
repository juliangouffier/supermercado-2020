/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import clases.ProductoCongelado;
import clases.ProductoFresco;
import clases.ProductoRefrigerado;
import java.awt.Font;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import rojerusan.RSAnimation;

/**
 *
 * @author Guffy
 */
public class VentanaVerCatalogo extends javax.swing.JFrame {

    /**
     * Creates new form VentanaVerCatalogo
     */
    int xMouse;
    int yMouse;
    DecimalFormat df = new DecimalFormat("#.00");
    DefaultTableModel modelo=new DefaultTableModel();
    DefaultTableModel modelo1=new DefaultTableModel();
    static double total;
    public VentanaVerCatalogo() {
        initComponents();
        RSAnimation.setBajar(-50, 200, 2, 2, this);
        this.setLocationRelativeTo(null);
        int verificar;
        
        
        modelo.setColumnIdentifiers(new Object[]{"Nombre","Precio"});
        TablaCatalogo.setModel(modelo);
        modelo.setRowCount(0);
        modelo1.setColumnIdentifiers(new Object[]{"Nombre","Precio","Cantidad","Importe"});
        tablaCarrito.setModel(modelo1);
        modelo1.setRowCount(0);
        //TablaCatalogo.getTableHeader().setBackground(new Color(155,205,155));
        //TablaCatalogo.setOpaque(false);
        TablaCatalogo.getTableHeader().setFont(new Font("Segoe UI",Font.PLAIN,14));
        tablaCarrito.getTableHeader().setFont(new Font("Segoe UI",Font.PLAIN,14));
        List<ProductoCongelado> Pc =new ArrayList<ProductoCongelado>();
        try{
            
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            
        }
        catch (Exception e){
            
        }
        try{
            
            File archivo = new File("C:/Users/Guffy/Documents/NetBeansProjects/ProyectodePrueba/src/archivos/productosCongelados.txt");
            
            if(archivo.exists()){
            FileReader reader = new FileReader(archivo);
            BufferedReader breader = new BufferedReader(reader);
                String linea;
               
                    
                    
                while((linea = breader.readLine()) !=null){
                    Pc.add(new ProductoCongelado(linea.split("ð")));
                    System.out.println("entro");
                   // System.out.println(PCongelados.toString());
                }
                
                breader.close();
                reader.close();
            }
            else{
                
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        for(ProductoCongelado p : Pc ){
            modelo.addRow(new Object[]{
                p.getNombre(),
                p.getPrecio(),
            });
        }
        List<ProductoFresco> Pf = new ArrayList<ProductoFresco>();
        try{
            
            File archivo2 = new File("C:/Users/Guffy/Documents/NetBeansProjects/ProyectodePrueba/src/archivos/productosFrescos.txt");
            
            if(archivo2.exists()){
            FileReader reader = new FileReader(archivo2);
            BufferedReader breader = new BufferedReader(reader);
                String linea;
               
                    
                    
                while((linea = breader.readLine()) !=null){
                    Pf.add(new ProductoFresco(linea.split("ð")));
                    System.out.println("entro");
                   // System.out.println(PCongelados.toString());
                }
                
                breader.close();
                reader.close();
            }
            else{
                
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        for(ProductoFresco f : Pf ){
            modelo.addRow(new Object[]{
                f.getNombre(),
                f.getPrecio(),
            });
        }
        List<ProductoRefrigerado> Pr = new ArrayList<ProductoRefrigerado>();
        try{
            
            File archivo3 = new File("C:/Users/Guffy/Documents/NetBeansProjects/ProyectodePrueba/src/archivos/productosRefrigerados.txt");
            
            if(archivo3.exists()){
                FileReader reader = new FileReader(archivo3);
                BufferedReader breader = new BufferedReader(reader);
                String linea;
               
                    
                    
                while((linea = breader.readLine()) !=null){
                    
                    Pr.add(new ProductoRefrigerado(linea.split("ð")));
                    System.out.println("entro");
                   // System.out.println(PCongelados.toString());
                }
                
                breader.close();
                reader.close();
            }
            else{
                
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        for(ProductoRefrigerado r : Pr ){

           
            modelo.addRow(new Object[]{
                r.getNombre(),
                r.getPrecio(),
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
        jButton8 = new javax.swing.JButton();
        btnAgregarCarrito = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaCarrito = new rojerusan.RSTableMetro1();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaCatalogo = new rojerusan.RSTableMetro1();
        Txt_Total = new rojeru_san.rsfield.RSTextFullBD();
        jPanelRound1 = new LIB.JPanelRound();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        labelVerCatalogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });

        contenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ModificarProducto.png"))); // NOI18N
        jButton8.setBorderPainted(false);
        jButton8.setContentAreaFilled(false);
        jButton8.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ModificarProductoOVER.png"))); // NOI18N
        jButton8.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton8MouseMoved(evt);
            }
        });
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        contenedor.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 430, 200, 50));

        btnAgregarCarrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregaralcarrito.png"))); // NOI18N
        btnAgregarCarrito.setBorderPainted(false);
        btnAgregarCarrito.setContentAreaFilled(false);
        btnAgregarCarrito.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/agregaralcarritoOVER.png"))); // NOI18N
        btnAgregarCarrito.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnAgregarCarritoMouseMoved(evt);
            }
        });
        btnAgregarCarrito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarCarritoMouseClicked(evt);
            }
        });
        btnAgregarCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCarritoActionPerformed(evt);
            }
        });
        contenedor.add(btnAgregarCarrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 170, 200, 50));

        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminardelcarrito.png"))); // NOI18N
        jButton9.setBorderPainted(false);
        jButton9.setContentAreaFilled(false);
        jButton9.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminardelcarritoOVER.png"))); // NOI18N
        jButton9.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton9MouseMoved(evt);
            }
        });
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        contenedor.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 360, 200, 50));

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminartodocarrito.png"))); // NOI18N
        jButton10.setBorderPainted(false);
        jButton10.setContentAreaFilled(false);
        jButton10.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/eliminartodocarritoOVER.png"))); // NOI18N
        jButton10.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton10MouseMoved(evt);
            }
        });
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        contenedor.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 500, 200, 50));

        tablaCarrito=new rojerusan.RSTableMetro1(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tablaCarrito.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaCarrito.setBackgoundHead(new java.awt.Color(204, 0, 0));
        tablaCarrito.setBackgoundHover(new java.awt.Color(204, 222, 236));
        tablaCarrito.setColorPrimaryText(new java.awt.Color(136, 69, 121));
        tablaCarrito.setColorSecondary(new java.awt.Color(240, 248, 255));
        tablaCarrito.setColorSecundaryText(new java.awt.Color(204, 51, 0));
        tablaCarrito.setEffectHover(true);
        tablaCarrito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaCarritoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaCarrito);

        contenedor.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 660, 190));

        TablaCatalogo=new rojerusan.RSTableMetro1(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        TablaCatalogo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        TablaCatalogo.setBackgoundHead(new java.awt.Color(204, 0, 0));
        TablaCatalogo.setBackgoundHover(new java.awt.Color(204, 222, 236));
        TablaCatalogo.setColorPrimaryText(new java.awt.Color(136, 69, 121));
        TablaCatalogo.setColorSecondary(new java.awt.Color(240, 248, 255));
        TablaCatalogo.setColorSecundaryText(new java.awt.Color(204, 51, 0));
        TablaCatalogo.setEffectHover(true);
        TablaCatalogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaCatalogoMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TablaCatalogo);

        contenedor.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 660, 190));

        Txt_Total.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        Txt_Total.setPlaceholder("Total...");
        Txt_Total.setSoloNumeros(true);
        contenedor.add(Txt_Total, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 570, 120, 40));

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

        labelVerCatalogo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        labelVerCatalogo.setForeground(new java.awt.Color(255, 255, 255));
        labelVerCatalogo.setText("Ver Catalogo");

        javax.swing.GroupLayout jPanelRound1Layout = new javax.swing.GroupLayout(jPanelRound1);
        jPanelRound1.setLayout(jPanelRound1Layout);
        jPanelRound1Layout.setHorizontalGroup(
            jPanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRound1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(455, 455, 455)
                .addComponent(labelVerCatalogo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 456, Short.MAX_VALUE)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanelRound1Layout.setVerticalGroup(
            jPanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelVerCatalogo)
                    .addComponent(jButton7)
                    .addComponent(jButton6))
                .addContainerGap())
        );

        contenedor.add(jPanelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1160, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagenFondo.png"))); // NOI18N
        contenedor.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1170, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 1117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(contenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        VentanaPrincipal nuevo = new VentanaPrincipal();
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

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:

        int fsel =tablaCarrito.getSelectedRow();
        tablaCarrito.removeAll();
        try{

            String Importe;
            if(tablaCarrito.getRowCount()==0){
                JOptionPane.showMessageDialog(null, "No hay ningun producto en el carrito","ERROR",JOptionPane.ERROR_MESSAGE);
                tablaCarrito.removeAll();
            }
            else{
                modelo1=(DefaultTableModel)tablaCarrito.getModel();
                int filas = modelo1.getRowCount();

                for( int i = modelo1.getRowCount() - 1; i >= 0; i-- ) {
                    modelo1.removeRow(i);

                }

                total= 0.00;
                DecimalFormat df = new DecimalFormat("#.00");
                Txt_Total.setText("$"+df.format(total));
                JOptionPane.showMessageDialog(null, "Se han eliminado todos los productos con exito.","Advertencia",JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception e){}
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton10MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseMoved
        // TODO add your handling code here:
        RSAnimation.setMoverDerecha(780, 781, 1, 1, jButton9);
    }//GEN-LAST:event_jButton10MouseMoved

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        modelo1=(DefaultTableModel)tablaCarrito.getModel();
        int fsel =tablaCarrito.getSelectedRow();
        int columna=2;
        try{
            String cantidad , Precio ,NCant,Nombre;
            if(modelo1.getRowCount()==0 ){
                JOptionPane.showMessageDialog(null, "No hay ningun producto en el carrito","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            else if(fsel==-1){

                JOptionPane.showMessageDialog(null, "Debe seleccionar un producto del carrito","Advertencia",JOptionPane.WARNING_MESSAGE);
            }

            else if(comprobarTabla(modelo1)!=0){
                String txtNCant = JOptionPane.showInputDialog("Introduzca la nueva cantidad");
                if(txtNCant == null){
                    System.out.println("se cancelo");
                    txtNCant = tablaCarrito.getValueAt(fsel,2).toString();

                }else{
                    boolean resultado = comprobarCampo(txtNCant);
                    while(comprobarCampo(txtNCant) == false){
                        JOptionPane.showMessageDialog(null, "Ingrese una cantidad valida, cantidad mayor a cero", "Error", JOptionPane.ERROR_MESSAGE);
                        txtNCant = JOptionPane.showInputDialog("Introduzca la nueva cantidad");
                        if(txtNCant == null){
                            break;
                        }

                    }

                }
                modelo1=(DefaultTableModel)tablaCarrito.getModel();
                cantidad= tablaCarrito.getValueAt(fsel,2).toString();
                Precio=tablaCarrito.getValueAt(fsel,1).toString();
                total=(total-(Double.parseDouble(Precio)*Integer.parseInt(cantidad)));
                NCant=txtNCant;
                modelo1.setValueAt(NCant,fsel,columna);
                modelo1.setValueAt((Double.parseDouble(Precio)*Integer.parseInt(NCant)), fsel, 3);
                total=(total+(Double.parseDouble(Precio)*Integer.parseInt(NCant)));

                Txt_Total.setText("$"+df.format(total));
                JOptionPane.showMessageDialog(null, "Se ha modificado el producto con exito.","Advertencia",JOptionPane.INFORMATION_MESSAGE);
            }

        } catch (Exception e){}
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton8MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseMoved
        // TODO add your handling code here:
        RSAnimation.setMoverDerecha(780, 781, 1, 1, jButton8);
    }//GEN-LAST:event_jButton8MouseMoved

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        int fsel =tablaCarrito.getSelectedRow();
        try{
            String Importe;
            if(modelo1.getRowCount() == 0){
                JOptionPane.showMessageDialog(null, "No hay ningun producto en el carrito.","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            else if(fsel==-1){
                JOptionPane.showMessageDialog(null, "Debe de seleccionar una fila","Advertencia",JOptionPane.WARNING_MESSAGE);
            }
            else{
                modelo1=(DefaultTableModel)tablaCarrito.getModel();
                Importe=tablaCarrito.getValueAt(fsel,3).toString();
                modelo1.removeRow(fsel);
                total=(total - Double.parseDouble(Importe));
                DecimalFormat df = new DecimalFormat("#.00");
                Txt_Total.setText("$"+df.format(total));
                JOptionPane.showMessageDialog(null, "Se ha eliminado el producto con exito.","Advertencia",JOptionPane.INFORMATION_MESSAGE);

            }

        } catch (Exception e){}

        }

        private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {
            // TODO add your handling code here:

            modelo1=(DefaultTableModel)tablaCarrito.getModel();
            int fsel =tablaCarrito.getSelectedRow();
            int columna=2;
            try{
                String cantidad , Precio ,NCant,Nombre;
                if(modelo1.getRowCount()==0 ){
                    JOptionPane.showMessageDialog(null, "No hay ningun producto en el carrito","ERROR",JOptionPane.ERROR_MESSAGE);
                }
                else if(fsel==-1){

                    JOptionPane.showMessageDialog(null, "Debe seleccionar un producto del carrito","Advertencia",JOptionPane.WARNING_MESSAGE);
                }

                else if(comprobarTabla(modelo1)!=0){
                    String txtNCant = JOptionPane.showInputDialog("Introduzca la nueva cantidad");
                    if(txtNCant == null){
                        System.out.println("se cancelo");
                        txtNCant = tablaCarrito.getValueAt(fsel,2).toString();

                    }else{
                        boolean resultado = comprobarCampo(txtNCant);
                        while(comprobarCampo(txtNCant) == false){
                            JOptionPane.showMessageDialog(null, "Ingrese una cantidad valida, cantidad mayor a cero", "Error", JOptionPane.ERROR_MESSAGE);
                            txtNCant = JOptionPane.showInputDialog("Introduzca la nueva cantidad");
                            if(txtNCant == null){
                                break;
                            }

                        }

                    }
                    modelo1=(DefaultTableModel)tablaCarrito.getModel();
                    cantidad= tablaCarrito.getValueAt(fsel,2).toString();
                    Precio=tablaCarrito.getValueAt(fsel,1).toString();
                    total=(total-(Double.parseDouble(Precio)*Integer.parseInt(cantidad)));
                    NCant=txtNCant;
                    modelo1.setValueAt(NCant,fsel,columna);
                    modelo1.setValueAt((Double.parseDouble(Precio)*Integer.parseInt(NCant)), fsel, 3);
                    total=(total+(Double.parseDouble(Precio)*Integer.parseInt(NCant)));
                    DecimalFormat df = new DecimalFormat("#.00");
                    Txt_Total.setText("$"+df.format(total));
                    JOptionPane.showMessageDialog(null, "Se ha modificado el producto con exito.","Advertencia",JOptionPane.INFORMATION_MESSAGE);
                }

            } catch (Exception e){}
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton9MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseMoved
        // TODO add your handling code here:
        RSAnimation.setMoverDerecha(780, 781, 1, 1, jButton9);
    }//GEN-LAST:event_jButton9MouseMoved

    private void btnAgregarCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCarritoActionPerformed
        // TODO add your handling code here:
        int fsel =TablaCatalogo.getSelectedRow();
        double x=0, calculo=0;
        try{
            String Nombre, Precio, cant, Importe;
            if(modelo.getRowCount()==0){
                // poner que no hay nada en la tabla
                JOptionPane.showMessageDialog(null, "No hay ningun producto en el catalogo","ERROR",JOptionPane.ERROR_MESSAGE);
            }
            else if(fsel==-1){
                JOptionPane.showMessageDialog(null, "Debe de seleccionar un producto","Advertencia",JOptionPane.WARNING_MESSAGE);
            }else{
                String txtNCant = JOptionPane.showInputDialog("Introduzca la nueva cantidad");
                if(txtNCant == null){
                    System.out.println("se cancelo");
                }else{
                    boolean resultado = comprobarCampo(txtNCant);
                    while(comprobarCampo(txtNCant) == false){
                        JOptionPane.showMessageDialog(null, "Ingrese una cantidad valida, cantidad mayor a cero y menor a 100", "Error", JOptionPane.ERROR_MESSAGE);
                        txtNCant = JOptionPane.showInputDialog("Introduzca la nueva cantidad");
                        if(txtNCant == null){
                            break;
                        }

                    }

                    modelo=(DefaultTableModel)TablaCatalogo.getModel();
                    Nombre=TablaCatalogo.getValueAt(fsel,0).toString();
                    Precio=TablaCatalogo.getValueAt(fsel,1).toString();

                    cant=txtNCant;
                    DecimalFormat df = new DecimalFormat("#.00");
                    x=(Double.parseDouble(Precio) * Integer.parseInt(cant));
                    
                    Importe=String.valueOf(x);

                    modelo1=(DefaultTableModel)tablaCarrito.getModel();
                    String filaelemento[] = {Nombre,Precio,cant,Importe};

                    modelo1.addRow(filaelemento);
                    calculo=(Double.parseDouble(Precio)*Integer.parseInt(txtNCant));
                    total = (total + calculo);
                    Txt_Total.setText("$"+df.format(total));
                }
            }

        } catch (Exception e){}
        
        TablaCatalogo.clearSelection();
    }//GEN-LAST:event_btnAgregarCarritoActionPerformed
    
   
    private void btnAgregarCarritoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarCarritoMouseMoved
        // TODO add your handling code here:
        RSAnimation.setMoverDerecha(780, 781, 1, 1, btnAgregarCarrito);
    }//GEN-LAST:event_btnAgregarCarritoMouseMoved

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        tablaCarrito.clearSelection();
        TablaCatalogo.clearSelection();
    }//GEN-LAST:event_formMouseClicked

    private void btnAgregarCarritoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarCarritoMouseClicked
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_btnAgregarCarritoMouseClicked

    private void TablaCatalogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaCatalogoMouseClicked
        // TODO add your handling code here:
        tablaCarrito.clearSelection();
    }//GEN-LAST:event_TablaCatalogoMouseClicked

    private void tablaCarritoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaCarritoMouseClicked
        // TODO add your handling code here:
        TablaCatalogo.clearSelection();
    }//GEN-LAST:event_tablaCarritoMouseClicked
    public boolean comprobarCampo(String campo){
    boolean resultado;
        try {
            int numero =  Integer.parseInt(campo);
            resultado = false;
            if(numero > 0 && numero <= 100){
                resultado = true;
            }

        } catch (NumberFormatException excepcion) {
            resultado = false;
        }

        return resultado;
    
    }
    public int comprobarTabla(DefaultTableModel m) {
           int row = 0;
           int i = 0;
           for (i = 0; i < m.getRowCount(); ++i) {

               try {
                   if (!(m.getValueAt(i, 0).equals("")) && !(m.getValueAt(i, 1).equals(""))
                           && !(m.getValueAt(i, 2).equals(""))) {
                       row++;
                   }

               } catch (NullPointerException e) {
                   continue;
               }


           }
           return row;
       }
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
            java.util.logging.Logger.getLogger(VentanaVerCatalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaVerCatalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaVerCatalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaVerCatalogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaVerCatalogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rojerusan.RSTableMetro1 TablaCatalogo;
    private rojeru_san.rsfield.RSTextFullBD Txt_Total;
    private javax.swing.JButton btnAgregarCarrito;
    private javax.swing.JPanel contenedor;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private LIB.JPanelRound jPanelRound1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel labelVerCatalogo;
    private rojerusan.RSTableMetro1 tablaCarrito;
    // End of variables declaration//GEN-END:variables
}
