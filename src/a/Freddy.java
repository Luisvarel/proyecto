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
public class Freddy extends Thread {

    public main m;
    public Chica c;
    public Bonnie b;
    public Foxy f;
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
    private JLabel LabelShowStage;
    private JLabel LabelDinnigArea;
    private JLabel LabelEastHall;
    private JLabel LabelEastHallCorner;
    private JLabel LabelRestrooms;

    public Freddy(JPanel Panelmenu, JPanel PanelOficina, JLabel LabelJumpscare, JPanel PanelJumpscare, int noche, int ai, int dificultad, JLabel LabelShowStage, JLabel LabelDinnigArea, JLabel LabelEastHall, JLabel LabelEastHallCorner, JLabel LabelRestrooms) {
        this.PanelOficina = PanelOficina;
        this.LabelJumpscare = LabelJumpscare;
        this.PanelJumpscare = PanelJumpscare;
        this.noche = noche;
        this.ai = ai;
        this.dificultad = dificultad;
        this.LabelShowStage = LabelShowStage;
        this.LabelDinnigArea = LabelDinnigArea;
        this.LabelEastHall = LabelEastHall;
        this.LabelEastHallCorner = LabelEastHallCorner;
        this.LabelRestrooms = LabelRestrooms;
        this.Panelmenu = Panelmenu;
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
                /*
                no hace nada
                 */
            }
            case 2 -> {
                noche2F(OportunidadMovimiento);
            }
            case 3 -> {
                /*
                no hace nada
                 */
            }
            case 4 -> {
                noche4(OportunidadMovimiento);
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

    public int animatronico() {
        /*
       1 chica
           2 foxy
             3 Bonnie
         */
        Random ran = new Random();
        return ran.nextInt(3) + 1;
    }

    public void movimiento() {
        audio a = new audio("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\sonidos\\freddymove1.wav");
        a.start();
        if (m.UbiFreddy + 1 <= 5) {
            m.UbiFreddy = m.UbiFreddy + 1;

        }
        switch (m.UbiFreddy) {
            case 1 -> {
                if (m.UbiBonnie == 0 && m.UbiChica == 0) {
                    LabelShowStage.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\Freddy\\Freddy se fue.png"));
                } else if ((m.UbiBonnie != 0 && m.UbiChica == 0) || (m.UbiBonnie == 0 && m.UbiChica != 0)) {
                    LabelShowStage.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\comun\\videoerror.png"));

                } else if (m.UbiBonnie != 0 && m.UbiFreddy != 0 && m.UbiChica != 0) {
                    LabelShowStage.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\comun\\falta Bonnie Chica Freddy.png"));
                }
                if (m.UbiFreddy == 1 && (m.UbiBonnie != 1 || m.UbiBonnie != 2) && (m.UbiChica != 1 || m.UbiChica != 2)) {
                    LabelDinnigArea.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\Freddy\\1Freddy.png"));
                } else {
                    LabelDinnigArea.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\comun\\videoerror.png"));
                }
            }
            case 2 -> {
                if (m.UbiChica != 3 && m.UbiChica != 4) {
                    LabelRestrooms.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\Freddy\\2Freddy.png"));
                } else {
                    LabelRestrooms.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\comun\\videoerror.png"));
                }
                if ((m.UbiBonnie != 1 || m.UbiBonnie != 2) || (m.UbiChica != 1 || m.UbiChica != 2)) {
                    LabelDinnigArea.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\Vacio\\cam1Bempty.png"));
                }
            }
            case 3 -> {
                if (m.UbiChica != 6 && m.UbiChica != 7) {
                    LabelEastHall.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\Freddy\\3Freddy.png"));
                } else {
                    LabelEastHall.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\comun\\videoerror.png"));
                }
                if (m.UbiChica != 3 && m.UbiChica != 4) {
                    LabelRestrooms.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\Vacio\\cam7empty.png"));
                }
            }
            case 4 -> {
                if (m.UbiChica != 8) {
                    LabelEastHallCorner.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\Freddy\\4Freddy.png"));
                } else {
                    LabelEastHallCorner.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\comun\\videoerror.png"));
                }
                if (m.UbiChica != 6 && m.UbiChica != 7) {
                    LabelEastHall.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\Vacio\\cam4Aempty.png"));
                }
            }
            case 5 -> {
                if (m.luz_derecho) {
                    m.vivo = false;
                    PanelOficina.setVisible(false);
                    PanelJumpscare.setVisible(true);
                    audio a1 = new audio("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\sonidos\\scream.wav");
                    a1.start();
                    LabelJumpscare.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\muertes\\freddydeath.gif"));
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException ex) {
                    }
                    LabelJumpscare.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\muertes\\death.png"));
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException ex) {
                    }
                    LabelJumpscare.setVisible(false);
                    Panelmenu.setVisible(true);
                } else {
                    m.UbiFreddy = 3;
                    if (m.UbiChica != 6 && m.UbiChica != 7) {
                        LabelEastHall.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\Freddy\\3Freddy.png"));
                        if (m.UbiChica != 3 && m.UbiChica != 4) {
                            LabelRestrooms.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\Vacio\\cam7empty.png"));
                        }
                    } else {
                        LabelRestrooms.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\comun\\videoerror.png"));
                    }
                }
            }
        }
    }

    public void noche2F(int OportunidadMovimiento) {
        while (m.vivo) {
            try {
                Thread.sleep(OportunidadMovimiento);
            } catch (InterruptedException ex) {
            }
            int temp = num();
            if (ai >= temp) {
                movimiento();
                if (m.vivo) {
                    int contador = 0;
                    while (contador == 0) {
                        contador = 0;
                        for (int i = 1; i <= 10; i++) {
                            if (m.en_camaras) {
                                contador++;
                            }
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException ex) {
                            }
                        }
                    }
                    if (m.UbiFreddy + 1 <= 5) {
                        m.UbiFreddy = m.UbiFreddy + 1;

                    }
                    movimiento();
                } else {
                    break;
                }
            }
        }
    }

    public void noche4(int OportunidadMovimiento) {
        while (m.vivo) {
            try {
                Thread.sleep(OportunidadMovimiento);
            } catch (InterruptedException ex) {
            }
            int temp = num();
            if (ai >= temp) {
                movimiento();
                if (m.vivo) {
                    int contador = 0;
                    while (contador == 0) {
                        contador = 0;
                        for (int i = 1; i <= 10; i++) {
                            if (m.en_camaras) {
                                contador++;
                            }
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException ex) {
                            }
                        }
                    }
                    if (m.UbiFreddy + 1 <= 5) {
                        m.UbiFreddy = m.UbiFreddy + 1;

                    }
                    movimiento();
                    if (m.vivo) {
                        int animatronico = animatronico();
                        switch (animatronico) {
                            case 1 -> {
                                if (m.AIChica > 0) {
                                    audio a = new audio("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\sonidos\\freddymove1.wav");
                                    a.start();
                                }
                            }
                            case 2 -> {
                                if (m.AIfoxy > 0) {
                                    audio a = new audio("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\sonidos\\freddymove1.wav");
                                    a.start();
                                    if (m.Ubifoxy + 1 < 2) {
                                        m.Ubifoxy = m.Ubifoxy + 1;
                                    }
                                    f.movimiento();
                                }
                            }
                            case 3 -> {
                                if (m.AIBonnie > 0) {
                                    audio a = new audio("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\sonidos\\freddymove1.wav");
                                    a.start();
                                    if (m.UbiBonnie + 1 < 7) {
                                        m.UbiBonnie = m.UbiBonnie + 1;
                                    }

                                }
                            }
                        }
                    }
                } else {
                    break;
                }
            }
        }
    }
}
