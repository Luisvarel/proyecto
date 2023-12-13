/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a;

import java.util.Random;

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
    private JLabel LabelOficina;
    private JPanel PanelOficina;
    private JLabel LabelJumpscare;
    private JPanel PanelJumpscare;
    private int golden;

    public Golden_Freddy(int golden, boolean estado, int noche, JLabel cam, JLabel LabelOficina, JPanel PanelOficina, JLabel LabelJumpscare, JPanel PanelJumpscare) {
        this.estado = estado;
        this.noche = noche;
        this.cam = cam;
        this.LabelOficina = LabelOficina;
        this.PanelOficina = PanelOficina;
        this.LabelJumpscare = LabelJumpscare;
        this.PanelJumpscare = PanelJumpscare;
        this.golden = golden;
    }

    /*
     noche 1=1
     noche 2=2
     noche 3=3
     noche 4=4
     */
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

    @Override
    public void run() {
        if (golden>0) {
            if (estado) {
                switch (noche) {
                    case 1 -> {
                        //no hace nada
                    }
                    case 2 -> {
                        noche2();
                    }
                    case 3 -> {
                        //no hace nada
                    }
                    case 4 -> {
                        noche4();
                    }
                    case 5 -> {
                        //noche personalizada

                    }
                }
            }
        }
    }

    public int aparicion(int probabilidad) {
        Random ran = new Random();
        int num = ran.nextInt(probabilidad) + 1;
        System.out.println(num);
        return num;
    }

    public void noche2() {
        if (aparicion(1000) == 1) {
            audio a = new audio("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\sonidos\\giggle.wav");
            a.start();
            cam.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\Golden\\cam2b_golden.png"));
            LabelOficina.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\oficina\\oficina_golden.png"));
            try {
                Thread.sleep(10000);
            } catch (InterruptedException ex) {
            }
            audio a1 = new audio("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\sonidos\\goldenscream.wav");
            a1.start();
            PanelOficina.setVisible(false);
            PanelJumpscare.setVisible(true);
            LabelJumpscare.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\muertes\\goldenfreddydeath2.png"));
            try {
                Thread.sleep(5000);
            } catch (InterruptedException ex) {
            }
            System.exit(0);
        }
    }

    public void noche4() {
        if (aparicion(100) == 1) {
            audio a = new audio("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\sonidos\\giggle.wav");
            a.start();
            cam.setIcon(new ImageIcon(""));
            LabelOficina.setIcon(new ImageIcon(""));
            try {
                Thread.sleep(10000);
            } catch (InterruptedException ex) {
            } finally {
                audio a1 = new audio("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\sonidos\\goldenscream.wav");
                a1.start();
                PanelOficina.setVisible(false);
                PanelJumpscare.setVisible(true);
                LabelJumpscare.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\muertes\\goldenfreddydeath2.png"));
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException ex) {
                }
                System.exit(0);
            }
        }
    }
}
