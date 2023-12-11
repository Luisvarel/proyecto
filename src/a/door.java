/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a;


import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Luis Andres Varela
 */
public class door extends Thread {

    private JLabel puerta;
    private boolean abierta;
    private String gif;
    private JPanel fondo;

    public door( JPanel fondo, JLabel puerta, boolean abierta, String gif) {
        this.puerta = puerta;
        this.abierta = abierta;
        this.gif = gif;
        this.fondo = fondo;
    }

    @Override
    public void run() {
        int mil = 0;
        if (abierta) {
            mil = 400;
            fondo.setVisible(true);
        } else {
            mil = 500;
        }
        ImageIcon temp = (ImageIcon) puerta.getIcon();
        puerta.setIcon(new ImageIcon(gif));
        try {
            Thread.sleep(mil);
        } catch (InterruptedException ex) {
        }
        puerta.setIcon(temp);
        if (!abierta) {
            fondo.setVisible(false);
        }
    }
}
