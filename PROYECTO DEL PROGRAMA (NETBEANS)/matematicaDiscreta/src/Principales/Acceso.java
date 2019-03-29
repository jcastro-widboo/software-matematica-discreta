/*
 * Autor: Jorge Castro, Cristhian Ampudia, Miguel Calderón.
 * Software: MATEMATICA DISCRETA
 * Fecha: 15/07/2016
 * Hora: 9:00
 * Version: 2.0
 */

package Principales;

import javax.swing.ImageIcon;
import Graficador.*;

public class Acceso extends javax.swing.JFrame {
        
//Componentes caracteristicos de la ventana.
    public Acceso() {

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

        fondo1 = new javax.swing.JLabel();
        JDPanel = new javax.swing.JDesktopPane();
        JBCicloEuler = new javax.swing.JButton();
        JLCicloEuler = new javax.swing.JLabel();
        JLMensajeBienvenida = new javax.swing.JLabel();
        JLTituloCabecera = new javax.swing.JLabel();
        JBBotonSalir = new javax.swing.JButton();
        JBEjercicioGrafo = new javax.swing.JButton();
        JBRecorridosArbolBinario = new javax.swing.JButton();
        JLImagenEstudiante5 = new javax.swing.JLabel();
        JBEjercicioSerie = new javax.swing.JButton();
        JLEjercicioGrafo = new javax.swing.JLabel();
        JLImagenEstudiante6 = new javax.swing.JLabel();
        JLImagenEstudiante3 = new javax.swing.JLabel();
        JLImagenEstudiante4 = new javax.swing.JLabel();
        JLTituloCabecera1 = new javax.swing.JLabel();
        JLImagenAlumno1 = new javax.swing.JLabel();
        JBAlgoritmoPrim = new javax.swing.JButton();
        JLEjercicioSerie = new javax.swing.JLabel();
        JBRecorridoVerticesInternos = new javax.swing.JButton();
        JLImagenEstudiante2 = new javax.swing.JLabel();
        JLImagenEstudiante7 = new javax.swing.JLabel();
        JLImagenEstudiante8 = new javax.swing.JLabel();
        JLEjercicioGrafo1 = new javax.swing.JLabel();
        UteGrafo = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        JLImagenEstudiante9 = new javax.swing.JLabel();
        JLEjercicioGrafo2 = new javax.swing.JLabel();
        JLEjercicioGrafo3 = new javax.swing.JLabel();
        JLImagenEstudiante10 = new javax.swing.JLabel();
        JLImagenEstudiante11 = new javax.swing.JLabel();
        JLImagenEstudiante12 = new javax.swing.JLabel();
        JLEjercicioGrafo4 = new javax.swing.JLabel();
        JLEjercicioGrafo5 = new javax.swing.JLabel();
        JLEjercicioGrafo6 = new javax.swing.JLabel();
        JLFondoVentana = new javax.swing.JLabel();

        fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondoprincipal.jpg"))); // NOI18N
        fondo1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(950, 500));
        setMinimumSize(new java.awt.Dimension(950, 500));
        setPreferredSize(new java.awt.Dimension(950, 500));
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        JBCicloEuler.setForeground(new java.awt.Color(240, 240, 240));
        JBCicloEuler.setBorder(null);
        JBCicloEuler.setBorderPainted(false);
        JBCicloEuler.setContentAreaFilled(false);
        JBCicloEuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBCicloEulerActionPerformed(evt);
            }
        });
        JDPanel.add(JBCicloEuler);
        JBCicloEuler.setBounds(620, 90, 190, 140);

        JLCicloEuler.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        JLCicloEuler.setForeground(new java.awt.Color(255, 255, 255));
        JLCicloEuler.setText("Ciclo de Euler");
        JDPanel.add(JLCicloEuler);
        JLCicloEuler.setBounds(630, 160, 120, 30);

        JLMensajeBienvenida.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JLMensajeBienvenida.setForeground(new java.awt.Color(255, 255, 255));
        JLMensajeBienvenida.setText("PROGRAMAS MATEMÁTICA DISCRETA");
        JDPanel.add(JLMensajeBienvenida);
        JLMensajeBienvenida.setBounds(240, 20, 460, 30);

        JLTituloCabecera.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JLTituloCabecera.setForeground(new java.awt.Color(255, 255, 255));
        JLTituloCabecera.setText("Jorge Castro, Cristhian Ampudia, Miguel Calderón.");
        JDPanel.add(JLTituloCabecera);
        JLTituloCabecera.setBounds(20, 440, 310, 20);

        JBBotonSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        JBBotonSalir.setForeground(new java.awt.Color(255, 255, 255));
        JBBotonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salirinicio1.png"))); // NOI18N
        JBBotonSalir.setText("Salir");
        JBBotonSalir.setBorder(null);
        JBBotonSalir.setBorderPainted(false);
        JBBotonSalir.setContentAreaFilled(false);
        JBBotonSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBBotonSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBBotonSalir.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        JBBotonSalir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JBBotonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBotonSalirActionPerformed(evt);
            }
        });
        JDPanel.add(JBBotonSalir);
        JBBotonSalir.setBounds(875, 390, 60, 70);

        JBEjercicioGrafo.setForeground(new java.awt.Color(240, 240, 240));
        JBEjercicioGrafo.setBorder(null);
        JBEjercicioGrafo.setBorderPainted(false);
        JBEjercicioGrafo.setContentAreaFilled(false);
        JBEjercicioGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEjercicioGrafoActionPerformed(evt);
            }
        });
        JDPanel.add(JBEjercicioGrafo);
        JBEjercicioGrafo.setBounds(380, 90, 200, 140);

        JBRecorridosArbolBinario.setForeground(new java.awt.Color(240, 240, 240));
        JBRecorridosArbolBinario.setBorder(null);
        JBRecorridosArbolBinario.setBorderPainted(false);
        JBRecorridosArbolBinario.setContentAreaFilled(false);
        JBRecorridosArbolBinario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBRecorridosArbolBinarioActionPerformed(evt);
            }
        });
        JDPanel.add(JBRecorridosArbolBinario);
        JBRecorridosArbolBinario.setBounds(370, 260, 210, 160);

        JLImagenEstudiante5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/inicios.png"))); // NOI18N
        JDPanel.add(JLImagenEstudiante5);
        JLImagenEstudiante5.setBounds(420, 270, 50, 50);

        JBEjercicioSerie.setForeground(new java.awt.Color(240, 240, 240));
        JBEjercicioSerie.setBorder(null);
        JBEjercicioSerie.setBorderPainted(false);
        JBEjercicioSerie.setContentAreaFilled(false);
        JBEjercicioSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBEjercicioSerieActionPerformed(evt);
            }
        });
        JDPanel.add(JBEjercicioSerie);
        JBEjercicioSerie.setBounds(140, 90, 200, 140);

        JLEjercicioGrafo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        JLEjercicioGrafo.setForeground(new java.awt.Color(255, 255, 255));
        JLEjercicioGrafo.setText("Ejercicio Grafo");
        JDPanel.add(JLEjercicioGrafo);
        JLEjercicioGrafo.setBounds(390, 160, 120, 30);

        JLImagenEstudiante6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dedo.png"))); // NOI18N
        JDPanel.add(JLImagenEstudiante6);
        JLImagenEstudiante6.setBounds(750, 140, 50, 80);

        JLImagenEstudiante3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/inicios.png"))); // NOI18N
        JDPanel.add(JLImagenEstudiante3);
        JLImagenEstudiante3.setBounds(420, 100, 50, 50);

        JLImagenEstudiante4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dedo.png"))); // NOI18N
        JDPanel.add(JLImagenEstudiante4);
        JLImagenEstudiante4.setBounds(520, 140, 50, 80);

        JLTituloCabecera1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        JLTituloCabecera1.setForeground(new java.awt.Color(255, 255, 255));
        JLTituloCabecera1.setText("widboo.com © 2016");
        JDPanel.add(JLTituloCabecera1);
        JLTituloCabecera1.setBounds(60, 20, 140, 40);

        JLImagenAlumno1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/inicios.png"))); // NOI18N
        JDPanel.add(JLImagenAlumno1);
        JLImagenAlumno1.setBounds(180, 100, 50, 50);

        JBAlgoritmoPrim.setForeground(new java.awt.Color(240, 240, 240));
        JBAlgoritmoPrim.setBorder(null);
        JBAlgoritmoPrim.setBorderPainted(false);
        JBAlgoritmoPrim.setContentAreaFilled(false);
        JBAlgoritmoPrim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBAlgoritmoPrimActionPerformed(evt);
            }
        });
        JDPanel.add(JBAlgoritmoPrim);
        JBAlgoritmoPrim.setBounds(140, 260, 200, 160);

        JLEjercicioSerie.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        JLEjercicioSerie.setForeground(new java.awt.Color(255, 255, 255));
        JLEjercicioSerie.setText("Ejercicio Serie");
        JDPanel.add(JLEjercicioSerie);
        JLEjercicioSerie.setBounds(150, 160, 120, 30);

        JBRecorridoVerticesInternos.setForeground(new java.awt.Color(240, 240, 240));
        JBRecorridoVerticesInternos.setBorder(null);
        JBRecorridoVerticesInternos.setBorderPainted(false);
        JBRecorridoVerticesInternos.setContentAreaFilled(false);
        JBRecorridoVerticesInternos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBRecorridoVerticesInternosActionPerformed(evt);
            }
        });
        JDPanel.add(JBRecorridoVerticesInternos);
        JBRecorridoVerticesInternos.setBounds(600, 260, 220, 160);

        JLImagenEstudiante2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dedo.png"))); // NOI18N
        JDPanel.add(JLImagenEstudiante2);
        JLImagenEstudiante2.setBounds(280, 330, 50, 81);

        JLImagenEstudiante7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/inicios.png"))); // NOI18N
        JDPanel.add(JLImagenEstudiante7);
        JLImagenEstudiante7.setBounds(180, 270, 50, 50);

        JLImagenEstudiante8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/inicios.png"))); // NOI18N
        JDPanel.add(JLImagenEstudiante8);
        JLImagenEstudiante8.setBounds(660, 270, 50, 50);

        JLEjercicioGrafo1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        JLEjercicioGrafo1.setForeground(new java.awt.Color(255, 255, 255));
        JLEjercicioGrafo1.setText("Árboles Binarios");
        JDPanel.add(JLEjercicioGrafo1);
        JLEjercicioGrafo1.setBounds(380, 360, 140, 20);

        UteGrafo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        UteGrafo.setForeground(new java.awt.Color(255, 255, 255));
        UteGrafo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BANNER2.png"))); // NOI18N
        UteGrafo.setBorder(null);
        UteGrafo.setBorderPainted(false);
        UteGrafo.setContentAreaFilled(false);
        UteGrafo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UteGrafo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        UteGrafo.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        UteGrafo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        UteGrafo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UteGrafoActionPerformed(evt);
            }
        });
        JDPanel.add(UteGrafo);
        UteGrafo.setBounds(20, 190, 100, 110);
        JDPanel.add(jSeparator1);
        jSeparator1.setBounds(100, 240, 750, 10);

        JLImagenEstudiante9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/inicios.png"))); // NOI18N
        JDPanel.add(JLImagenEstudiante9);
        JLImagenEstudiante9.setBounds(660, 100, 50, 50);

        JLEjercicioGrafo2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        JLEjercicioGrafo2.setForeground(new java.awt.Color(255, 255, 255));
        JLEjercicioGrafo2.setText(" Prim");
        JDPanel.add(JLEjercicioGrafo2);
        JLEjercicioGrafo2.setBounds(180, 360, 50, 20);

        JLEjercicioGrafo3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        JLEjercicioGrafo3.setForeground(new java.awt.Color(255, 255, 255));
        JLEjercicioGrafo3.setText("Árbol Binario");
        JDPanel.add(JLEjercicioGrafo3);
        JLEjercicioGrafo3.setBounds(630, 360, 110, 20);

        JLImagenEstudiante10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dedo.png"))); // NOI18N
        JDPanel.add(JLImagenEstudiante10);
        JLImagenEstudiante10.setBounds(520, 330, 50, 81);

        JLImagenEstudiante11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dedo.png"))); // NOI18N
        JDPanel.add(JLImagenEstudiante11);
        JLImagenEstudiante11.setBounds(760, 330, 50, 81);

        JLImagenEstudiante12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dedo.png"))); // NOI18N
        JDPanel.add(JLImagenEstudiante12);
        JLImagenEstudiante12.setBounds(280, 140, 50, 81);

        JLEjercicioGrafo4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        JLEjercicioGrafo4.setForeground(new java.awt.Color(255, 255, 255));
        JLEjercicioGrafo4.setText("Algoritmo de");
        JDPanel.add(JLEjercicioGrafo4);
        JLEjercicioGrafo4.setBounds(150, 330, 110, 30);

        JLEjercicioGrafo5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        JLEjercicioGrafo5.setForeground(new java.awt.Color(255, 255, 255));
        JLEjercicioGrafo5.setText("Recorridos en");
        JDPanel.add(JLEjercicioGrafo5);
        JLEjercicioGrafo5.setBounds(390, 330, 120, 30);

        JLEjercicioGrafo6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        JLEjercicioGrafo6.setForeground(new java.awt.Color(255, 255, 255));
        JLEjercicioGrafo6.setText("Vértices Internos");
        JDPanel.add(JLEjercicioGrafo6);
        JLEjercicioGrafo6.setBounds(610, 330, 140, 30);

        JLFondoVentana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/fondoprincipal.jpg"))); // NOI18N
        JLFondoVentana.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        JDPanel.add(JLFondoVentana);
        JLFondoVentana.setBounds(0, 0, 950, 500);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JDPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 949, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JDPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        
    }//GEN-LAST:event_formWindowGainedFocus

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained

    }//GEN-LAST:event_formFocusGained

//Boton de acceso a la ventana ejercicioSerie.    
    private void JBEjercicioSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEjercicioSerieActionPerformed

        new ejercicioSerie(this, true).setVisible(true);

    }//GEN-LAST:event_JBEjercicioSerieActionPerformed

//Boton para salir del sistema.    
    private void JBBotonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBotonSalirActionPerformed

        System.exit(0);

    }//GEN-LAST:event_JBBotonSalirActionPerformed

//Boton de acceso a la ventana cicloEuler.    
    private void JBCicloEulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBCicloEulerActionPerformed

        new cicloEuler(this, true).setVisible(true);
        new cicloEulerMatrizA(this, true).setVisible(true);

    }//GEN-LAST:event_JBCicloEulerActionPerformed

//Boton de acceso a la ventana ejercicioGrafo.
    private void JBEjercicioGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBEjercicioGrafoActionPerformed
       
        new ejercicioGrafo(this, true).setVisible(true);
        
    }//GEN-LAST:event_JBEjercicioGrafoActionPerformed

//Boton de acceso a la ventana algoritmoPrim.
    private void JBAlgoritmoPrimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBAlgoritmoPrimActionPerformed
      
        new algoritmoPrim(this, true).setVisible(true);
        
    }//GEN-LAST:event_JBAlgoritmoPrimActionPerformed

//Boton de acceso a la ventana recorridosArbolBinario.
    private void JBRecorridosArbolBinarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBRecorridosArbolBinarioActionPerformed
        
        new recorridosArbolBinario(this, true).setVisible(true);
        
    }//GEN-LAST:event_JBRecorridosArbolBinarioActionPerformed

//Boton de acceso a la ventana recorridoVerticesInternos.
    private void JBRecorridoVerticesInternosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBRecorridoVerticesInternosActionPerformed
        
        new recorridoVerticesInternos(this, true).setVisible(true);
        
    }//GEN-LAST:event_JBRecorridoVerticesInternosActionPerformed

    private void UteGrafoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UteGrafoActionPerformed
        
        new Grafo().init();
        
    }//GEN-LAST:event_UteGrafoActionPerformed

//Metodo main.    
    public static void main(String args[]) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBAlgoritmoPrim;
    private javax.swing.JButton JBBotonSalir;
    private javax.swing.JButton JBCicloEuler;
    private javax.swing.JButton JBEjercicioGrafo;
    private javax.swing.JButton JBEjercicioSerie;
    private javax.swing.JButton JBRecorridoVerticesInternos;
    private javax.swing.JButton JBRecorridosArbolBinario;
    private javax.swing.JDesktopPane JDPanel;
    private javax.swing.JLabel JLCicloEuler;
    private javax.swing.JLabel JLEjercicioGrafo;
    private javax.swing.JLabel JLEjercicioGrafo1;
    private javax.swing.JLabel JLEjercicioGrafo2;
    private javax.swing.JLabel JLEjercicioGrafo3;
    private javax.swing.JLabel JLEjercicioGrafo4;
    private javax.swing.JLabel JLEjercicioGrafo5;
    private javax.swing.JLabel JLEjercicioGrafo6;
    private javax.swing.JLabel JLEjercicioSerie;
    private javax.swing.JLabel JLFondoVentana;
    private javax.swing.JLabel JLImagenAlumno1;
    private javax.swing.JLabel JLImagenEstudiante10;
    private javax.swing.JLabel JLImagenEstudiante11;
    private javax.swing.JLabel JLImagenEstudiante12;
    private javax.swing.JLabel JLImagenEstudiante2;
    private javax.swing.JLabel JLImagenEstudiante3;
    private javax.swing.JLabel JLImagenEstudiante4;
    private javax.swing.JLabel JLImagenEstudiante5;
    private javax.swing.JLabel JLImagenEstudiante6;
    private javax.swing.JLabel JLImagenEstudiante7;
    private javax.swing.JLabel JLImagenEstudiante8;
    private javax.swing.JLabel JLImagenEstudiante9;
    private javax.swing.JLabel JLMensajeBienvenida;
    private javax.swing.JLabel JLTituloCabecera;
    private javax.swing.JLabel JLTituloCabecera1;
    private javax.swing.JButton UteGrafo;
    private javax.swing.JLabel fondo1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}