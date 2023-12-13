/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a;

import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Luis Andres Varela
 */
public class Bonnie extends Thread {

    private main m;
    private JPanel PanelOficina;
    private JLabel LabelJumpscare;
    private JPanel PanelJumpscare;
    private JPanel Panelmenu;
    private int noche;
    /*
     noche 1=1
     noche 2=2
     noche 3=3
     noche 4=4
     */
    private int ai;
    /*
    0 para desactivar
     */
    private int dificultad;

    /*
    0 facil
    1 Nightmare
     */
    public Bonnie(int noche) {
        this.noche = noche;
    }

    public Bonnie(int ai, int dificultad) {
        this.ai = ai;
        this.dificultad = dificultad;
    }

    @Override
    public void run() {
        int OportunidadMovimiento = 0;
        if (dificultad == 0) {
            OportunidadMovimiento = 10000;
        } else if (dificultad == 1) {
            OportunidadMovimiento = 5000;
        }
        switch (noche) {
            case 1 -> {
                while (m.vivo) {
                    try {
                        Thread.sleep(OportunidadMovimiento);
                    } catch (InterruptedException ex) {
                    }
                    if (true) {
                        
                    }
                }
            }
            case 2 -> {
                /*
                no hace nada
                 */
            }
            case 3 -> {

            }
            case 4 -> {

            }
            /*
            noche personalizada
             */
            case 5 -> {

            }
        }
    }

    public int num() {
        Random ran = new Random();
        return ran.nextInt(20) + 1;
    }
}
