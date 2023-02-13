/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import javax.swing.JOptionPane;
import javax.swing.UIManager;
import rojerusan.RSAnimation;





/**
 *
 * @author Guffy
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    
    
    
    int xMouse;
    int yMouse;
    public VentanaPrincipal() {
        initComponents();
       
     
        RSAnimation.setBajar(-50, 200, 2, 2, this);
       this.setLocationRelativeTo(null);
       try{
            
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            
        }
        catch (Exception e){
            
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
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanelRound1 = new LIB.JPanelRound();
        jButton7 = new javax.swing.JButton();
        labelVerCatalogo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        contenedor.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/verCatalogo.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/VerCatalogoOVER.png"))); // NOI18N
        jButton1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton1MouseMoved(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        contenedor.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 200, 50));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Clientes.png"))); // NOI18N
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ClientesOVER.png"))); // NOI18N
        jButton3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton3MouseMoved(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        contenedor.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, 200, 50));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gestionarProductos.png"))); // NOI18N
        jButton4.setBorderPainted(false);
        jButton4.setContentAreaFilled(false);
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/GestionarProductosOVER.png"))); // NOI18N
        jButton4.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton4MouseMoved(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        contenedor.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, 200, 50));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/consultarOVER.png"))); // NOI18N
        jButton5.setBorderPainted(false);
        jButton5.setContentAreaFilled(false);
        jButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/consultar.png"))); // NOI18N
        jButton5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jButton5MouseMoved(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        contenedor.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 410, 200, 50));

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
        labelVerCatalogo.setText("Sistema De Ventas");

        javax.swing.GroupLayout jPanelRound1Layout = new javax.swing.GroupLayout(jPanelRound1);
        jPanelRound1.setLayout(jPanelRound1Layout);
        jPanelRound1Layout.setHorizontalGroup(
            jPanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRound1Layout.createSequentialGroup()
                .addContainerGap(499, Short.MAX_VALUE)
                .addComponent(labelVerCatalogo)
                .addGap(412, 412, 412)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        jPanelRound1Layout.setVerticalGroup(
            jPanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRound1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelVerCatalogo)
                    .addComponent(jButton7))
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

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
    
        JOptionPane.showMessageDialog(null, "En Construccion");
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        VentanaConsultar nuevaCon = new VentanaConsultar();
        nuevaCon.setVisible(true);
        this.dispose();
       
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        VentanaGestionarProductos nuevaGes = new VentanaGestionarProductos();
        nuevaGes.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

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

    private void jButton3MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseMoved
        // TODO add your handling code here:
        RSAnimation.setMoverDerecha(470, 471, 1, 1, jButton3);

    }//GEN-LAST:event_jButton3MouseMoved

    private void jButton1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseMoved
        // TODO add your handling code here:
        RSAnimation.setMoverDerecha(470, 471, 1, 1, jButton1);
    }//GEN-LAST:event_jButton1MouseMoved

    private void jButton4MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseMoved
        // TODO add your handling code here:
        RSAnimation.setMoverDerecha(470, 471, 1, 1, jButton4);
    }//GEN-LAST:event_jButton4MouseMoved

    private void jButton5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseMoved
        // TODO add your handling code here:
        RSAnimation.setMoverDerecha(470, 471, 1, 1, jButton5);
    }//GEN-LAST:event_jButton5MouseMoved

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        VentanaVerCatalogo nuevo = new VentanaVerCatalogo();
        nuevo.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel contenedor;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private LIB.JPanelRound jPanelRound1;
    private javax.swing.JLabel labelVerCatalogo;
    // End of variables declaration//GEN-END:variables
}