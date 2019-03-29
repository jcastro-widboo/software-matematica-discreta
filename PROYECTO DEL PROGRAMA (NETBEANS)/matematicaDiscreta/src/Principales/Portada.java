/*
 * Autor: Jorge Castro, Cristhian Ampudia, Miguel Calderón.
 * Software: MATEMATICA DISCRETA
 * Fecha: 15/07/2016
 * Hora: 9:00
 * Version: 2.0
 */

package Principales;

import javax.swing.ImageIcon;

public class Portada extends javax.swing.JFrame {

//Componentes caracteristicos de la venta.
    public Portada() {

        initComponents();
        this.setTitle("Programas - Matemática Discreta");
        setLocationRelativeTo(null);
        Thread Hilo = new Principales.CargarBarra(JPBarraDeProgreso);
        Hilo.start();
        setResizable(false);
        setDefaultCloseOperation(0);
        setIconImage(new ImageIcon(getClass().getResource("/img/favicon.png")).getImage());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPBarraDeProgreso = new javax.swing.JProgressBar();
        JLFondoVentana = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(484, 210));
        setPreferredSize(new java.awt.Dimension(484, 210));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPBarraDeProgreso.setForeground(new java.awt.Color(0, 153, 0));
        JPBarraDeProgreso.setToolTipText("");
        JPBarraDeProgreso.setBorderPainted(false);
        JPBarraDeProgreso.setName(""); // NOI18N
        JPBarraDeProgreso.setStringPainted(true);
        JPBarraDeProgreso.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                JPBarraDeProgresoStateChanged(evt);
            }
        });
        getContentPane().add(JPBarraDeProgreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 480, 20));

        JLFondoVentana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/portada.png"))); // NOI18N
        JLFondoVentana.setMaximumSize(new java.awt.Dimension(506, 230));
        JLFondoVentana.setMinimumSize(new java.awt.Dimension(506, 230));
        getContentPane().add(JLFondoVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 160));

        pack();
    }// </editor-fold>//GEN-END:initComponents

//Bloque que inicia la barra de progreso y abre la ventana del Acceso..
    private void JPBarraDeProgresoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_JPBarraDeProgresoStateChanged

        if (JPBarraDeProgreso.getValue() == 100) {
            Acceso p = new Acceso();                 
            p.setVisible(true);
            setVisible(false);

        }
        
    }//GEN-LAST:event_JPBarraDeProgresoStateChanged
        
//Metodo main.    
    public static void main(String args[]) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLFondoVentana;
    private javax.swing.JProgressBar JPBarraDeProgreso;
    // End of variables declaration//GEN-END:variables
}