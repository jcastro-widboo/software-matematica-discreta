package Graficador;

import java.awt.Color;
import java.awt.Graphics;

public class Linea{

    Nodo inicial;
    Nodo ffinal;
    Color color= Color.BLACK;

    public Linea(Nodo inicial, Nodo ffinal) {
        
        this.inicial=inicial;
        this.ffinal=ffinal;
        
    }

    public void painter(Graphics g) {
        
        g.setColor(Color.BLUE);
        g.setColor(color);
        g.drawLine(inicial.getX(), inicial.getY(), ffinal.getX(), ffinal.getY());
        
    }

    public void setColor(Color color) {
        
        this.color = color;
        
    }

    public Nodo getFfinal() {
        
        return ffinal;
        
    }

    public Nodo getInicial() {
        
        return inicial;
        
    }
    
}