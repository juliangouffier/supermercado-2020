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
import javax.swing.table.DefaultTableModel;
import rojerusan.RSAnimation;

/**
 *
 * @author Guffy
 */
public class VentanaModificarProducto extends javax.swing.JFrame {

    /**
     * Creates new form VentanaModificarProducto
     */
    int xMouse;
    int yMouse;
    List<ProductoCongelado> Pc =new ArrayList<ProductoCongelado>();
    List<ProductoRefrigerado> Pr = new ArrayList<ProductoRefrigerado>();
    List<ProductoFresco> Pf = new ArrayList<ProductoFresco>();
    DefaultTableModel modelo=new DefaultTableModel();
    private final char constante = 'ð';
    public VentanaModificarProducto() {
        char g ='-';
        initComponents();
          this.setLocationRelativeTo(null);
        RSAnimation.setBajar(-50, 200, 2, 2, this);
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
        btnModificarProducto = new javax.swing.JButton();
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
        Tabla.setEffectHover(true);
        Tabla.setShowVerticalLines(true);
        Tabla.setSurrendersFocusOnKeystroke(true);
        jScrollPane1.setViewportView(Tabla);

        contenedor.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 1300, 400));

        btnModificarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ModificarProducto.png"))); // NOI18N
        btnModificarProducto.setBorderPainted(false);
        btnModificarProducto.setContentAreaFilled(false);
        btnModificarProducto.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ModificarProductoOVER.png"))); // NOI18N
        btnModificarProducto.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnModificarProductoMouseMoved(evt);
            }
        });
        btnModificarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarProductoActionPerformed(evt);
            }
        });
        contenedor.add(btnModificarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 540, 200, 50));

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
        LabelAñadirNuevoProducto.setText("Modificar Productos");

        javax.swing.GroupLayout jPanelRound1Layout = new javax.swing.GroupLayout(jPanelRound1);
        jPanelRound1.setLayout(jPanelRound1Layout);
        jPanelRound1Layout.setHorizontalGroup(
            jPanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRound1Layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 517, Short.MAX_VALUE)
                .addComponent(LabelAñadirNuevoProducto)
                .addGap(514, 514, 514)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(111, 111, 111))
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

    private void btnModificarProductoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModificarProductoMouseMoved
        // TODO add your handling code here:
        RSAnimation.setMoverDerecha(550, 551, 1, 1, btnModificarProducto);
    }//GEN-LAST:event_btnModificarProductoMouseMoved

    private void btnModificarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarProductoActionPerformed
        // TODO add your handling code here:
        modelo=(DefaultTableModel)Tabla.getModel();
        String congelado= "congelado";
        String fresco ="fresco";
        String refrigerado= "refrigerado";
        int fsel=Tabla.getSelectedRow();
        int csel=Tabla.getSelectedColumn();
        String Cod, Nombre,Precio, Descripcion, FechaCad,NumLot,Tipo,CodOrg,Temp,FechaEnva, Pais;
        if(csel!=-1 && fsel!=-1){
        switch(csel){
            case 0:
                try{
                    if(fsel==-1){
                        JOptionPane.showMessageDialog(null,"Debe seleccionar un producto a modificar");
                    }else{
                        if(comprobarTabla(modelo)!=0){
                            String txtCod = JOptionPane.showInputDialog("Ingrese el nuevo codigo del producto");
                            if(txtCod== null){
                                System.out.println("se cancelo");
                                txtCod = Tabla.getValueAt(fsel,csel).toString();
                            }else{
                                boolean resultado = comprobarCod(txtCod);
                                while(comprobarCod(txtCod) == false){
            JOptionPane.showMessageDialog(null, "Ingrese un codigo valido(12 Digitos)", "Error", JOptionPane.ERROR_MESSAGE);
            txtCod = JOptionPane.showInputDialog("Ingrese el nuevo codigo del producto(12 Digitos)");
           if(txtCod == null){
               break;
           }
                                }
                                
                            }
                            
                            
                            modelo=(DefaultTableModel)Tabla.getModel();
                            Cod=txtCod;
                            System.out.println(Cod);
                            
                            Tipo=Tabla.getValueAt(fsel,6).toString();
              if(Tipo.equals(congelado)){
                        for(int i = 0; i< Pc.size();i++){
                            ProductoCongelado conge = Pc.get(i);
                            if(conge.getCodigoDeProducto() == (Tabla.getValueAt(fsel, 0).toString())){
                                Pc.remove(i);
                                conge.setCodigoDeProducto(Cod);
                                Pc.add(conge);
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
                                modelo.setValueAt(Cod,fsel,csel);
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
                                Fres.setCodigoDeProducto(Cod);
                                Pf.add(Fres);
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
                                    modelo.setValueAt(Cod,fsel,csel);
                                    }catch (Exception e){
                            e.printStackTrace();
                   }

                                
                            }
                        }
                  }else{
                      if(Tipo.equals(refrigerado)){
                      File archivo1 = new File("D:/Escritorio/Proyecto-Final/src/archivos/productosRefrigerados.txt");
                      File outputFile = new File("D:/Escritorio/Proyecto-Final/src/archivos/productosRefrigerados.txt");
                      
                      for(int i = 0; i< Pr.size();i++){
                            ProductoRefrigerado Refri = Pr.get(i);
                            if(Refri.getCodigoDeProducto() == (Tabla.getValueAt(fsel, 0).toString())){
                                Pr.remove(i);
                                Refri.setCodigoDeProducto(Cod);
                                Pr.add(Refri);
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
                                    modelo.setValueAt(Cod,fsel,csel);
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
                }catch (Exception e){}
                break;
            case 1:
                try{
                    if(fsel==-1){
                        JOptionPane.showMessageDialog(null,"Debe seleccionar un producto a modificar");
                    }else{
                        if(comprobarTabla(modelo)!=0){
                            String txtNombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre del producto");
                            if(txtNombre== null){
                                System.out.println("se cancelo");
                                txtNombre = Tabla.getValueAt(fsel,csel).toString();
                            }else{
                                boolean resultado = comprobarText(txtNombre);
                                while(comprobarText(txtNombre) == false){
            JOptionPane.showMessageDialog(null, "Ingrese un nombre valido", "Error", JOptionPane.ERROR_MESSAGE);
            txtNombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre del producto");
           if(txtNombre == null){
               txtNombre=Tabla.getValueAt(fsel, csel).toString();
               break;
           }
                                }
                                
                            }        
                            modelo=(DefaultTableModel)Tabla.getModel();
                            Nombre=txtNombre;
                            
                            Tipo=Tabla.getValueAt(fsel,6).toString();
              if(Tipo.equals(congelado)){
                        for(int i = 0; i< Pc.size();i++){
                            ProductoCongelado conge = Pc.get(i);
                            if(conge.getCodigoDeProducto() == (Tabla.getValueAt(fsel, 0).toString())){
                                Pc.remove(i);
                                conge.setNombre(Nombre);
                                Pc.add(conge);
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
                                modelo.setValueAt(Nombre,fsel,csel);
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
                                Fres.setNombre(Nombre);
                                Pf.add(Fres);
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
                                    modelo.setValueAt(Nombre,fsel,csel);
                                    }catch (Exception e){
                            e.printStackTrace();
                   }

                                
                            }
                        }
                  }else{
                      if(Tipo.equals(refrigerado)){
                      File archivo1 = new File("D:/Escritorio/Proyecto-Final/src/archivos/productosRefrigerados.txt");
                      File outputFile = new File("D:/Escritorio/Proyecto-Final/src/archivos/productosRefrigerados.txt");
                      
                      for(int i = 0; i< Pr.size();i++){
                            ProductoRefrigerado Refri = Pr.get(i);
                            if(Refri.getCodigoDeProducto() == (Tabla.getValueAt(fsel, 0).toString())){
                                Pr.remove(i);
                                Refri.setNombre(Nombre);
                                Pr.add(Refri);
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
                                    modelo.setValueAt(Nombre,fsel,csel);
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
                }catch (Exception e){}
                break;
            case 2:
                try{
                    if(fsel==-1){
                        JOptionPane.showMessageDialog(null,"Debe seleccionar un producto a modificar");
                    }else{
                        if(comprobarTabla(modelo)!=0){
                            String txtPrecio = JOptionPane.showInputDialog("Ingrese el nuevo precio del producto");
                            if(txtPrecio== null){
                                System.out.println("se cancelo");
                                txtPrecio = Tabla.getValueAt(fsel,csel).toString();
                            }else{
                                boolean resultado = comprobarCampo(txtPrecio);
                                while(comprobarCampo(txtPrecio) == false){
            JOptionPane.showMessageDialog(null, "Ingrese un precio valido", "Error", JOptionPane.ERROR_MESSAGE);
            txtPrecio = JOptionPane.showInputDialog("Ingrese el nuevo precio del producto");
           if(txtPrecio == null){
               txtPrecio=Tabla.getValueAt(fsel,csel).toString();
               break;
           }
                                }
                                
                            }      
                            modelo=(DefaultTableModel)Tabla.getModel();
                            Precio=txtPrecio;
                            
                            Tipo=Tabla.getValueAt(fsel,6).toString();
              if(Tipo.equals(congelado)){
                        for(int i = 0; i< Pc.size();i++){
                            ProductoCongelado conge = Pc.get(i);
                            if(conge.getCodigoDeProducto() == (Tabla.getValueAt(fsel, 0).toString())){
                                Pc.remove(i);
                                conge.setPrecio(Precio);
                                Pc.add(conge);
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
                                modelo.setValueAt(Precio,fsel,csel);
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
                                Fres.setPrecio(Precio);
                                Pf.add(Fres);
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
                                    modelo.setValueAt(Precio,fsel,csel);
                                    }catch (Exception e){
                            e.printStackTrace();
                   }

                                
                            }
                        }
                  }else{
                      if(Tipo.equals(refrigerado)){
                      File archivo1 = new File("D:/Escritorio/Proyecto-Final/src/archivos/productosRefrigerados.txt");
                      File outputFile = new File("D:/Escritorio/Proyecto-Final/src/archivos/productosRefrigerados.txt");
                      
                      for(int i = 0; i< Pr.size();i++){
                            ProductoRefrigerado Refri = Pr.get(i);
                            if(Refri.getCodigoDeProducto() == (Tabla.getValueAt(fsel, 0).toString())){
                                Pr.remove(i);
                                Refri.setPrecio(Precio);
                                Pr.add(Refri);
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
                                    modelo.setValueAt(Precio,fsel,csel);
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
                }catch (Exception e){}
                break;
            case 3:
                try{
                    if(fsel==-1){
                        JOptionPane.showMessageDialog(null,"Debe seleccionar un producto a modificar");
                    }else{
                        if(comprobarTabla(modelo)!=0){
                            String txtDescripcion = JOptionPane.showInputDialog("Ingrese la nueva descripcion del producto");
                            if(txtDescripcion== null){
                                System.out.println("se cancelo");
                                txtDescripcion = Tabla.getValueAt(fsel,csel).toString();
                            }else{
                                boolean resultado = comprobarText(txtDescripcion);
                                while(comprobarText(txtDescripcion) == false){
            JOptionPane.showMessageDialog(null, "Ingrese una descripcion valida", "Error", JOptionPane.ERROR_MESSAGE);
            txtDescripcion = JOptionPane.showInputDialog("Ingrese la nueva descripcion del producto");
           if(txtDescripcion == null){
               txtDescripcion=Tabla.getValueAt(fsel, csel).toString();
               break;
           }
                                }
                                
                            }        
                            modelo=(DefaultTableModel)Tabla.getModel();
                            Descripcion=txtDescripcion;
                            
                            Tipo=Tabla.getValueAt(fsel,6).toString();
              if(Tipo.equals(congelado)){
                        for(int i = 0; i< Pc.size();i++){
                            ProductoCongelado conge = Pc.get(i);
                            if(conge.getCodigoDeProducto() == (Tabla.getValueAt(fsel, 0).toString())){
                                Pc.remove(i);
                                conge.setDescripcion(Descripcion);
                                Pc.add(conge);
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
                                modelo.setValueAt(Descripcion,fsel,csel);
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
                                Fres.setDescripcion(Descripcion);
                                Pf.add(Fres);
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
                                    modelo.setValueAt(Descripcion,fsel,csel);
                                    }catch (Exception e){
                            e.printStackTrace();
                   }

                                
                            }
                        }
                  }else{
                      if(Tipo.equals(refrigerado)){
                      File archivo1 = new File("D:/Escritorio/Proyecto-Final/src/archivos/productosRefrigerados.txt");
                      File outputFile = new File("D:/Escritorio/Proyecto-Final/src/archivos/productosRefrigerados.txt");
                      
                      for(int i = 0; i< Pr.size();i++){
                            ProductoRefrigerado Refri = Pr.get(i);
                            if(Refri.getCodigoDeProducto() == (Tabla.getValueAt(fsel, 0).toString())){
                                Pr.remove(i);
                                Refri.setDescripcion(Descripcion);
                                Pr.add(Refri);
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
                                    modelo.setValueAt(Descripcion,fsel,csel);
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
                }catch (Exception e){}
                break;
            case 4:
                try{
                    String Dia;
                    String Mes;
                    String Anio;
                    String Fecha;
                    if(fsel==-1){
                        JOptionPane.showMessageDialog(null,"Debe seleccionar un producto a modificar");
                    }else{
                        Fecha=Tabla.getValueAt(fsel,csel).toString();
                        if(comprobarTabla(modelo)!=0){
                            String txtAnio = JOptionPane.showInputDialog("Ingrese el nuevo año de la fecha de caducidad del producto del producto");
                            if(txtAnio== null){
                                System.out.println("se cancelo");
                                Fecha = Tabla.getValueAt(fsel,csel).toString();
                            }else{
                                boolean resultado = comprobarAnio(txtAnio);
                                while(comprobarAnio(txtAnio) == false){
            JOptionPane.showMessageDialog(null, "Ingrese un año valido", "Error", JOptionPane.ERROR_MESSAGE);
            txtAnio = JOptionPane.showInputDialog("Ingrese el nuevo año de la fecha de caducidad del producto del producto");
           if(txtAnio == null){
               break;
           }
                                }
                                
                            }    
                            String txtMes = JOptionPane.showInputDialog("Ingrese el nuevo mes de la fecha de caducidad del producto del producto");
                            if(txtMes== null){
                                System.out.println("se cancelo");
                                Fecha = Tabla.getValueAt(fsel,csel).toString();
                            }else{
                                boolean resultado = comprobarMes(txtMes);
                                while(comprobarMes(txtMes) == false){
            JOptionPane.showMessageDialog(null, "Ingrese un mes valido", "Error", JOptionPane.ERROR_MESSAGE);
            txtMes = JOptionPane.showInputDialog("Ingrese el nuevo mes de la fecha de caducidad del producto del producto");
           if(txtMes == null){
               break;
           }
                                }
                                
                            } 
                            String txtDia = JOptionPane.showInputDialog("Ingrese el nuevo dia de la fecha de caducidad del producto del producto");
                              if(txtDia== null){
                                System.out.println("se cancelo");
                                Fecha = Tabla.getValueAt(fsel,csel).toString();
                            }else{
                                boolean resultado = comprobarDia(txtDia,txtMes);
                                while(comprobarDia(txtDia,txtMes) == false){
            JOptionPane.showMessageDialog(null, "Ingrese un dia valido", "Error", JOptionPane.ERROR_MESSAGE);
            txtDia = JOptionPane.showInputDialog("Ingrese el nuevo dia de la fecha de caducidad del producto");
           if(txtDia == null){
               break;
           }
                                }
                                
                            }
                            if(txtDia!=null && txtMes !=null && txtAnio !=null ){
                                modelo=(DefaultTableModel)Tabla.getModel();
                                FechaCad=(txtDia+"/"+txtMes+"/"+txtAnio);
                            }
                            else{
                                modelo=(DefaultTableModel)Tabla.getModel();
                                FechaCad=Fecha;
                            }
                            Tipo=Tabla.getValueAt(fsel,6).toString();
              if(Tipo.equals(congelado)){
                        for(int i = 0; i< Pc.size();i++){
                            ProductoCongelado conge = Pc.get(i);
                            if(conge.getCodigoDeProducto() == (Tabla.getValueAt(fsel, 0).toString())){
                                Pc.remove(i);
                                conge.setFechaCaducidad(FechaCad);
                                Pc.add(conge);
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
                                modelo.setValueAt(FechaCad,fsel,csel);
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
                                Fres.setFechaCaducidad(FechaCad);
                                Pf.add(Fres);
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
                                    modelo.setValueAt(FechaCad,fsel,csel);
                                    }catch (Exception e){
                            e.printStackTrace();
                   }

                                
                            }
                        }
                  }else{
                      if(Tipo.equals(refrigerado)){
                      File archivo1 = new File("D:/Escritorio/Proyecto-Final/src/archivos/productosRefrigerados.txt");
                      File outputFile = new File("D:/Escritorio/Proyecto-Final/src/archivos/productosRefrigerados.txt");
                      
                      for(int i = 0; i< Pr.size();i++){
                            ProductoRefrigerado Refri = Pr.get(i);
                            if(Refri.getCodigoDeProducto() == (Tabla.getValueAt(fsel, 0).toString())){
                                Pr.remove(i);
                                Refri.setFechaCaducidad(FechaCad);
                                Pr.add(Refri);
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
                                    modelo.setValueAt(FechaCad,fsel,csel);
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
                }catch (Exception e){}
                break;
            case 5:
                try{
                    if(fsel==-1){
                        JOptionPane.showMessageDialog(null,"Debe seleccionar un producto a modificar");
                    }else{
                        if(comprobarTabla(modelo)!=0){
                            String txtNumLote = JOptionPane.showInputDialog("Ingrese el nuevo numero de lote del producto");
                            if(txtNumLote== null){
                                System.out.println("se cancelo");
                                txtNumLote = Tabla.getValueAt(fsel,csel).toString();
                            }else{
                                boolean resultado = comprobarCod(txtNumLote);
                                while(comprobarCod(txtNumLote) == false){
            JOptionPane.showMessageDialog(null, "Ingrese un numero de lote valido(12 Digitos)", "Error", JOptionPane.ERROR_MESSAGE);
            txtNumLote = JOptionPane.showInputDialog("Ingrese el nuevo numero de lote del producto del producto(12 Digitos)");
           if(txtNumLote == null){
               txtNumLote = Tabla.getValueAt(fsel, csel).toString();
               break;
           }
                                }
                                
                            }       
                            modelo=(DefaultTableModel)Tabla.getModel();
                            NumLot=txtNumLote;
                            
                            Tipo=Tabla.getValueAt(fsel,6).toString();
              if(Tipo.equals(congelado)){
                        for(int i = 0; i< Pc.size();i++){
                            ProductoCongelado conge = Pc.get(i);
                            if(conge.getCodigoDeProducto() == (Tabla.getValueAt(fsel, 0).toString())){
                                Pc.remove(i);
                                conge.setNumLote(NumLot);
                                Pc.add(conge);
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
                                modelo.setValueAt(NumLot,fsel,csel);
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
                                Fres.setNumLote(NumLot);
                                Pf.add(Fres);
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
                                    modelo.setValueAt(NumLot,fsel,csel);
                                    }catch (Exception e){
                            e.printStackTrace();
                   }

                                
                            }
                        }
                  }else{
                      if(Tipo.equals(refrigerado)){
                      File archivo1 = new File("D:/Escritorio/Proyecto-Final/src/archivos/productosRefrigerados.txt");
                      File outputFile = new File("D:/Escritorio/Proyecto-Final/src/archivos/productosRefrigerados.txt");
                      
                      for(int i = 0; i< Pr.size();i++){
                            ProductoRefrigerado Refri = Pr.get(i);
                            if(Refri.getCodigoDeProducto() == (Tabla.getValueAt(fsel, 0).toString())){
                                Pr.remove(i);
                                Refri.setNumLote(NumLot);
                                Pr.add(Refri);
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
                                    modelo.setValueAt(NumLot,fsel,csel);
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
                }catch (Exception e){}
                break;
            case 6:
                break;
            case 7:
               try {
                   if(fsel==-1){
                        JOptionPane.showMessageDialog(null,"Debe seleccionar un producto a modificar");
                    }else{
                       Tipo=Tabla.getValueAt(fsel,6).toString();
                       if(Tipo.equals(refrigerado)){
                       if(comprobarTabla(modelo)!=0){
                            String txtCodOrg = JOptionPane.showInputDialog("Ingrese el nuevo codigo de organismo del producto");
                            if(txtCodOrg== null){
                                System.out.println("se cancelo");
                                txtCodOrg = Tabla.getValueAt(fsel,csel).toString();
                            }else{
                                boolean resultado = comprobarCod(txtCodOrg);
                                while(comprobarCod(txtCodOrg) == false){
            JOptionPane.showMessageDialog(null, "Ingrese un codigo valido(12 Digitos)", "Error", JOptionPane.ERROR_MESSAGE);
            txtCodOrg = JOptionPane.showInputDialog("Ingrese el nuevo codigo de organismo del producto(12 Digitos)");
           if(txtCodOrg == null){
               txtCodOrg= Tabla.getValueAt(fsel,csel).toString();
               break;
           }
                                }
                                
                            }      
                            modelo=(DefaultTableModel)Tabla.getModel();
                            CodOrg=txtCodOrg;
                            
                            
                   
                      File archivo1 = new File("D:/Escritorio/Proyecto-Final/src/archivos/productosRefrigerados.txt");
                      File outputFile = new File("D:/Escritorio/Proyecto-Final/src/archivos/productosRefrigerados.txt");
                      
                      for(int i = 0; i< Pr.size();i++){
                            ProductoRefrigerado Refri = Pr.get(i);
                            if(Refri.getCodigoDeProducto() == (Tabla.getValueAt(fsel, 0).toString())){
                                Pr.remove(i);
                                Refri.setCodigoDeOrganismo(CodOrg);
                                Pr.add(Refri);
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
                                    modelo.setValueAt(CodOrg,fsel,csel);
                                    }catch (Exception e){
                            e.printStackTrace();
                   }

                                
                            }
                        }
                      }
                   }else{
                           JOptionPane.showMessageDialog(null, "Este producto no lleva codigo de organismo", "Error", JOptionPane.ERROR_MESSAGE);
                       }
               }
               } catch (Exception e){}
               break;
            case 8:
                try {
                   if(fsel==-1){
                        JOptionPane.showMessageDialog(null,"Debe seleccionar un producto a modificar");
                    }else{
                       Tipo=Tabla.getValueAt(fsel,6).toString();
                       if(Tipo.equals(congelado)){
                       if(comprobarTabla(modelo)!=0){
                            String txtTemp = JOptionPane.showInputDialog("Ingrese la nueva temperatura recomendada del producto del producto");
                            if(txtTemp== null){
                                System.out.println("se cancelo");
                                txtTemp = Tabla.getValueAt(fsel,csel).toString();
                            }else{
                                boolean resultado = comprobarTemp(txtTemp);
                                while(comprobarTemp(txtTemp) == false){
            JOptionPane.showMessageDialog(null, "Ingrese una temperatura valida", "Error", JOptionPane.ERROR_MESSAGE);
            txtTemp = JOptionPane.showInputDialog("Ingrese la nueva temperatura del producto");
           if(txtTemp == null){
               txtTemp=Tabla.getValueAt(fsel, csel).toString();
               break;
           }
                                }
                                
                            }      
                            modelo=(DefaultTableModel)Tabla.getModel();
                            Temp=txtTemp;
                            
                            
                   
                      File archivo1 = new File("D:/Escritorio/Proyecto-Final/src/archivos/productosCongelados.txt");
                      File outputFile = new File("D:/Escritorio/Proyecto-Final/src/archivos/productosCongelados.txt");
                      
                      for(int i = 0; i< Pc.size();i++){
                            ProductoCongelado conge = Pc.get(i);
                            if(conge.getCodigoDeProducto() == (Tabla.getValueAt(fsel, 0).toString())){
                                Pc.remove(i);
                                conge.setTempRecomendada(Temp);
                                Pc.add(conge);
                                archivo1.delete();
                                
                                    ProductoCongelado p3;
                                    try{
                                        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
                                    for(int j=0;j<Pr.size();j++){
                                    
                                    p3=Pc.get(j);
                                    writer.append(p3.getNombre()+constante+p3.getDescripcion()+constante+p3.getCodigoDeProducto()+constante+p3.getFechaCaducidad()+constante+p3.getNumLote()+constante+p3.getPrecio()+constante+p3.getTempRecomendada()+constante+p3.getTipoDeProducto());
                                    writer.newLine();
                                    }
                                    writer.close();
                                    writer.close();
                                    modelo.setValueAt(Temp,fsel,csel);
                                    }catch (Exception e){
                            e.printStackTrace();
                   }

                                
                            }
                        }
                      }
                   }else{
                           JOptionPane.showMessageDialog(null, "Este producto no lleva temperatura recomendada", "Error", JOptionPane.ERROR_MESSAGE);
                       }
               }
               } catch (Exception e){}
                break;
            case 9:
                try{
                    String Dia;
                    String Mes;
                    String Anio;
                    String Fecha;
                    if(fsel==-1){
                        JOptionPane.showMessageDialog(null,"Debe seleccionar un producto a modificar");
                    }else{
                        Fecha=Tabla.getValueAt(fsel,csel).toString();
                        Tipo=Tabla.getValueAt(fsel,6).toString();
                        if(Tipo.equals(fresco)){
                        if(comprobarTabla(modelo)!=0){
                            String txtAnio = JOptionPane.showInputDialog("Ingrese el nuevo año de la fecha de envasado del producto del producto");
                            if(txtAnio== null){
                                System.out.println("se cancelo");
                                Fecha = Tabla.getValueAt(fsel,csel).toString();
                            }else{
                                boolean resultado = comprobarAnio(txtAnio);
                                while(comprobarAnio(txtAnio) == false){
            JOptionPane.showMessageDialog(null, "Ingrese un año valido", "Error", JOptionPane.ERROR_MESSAGE);
            txtAnio = JOptionPane.showInputDialog("Ingrese el nuevo año de la fecha de envasado del producto del producto");
           if(txtAnio == null){
               break;
           }
                                }
                                
                            }    
                            String txtMes = JOptionPane.showInputDialog("Ingrese el nuevo mes de la fecha de envasado del producto del producto");
                            if(txtMes== null){
                                System.out.println("se cancelo");
                                Fecha = Tabla.getValueAt(fsel,csel).toString();
                            }else{
                                boolean resultado = comprobarMes(txtMes);
                                while(comprobarMes(txtMes) == false){
            JOptionPane.showMessageDialog(null, "Ingrese un mes valido", "Error", JOptionPane.ERROR_MESSAGE);
            txtMes = JOptionPane.showInputDialog("Ingrese el nuevo mes de la fecha de envasado del producto del producto");
           if(txtMes == null){
               break;
           }
                                }
                                
                            } 
                            String txtDia = JOptionPane.showInputDialog("Ingrese el nuevo dia de la fecha de envasado del producto del producto");
                              if(txtDia== null){
                                System.out.println("se cancelo");
                                Fecha = Tabla.getValueAt(fsel,csel).toString();
                            }else{
                                boolean resultado = comprobarDia(txtDia,txtMes);
                                while(comprobarDia(txtDia,txtMes) == false){
            JOptionPane.showMessageDialog(null, "Ingrese un dia valido", "Error", JOptionPane.ERROR_MESSAGE);
            txtDia = JOptionPane.showInputDialog("Ingrese el nuevo dia de la fecha de envasado del producto");
           if(txtDia == null){
               break;
           }
                                }
                                
                            }
                            if(txtDia!=null && txtMes !=null && txtAnio !=null ){
                                modelo=(DefaultTableModel)Tabla.getModel();
                                FechaEnva=(txtDia+"/"+txtMes+"/"+txtAnio);
                            }
                            else{
                                modelo=(DefaultTableModel)Tabla.getModel();
                                FechaEnva=Fecha;
                            }
                            
              
                  
                      
                      File archivo1 = new File("D:/Escritorio/Proyecto-Final/src/archivos/productosFrescos.txt");
                      File outputFile = new File("D:/Escritorio/Proyecto-Final/src/archivos/productosFrescos.txt");
                      
                      for(int i = 0; i< Pf.size();i++){
                            ProductoFresco Fres = Pf.get(i);
                            if(Fres.getCodigoDeProducto() == (Tabla.getValueAt(fsel, 0).toString())){
                                Pf.remove(i);
                                Fres.setFechaCaducidad(FechaEnva);
                                Pf.add(Fres);
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
                                    modelo.setValueAt(FechaEnva,fsel,csel);
                                    }catch (Exception e){
                            e.printStackTrace();
                   }

                                
                            }
                        }
                  
              }
                        }else{
                          JOptionPane.showMessageDialog(null, "Este producto no lleva Fecha de Envasado", "Error", JOptionPane.ERROR_MESSAGE);
                      
                  }
                    }
                }catch (Exception e){}
                break;
            case 10:
                try {
                   if(fsel==-1){
                        JOptionPane.showMessageDialog(null,"Debe seleccionar un producto a modificar");
                    }else{
                       Tipo=Tabla.getValueAt(fsel,6).toString();
                       if(Tipo.equals(fresco)){
                       if(comprobarTabla(modelo)!=0){
                            String txtPais = JOptionPane.showInputDialog("Ingrese el nuevo pais de origen del producto del producto");
                            if(txtPais== null){
                                System.out.println("se cancelo");
                                txtPais = Tabla.getValueAt(fsel,csel).toString();
                            }else{
                                boolean resultado = comprobarText(txtPais);
                                while(comprobarText(txtPais) == false){
            JOptionPane.showMessageDialog(null, "Ingrese un pais valido", "Error", JOptionPane.ERROR_MESSAGE);
            txtPais = JOptionPane.showInputDialog("Ingrese el nuevo pais de origen del producto");
           if(txtPais == null){
               txtPais=Tabla.getValueAt(fsel, csel).toString();
               break;
           }
                                }
                                
                            }      
                            modelo=(DefaultTableModel)Tabla.getModel();
                            Pais=txtPais;
                            
                            
                   
                      File archivo1 = new File("D:/Escritorio/Proyecto-Final/src/archivos/productosCongelados.txt");
                      File outputFile = new File("D:/Escritorio/Proyecto-Final/src/archivos/productosCongelados.txt");
                      
                      for(int i = 0; i< Pf.size();i++){
                            ProductoFresco Fres = Pf.get(i);
                            if(Fres.getCodigoDeProducto() == (Tabla.getValueAt(fsel, 0).toString())){
                                Pf.remove(i);
                                Fres.setPaisOrigen(Pais);
                                Pf.add(Fres);
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
                                    modelo.setValueAt(Pais,fsel,csel);
                                    }catch (Exception e){
                            e.printStackTrace();
                   }

                                
                            }
                        }
                      }
                   }else{
                           JOptionPane.showMessageDialog(null, "Este producto no lleva pais de origen", "Error", JOptionPane.ERROR_MESSAGE);
                       }
               }
               } catch (Exception e){}
                break;
                     }
        }else{
            JOptionPane.showMessageDialog(null, "Debe de seleccionar un producto", "Error", JOptionPane.ERROR_MESSAGE);
        }
        Tabla.clearSelection();
    }//GEN-LAST:event_btnModificarProductoActionPerformed

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

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
        Tabla.clearSelection();
    }//GEN-LAST:event_formMouseClicked
public boolean comprobarText(String campo){
    boolean resultado;
    
        try {
            resultado = false;
                for(char c : campo.toCharArray()){
                    if(Character.isDigit(c)){
                        resultado = false;
                        break;
                    }else{
                        
                        
                            
                        resultado=true;
                        
                    }
                    
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
public boolean comprobarCampo(String campo){
    boolean resultado;
        try {
            int numero =  Integer.parseInt(campo);
            resultado = false;
            if(numero > 0){
                resultado = true;
            }

        } catch (NumberFormatException excepcion) {
            resultado = false;
        }

        return resultado;
    
    }
public boolean comprobarDia(String dia, String mes){
    boolean resultado;
        try {
            int Dia =  Integer.parseInt(dia);
            int Mes =  Integer.parseInt(mes);
            resultado = false;
            if(Mes == 1 || Mes == 3 || Mes == 5 || Mes == 7 || Mes == 8 || Mes == 10 || Mes == 12){
                if(Dia > 0 && Dia < 32 )
                resultado = true;
            }
            else{
                if(Mes == 4 || Mes == 6 || Mes == 9 || Mes == 11){
                    if(Dia > 0 && Dia < 31 )
                        resultado = true;
                    }
                else{
                    if(Mes == 2){
                        if(Dia > 0 && Dia < 29)
                            resultado = true;
                    }
                }
            }

        } catch (NumberFormatException excepcion) {
            resultado = false;
        }

        return resultado;
    
    }
public boolean comprobarMes(String mes){
    boolean resultado;
        try {
            int numero =  Integer.parseInt(mes);
            resultado = false;
            if(numero > 0 && numero <13){
                resultado = true;
            }

        } catch (NumberFormatException excepcion) {
            resultado = false;
        }

        return resultado;
    
    }
public boolean comprobarAnio(String anio){
    boolean resultado;
        try {
            int numero =  Integer.parseInt(anio);
            resultado = false;
            if(numero > 2019&& numero <2023){
                resultado = true;
            }

        } catch (NumberFormatException excepcion) {
            resultado = false;
        }

        return resultado;
    
    }
public boolean comprobarCod(String campo){
    boolean resultado;
        try {
            resultado = false;
                for(char c : campo.toCharArray()){
                    if(!Character.isDigit(c)){
                        resultado = false;
                    }
                    
                }
                if(campo.toCharArray().length > 11 && campo.toCharArray().length <=12){
                    for(char c : campo.toCharArray()){
                        if(c != '-' ){
                            if(!Character.isDigit(c)){
                                resultado = false;
                                break;
                            }else{
                                resultado = true;
                                 System.out.println(campo.toCharArray().length);
                            }
                        }else{
                            break;
                        }
                    }
                }
            

        } catch (NumberFormatException excepcion) {
            resultado = false;
        }

        return resultado;
    
    }

public boolean comprobarTemp(String campo){
    boolean resultado;
        try {
            int numero =  Integer.parseInt(campo);
            resultado = false;
            if(numero > -24 && numero < 0){
                resultado = true;
            }

        } catch (NumberFormatException excepcion) {
            resultado = false;
        }

        return resultado;
    
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
            java.util.logging.Logger.getLogger(VentanaModificarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaModificarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaModificarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaModificarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaModificarProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LabelAñadirNuevoProducto;
    private rojerusan.RSTableMetro1 Tabla;
    private javax.swing.JButton btnModificarProducto;
    private javax.swing.JPanel contenedor;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel2;
    private LIB.JPanelRound jPanelRound1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
