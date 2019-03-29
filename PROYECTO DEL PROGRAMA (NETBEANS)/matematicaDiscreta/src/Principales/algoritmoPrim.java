/*
 * Autor: Jorge Castro, Cristhian Ampudia, Miguel Calderón.
 * Software: MATEMATICA DISCRETA
 * Fecha: 15/07/2016
 * Hora: 9:00
 * Version: 2.0
 */

package Principales;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.PriorityQueue;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class algoritmoPrim extends javax.swing.JDialog {

//Componentes caracteristicos de la venta.
    public algoritmoPrim(java.awt.Frame parent, boolean modal) {

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
        JBSalir2 = new javax.swing.JButton();
        JLTextoBienvenida2 = new javax.swing.JLabel();
        JLTextoBienvenida3 = new javax.swing.JLabel();
        ingreso1 = new javax.swing.JTextField();
        ingreso2 = new javax.swing.JTextField();
        JBIngresar1 = new javax.swing.JButton();
        JLTextoBienvenida4 = new javax.swing.JLabel();
        ingreso3 = new javax.swing.JTextField();
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
        JLBienvenida.setText("ALGORITMO DE PRIM");
        JDPanel.add(JLBienvenida);
        JLBienvenida.setBounds(202, 90, 270, 30);

        JLBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/g3014.png"))); // NOI18N
        JDPanel.add(JLBanner);
        JLBanner.setBounds(260, 10, 150, 70);

        JLTextoBienvenida.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JLTextoBienvenida.setForeground(new java.awt.Color(255, 255, 255));
        JLTextoBienvenida.setText("Vértice final: ");
        JDPanel.add(JLTextoBienvenida);
        JLTextoBienvenida.setBounds(210, 190, 110, 30);

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
        JBReiniciar.setBounds(600, 230, 50, 35);

        JLTextoBienvenida1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        JLTextoBienvenida1.setForeground(new java.awt.Color(255, 255, 255));
        JLTextoBienvenida1.setText("Resultado:");
        JDPanel.add(JLTextoBienvenida1);
        JLTextoBienvenida1.setBounds(20, 250, 200, 20);

        resultado.setEditable(false);
        resultado.setColumns(20);
        resultado.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 14)); // NOI18N
        resultado.setRows(5);
        resultado.setBorder(null);
        jScrollPane1.setViewportView(resultado);

        JDPanel.add(jScrollPane1);
        jScrollPane1.setBounds(20, 280, 640, 230);

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
        JLTextoBienvenida2.setText("Ingrese el valor total de aristas del gráfico: ");
        JDPanel.add(JLTextoBienvenida2);
        JLTextoBienvenida2.setBounds(20, 140, 360, 30);

        JLTextoBienvenida3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JLTextoBienvenida3.setForeground(new java.awt.Color(255, 255, 255));
        JLTextoBienvenida3.setText("Peso: ");
        JDPanel.add(JLTextoBienvenida3);
        JLTextoBienvenida3.setBounds(390, 190, 60, 30);

        ingreso1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ingreso1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ingreso1.setText("0");
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
        ingreso1.setBounds(140, 190, 50, 30);

        ingreso2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ingreso2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ingreso2.setText("1");
        ingreso2.setBorder(null);
        ingreso2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingreso2MouseClicked(evt);
            }
        });
        ingreso2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingreso2ActionPerformed(evt);
            }
        });
        ingreso2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ingreso2KeyTyped(evt);
            }
        });
        JDPanel.add(ingreso2);
        ingreso2.setBounds(320, 190, 50, 30);

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

        JLTextoBienvenida4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        JLTextoBienvenida4.setForeground(new java.awt.Color(255, 255, 255));
        JLTextoBienvenida4.setText("Vértice inicial: ");
        JDPanel.add(JLTextoBienvenida4);
        JLTextoBienvenida4.setBounds(20, 190, 120, 30);

        ingreso3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        ingreso3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ingreso3.setText("0");
        ingreso3.setBorder(null);
        ingreso3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingreso3MouseClicked(evt);
            }
        });
        ingreso3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingreso3ActionPerformed(evt);
            }
        });
        ingreso3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ingreso3KeyTyped(evt);
            }
        });
        JDPanel.add(ingreso3);
        ingreso3.setBounds(450, 190, 50, 30);

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

            JOptionPane.showMessageDialog(null, "Ingrese el valor total de aristas del gráfico !", "Advertencia", JOptionPane.ERROR_MESSAGE);
            return;

        }

        if ((ingreso.getText().equals("0"))) {

            JOptionPane.showMessageDialog(null, "Ingrese al menos una arista diferente de 0 !", "Advertencia", JOptionPane.ERROR_MESSAGE);
            return;

        }

        String entrada2 = ingreso.getText();

        totalvertice = Integer.parseInt(entrada2);

        vertices = new Vertice[totalvertice];
        
        resultado.append(" El valor total de aristas del gráfico es: " + totalvertice + "\n");

        JOptionPane.showMessageDialog(null, "Valor ingresado correctamente !", "Continua con el proceso...", JOptionPane.INFORMATION_MESSAGE);
        JBIngresar.setEnabled(false);
        ingreso.enable(false);

    }//GEN-LAST:event_JBIngresarActionPerformed

    private void JBReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBReiniciarActionPerformed

        ingreso.setText(null);
        ingreso1.setText(null);
        ingreso2.setText(null);
        ingreso3.setText(null);
        resultado.setText(null);
        JBIngresar1.setEnabled(true);
        JBIngresar.setEnabled(true);
        ingreso.enable(true);
        ingreso1.enable(true);
        ingreso2.enable(true);
        ingreso3.enable(true);
        cont = 0;
        totalvertice = 0;
        vertices = null;

    }//GEN-LAST:event_JBReiniciarActionPerformed

    private void JBSalir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBSalir2ActionPerformed

        new algoritmoPrimExplicacion(this, true).setVisible(true);

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

    private void ingreso2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingreso2MouseClicked

        if (JBIngresar1.isEnabled() == true) {

            ingreso2.setText(null);

        }

    }//GEN-LAST:event_ingreso2MouseClicked

    private void ingreso2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingreso2ActionPerformed

    }//GEN-LAST:event_ingreso2ActionPerformed

    private void ingreso2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ingreso2KeyTyped

        validacion(evt);

    }//GEN-LAST:event_ingreso2KeyTyped

    private void JBIngresar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBIngresar1ActionPerformed

        if ((ingreso.getText().equals(""))) {

            JOptionPane.showMessageDialog(null, "Ingrese el valor total de aristas del gráfico !", "Advertencia", JOptionPane.ERROR_MESSAGE);
            return;

        }

        if ((ingreso.getText().equals("0"))) {

            JOptionPane.showMessageDialog(null, "Ingrese una arista diferente de 0 !", "Advertencia", JOptionPane.ERROR_MESSAGE);
            return;

        }

        if ((ingreso1.getText().equals("")) && (ingreso2.getText().equals(""))) {

            JOptionPane.showMessageDialog(null, "Ingrese el valor inicial o final de los vertices !", "Advertencia", JOptionPane.ERROR_MESSAGE);
            return;

        }

        if ((ingreso3.getText().equals(""))) {

            JOptionPane.showMessageDialog(null, "Ingrese el peso de la arista !", "Advertencia", JOptionPane.ERROR_MESSAGE);
            return;

        }

        String entrada2 = ingreso1.getText();
        String entrada3 = ingreso2.getText();
        String entrada4 = ingreso3.getText();

        inicio = Integer.parseInt(entrada2);
        fin = Integer.parseInt(entrada3);
        peso = Double.parseDouble(entrada4);

        vertices[cont] = new Vertice(inicio, fin, peso);
        
    }//GEN-LAST:event_JBIngresar1ActionPerformed

    private void JBIngresar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBIngresar1MouseClicked

        cont++;

        if (cont == totalvertice) {
            
            JOptionPane.showMessageDialog(null, "Valores ingresados correctamente !", "Mire el resultado...", JOptionPane.INFORMATION_MESSAGE);

            ingreso1.enable(false);
            ingreso2.enable(false);
            ingreso3.enable(false);

            ArrayList<ArrayList<Vertice>> grafico = crearGrafico(vertices);
            ArrayList<Vertice> mst = prim(grafico);

            resultado.append(" Árbol de expansión mínimo: ");
            resultado.append("\n");

            for (Vertice e : mst) {

                resultado.append(" " + e.inicio + " - " + e.fin + " : " + e.info + "\n");

            }

            resultado.append("\n");

            JBIngresar1.setEnabled(false);
            JBIngresar.setEnabled(false);

        }

    }//GEN-LAST:event_JBIngresar1MouseClicked

    private void ingreso3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingreso3MouseClicked

        if (JBIngresar1.isEnabled() == true) {

            ingreso3.setText(null);

        }

    }//GEN-LAST:event_ingreso3MouseClicked

    private void ingreso3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingreso3ActionPerformed

    }//GEN-LAST:event_ingreso3ActionPerformed

    private void ingreso3KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ingreso3KeyTyped

        validacionEspecial(evt);

    }//GEN-LAST:event_ingreso3KeyTyped

    int cont = 0;
    int totalvertice = 0;

    int inicio, fin;
    double peso;

    Vertice[] vertices;

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

    //Metodo para validar ingresos que admite el punto.
    void validacionEspecial(java.awt.event.KeyEvent evt) {

        int k = (int) evt.getKeyChar();

        if (k >= 00 && k <= 00 || k >= 27 && k <= 45) {

            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "No puede ingresar caracteres, solamente números !", "Advertencia", JOptionPane.ERROR_MESSAGE);

        }

        if (k >= 47 && k <= 47) {

            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "No puede ingresar caracteres, solamente números !", "Advertencia", JOptionPane.ERROR_MESSAGE);

        }

        if (k >= 58 && k <= 126 || k >= 128 && k <= 255) {

            evt.setKeyChar((char) KeyEvent.VK_CLEAR);
            JOptionPane.showMessageDialog(null, "No puede ingresar caracteres, solamente números !", "Advertencia", JOptionPane.ERROR_MESSAGE);

        }

    }

    static class Vertice {

        int inicio, fin;
        double info;

        Vertice(int f, int t, double w) {

            inicio = f;
            fin = t;
            info = w;

        }

    }

    public static ArrayList<Vertice> prim(ArrayList<ArrayList<Vertice>> G) {

        if (G.isEmpty()) {

            throw new NullPointerException("El gráfico está vacio!");

        }

        ArrayList<Vertice> mst = new ArrayList<>();

        PriorityQueue<Vertice> pq = new PriorityQueue<>((Object o1, Object o2) -> {

            Vertice primero = (Vertice) o1;
            Vertice segundo = (Vertice) o2;

            if (primero.info < segundo.info) {

                return -1;

            } else if (primero.info > segundo.info) {

                return 1;

            } else {

                return 0;

            }

        });

        for (Vertice e : G.get(0)) {

            pq.add(e);

        }

        boolean[] marcado = new boolean[G.size()];

        marcado[0] = true;

        while (!pq.isEmpty()) {

            Vertice e = pq.peek();

            pq.poll();

            if (marcado[e.inicio] && marcado[e.fin]) {

                continue;

            }

            marcado[e.inicio] = true;

            for (Vertice vertice : G.get(e.fin)) {

                if (!marcado[vertice.fin]) {

                    pq.add(vertice);

                }

            }

            marcado[e.fin] = true;
            mst.add(e);

        }

        return mst;

    }

    public ArrayList<ArrayList<Vertice>> crearGrafico(Vertice[] vertices) {

        ArrayList<ArrayList<Vertice>> G = new ArrayList<>();

        int length = vertices.length * 2;

        for (int i = 0; i < length; ++i) {

            G.add(new ArrayList<>());

        }

        resultado.append("\n");

        for (Vertice e : vertices) {

            Vertice other = new Vertice(e.fin, e.inicio, e.info);
            G.get(e.inicio).add(e);
            G.get(e.fin).add(other);
            resultado.append(" Vértice agregado: [" + e.inicio + ", " + e.fin + " : " + e.info + "] " + "[" + e.fin + ", " + e.inicio + " : " + e.info + "]" + "\n");

        }

        resultado.append("\n");

        return G;

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
    private javax.swing.JLabel JLTextoBienvenida;
    private javax.swing.JLabel JLTextoBienvenida1;
    private javax.swing.JLabel JLTextoBienvenida2;
    private javax.swing.JLabel JLTextoBienvenida3;
    private javax.swing.JLabel JLTextoBienvenida4;
    private javax.swing.JTextField ingreso;
    private javax.swing.JTextField ingreso1;
    private javax.swing.JTextField ingreso2;
    private javax.swing.JTextField ingreso3;
    private javax.swing.JScrollPane jScrollPane1;
    public static final javax.swing.JTextArea resultado = new javax.swing.JTextArea();
    // End of variables declaration//GEN-END:variables
}
