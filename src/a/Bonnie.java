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
public class Bonnie extends Thread {

    private main m;
    private JPanel PanelOficina;
    private JLabel LabelJumpscare;
    private JLabel label_oficina;
    private JPanel PanelJumpscare;
    private JPanel Panelmenu;
    private JPanel gif_camara_salida;
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
    private JLabel salidaC;
    private JLabel LabelShowStage;
    private JLabel LabelWestHallCorner;
    private JLabel LabelWestHall;
    private JLabel LabelSupplyCloset;
    private JLabel LabelBackStage;
    private JLabel LabelDinnigArea;
    private JLabel camara;
    private int bonniepuerta = 1;
    private int OportunidadMovimiento = 0;

    public Bonnie(JPanel PanelOficina, JLabel LabelJumpscare, JLabel label_oficina, JPanel PanelJumpscare, JPanel Panelmenu, JPanel gif_camara_salida, int noche, int ai, int dificultad, JLabel salidaC, JLabel LabelShowStage, JLabel LabelWestHallCorner, JLabel LabelWestHall, JLabel LabelSupplyCloset, JLabel LabelBackStage, JLabel LabelDinnigArea, JLabel camara) {
        this.PanelOficina = PanelOficina;
        this.LabelJumpscare = LabelJumpscare;
        this.label_oficina = label_oficina;
        this.PanelJumpscare = PanelJumpscare;
        this.Panelmenu = Panelmenu;
        this.gif_camara_salida = gif_camara_salida;
        this.noche = noche;
        this.ai = ai;
        this.dificultad = dificultad;
        this.salidaC = salidaC;
        this.LabelShowStage = LabelShowStage;
        this.LabelWestHallCorner = LabelWestHallCorner;
        this.LabelWestHall = LabelWestHall;
        this.LabelSupplyCloset = LabelSupplyCloset;
        this.LabelBackStage = LabelBackStage;
        this.LabelDinnigArea = LabelDinnigArea;
        this.camara = camara;
    }

    @Override
    public void run() {
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
                    if (ai >= num()) {
                        movimiento(azar());
                    }
                }
            }
            case 2 -> {
                /*
                no hace nada
                 */
            }
            case 3 -> {
                while (m.vivo) {
                    try {
                        Thread.sleep(OportunidadMovimiento);
                    } catch (InterruptedException ex) {
                    }
                    if (ai >= num()) {
                        try {
                            Thread.sleep(10000);
                        } catch (InterruptedException ex) {
                        }
                        if (bonniepuerta < 7) {
                            bonniepuerta = 7;
                        }
                        movimiento(azar());
                    }
                }
            }
            case 4 -> {
                while (m.vivo) {
                    try {
                        Thread.sleep(OportunidadMovimiento);
                    } catch (InterruptedException ex) {
                    }
                    if (ai >= num()) {
                        movimiento(azar());
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

    public void movimiento(int num) {
        if (bonniepuerta < 7) {
            bonniepuerta = num;
        } else if (bonniepuerta == 7) {
            bonniepuerta = 7;
        }
        switch (bonniepuerta) {
            case 1 -> {
                if (m.UbiBonnie == 1 && (m.UbiChica != 1 || m.UbiChica != 2) && m.UbiFreddy != 1) {
                    LabelDinnigArea.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\chica\\1Chica.png"));
                } else {
                    LabelDinnigArea.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\comun\\videoerror.png"));
                }
            }
            case 2 -> {
                if (m.UbiBonnie == 2 && (m.UbiChica != 1 || m.UbiChica != 2) && m.UbiFreddy != 1) {
                    LabelDinnigArea.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\bonnie\\2Bonnie.png"));
                } else {
                    LabelDinnigArea.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\comun\\videoerror.png"));
                }
            }
            case 3 -> {
                LabelBackStage.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\bonnie\\3Bonnie.png"));
            }
            case 4 -> {
                LabelBackStage.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\bonnie\\4Bonnie.png"));
            }
            case 5 -> {
                if (m.UbiBonnie == 5 && m.Ubifoxy != 3) {
                    LabelWestHall.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\bonnie\\5Bonnie.png"));
                } else {
                    LabelWestHall.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\comun\\videoerror.png"));
                }

            }
            case 6 -> {
                LabelSupplyCloset.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\bonnie\\6Bonnie.png"));
            }
            case 7 -> {
                if (m.activogolden != 1) {
                    LabelWestHallCorner.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\bonnie\\7Bonnie.png"));
                }
                try {
                    Thread.sleep(OportunidadMovimiento);
                } catch (InterruptedException ex) {
                }
                bonniepuerta = 8;
                m.Bonnieafuera = true;
            }
            case 8 -> {
                if (!m.puerta_i) {
                    bonniepuerta = 1;
                } else {
                    m.vivo = false;

                    PanelOficina.setVisible(false);
                    PanelJumpscare.setVisible(true);
                    audio a = new audio("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\sonidos\\scream.wav");
                    a.start();
                    LabelJumpscare.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\muertes\\bonniedeath.gif"));
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
                }
            }
            default -> {
            }
        }
        //1 y 2
        if (m.UbiChica == 0 && m.UbiFreddy == 0) {
            LabelShowStage.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\bonnie\\FueBonnie.png"));
        } else if (m.UbiChica != 0 && m.UbiFreddy == 0 & m.UbiBonnie != 0) {
            LabelShowStage.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\comun\\falta Bonnie Chica.png"));
        } else if (m.UbiChica != 0 && m.UbiFreddy != 0 && m.UbiBonnie != 0) {
            LabelShowStage.setIcon(new ImageIcon("‪C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\comun\\falta Bonnie Chica Freddy.png"));
        } else {
            LabelShowStage.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\comun\\videoerror.png"));
        }
        //3 y 4
        if ((m.UbiBonnie != 1 && m.UbiBonnie != 2) && (m.UbiFreddy != 1) && (m.UbiChica != 1 && m.UbiChica != 2)) {
            LabelDinnigArea.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\Vacio\\cam1Bempty.png"));
        } else if ((m.UbiBonnie != 1 && m.UbiBonnie != 2) && (m.UbiFreddy == 1) && (m.UbiChica != 1 && m.UbiChica != 2)) {
            LabelDinnigArea.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\Freddy\\1Freddy.png"));
        } else if ((m.UbiBonnie != 1 && m.UbiBonnie != 2) && (m.UbiFreddy != 1) && (m.UbiChica == 1 || m.UbiChica == 2)) {
            if (m.UbiChica == 1) {
                LabelDinnigArea.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\chica\\1Chica.png"));
            } else if (m.UbiChica == 2) {
                LabelDinnigArea.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\chica\\2Chica.png"));
            }
        } else if ((m.UbiBonnie == 1 || m.UbiBonnie == 2) && (m.UbiFreddy != 1) && (m.UbiChica != 1 && m.UbiChica != 2)) {
            if (m.UbiChica == 1) {
                LabelDinnigArea.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\bonnie\\1Bonnie.png"));
            } else if (m.UbiChica == 2) {
                LabelDinnigArea.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\bonnie\\2Bonnie.png"));
            }
        } else {
            LabelDinnigArea.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\comun\\videoerror.png"));
        }
        //5
        if (m.UbiBonnie != 3 && m.UbiBonnie != 4) {
            LabelBackStage.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\Vacio\\cam5empty.png"));
        }
        //6
        if (m.UbiBonnie != 6) {
            LabelBackStage.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\Vacio\\cam3empty.png"));
        }
        //7
        if (m.UbiBonnie != 7 && m.activogolden != 1) {
            LabelWestHallCorner.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\Vacio\\cam2bempty.png"));
        }
    }

    public void movimiento4(int num) {
        if (bonniepuerta < 7) {
            bonniepuerta = num;
        } else if (bonniepuerta == 7) {
            bonniepuerta = 7;
        }
        switch (bonniepuerta) {
            case 1 -> {
                if (m.UbiBonnie == 1 && (m.UbiChica != 1 || m.UbiChica != 2) && m.UbiFreddy != 1) {
                    LabelDinnigArea.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\chica\\1Chica.png"));
                } else {
                    LabelDinnigArea.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\comun\\videoerror.png"));
                }
            }
            case 2 -> {
                if (m.UbiBonnie == 2 && (m.UbiChica != 1 || m.UbiChica != 2) && m.UbiFreddy != 1) {
                    LabelDinnigArea.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\bonnie\\2Bonnie.png"));
                } else {
                    LabelDinnigArea.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\comun\\videoerror.png"));
                }
            }
            case 3 -> {
                LabelBackStage.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\bonnie\\3Bonnie.png"));
            }
            case 4 -> {
                LabelBackStage.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\bonnie\\4Bonnie.png"));
            }
            case 5 -> {
                if (m.UbiBonnie == 5 && m.Ubifoxy != 3) {
                    LabelWestHall.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\bonnie\\5Bonnie.png"));
                } else {
                    LabelWestHall.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\comun\\videoerror.png"));
                }

            }
            case 6 -> {
                LabelSupplyCloset.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\bonnie\\6Bonnie.png"));
            }
            case 7 -> {
                if (m.activogolden != 1) {
                    LabelWestHallCorner.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\bonnie\\7Bonnie.png"));
                }
                try {
                    Thread.sleep(OportunidadMovimiento);
                } catch (InterruptedException ex) {
                }
                bonniepuerta = 8;
                m.Bonnieafuera = true;
                m.ba.setLuzIzq(false);
                label_oficina.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\src\\oficina\\office.jpg"));
                camara.setVisible(false);
                if (m.en_camaras) {
                    audio a = new audio("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\sonidos\\camaraup.wav");
                    gif_cambio_CO g = new gif_cambio_CO(gif_camara_salida, salidaC, PanelOficina);
                    g.start();
                    a.start();
                    m.en_camaras = false;
                    m.ba.setCamara(m.en_camaras);
                }
            }
            case 8 -> {
                if (!m.puerta_i) {
                    bonniepuerta = 1;
                } else {
                    m.vivo = false;
                    PanelOficina.setVisible(false);
                    PanelJumpscare.setVisible(true);
                    audio a = new audio("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\sonidos\\scream.wav");
                    a.start();
                    LabelJumpscare.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\muertes\\bonniedeath.gif"));
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
                }
            }
            default -> {
            }
        }
        //1 y 2
        if (m.UbiChica == 0 && m.UbiFreddy == 0) {
            LabelShowStage.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\bonnie\\FueBonnie.png"));
        } else if (m.UbiChica != 0 && m.UbiFreddy == 0 & m.UbiBonnie != 0) {
            LabelShowStage.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\comun\\falta Bonnie Chica.png"));
        } else if (m.UbiChica != 0 && m.UbiFreddy != 0 && m.UbiBonnie != 0) {
            LabelShowStage.setIcon(new ImageIcon("‪C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\comun\\falta Bonnie Chica Freddy.png"));
        } else {
            LabelShowStage.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\comun\\videoerror.png"));
        }
        //3 y 4
        if ((m.UbiBonnie != 1 && m.UbiBonnie != 2) && (m.UbiFreddy != 1) && (m.UbiChica != 1 && m.UbiChica != 2)) {
            LabelDinnigArea.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\Vacio\\cam1Bempty.png"));
        } else if ((m.UbiBonnie != 1 && m.UbiBonnie != 2) && (m.UbiFreddy == 1) && (m.UbiChica != 1 && m.UbiChica != 2)) {
            LabelDinnigArea.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\Freddy\\1Freddy.png"));
        } else if ((m.UbiBonnie != 1 && m.UbiBonnie != 2) && (m.UbiFreddy != 1) && (m.UbiChica == 1 || m.UbiChica == 2)) {
            if (m.UbiChica == 1) {
                LabelDinnigArea.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\chica\\1Chica.png"));
            } else if (m.UbiChica == 2) {
                LabelDinnigArea.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\chica\\2Chica.png"));
            }
        } else if ((m.UbiBonnie == 1 || m.UbiBonnie == 2) && (m.UbiFreddy != 1) && (m.UbiChica != 1 && m.UbiChica != 2)) {
            if (m.UbiChica == 1) {
                LabelDinnigArea.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\bonnie\\1Bonnie.png"));
            } else if (m.UbiChica == 2) {
                LabelDinnigArea.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\bonnie\\2Bonnie.png"));
            }
        } else {
            LabelDinnigArea.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\comun\\videoerror.png"));
        }
        //5
        if (m.UbiBonnie != 3 && m.UbiBonnie != 4) {
            LabelBackStage.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\Vacio\\cam5empty.png"));
        }
        //6
        if (m.UbiBonnie != 6) {
            LabelBackStage.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\Vacio\\cam3empty.png"));
        }
        //7
        if (m.UbiBonnie != 7 && m.activogolden != 1) {
            LabelWestHallCorner.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\Vacio\\cam2bempty.png"));
        }
    }

    public void movimiento3(int num) {
        switch (bonniepuerta) {
            case 1 -> {
                if (m.UbiBonnie == 1 && (m.UbiChica != 1 || m.UbiChica != 2) && m.UbiFreddy != 1) {
                    LabelDinnigArea.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\chica\\1Chica.png"));
                } else {
                    LabelDinnigArea.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\comun\\videoerror.png"));
                }
            }
            case 7 -> {
                if (m.activogolden != 1) {
                    LabelWestHallCorner.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\bonnie\\7Bonnie.png"));
                }
                try {
                    Thread.sleep(OportunidadMovimiento);
                } catch (InterruptedException ex) {
                }
                bonniepuerta = 8;
                m.Bonnieafuera = true;
            }
            case 8 -> {
                if (!m.puerta_i) {
                    bonniepuerta = 1;
                } else {
                    m.vivo = false;
                    PanelOficina.setVisible(false);
                    PanelJumpscare.setVisible(true);
                    audio a = new audio("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\sonidos\\scream.wav");
                    a.start();
                    LabelJumpscare.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\muertes\\bonniedeath.gif"));
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
                }
            }
        }
        //1 y 2
        if (m.UbiChica == 0 && m.UbiFreddy == 0) {
            LabelShowStage.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\bonnie\\FueBonnie.png"));
        } else if (m.UbiChica != 0 && m.UbiFreddy == 0 & m.UbiBonnie != 0) {
            LabelShowStage.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\comun\\falta Bonnie Chica.png"));
        } else if (m.UbiChica != 0 && m.UbiFreddy != 0 && m.UbiBonnie != 0) {
            LabelShowStage.setIcon(new ImageIcon("‪C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\comun\\falta Bonnie Chica Freddy.png"));
        } else {
            LabelShowStage.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\comun\\videoerror.png"));
        }
        //3 y 4
        if ((m.UbiBonnie != 1 && m.UbiBonnie != 2) && (m.UbiFreddy != 1) && (m.UbiChica != 1 && m.UbiChica != 2)) {
            LabelDinnigArea.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\Vacio\\cam1Bempty.png"));
        } else if ((m.UbiBonnie != 1 && m.UbiBonnie != 2) && (m.UbiFreddy == 1) && (m.UbiChica != 1 && m.UbiChica != 2)) {
            LabelDinnigArea.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\Freddy\\1Freddy.png"));
        } else if ((m.UbiBonnie != 1 && m.UbiBonnie != 2) && (m.UbiFreddy != 1) && (m.UbiChica == 1 || m.UbiChica == 2)) {
            if (m.UbiChica == 1) {
                LabelDinnigArea.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\chica\\1Chica.png"));
            } else if (m.UbiChica == 2) {
                LabelDinnigArea.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\chica\\2Chica.png"));
            }
        } else if ((m.UbiBonnie == 1 || m.UbiBonnie == 2) && (m.UbiFreddy != 1) && (m.UbiChica != 1 && m.UbiChica != 2)) {
            if (m.UbiChica == 1) {
                LabelDinnigArea.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\bonnie\\1Bonnie.png"));
            } else if (m.UbiChica == 2) {
                LabelDinnigArea.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\bonnie\\2Bonnie.png"));
            }
        } else {
            LabelDinnigArea.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\comun\\videoerror.png"));
        }
        //5
        if (m.UbiBonnie != 3 && m.UbiBonnie != 4) {
            LabelBackStage.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\Vacio\\cam5empty.png"));
        }
        //6
        if (m.UbiBonnie != 6) {
            LabelBackStage.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\Vacio\\cam3empty.png"));
        }
        //7
        if (m.UbiBonnie != 7 && m.activogolden != 1) {
            LabelWestHallCorner.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\Vacio\\cam2bempty.png"));
        }
    }

    public int num() {
        Random ran = new Random();
        return ran.nextInt(20) + 1;
    }

    public int azar() {
        Random ran = new Random();
        return ran.nextInt(7) + 1;
    }

    public JPanel getPanelOficina() {
        return PanelOficina;
    }

    public void setPanelOficina(JPanel PanelOficina) {
        this.PanelOficina = PanelOficina;
    }

    public JLabel getLabelJumpscare() {
        return LabelJumpscare;
    }

    public void setLabelJumpscare(JLabel LabelJumpscare) {
        this.LabelJumpscare = LabelJumpscare;
    }

    public JLabel getLabel_oficina() {
        return label_oficina;
    }

    public void setLabel_oficina(JLabel label_oficina) {
        this.label_oficina = label_oficina;
    }

    public JPanel getPanelJumpscare() {
        return PanelJumpscare;
    }

    public void setPanelJumpscare(JPanel PanelJumpscare) {
        this.PanelJumpscare = PanelJumpscare;
    }

    public JPanel getPanelmenu() {
        return Panelmenu;
    }

    public void setPanelmenu(JPanel Panelmenu) {
        this.Panelmenu = Panelmenu;
    }

    public JPanel getGif_camara_salida() {
        return gif_camara_salida;
    }

    public void setGif_camara_salida(JPanel gif_camara_salida) {
        this.gif_camara_salida = gif_camara_salida;
    }

    public int getNoche() {
        return noche;
    }

    public void setNoche(int noche) {
        this.noche = noche;
    }

    public int getAi() {
        return ai;
    }

    public void setAi(int ai) {
        this.ai = ai;
    }

    public int getDificultad() {
        return dificultad;
    }

    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }

    public JLabel getSalidaC() {
        return salidaC;
    }

    public void setSalidaC(JLabel salidaC) {
        this.salidaC = salidaC;
    }

    public JLabel getLabelShowStage() {
        return LabelShowStage;
    }

    public void setLabelShowStage(JLabel LabelShowStage) {
        this.LabelShowStage = LabelShowStage;
    }

    public JLabel getLabelWestHallCorner() {
        return LabelWestHallCorner;
    }

    public void setLabelWestHallCorner(JLabel LabelWestHallCorner) {
        this.LabelWestHallCorner = LabelWestHallCorner;
    }

    public JLabel getLabelWestHall() {
        return LabelWestHall;
    }

    public void setLabelWestHall(JLabel LabelWestHall) {
        this.LabelWestHall = LabelWestHall;
    }

    public JLabel getLabelSupplyCloset() {
        return LabelSupplyCloset;
    }

    public void setLabelSupplyCloset(JLabel LabelSupplyCloset) {
        this.LabelSupplyCloset = LabelSupplyCloset;
    }

    public JLabel getLabelBackStage() {
        return LabelBackStage;
    }

    public void setLabelBackStage(JLabel LabelBackStage) {
        this.LabelBackStage = LabelBackStage;
    }

    public JLabel getLabelDinnigArea() {
        return LabelDinnigArea;
    }

    public void setLabelDinnigArea(JLabel LabelDinnigArea) {
        this.LabelDinnigArea = LabelDinnigArea;
    }

    public JLabel getCamara() {
        return camara;
    }

    public void setCamara(JLabel camara) {
        this.camara = camara;
    }

    public int getBonniepuerta() {
        return bonniepuerta;
    }

    public void setBonniepuerta(int bonniepuerta) {
        this.bonniepuerta = bonniepuerta;
    }

    public int getOportunidadMovimiento() {
        return OportunidadMovimiento;
    }

    public void setOportunidadMovimiento(int OportunidadMovimiento) {
        this.OportunidadMovimiento = OportunidadMovimiento;
    }

}
