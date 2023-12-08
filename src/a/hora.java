/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a;

import java.awt.Label;

/**
 *
 * @author Luis Andres Varela
 */
public class hora extends Thread {

    private Label hora;
    private Label hora1;

    public hora(Label hora,Label hora1) {
        this.hora = hora;
        this.hora1 = hora1;
    }

    @Override
    public void run() {
        for (int i = 1; i <=6; i++) {
            try {
                Thread.sleep(60000);
            } catch (InterruptedException ex) {
            }
            if (i == 1) {
                hora.setText(""+i);
            }
        }
    }

}
