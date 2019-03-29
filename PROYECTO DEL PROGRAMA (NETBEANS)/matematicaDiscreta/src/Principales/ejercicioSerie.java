/*
 * Autor: Jorge Castro, Cristhian Ampudia, Miguel Calderón.
 * Software: MATEMATICA DISCRETA
 * Fecha: 15/07/2016
 * Hora: 9:00
 * Version: 2.0
 */

package Principales;

import java.awt.event.KeyEvent;
import java.math.BigInteger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class ejercicioSerie extends javax.swing.JDialog {

//Componentes caracteristicos de la venta.
    public ejercicioSerie(java.awt.Frame parent, boolean modal) {

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
        JLBienvenida = new javax.swing.JLabel();
        JLBanner = new javax.swing.JLabel();
        JLTextoBienvenida = new javax.swing.JLabel();
        ingreso = new javax.swing.JTextField();
        JBIngresar = new javax.swing.JButton();
        JBReiniciar = new javax.swing.JButton();
        JLTextoBienvenida1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        resultado = new javax.swing.JTextArea();
        JBSalir2 = new javax.swing.JButton();
        JLFondoVentana = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(395, 530));

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
        JBSalir.setBounds(580, 430, 80, 60);

        JLBienvenida.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JLBienvenida.setForeground(new java.awt.Color(255, 255, 255));
        JLBienvenida.setText("EJERCICIO SERIE");
        JDPanel.add(JLBienvenida);
        JLBienvenida.setBounds(230, 90, 220, 30);

        JLBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/g3014.png"))); // NOI18N
        JDPanel.add(JLBanner);
        JLBanner.setBounds(260, 10, 150, 70);

        JLTextoBienvenida.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JLTextoBienvenida.setForeground(new java.awt.Color(255, 255, 255));
        JLTextoBienvenida.setText("Ingrese el número de sucesiones de la serie: ");
        JDPanel.add(JLTextoBienvenida);
        JLTextoBienvenida.setBounds(20, 160, 360, 30);

        ingreso.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ingreso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ingreso.setText("7");
        ingreso.setBorder(null);
        ingreso.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresoMouseClicked(evt);
            }
        });
        ingreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresoActionPerformed(evt);
            }
        });
        ingreso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ingresoKeyTyped(evt);
            }
        });
        JDPanel.add(ingreso);
        ingreso.setBounds(380, 160, 120, 30);

        JBIngresar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JBIngresar.setForeground(new java.awt.Color(255, 255, 255));
        JBIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/matematicadiscreta/icons/add.png"))); // NOI18N
        JBIngresar.setText("Aceptar");
        JBIngresar.setBorder(null);
        JBIngresar.setBorderPainted(false);
        JBIngresar.setContentAreaFilled(false);
        JBIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBIngresar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBIngresar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        JBIngresar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JBIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBIngresarActionPerformed(evt);
            }
        });
        JDPanel.add(JBIngresar);
        JBIngresar.setBounds(520, 160, 50, 35);

        JBReiniciar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JBReiniciar.setForeground(new java.awt.Color(255, 255, 255));
        JBReiniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/matematicadiscreta/icons/arrow_refresh.png"))); // NOI18N
        JBReiniciar.setText("Reiniciar");
        JBReiniciar.setBorder(null);
        JBReiniciar.setBorderPainted(false);
        JBReiniciar.setContentAreaFilled(false);
        JBReiniciar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBReiniciar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBReiniciar.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        JBReiniciar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JBReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBReiniciarActionPerformed(evt);
            }
        });
        JDPanel.add(JBReiniciar);
        JBReiniciar.setBounds(600, 160, 50, 35);

        JLTextoBienvenida1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JLTextoBienvenida1.setForeground(new java.awt.Color(255, 255, 255));
        JLTextoBienvenida1.setText("Serie resultante:");
        JDPanel.add(JLTextoBienvenida1);
        JLTextoBienvenida1.setBounds(20, 200, 200, 30);

        resultado.setEditable(false);
        resultado.setColumns(20);
        resultado.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        resultado.setRows(5);
        resultado.setBorder(null);
        jScrollPane1.setViewportView(resultado);

        JDPanel.add(jScrollPane1);
        jScrollPane1.setBounds(20, 230, 640, 190);

        JBSalir2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JBSalir2.setForeground(new java.awt.Color(255, 255, 255));
        JBSalir2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir.png"))); // NOI18N
        JBSalir2.setText("Explicación");
        JBSalir2.setBorder(null);
        JBSalir2.setBorderPainted(false);
        JBSalir2.setContentAreaFilled(false);
        JBSalir2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBSalir2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBSalir2.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        JBSalir2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JBSalir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBSalir2ActionPerformed(evt);
            }
        });
        JDPanel.add(JBSalir2);
        JBSalir2.setBounds(30, 430, 80, 60);

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
            .addComponent(JDPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//Boton para salir de la ventana. 
    private void JBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSalirActionPerformed

        JBReiniciarActionPerformed(evt);
        
        dispose();

    }//GEN-LAST:event_JBSalirActionPerformed

    private void ingresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresoActionPerformed

    }//GEN-LAST:event_ingresoActionPerformed

    private void JBIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBIngresarActionPerformed

        if ((ingreso.getText().equals(""))) {

            JOptionPane.showMessageDialog(null, "Ingrese el número de sucesiones de la serie !", "Advertencia", JOptionPane.ERROR_MESSAGE);
            return;

        }

        int n;

        String entrada = ingreso.getText();

        n = Integer.parseInt(entrada);

        if (n != 0) {

            if (n < 35) {

                BigInteger mat[] = new BigInteger[n];
                BigInteger n1 = new BigInteger("1");
                BigInteger n2 = new BigInteger("1");

                if (n == 1) {

                    dibujarLinea();
                    resultado.append(" \n");
                    resultado.append("La serie con "+n+" sucesiones es: "+"\n");
                    resultado.append(" \n");
                    resultado.append(" " + n1 + "\n");
                    dibujarLinea();

                } else if (n == 2) {

                    dibujarLinea();
                    resultado.append(" \n");
                    resultado.append("La serie con "+n+" sucesiones es: "+"\n");
                    resultado.append(" " + n1 + " , " + n2 +"\n");
                    dibujarLinea();

                } else {

                    mat[0] = new BigInteger("1");
                    mat[1] = new BigInteger("1");

                    for (int i = 2; i < n; i++) {

                        BigInteger A = mat[i - 1];
                        BigInteger B = mat[i - 2];
                        BigInteger C = new BigInteger("2");
                        mat[i] = (A.multiply(B)).multiply(C);

                    }

                    dibujarLinea();
                    resultado.append(" \n");
                    resultado.append("La serie con "+n+" sucesiones es: "+"\n");

                    for (int i = 0; i < n; i++) {

                        resultado.append(mat[i] + ", ");

                    }
                    resultado.append(" \n");
                    dibujarLinea();

                }

            } else {

                JOptionPane.showMessageDialog(this, "El número de sucesiones es muy alto para esta serie, intentalo con un número menor a 35 !", "Advertencia", JOptionPane.ERROR_MESSAGE);

            }

        } else {

            JOptionPane.showMessageDialog(this, "El número de sucesiones no puede ser 0 !", "Advertencia", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_JBIngresarActionPerformed

    private void JBReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBReiniciarActionPerformed

        ingreso.setText(null);
        resultado.setText(null);
        ingreso.setText("7");

    }//GEN-LAST:event_JBReiniciarActionPerformed

    private void JBSalir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSalir2ActionPerformed

        new ejercicioSerieExplicacion(this, true).setVisible(true);

    }//GEN-LAST:event_JBSalir2ActionPerformed

    private void ingresoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ingresoKeyTyped

        validacion(evt);

    }//GEN-LAST:event_ingresoKeyTyped

    private void ingresoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresoMouseClicked

        ingreso.setText(null);

    }//GEN-LAST:event_ingresoMouseClicked

    void dibujarLinea() {

        for (int i = 0; i < resultado.getHeight(); i++) {

            resultado.append("-");

        }

    }

    void validacion(java.awt.event.KeyEvent evt) {

        int k = (int) evt.getKeyChar();

        if (k >= 00 && k <= 00 || k >= 27 && k <= 47) {

            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "No puede ingresar caracteres, solamente números !", "Advertencia", JOptionPane.ERROR_MESSAGE);

        }

        if (k >= 58 && k <= 126 || k >= 128 && k <= 255) {

            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "No puede ingresar caracteres, solamente números !", "Advertencia", JOptionPane.ERROR_MESSAGE);

        }

    }

//Metodo main.    
    public static void main(String args[]) {

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBIngresar;
    private javax.swing.JButton JBReiniciar;
    private javax.swing.JButton JBSalir;
    private javax.swing.JButton JBSalir2;
    private javax.swing.JDesktopPane JDPanel;
    private javax.swing.JLabel JLBanner;
    private javax.swing.JLabel JLBienvenida;
    private javax.swing.JLabel JLFondoVentana;
    private javax.swing.JLabel JLTextoBienvenida;
    private javax.swing.JLabel JLTextoBienvenida1;
    private javax.swing.JTextField ingreso;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea resultado;
    // End of variables declaration//GEN-END:variables
}
