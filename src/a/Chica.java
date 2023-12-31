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
public class Chica extends Thread {

    private main m;
    private JPanel gif_camara_salida;
    private JPanel PanelOficina;
    private JLabel LabelJumpscare;
    private JPanel PanelJumpscare;
    private JPanel Panelmenu;
    private JLabel camara;
    private JLabel label_oficina;

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
    private JLabel LabelPorcentaOficina;
    private JLabel LabelPorcentajeCamara;
    private JLabel LabelShowStage;
    private JLabel LabelDinnigArea;
    private JLabel LabelRestrooms;
    private JLabel LabelEastHall;
    private JLabel LabelEastHallCorner;
    private int OportunidadMovimiento = 0;

    public Chica(int noche) {
        this.noche = noche;
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
                        movimiento();
                    }
                }
            }
            case 2 -> {
                /*
                no hace nada
                 */
            }
            case 3 -> {
                DecimalFormatSymbols symbols = new DecimalFormatSymbols();
                symbols.setDecimalSeparator('.');
                DecimalFormat formato = new DecimalFormat("#.##", symbols);
                while (m.vivo) {
                    try {
                        Thread.sleep(OportunidadMovimiento);
                    } catch (InterruptedException ex) {
                    }
                    if (ai >= num()) {
                        audio a = new audio("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\sonidos\\Steps.wav");
                        a.start();
                        double porcentaje = 0;
                        porcentaje = Double.parseDouble(LabelPorcentaOficina.getText());
                        porcentaje = porcentaje - 1;
                        if (porcentaje < 0) {
                            porcentaje = 0.00;
                        }
                        LabelPorcentaOficina.setText("" + formato.format(porcentaje));
                        LabelPorcentajeCamara.setText("" + formato.format(porcentaje));
                        movimiento();
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

    public void movimiento() {
        m.UbiBonnie = m.UbiBonnie + 1;
        switch (m.UbiBonnie) {
            case 1 -> {
                if (m.UbiFreddy != 1 && (m.UbiBonnie != 1 && m.UbiBonnie != 2)) {
                    LabelDinnigArea.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\chica\\1Chica.png"));
                } else {
                    LabelDinnigArea.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\comun\\videoerror.png"));
                }
            }
            case 2 -> {
                if (m.UbiFreddy != 1 && (m.UbiBonnie != 1 && m.UbiBonnie != 2)) {
                    LabelDinnigArea.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\chica\\2Chica.png"));
                } else {
                    LabelDinnigArea.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\comun\\videoerror.png"));
                }
            }
            case 3 -> {
                if (m.UbiFreddy != 2) {
                    LabelRestrooms.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\chica\\3Chica.png"));
                } else {
                    LabelRestrooms.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\comun\\videoerror.png"));
                }
            }
            case 4 -> {
                if (m.UbiFreddy != 2) {
                    LabelRestrooms.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\chica\\4Chica.png"));
                } else {
                    LabelRestrooms.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\comun\\videoerror.png"));
                }
            }
            case 5 -> {
            }
            case 6 -> {
                if (m.UbiFreddy != 3) {
                    LabelEastHall.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\chica\\6Chica.png"));
                } else {
                    LabelEastHall.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\comun\\videoerror.png"));
                }
            }
            case 7 -> {
                if (m.UbiFreddy != 3) {
                    LabelEastHall.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\chica\\7Chica.png"));
                } else {
                    LabelEastHall.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\comun\\videoerror.png"));
                }
            }
            case 8 -> {
                if (m.UbiFreddy != 3) {
                    LabelEastHallCorner.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\chica\\8Chica.png"));
                } else {
                    LabelEastHallCorner.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\comun\\videoerror.png"));
                }
                try {
                    Thread.sleep(OportunidadMovimiento);
                } catch (InterruptedException ex) {
                }
                m.Chicaafuera = true;
            }
            case 9 -> {
                if (m.puerta_d) {
                    m.vivo = false;
                    PanelOficina.setVisible(false);
                    PanelJumpscare.setVisible(true);
                    audio a = new audio("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\sonidos\\scream.wav");
                    a.start();
                    LabelJumpscare.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\muertes\\chicadeath.gif"));
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
                    if (m.UbiFreddy != 1 && (m.UbiBonnie != 1 && m.UbiBonnie != 2)) {
                        LabelDinnigArea.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\chica\\2Chica.png"));
                    } else {
                        LabelDinnigArea.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\comun\\videoerror.png"));
                    }
                    m.UbiChica = 1;
                }
            }
        }
        //1 2
        if (m.UbiBonnie == 0 && m.UbiFreddy == 0) {
            LabelShowStage.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\chica\\Se Fue Chica.png"));
        } else if (m.UbiChica != 0 && m.UbiFreddy == 0 && m.UbiBonnie != 0) {
            LabelShowStage.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\comun\\falta Bonnie Chica.png"));
        } else if (m.UbiChica != 0 && m.UbiFreddy != 0 && m.UbiBonnie != 0) {
            LabelShowStage.setIcon(new ImageIcon("‪C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\comun\\falta Bonnie Chica Freddy.png"));
        } else {
            LabelShowStage.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\comun\\videoerror.png"));
        }
        //3 4
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
        // 6 7
        if ((m.UbiChica != 3 && m.UbiChica != 4) && m.UbiFreddy != 2) {
            LabelRestrooms.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\Vacio\\cam7empty.png"));
        } else if (m.UbiFreddy == 2) {
            LabelRestrooms.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\Freddy\\2Freddy.png"));
        }
        // 8
        if ((m.UbiChica != 6 && m.UbiChica != 7) && m.UbiFreddy != 3) {
            LabelEastHall.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\Vacio\\cam4Aempty.png"));
        } else if (m.UbiFreddy == 3) {
            LabelEastHall.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\Vacio\\cam4Aempty.png"));
        }

    }

    public int azar() {
        Random ran = new Random();
        return ran.nextInt(8) + 1;
    }

    public void movimiento4(int num) {
        if (num <= 8) {
            m.UbiBonnie = num;
        }
        switch (m.UbiBonnie) {
            case 1 -> {
                if (m.UbiFreddy != 1 && (m.UbiBonnie != 1 && m.UbiBonnie != 2)) {
                    LabelDinnigArea.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\chica\\1Chica.png"));
                } else {
                    LabelDinnigArea.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\comun\\videoerror.png"));
                }
            }
            case 2 -> {
                if (m.UbiFreddy != 1 && (m.UbiBonnie != 1 && m.UbiBonnie != 2)) {
                    LabelDinnigArea.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\chica\\2Chica.png"));
                } else {
                    LabelDinnigArea.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\comun\\videoerror.png"));
                }
            }
            case 3 -> {
                if (m.UbiFreddy != 2) {
                    LabelRestrooms.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\chica\\3Chica.png"));
                } else {
                    LabelRestrooms.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\comun\\videoerror.png"));
                }
            }
            case 4 -> {
                if (m.UbiFreddy != 2) {
                    LabelRestrooms.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\chica\\4Chica.png"));
                } else {
                    LabelRestrooms.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\comun\\videoerror.png"));
                }
            }
            case 5 -> {
            }
            case 6 -> {
                if (m.UbiFreddy != 3) {
                    LabelEastHall.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\chica\\6Chica.png"));
                } else {
                    LabelEastHall.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\comun\\videoerror.png"));
                }
            }
            case 7 -> {
                if (m.UbiFreddy != 3) {
                    LabelEastHall.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\chica\\7Chica.png"));
                } else {
                    LabelEastHall.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\comun\\videoerror.png"));
                }
            }
            case 8 -> {
                if (m.UbiFreddy != 3) {
                    LabelEastHallCorner.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\chica\\8Chica.png"));
                } else {
                    LabelEastHallCorner.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\comun\\videoerror.png"));
                }
                try {
                    Thread.sleep(OportunidadMovimiento);
                } catch (InterruptedException ex) {
                }
                m.UbiBonnie = 9;
                m.Chicaafuera = true;
                m.ba.setLuzIzq(false);
                m.ba.setLuzD(false);
                label_oficina.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\src\\oficina\\office.jpg"));
                camara.setVisible(false);
                if (m.en_camaras) {
                    audio a3 = new audio("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\sonidos\\camaraup.wav");
                    gif_cambio_CO g = new gif_cambio_CO(gif_camara_salida, salidaC, PanelOficina);
                    g.start();
                    a3.start();
                    m.en_camaras = false;
                    m.ba.setCamara(m.en_camaras);
                }
            }
            case 9 -> {
                if (m.puerta_d) {
                    PanelOficina.setVisible(false);
                    PanelJumpscare.setVisible(true);
                    audio a = new audio("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\sonidos\\scream.wav");
                    a.start();
                    LabelJumpscare.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\muertes\\chicadeath.gif"));
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException ex) {
                    }
                    DecimalFormatSymbols symbols = new DecimalFormatSymbols();
                    symbols.setDecimalSeparator('.');
                    DecimalFormat formato = new DecimalFormat("#.##", symbols);
                    LabelJumpscare.setVisible(false);
                    PanelOficina.setVisible(true);
                    double porcentaje = 0;
                    porcentaje = Double.parseDouble(LabelPorcentaOficina.getText());
                    porcentaje = porcentaje - 10;
                    if (porcentaje < 0) {
                        porcentaje = 0.00;
                    }
                    LabelPorcentaOficina.setText("" + formato.format(porcentaje));
                    LabelPorcentajeCamara.setText("" + formato.format(porcentaje));
                } else {
                    if (m.UbiFreddy != 1 && (m.UbiBonnie != 1 && m.UbiBonnie != 2)) {
                        LabelDinnigArea.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\chica\\2Chica.png"));
                    } else {
                        LabelDinnigArea.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\comun\\videoerror.png"));
                    }
                    m.UbiChica = 1;
                }
            }
        }
        //1 2
        if (m.UbiBonnie == 0 && m.UbiFreddy == 0) {
            LabelShowStage.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\chica\\Se Fue Chica.png"));
        } else if (m.UbiChica != 0 && m.UbiFreddy == 0 && m.UbiBonnie != 0) {
            LabelShowStage.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\comun\\falta Bonnie Chica.png"));
        } else if (m.UbiChica != 0 && m.UbiFreddy != 0 && m.UbiBonnie != 0) {
            LabelShowStage.setIcon(new ImageIcon("‪C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\comun\\falta Bonnie Chica Freddy.png"));
        } else {
            LabelShowStage.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\comun\\videoerror.png"));
        }
        //3 4
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
        // 6 7
        if ((m.UbiChica != 3 && m.UbiChica != 4) && m.UbiFreddy != 2) {
            LabelRestrooms.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\Vacio\\cam7empty.png"));
        } else if (m.UbiFreddy == 2) {
            LabelRestrooms.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\Freddy\\2Freddy.png"));
        }
        // 8
        if ((m.UbiChica != 6 && m.UbiChica != 7) && m.UbiFreddy != 3) {
            LabelEastHall.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\Vacio\\cam4Aempty.png"));
        } else if (m.UbiFreddy == 3) {
            LabelEastHall.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\camaras\\Vacio\\cam4Aempty.png"));
        }

    }

}
