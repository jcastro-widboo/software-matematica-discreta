package Graficador;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Dibujar extends JPanel implements MouseListener, MouseMotionListener {

    int x = 0, y = 0;
    Linea linea;
    Nodo circulo;
    Nodo jalada = null;
    List<Nodo> ListCirculo = new ArrayList<Nodo>();
    List<Linea> ListArista = new ArrayList<Linea>();
    Grafo p;

    public Dibujar(Grafo prin) {

        p = prin;
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
        this.setVisible(true);
        this.setDoubleBuffered(true);
       
        
    }

    Dibujar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void anadirCirculo(int x, int y) {

        circulo = new Nodo(ListCirculo.size(), x, y);
        ListCirculo.add(circulo);
        repaint();
        p.repaint();

    }

    public void anadirLinea(int x, int y) {

        try {

            linea = new Linea(ListCirculo.get(x), ListCirculo.get(y));
            this.ListArista.add(linea);
            repaint();
            p.repaint();

        } catch (IndexOutOfBoundsException e) {

            JOptionPane.showMessageDialog(null, "No ha insertado un nodo!");

        }

    }

    @Override
    public void paintComponent(Graphics g) {

        super.paintComponents(g);
        for (Linea f : ListArista) {

            f.painter(g);

        }

        for (Nodo f : ListCirculo) {

            f.painter(g, this);

        }

    }

    public void mouseClicked(MouseEvent e) {

        try {

            if (e.getButton() == 1) {

                x = e.getX();
                y = e.getY();
                anadirCirculo(x, y);

            } else {

                if (e.getButton() == 3) {

                    int ini = Integer.parseInt(JOptionPane.showInputDialog("Número de nodo inicial"));
                    int fin = Integer.parseInt(JOptionPane.showInputDialog("Número de nodo final"));
                    anadirLinea(ini, fin);

                }

            }

        } catch (Exception ex) {

        }

    }

    public void mousePressed(MouseEvent e) {

    }

    public void mouseReleased(MouseEvent e) {

    }

    public void mouseEntered(MouseEvent e) {

    }

    public void mouseExited(MouseEvent e) {

    }

    public void mouseDragged(MouseEvent e) {

        if (jalada == null) {

            for (Nodo f : ListCirculo) {

                if (f.jaladopor(e.getPoint())) {

                    jalada = f;

                }

                x = e.getPoint().x;
                y = e.getPoint().y;
                repaint();
                p.repaint();

            }

        } else {

            jalada.transladar(e.getPoint().x - x, e.getPoint().y - y);
            x = e.getPoint().x;
            y = e.getPoint().y;
            repaint();
            p.repaint();

        }

    }

    public void mouseMoved(MouseEvent e) {

        jalada = null;

    }

}
