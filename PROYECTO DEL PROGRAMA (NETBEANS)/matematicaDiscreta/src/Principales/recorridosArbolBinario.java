/*
 * Autor: Jorge Castro, Cristhian Ampudia, Miguel Calderón.
 * Software: MATEMATICA DISCRETA
 * Fecha: 15/07/2016
 * Hora: 9:00
 * Version: 2.0
 */
package Principales;

import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class recorridosArbolBinario extends javax.swing.JDialog {

//Componentes caracteristicos de la venta.
    public recorridosArbolBinario(java.awt.Frame parent, boolean modal) {

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
        ingreso = new javax.swing.JTextField();
        JBIngresar = new javax.swing.JButton();
        JBReiniciar = new javax.swing.JButton();
        JLTextoBienvenida1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JBSalir2 = new javax.swing.JButton();
        JLTextoBienvenida2 = new javax.swing.JLabel();
        JLTextoBienvenida3 = new javax.swing.JLabel();
        ingreso1 = new javax.swing.JTextField();
        JBIngresar1 = new javax.swing.JButton();
        JLFondoVentana = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(680, 600));

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
        JBSalir.setBounds(580, 520, 80, 60);

        JLBienvenida.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        JLBienvenida.setForeground(new java.awt.Color(255, 255, 255));
        JLBienvenida.setText("RECORRIDOS EN ÁRBOLES BINARIOS");
        JDPanel.add(JLBienvenida);
        JLBienvenida.setBounds(110, 90, 460, 30);

        JLBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/g3014.png"))); // NOI18N
        JDPanel.add(JLBanner);
        JLBanner.setBounds(260, 10, 150, 70);

        ingreso.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ingreso.setHorizontalAlignment(javax.swing.JTextField.CENTER);
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
        ingreso.setBounds(380, 140, 120, 30);

        JBIngresar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JBIngresar.setForeground(new java.awt.Color(255, 255, 255));
        JBIngresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/matematicadiscreta/icons/add.png"))); // NOI18N
        JBIngresar.setText("Ingresar");
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
        JBIngresar.setBounds(520, 140, 50, 35);

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
        JBReiniciar.setBounds(600, 220, 50, 35);

        JLTextoBienvenida1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JLTextoBienvenida1.setForeground(new java.awt.Color(255, 255, 255));
        JLTextoBienvenida1.setText("Resultado:");
        JDPanel.add(JLTextoBienvenida1);
        JLTextoBienvenida1.setBounds(20, 240, 200, 20);

        resultado.setEditable(false);
        resultado.setColumns(20);
        resultado.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        resultado.setRows(5);
        resultado.setBorder(null);
        jScrollPane1.setViewportView(resultado);

        JDPanel.add(jScrollPane1);
        jScrollPane1.setBounds(20, 270, 640, 240);

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
        JBSalir2.setBounds(30, 520, 80, 60);

        JLTextoBienvenida2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JLTextoBienvenida2.setForeground(new java.awt.Color(255, 255, 255));
        JLTextoBienvenida2.setText("Ingrese el valor total de vértices del árbol: ");
        JDPanel.add(JLTextoBienvenida2);
        JLTextoBienvenida2.setBounds(20, 140, 360, 30);

        JLTextoBienvenida3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JLTextoBienvenida3.setForeground(new java.awt.Color(255, 255, 255));
        JLTextoBienvenida3.setText("Ingrese el valor del vértice del árbol:");
        JDPanel.add(JLTextoBienvenida3);
        JLTextoBienvenida3.setBounds(20, 190, 300, 30);

        ingreso1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ingreso1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ingreso1.setBorder(null);
        ingreso1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingreso1MouseClicked(evt);
            }
        });
        ingreso1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingreso1ActionPerformed(evt);
            }
        });
        ingreso1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ingreso1KeyTyped(evt);
            }
        });
        JDPanel.add(ingreso1);
        ingreso1.setBounds(330, 190, 170, 30);

        JBIngresar1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        JBIngresar1.setForeground(new java.awt.Color(255, 255, 255));
        JBIngresar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/matematicadiscreta/icons/add.png"))); // NOI18N
        JBIngresar1.setText("Ingresar");
        JBIngresar1.setBorder(null);
        JBIngresar1.setBorderPainted(false);
        JBIngresar1.setContentAreaFilled(false);
        JBIngresar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBIngresar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        JBIngresar1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        JBIngresar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        JBIngresar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBIngresar1MouseClicked(evt);
            }
        });
        JBIngresar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBIngresar1ActionPerformed(evt);
            }
        });
        JDPanel.add(JBIngresar1);
        JBIngresar1.setBounds(520, 190, 50, 35);

        JLFondoVentana.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/azul.jpg"))); // NOI18N
        JLFondoVentana.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        JDPanel.add(JLFondoVentana);
        JLFondoVentana.setBounds(0, 0, 700, 620);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JDPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 680, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JDPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
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

            JOptionPane.showMessageDialog(null, "Ingrese el valor total de vértices del árbol !", "Advertencia", JOptionPane.ERROR_MESSAGE);
            return;

        }

        if ((ingreso.getText().equals("0"))) {

            JOptionPane.showMessageDialog(null, "Ingrese un vértice diferente de 0 !", "Advertencia", JOptionPane.ERROR_MESSAGE);
            return;

        }

        int inicio;

        String entrada2 = ingreso.getText();

        inicio = Integer.parseInt(entrada2);

        resultado.append(" Cantidad total de vértices en el árbol binario: " + inicio + " \n");
        resultado.append("\n");

        cantidad = inicio;

        JOptionPane.showMessageDialog(null, "Valor ingresado correctamente !", "Continua con el proceso...", JOptionPane.INFORMATION_MESSAGE);
        JBIngresar.setEnabled(false);
        ingreso.enable(false);

    }//GEN-LAST:event_JBIngresarActionPerformed

    private void JBReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBReiniciarActionPerformed

        ingreso.setText(null);
        ingreso1.setText(null);
        resultado.setText(null);
        recorridoVerticesInternos.resultado.setText(null);
        JBIngresar1.setEnabled(true);
        JBIngresar.setEnabled(true);
        ingreso.enable(true);
        ingreso1.enable(true);
        cont = 0;
        cantidad = 0;
        aux = 1;
        arbol.vaciar();

    }//GEN-LAST:event_JBReiniciarActionPerformed

    private void JBSalir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSalir2ActionPerformed

        new recorridosArbolBinarioExplicacion(this, true).setVisible(true);

    }//GEN-LAST:event_JBSalir2ActionPerformed

    private void ingresoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ingresoKeyTyped

        validacion(evt);

    }//GEN-LAST:event_ingresoKeyTyped

    private void ingresoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresoMouseClicked

        if (JBIngresar.isEnabled() == true) {

            ingreso.setText(null);

        }

    }//GEN-LAST:event_ingresoMouseClicked

    private void ingreso1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingreso1MouseClicked

        if (JBIngresar1.isEnabled() == true) {

            ingreso1.setText(null);

        }

    }//GEN-LAST:event_ingreso1MouseClicked

    private void ingreso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingreso1ActionPerformed

    }//GEN-LAST:event_ingreso1ActionPerformed

    private void ingreso1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ingreso1KeyTyped

        validacion(evt);

    }//GEN-LAST:event_ingreso1KeyTyped

    private void JBIngresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBIngresar1ActionPerformed

        if ((ingreso.getText().equals(""))) {

            JOptionPane.showMessageDialog(null, "Ingrese el valor total de vértices del árbol !", "Advertencia", JOptionPane.ERROR_MESSAGE);
            return;

        }

        if ((ingreso.getText().equals("0"))) {

            JOptionPane.showMessageDialog(null, "Ingrese un vértice diferente de 0 !", "Advertencia", JOptionPane.ERROR_MESSAGE);
            return;

        }

        int inicio;

        String entrada2 = ingreso1.getText();

        inicio = Integer.parseInt(entrada2);

        arbol.insertar(inicio);

        resultado.append(" Vértice " + aux++ + ": " + inicio + "\n");

    }//GEN-LAST:event_JBIngresar1ActionPerformed

    private void JBIngresar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBIngresar1MouseClicked

        cont++;

        if (cont == cantidad) {

            JOptionPane.showMessageDialog(null, "Valores ingresados correctamente !", "Mire el resultado...", JOptionPane.INFORMATION_MESSAGE);
            ingreso1.enable(false);

            resultado.append("\n");
            resultado.append(" Recorrido en preorden: ");
            arbol.imprimirPre();

            resultado.append("\n");
            resultado.append(" Recorrido en entreorden: ");
            arbol.imprimirEntre();

            resultado.append("\n");
            resultado.append(" Recorrido en postorden: ");
            arbol.imprimirPost();

            resultado.append("\n");
            resultado.append("\n");

            resultado.append(" -- Información general del árbol binario ingresado -- \n");
            resultado.append("\n");

            resultado.append(" Existen " + arbol.cantidadNodosHoja() + " nodos hojas");
            resultado.append("\n");

            resultado.append(" Existen " + arbol.cantidad() + " nodos en el arbol");
            resultado.append("\n");

            resultado.append(" La altura del arbol es: " + arbol.retornarAltura());
            resultado.append("\n");

            arbol.mayorValorl();

            resultado.append("\n");
            resultado.append(" Mostrar en entreorden el nivel del nodo:");
            arbol.imprimirEntreConNivel();

            resultado.append("\n");

            JBIngresar1.setEnabled(false);
            JBIngresar.setEnabled(false);

        }

    }//GEN-LAST:event_JBIngresar1MouseClicked

    static ArbolBinario arbol = new ArbolBinario();
    static int cantidad = 0;

    int cont = 0;
    int aux = 1;

    //Metodo para validar ingresos
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
    private javax.swing.JButton JBIngresar1;
    private javax.swing.JButton JBReiniciar;
    private javax.swing.JButton JBSalir;
    private javax.swing.JButton JBSalir2;
    private javax.swing.JDesktopPane JDPanel;
    private javax.swing.JLabel JLBanner;
    private javax.swing.JLabel JLBienvenida;
    private javax.swing.JLabel JLFondoVentana;
    private javax.swing.JLabel JLTextoBienvenida1;
    private javax.swing.JLabel JLTextoBienvenida2;
    private javax.swing.JLabel JLTextoBienvenida3;
    private javax.swing.JTextField ingreso;
    private javax.swing.JTextField ingreso1;
    private javax.swing.JScrollPane jScrollPane1;
    public static final javax.swing.JTextArea resultado = new javax.swing.JTextArea();
    // End of variables declaration//GEN-END:variables
}
