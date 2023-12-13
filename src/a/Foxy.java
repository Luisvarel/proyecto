/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Luis Andres Varela
 */
public class Foxy extends Thread {

    public main m;
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
    public int ai;
    /*
    0 para desactivar
     */
    private int dificultad;

    /*
    0 facil
    1 Nightmare
     */
    private JPanel camaras;
    private JLabel LabelPirateCove;
    private JLabel LabelWestHall;
    private JLabel LabelPorcentaOficina;
    private JLabel LabelPorcentajeCamara;
    private int contador1;

    
    @Override
    public void run() {
        switch (noche) {
            case 1 -> {
                /*
                no hace nada
                 */
            }
            case 2 -> {
                while (m.vivo) {
                    if (ai >= num()) {
                        audio a = new audio("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\sonidos\\Foxysong.wav");
                        a.start();
                        movimiento();
                    }
                }
            }
            case 3 -> {
                /*
                no hace nada
                 */
            }
            case 4 -> {
                while (m.vivo) {
                    if (ai >= num1()) {
                        audio a = new audio("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\sonidos\\Foxysong.wav");
                        a.start();
                        if (contador1 > 0) {
                            m.Ubifoxy = 3;
                        }
                        movimiento();
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

    public int num() {
        Random ran = new Random();
        return ran.nextInt(20) + 1;
    }

    public int num1() {
        contador1 = 0;
        for (int i = 0; i < 50; i++) {
            if (true) {
                contador1++;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
            }
        }
        Random ran = new Random();
        return ran.nextInt(20) + 1;
    }

    public void movimiento() {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setDecimalSeparator('.');
        DecimalFormat formato = new DecimalFormat("#.##", symbols);
        if (m.Ubifoxy < 2) {
            m.Ubifoxy = m.Ubifoxy + 1;
        }
        if (m.Ubifoxy == 1) {
            LabelPirateCove.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\Foxy\\1Foxy.png"));
            if (cuenta() >= 3) {
            } else {
                m.Ubifoxy = 3;
            }
        } else if (m.Ubifoxy == 2) {
            LabelPirateCove.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\Foxy\\2Foxy.png"));
            if (cuenta() >= 3) {
            } else {
                m.Ubifoxy = 3;
            }
        } else if (m.Ubifoxy == 3) {
            if (m.UbiBonnie != 5) {
                LabelWestHall.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\Foxy\\3Foxy.gif"));
            } else {
                LabelWestHall.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\comun\\videoerror.png"));
            }
            audio a1 = new audio("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\sonidos\\Run.wav");
            a1.start();
            try {
                Thread.sleep(1200);
            } catch (InterruptedException ex) {
            }
            if (m.UbiBonnie != 5) {
                LabelWestHall.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\Vacio\\cam2aempty.png"));
            } else if (m.UbiBonnie == 5) {
                LabelWestHall.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\bonnie\\5Bonnie.png"));
            }
            try {
                Thread.sleep(6000);
            } catch (InterruptedException ex) {
            }
            if (!m.puerta_i) {
                audio a = new audio("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\sonidos\\Bang.wav");
                a.start();
                double porcentaje = 0;
                porcentaje = Double.parseDouble(LabelPorcentaOficina.getText());
                if (noche == 2) {
                    porcentaje = porcentaje - 4;
                } else if (noche == 4) {
                    porcentaje = porcentaje - 6;
                }
                if (porcentaje < 0) {
                    porcentaje = 0.00;
                }
                LabelPorcentaOficina.setText("" + formato.format(porcentaje));
                LabelPorcentajeCamara.setText("" + formato.format(porcentaje));
                m.Ubifoxy = 1;
            } else {
                audio a = new audio("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\sonidos\\scream.wav");
                a.start();
                PanelOficina.setVisible(false);
                PanelJumpscare.setVisible(true);
                LabelJumpscare.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\muertes\\FNaF_FoxyJumpscare.gif"));
                m.vivo = false;
                Panelmenu.setVisible(true);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                }

            }
        }
    }

    public int cuenta() {
        int cuenta = 0;
        for (int i = 1; i <= 80; i++) {
            if (camaras.isVisible()) {
                cuenta++;
            }
            if (cuenta >= 3) {
                break;
            }
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
            }
        }
        return cuenta;
    }
}
