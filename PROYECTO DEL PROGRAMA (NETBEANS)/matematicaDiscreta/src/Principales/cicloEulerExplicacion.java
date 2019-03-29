/*
 * Autor: Jorge Castro, Cristhian Ampudia, Miguel Calderón.
 * Software: MATEMATICA DISCRETA
 * Fecha: 15/07/2016
 * Hora: 9:00
 * Version: 2.0
 */

package Principales;

import javax.swing.ImageIcon;

public class cicloEulerExplicacion extends javax.swing.JDialog {

//Componentes caracteristicos de la venta.    
    public cicloEulerExplicacion(java.awt.Dialog parent, boolean modal) {

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
        JLTextoBienvenida1 = new javax.swing.JLabel();
        JLTextoBienvenida2 = new javax.swing.JLabel();
        JLBanner3 = new javax.swing.JLabel();
        JLBanner4 = new javax.swing.JLabel();
        JLBanner5 = new javax.swing.JLabel();
        JLFondoVentana = new javax.swing.JLabel();

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
        JBSalir.setBounds(590, 370, 70, 60);

        JLTextoBienvenida.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JLTextoBienvenida.setForeground(new java.awt.Color(255, 255, 255));
        JLTextoBienvenida.setText("EXPLICACIÓN EULER");
        JDPanel.add(JLTextoBienvenida);
        JLTextoBienvenida.setBounds(200, 90, 270, 30);

        JLTextoBienvenida1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JLTextoBienvenida1.setForeground(new java.awt.Color(255, 255, 255));
        JLTextoBienvenida1.setText("Problema.-");
        JDPanel.add(JLTextoBienvenida1);
        JLTextoBienvenida1.setBounds(20, 130, 190, 30);

        JLTextoBienvenida2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JLTextoBienvenida2.setForeground(new java.awt.Color(255, 255, 255));
        JLTextoBienvenida2.setText("Escriba un programa que determine si una gráfica contiene un ciclo de Euler.");
        JDPanel.add(JLTextoBienvenida2);
        JLTextoBienvenida2.setBounds(40, 180, 620, 30);

        JLBanner3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ciclo1.png"))); // NOI18N
        JDPanel.add(JLBanner3);
        JLBanner3.setBounds(320, 240, 250, 160);

        JLBanner4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/g3014.png"))); // NOI18N
        JDPanel.add(JLBanner4);
        JLBanner4.setBounds(260, 10, 160, 70);

        JLBanner5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/camino1.png"))); // NOI18N
        JDPanel.add(JLBanner5);
        JLBanner5.setBounds(40, 240, 250, 160);

        JLFondoVentana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/azul.jpg"))); // NOI18N
        JLFondoVentana.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        JDPanel.add(JLFondoVentana);
        JLFondoVentana.setBounds(0, 0, 680, 460);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JDPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JDPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
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
    private javax.swing.JLabel JLBanner3;
    private javax.swing.JLabel JLBanner4;
    private javax.swing.JLabel JLBanner5;
    private javax.swing.JLabel JLFondoVentana;
    private javax.swing.JLabel JLTextoBienvenida;
    private javax.swing.JLabel JLTextoBienvenida1;
    private javax.swing.JLabel JLTextoBienvenida2;
    // End of variables declaration//GEN-END:variables
}