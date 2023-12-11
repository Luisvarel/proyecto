/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Luis Andres Varela
 */
public class Golden_Freddy extends Thread {

    private boolean estado;
    private int noche;
    private JLabel cam;
    private JLabel oficina;
    /*
     noche 1=1
     noche 2=2
     noche 3=3
     noche 4=4
     */
    private int probabilidad;

    public Golden_Freddy(int noche,JLabel cam,JLabel oficina) {
        this.estado = true;
        this.noche = noche;
        this.cam=cam;
        this.oficina=oficina;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public int getNoche() {
        return noche;
    }

    public void setNoche(int noche) {
        this.noche = noche;
    }

    public int getProbabilidad() {
        return probabilidad;
    }

    public void setProbabilidad(int probabilidad) {
        this.probabilidad = probabilidad;
    }

    @Override
    public void run() {
        switch (noche) {
            case 1 -> {
                /*
                no hace nada
                 */
            }
            case 2 -> {
                if (aparicion(1000) == 1) {
                    audio a = new audio("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\sonidos\\giggle.wav");
                    a.start();
                    cam.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\cam2b_golden.png"));
                    oficina.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\oficina\\oficina_golden.png"));
                    try {
                        Thread.sleep(10000);
                    } catch (InterruptedException ex) {
                    }
                    audio a1 = new audio("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\sonidos\\goldenscream.wav");
                    a1.start();
                    oficina.setIcon(new ImageIcon(""));
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException ex) {
                    }
                }
            }
            case 3 -> {
                /*
                no hace nada
                 */
            }
            case 4 -> {
                if (aparicion(100) == 1) {
                    audio a = new audio("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\sonidos\\giggle.wav");
                    a.start();
                    try {
                        Thread.sleep(10000);
                    } catch (InterruptedException ex) {
                    } finally {
                        audio a1 = new audio("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\sonidos\\goldenscream.wav");
                        a1.start();
                    }
                }
            }
            /*
            noche personalizada
             */
            case 5 -> {

            }
        }

    }

    public int aparicion(int probabilidad) {
        Random ran = new Random();
        int num = ran.nextInt(probabilidad) + 1;
        return num;
    }
}
