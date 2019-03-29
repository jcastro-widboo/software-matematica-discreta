package Graficador;

import javax.swing.JApplet;

public class Grafo extends JApplet {

    @Override
    public void init() {

        Dibujar l = new Dibujar(this);
        l.setBounds(0, 0, 400, 400);
        add(l);

    }

}
