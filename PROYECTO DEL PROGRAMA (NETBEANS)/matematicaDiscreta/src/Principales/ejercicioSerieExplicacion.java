/*
 * Autor: Jorge Castro, Cristhian Ampudia, Miguel Calderón.
 * Software: MATEMATICA DISCRETA
 * Fecha: 15/07/2016
 * Hora: 9:00
 * Version: 2.0
 */

package Principales;

import javax.swing.ImageIcon;

public class ejercicioSerieExplicacion extends javax.swing.JDialog {

//Componentes caracteristicos de la venta.    
    public ejercicioSerieExplicacion(java.awt.Dialog parent, boolean modal) {

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
        JLTextoBienvenida4 = new javax.swing.JLabel();
        JLFondoVentana = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(540, 400));
        setMinimumSize(new java.awt.Dimension(540, 400));

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
        JBSalir.setBounds(450, 320, 70, 60);

        JLTextoBienvenida.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JLTextoBienvenida.setForeground(new java.awt.Color(255, 255, 255));
        JLTextoBienvenida.setText("EXPLICACIÓN SERIE");
        JDPanel.add(JLTextoBienvenida);
        JLTextoBienvenida.setBounds(140, 90, 270, 30);

        JLBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/g3014.png"))); // NOI18N
        JDPanel.add(JLBanner);
        JLBanner.setBounds(190, 10, 160, 70);

        JLTextoBienvenida1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JLTextoBienvenida1.setForeground(new java.awt.Color(255, 255, 255));
        JLTextoBienvenida1.setText("Problema.-");
        JDPanel.add(JLTextoBienvenida1);
        JLTextoBienvenida1.setBounds(20, 150, 190, 30);

        JLTextoBienvenida2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JLTextoBienvenida2.setForeground(new java.awt.Color(255, 255, 255));
        JLTextoBienvenida2.setText("Escriba un programa que muestre los n elementos de la serie:");
        JDPanel.add(JLTextoBienvenida2);
        JLTextoBienvenida2.setBounds(30, 200, 500, 30);

        JLTextoBienvenida4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JLTextoBienvenida4.setForeground(new java.awt.Color(255, 255, 255));
        JLTextoBienvenida4.setText("1 , 1 , 2 , 4 , 16 , 128 , 4096 ...");
        JDPanel.add(JLTextoBienvenida4);
        JLTextoBienvenida4.setBounds(30, 260, 260, 20);

        JLFondoVentana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/azul.jpg"))); // NOI18N
        JLFondoVentana.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        JDPanel.add(JLFondoVentana);
        JLFondoVentana.setBounds(0, 0, 560, 420);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JDPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JDPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
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
    private javax.swing.JLabel JLFondoVentana;
    private javax.swing.JLabel JLTextoBienvenida;
    private javax.swing.JLabel JLTextoBienvenida1;
    private javax.swing.JLabel JLTextoBienvenida2;
    private javax.swing.JLabel JLTextoBienvenida4;
    // End of variables declaration//GEN-END:variables
}