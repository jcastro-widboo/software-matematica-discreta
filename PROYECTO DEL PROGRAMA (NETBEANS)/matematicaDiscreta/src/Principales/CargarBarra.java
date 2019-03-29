/*
 * Autor: Jorge Castro, Cristhian Ampudia, Miguel Calderón.
 * Software: MATEMATICA DISCRETA
 * Fecha: 15/07/2016
 * Hora: 9:00
 * Version: 2.0
 */

package Principales;

import java.awt.EventQueue;
import java.lang.reflect.InvocationTargetException;
import javax.swing.*;

//Bloque que administra la barra de carga de la clase Portada.
public class CargarBarra extends Thread {

    JProgressBar barra;
    
    //Variable "retraso" maneja la velocidad de carga de la barra de carga(modificable).
    private static int retraso = 50;

    public CargarBarra(JProgressBar barrar) {
        this.barra = barrar;
    }

    @Override

    public void run() {

        int minimo = barra.getMinimum();
        int maximo = barra.getMaximum();

        Runnable ejecutor = new Runnable() {

            @Override

            public void run() {

                int valorActual = barra.getValue();
                barra.setValue(valorActual + 1);

            }
        };

        for (int i = minimo; i < maximo; i++) {

            try {
                
                EventQueue.invokeAndWait(ejecutor);
                Thread.sleep(retraso);
                
            } catch (InterruptedException ex) {
                
            } catch (InvocationTargetException ex) {
                
            }
            
        }
        
    }
    
}
