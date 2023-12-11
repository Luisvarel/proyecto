/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a;

/**
 *
 * @author Luis Andres Varela
 */
public class Freddy extends Thread {

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
    public Freddy(int noche) {
        this.noche = noche;
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

            }
            case 3 -> {
                /*
                no hace nada
                 */
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
