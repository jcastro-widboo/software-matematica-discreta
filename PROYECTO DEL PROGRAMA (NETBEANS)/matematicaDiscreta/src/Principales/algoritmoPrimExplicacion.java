/*
 * Autor: Jorge Castro, Cristhian Ampudia, Miguel Calderón.
 * Software: MATEMATICA DISCRETA
 * Fecha: 15/07/2016
 * Hora: 9:00
 * Version: 2.0
 */

package Principales;

import javax.swing.ImageIcon;

public class algoritmoPrimExplicacion extends javax.swing.JDialog {
    
//Componentes caracteristicos de la venta.    
    public algoritmoPrimExplicacion(java.awt.Dialog parent, boolean modal) {

        super(parent, modal);
        initComponents();
        this.setTitle("Programas - Matemática Discreta");
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(0);
        setIconImage(new ImageIcon(getClass().getResource("/img/favicon.png")).getImage());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JDPanel = new javax.swing.JDesktopPane();
        JBSalir = new javax.swing.JButton();
        JLTextoBienvenida = new javax.swing.JLabel();
        JLBanner = new javax.swing.JLabel();
        JLTextoBienvenida1 = new javax.swing.JLabel();
        JLTextoBienvenida2 = new javax.swing.JLabel();
        JLBanner1 = new javax.swing.JLabel();
        JLFondoVentana = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(680, 501));

        JBSalir.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JBSalir.setForeground(new java.awt.Color(255, 255, 255));
        JBSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/apagar.png"))); // NOI18N
        JBSalir.setText("Salir");
        JBSalir.setBorder(null);
        JBSalir.setBorderPainted(false);
        JBSalir.setContentAreaFilled(false);
        JBSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBSalir.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        JBSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSalirActionPerformed(evt);
            }
        });
        JDPanel.add(JBSalir);
        JBSalir.setBounds(590, 420, 70, 60);

        JLTextoBienvenida.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JLTextoBienvenida.setForeground(new java.awt.Color(255, 255, 255));
        JLTextoBienvenida.setText("EXPLICACIÓN ALGORITMO DE PRIM");
        JDPanel.add(JLTextoBienvenida);
        JLTextoBienvenida.setBounds(120, 90, 440, 30);

        JLBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/image2995.png"))); // NOI18N
        JDPanel.add(JLBanner);
        JLBanner.setBounds(40, 240, 500, 200);

        JLTextoBienvenida1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JLTextoBienvenida1.setForeground(new java.awt.Color(255, 255, 255));
        JLTextoBienvenida1.setText("Problema.-");
        JDPanel.add(JLTextoBienvenida1);
        JLTextoBienvenida1.setBounds(20, 130, 600, 30);

        JLTextoBienvenida2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JLTextoBienvenida2.setForeground(new java.awt.Color(255, 255, 255));
        JLTextoBienvenida2.setText("Escriba un programa que aplique el algoritmo de Prim.");
        JDPanel.add(JLTextoBienvenida2);
        JLTextoBienvenida2.setBounds(40, 180, 540, 30);

        JLBanner1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/g3014.png"))); // NOI18N
        JDPanel.add(JLBanner1);
        JLBanner1.setBounds(260, 10, 160, 70);

        JLFondoVentana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/azul.jpg"))); // NOI18N
        JLFondoVentana.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        JDPanel.add(JLFondoVentana);
        JLFondoVentana.setBounds(0, 0, 700, 520);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JDPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JDPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//Boton para salir de la ventana. 
    private void JBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSalirActionPerformed
        
        dispose();
        
    }//GEN-LAST:event_JBSalirActionPerformed

//Metodo main.    
    public static void main(String args[]) {

        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBSalir;
    private javax.swing.JDesktopPane JDPanel;
    private javax.swing.JLabel JLBanner;
    private javax.swing.JLabel JLBanner1;
    private javax.swing.JLabel JLFondoVentana;
    private javax.swing.JLabel JLTextoBienvenida;
    private javax.swing.JLabel JLTextoBienvenida1;
    private javax.swing.JLabel JLTextoBienvenida2;
    // End of variables declaration//GEN-END:variables
}