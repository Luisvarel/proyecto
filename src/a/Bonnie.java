/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a;

/**
 *
 * @author Luis Andres Varela
 */
public class Bonnie extends Thread {

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
        switch (noche) {
            case 1 -> {

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

}
