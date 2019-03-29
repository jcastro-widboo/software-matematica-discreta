/*
 * Autor: Jorge Castro, Cristhian Ampudia, Miguel Calderón.
 * Software: MATEMATICA DISCRETA
 * Fecha: 15/07/2016
 * Hora: 9:00
 * Version: 2.0
 */

package Principales;

import java.awt.event.KeyEvent;
import java.util.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class cicloEulerMatrizA extends javax.swing.JDialog {

//Componentes caracteristicos de la venta.
    public cicloEulerMatrizA(java.awt.Frame parent, boolean modal) {

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
        resultado = new javax.swing.JTextArea();
        JLTextoBienvenida2 = new javax.swing.JLabel();
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
        JLBienvenida.setText("CICLO DE EULER POR CONSOLA");
        JDPanel.add(JLBienvenida);
        JLBienvenida.setBounds(150, 90, 390, 30);

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
        JBReiniciar.setBounds(600, 190, 50, 35);

        JLTextoBienvenida1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JLTextoBienvenida1.setForeground(new java.awt.Color(255, 255, 255));
        JLTextoBienvenida1.setText("Resultado:");
        JDPanel.add(JLTextoBienvenida1);
        JLTextoBienvenida1.setBounds(20, 200, 200, 30);

        resultado.setEditable(false);
        resultado.setColumns(20);
        resultado.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        resultado.setRows(5);
        resultado.setBorder(null);
        jScrollPane1.setViewportView(resultado);

        JDPanel.add(jScrollPane1);
        jScrollPane1.setBounds(20, 230, 640, 280);

        JLTextoBienvenida2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JLTextoBienvenida2.setForeground(new java.awt.Color(255, 255, 255));
        JLTextoBienvenida2.setText("Ingrese el valor total de aristas del gráfico: ");
        JDPanel.add(JLTextoBienvenida2);
        JLTextoBienvenida2.setBounds(20, 140, 360, 30);

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

        int inicio;
        String entrada = ingreso.getText();
        inicio = Integer.parseInt(entrada);

        int numeroDeNodos, num1;

        try {
            
            // leer el número de nodos
            numeroDeNodos = inicio;

            // leer la matriz de adyacencia
            int[][] matrizDeAdyacencia = new int[numeroDeNodos + 1][numeroDeNodos + 1];

            for (int i = 1; i <= numeroDeNodos; i++) {

                for (int j = 1; j <= numeroDeNodos; j++) {

                    num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la matriz de adyacencia del gráfico: "));
                    matrizDeAdyacencia[i][j] = num1;

                }

            }

            // se hacer el gráfico no dirigido
            for (int i = 1; i <= numeroDeNodos; i++) {

                for (int j = 1; j <= numeroDeNodos; j++) {

                    if (matrizDeAdyacencia[i][j] == 1 && matrizDeAdyacencia[j][i] == 0) {

                        matrizDeAdyacencia[j][i] = 1;

                    }

                }

            }

            resultado.append("\n");
            resultado.append(" El trayecto o circuito de Euler es: \n");
            resultado.append(" Porfavor ejecutar en consola para ver el resultado! \n");
            resultado.append("\n");
            JBIngresar.setEnabled(true);

            // Imprimir ciclo o trayecto de Euler
            cicloEulerMatrizA ciclo = new cicloEulerMatrizA(numeroDeNodos, matrizDeAdyacencia);
            ciclo.imprimirEuler();

        } catch (InputMismatchException noCoincide) {

            resultado.append("\n");
            resultado.append(" Error de ingreso!");
            resultado.append("\n");

        }

    }//GEN-LAST:event_JBIngresarActionPerformed

    private void JBReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBReiniciarActionPerformed

        JBIngresar.setEnabled(true);
        ingreso.setText(null);
        resultado.setText(null);

    }//GEN-LAST:event_JBReiniciarActionPerformed

    private void ingresoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ingresoKeyTyped

        validacion(evt);

    }//GEN-LAST:event_ingresoKeyTyped

    private void ingresoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresoMouseClicked


    }//GEN-LAST:event_ingresoMouseClicked

    private int[][] matrizAdyacencia;
    private int numeroNodos;

    public cicloEulerMatrizA(int numeroNodos, int[][] matrizAdyacencia) {

        this.numeroNodos = numeroNodos;
        this.matrizAdyacencia = new int[numeroNodos + 1][numeroNodos + 1];

        for (int inicioVertice = 1; inicioVertice <= numeroNodos; inicioVertice++) {

            for (int finVertice = 1; finVertice <= numeroNodos; finVertice++) {

                this.matrizAdyacencia[inicioVertice][finVertice] = matrizAdyacencia[inicioVertice][finVertice];

            }

        }

    }

    public int impar(int vertice) {

        int impar = 0;

        for (int finVertice = 1; finVertice <= numeroNodos; finVertice++) {

            if (matrizAdyacencia[vertice][finVertice] == 1 || matrizAdyacencia[finVertice][vertice] == 1) {

                impar++;

            }

        }

        return impar;

    }

    public int verticeGradoImpar() {

        int vertice = -1;

        for (int nodo = 1; nodo <= numeroNodos; nodo++) {

            if ((impar(nodo) % 2) != 0) {

                vertice = nodo;
                break;

            }

        }

        return vertice;

    }

    public void imprimirCTEuler(int vertice) {

        for (int fin = 1; fin <= numeroNodos; fin++) {

            if (matrizAdyacencia[vertice][fin] == 1 && esValidoArista(vertice, fin)) {

                System.out.println(" Inicio : " + vertice + " Destino: " + fin);
                //resultado.append(" Inicio : " + vertice + " Destino: " + fin); //Error null pointer no se puede imprimir en textarea

                eliminarArista(vertice, fin);
                imprimirCTEuler(fin);

            }

        }

    }

    public void imprimirEuler() {

        int vertice = 1;
        if (verticeGradoImpar() != -1) {

            vertice = verticeGradoImpar();

        }

        imprimirCTEuler(vertice);

    }

    public boolean esValidoArista(int inicio, int fin) {

        int cont = 0;

        for (int vertice = 1; vertice <= numeroNodos; vertice++) {

            if (matrizAdyacencia[inicio][vertice] == 1) {

                cont++;

            }

        }

        if (cont == 1) {

            return true;

        }

        int[] visitado = new int[numeroNodos + 1];
        int cont1 = CTCont(inicio, visitado);

        eliminarArista(inicio, fin);

        for (int vertice = 1; vertice <= numeroNodos; vertice++) {

            visitado[vertice] = 0;

        }

        int cont2 = CTCont(inicio, visitado);
        agregarArista(inicio, fin);

        return (cont1 > cont2) ? false : true;

    }

    public int CTCont(int inicio, int[] visitado) {

        visitado[inicio] = 1;
        int cont = 1;
        int fin = 1;

        while (fin <= numeroNodos) {

            if (matrizAdyacencia[inicio][fin] == 1 && visitado[fin] == 0) {

                cont += CTCont(fin, visitado);

            }

            fin++;

        }

        return cont;

    }

    public void eliminarArista(int inicio, int fin) {

        matrizAdyacencia[inicio][fin] = 0;
        matrizAdyacencia[fin][inicio] = 0;

    }

    public void agregarArista(int inicio, int fin) {

        matrizAdyacencia[inicio][fin] = 1;
        matrizAdyacencia[fin][inicio] = 1;

    }

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
    private javax.swing.JButton JBReiniciar;
    private javax.swing.JButton JBSalir;
    private javax.swing.JDesktopPane JDPanel;
    private javax.swing.JLabel JLBanner;
    private javax.swing.JLabel JLBienvenida;
    private javax.swing.JLabel JLFondoVentana;
    private javax.swing.JLabel JLTextoBienvenida1;
    private javax.swing.JLabel JLTextoBienvenida2;
    private javax.swing.JTextField ingreso;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea resultado;
    // End of variables declaration//GEN-END:variables
}
