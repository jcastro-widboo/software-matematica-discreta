package Graficador;

import java.awt.*;
import javax.swing.ImageIcon;

public class Nodo {

    int x, y, n;
    Image image;

    public Nodo(int n, int x, int y) {

        this.n = n;
        this.x = x;
        this.y = y;
        image = new ImageIcon(getClass().getResource("/img/favicon.png")).getImage();

    }

    public void painter(Graphics g, Dibujar l) {

        g.drawImage(image, x - 15, y - 15, l);
        g.setColor(Color.RED);
        g.drawString("" + n, x - 15, y - 15);
        g.drawString("" + n, x - 14, y - 14);

    }

    public int getX() {

        return x;

    }

    public int getY() {

        return y;

    }

    public int getN() {

        return n;

    }

    public void transladar(int dx, int dy) {

        this.x += dx;
        this.y += dy;

    }

    public void setImage(Image image) {

        this.image = image;

    }

    public boolean jaladopor(Point d) {

        if (d.distance(x, y) <= 15) {

            return true;

        } else {

            return false;

        }

    }

}
