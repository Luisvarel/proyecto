/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a;

import java.awt.Label;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Luis Andres Varela
 */
public class gif_cambio_CO extends Thread {

    private JPanel fondo_gif;
    private JLabel gif;
    private JPanel Cam_Ofi;

    public gif_cambio_CO(JPanel fondo_gif, JLabel gif, JPanel Cam_Ofi) {
        this.fondo_gif = fondo_gif;
        this.Cam_Ofi = Cam_Ofi;
        this.gif = gif;
    }

    @Override
    public void run() {
        fondo_gif.setVisible(true);
        gif.setIcon(gif.getIcon());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
        }
        fondo_gif.setVisible(false);
        Cam_Ofi.setVisible(true);
    }

}
