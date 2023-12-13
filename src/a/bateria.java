/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package a;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Luis Andres Varela
 */
public class bateria extends Thread {

    private boolean puertaD;
    private boolean puertaIzq;
    private boolean LuzD;
    private boolean LuzIzq;
    private boolean Camara;
    private JLabel LabelImagenCam;
    private JLabel LabelPorcentajeCamara;
    private JLabel LabelPorcentaOficina;
    private JLabel LabelImagenOficina;

    public bateria(boolean puertaD, boolean puertaIzq, boolean LuzD, boolean LuzIzq, boolean Camara, JLabel LabelImagenCam, JLabel LabelPorcentajeCamara, JLabel LabelPorcentaOficina, JLabel LabelImagenOficina) {
        this.puertaD = puertaD;
        this.puertaIzq = puertaIzq;
        this.LuzD = LuzD;
        this.LuzIzq = LuzIzq;
        this.Camara = Camara;
        this.LabelImagenCam = LabelImagenCam;
        this.LabelPorcentajeCamara = LabelPorcentajeCamara;
        this.LabelPorcentaOficina = LabelPorcentaOficina;
        this.LabelImagenOficina = LabelImagenOficina;

    }

    public boolean isPuertaD() {
        return puertaD;
    }

    public void setPuertaD(boolean puertaD) {
        this.puertaD = puertaD;
    }

    public boolean isPuertaIzq() {
        return puertaIzq;
    }

    public void setPuertaIzq(boolean puertaIzq) {
        this.puertaIzq = puertaIzq;
    }

    public boolean isLuzD() {
        return LuzD;
    }

    public void setLuzD(boolean LuzD) {
        this.LuzD = LuzD;
    }

    public boolean isLuzIzq() {
        return LuzIzq;
    }

    public void setLuzIzq(boolean LuzIzq) {
        this.LuzIzq = LuzIzq;
    }

    public boolean isCamara() {
        return Camara;
    }

    public void setCamara(boolean Camara) {
        this.Camara = Camara;
    }

    public JLabel getLabelImagenCam() {
        return LabelImagenCam;
    }

    public void setLabelImagenCam(JLabel LabelImagenCam) {
        this.LabelImagenCam = LabelImagenCam;
    }

    public JLabel getLabelPorcentajeCamara() {
        return LabelPorcentajeCamara;
    }

    public void setLabelPorcentajeCamara(JLabel LabelPorcentajeCamara) {
        this.LabelPorcentajeCamara = LabelPorcentajeCamara;
    }

    public JLabel getLabelPorcentaOficina() {
        return LabelPorcentaOficina;
    }

    public void setLabelPorcentaOficina(JLabel LabelPorcentaOficina) {
        this.LabelPorcentaOficina = LabelPorcentaOficina;
    }

    public JLabel getLabelImagenOficina() {
        return LabelImagenOficina;
    }

    public void setLabelImagenOficina(JLabel LabelImagenOficina) {
        this.LabelImagenOficina = LabelImagenOficina;
    }

    @Override
    public void run() {
        double porcentaje = Double.parseDouble(LabelPorcentaOficina.getText());
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setDecimalSeparator('.');
        DecimalFormat formato = new DecimalFormat("#.##", symbols);
        while (true) {
            System.out.println("a");
            if (porcentaje > 0) {
                int cantidadBarras = 0;
                if (!puertaD) {
                    cantidadBarras++;
                }
                if (!puertaIzq) {
                    cantidadBarras++;
                }
                if (LuzD) {
                    cantidadBarras++;
                }
                if (LuzIzq) {
                    cantidadBarras++;
                }
                if (Camara) {
                    cantidadBarras++;
                }
                switch (cantidadBarras) {
                    case 0 -> {
                        LabelImagenCam.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\bateria\\green.jpg"));
                        LabelImagenOficina.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\bateria\\green.jpg"));
                        try {
                            Thread.sleep(0);
                        } catch (InterruptedException ex) {
                        }
                    }
                    case 1 -> {
                        LabelImagenCam.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\bateria\\green2.jpg"));
                        LabelImagenOficina.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\bateria\\green2.jpg"));
                        porcentaje = Double.parseDouble(LabelPorcentaOficina.getText());
                        porcentaje = porcentaje - 0.1;
                        if (porcentaje < 0) {
                            porcentaje = 0.00;
                        }
                        LabelPorcentaOficina.setText("" + formato.format(porcentaje));
                        LabelPorcentajeCamara.setText("" + formato.format(porcentaje));
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                        }
                    }
                    case 2 -> {
                        LabelImagenCam.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\bateria\\yellow.jpg"));
                        LabelImagenOficina.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\bateria\\yellow.jpg"));
                        porcentaje = Double.parseDouble(LabelPorcentaOficina.getText());
                        porcentaje = porcentaje - 0.2;
                        if (porcentaje < 0) {
                            porcentaje = 0.00;
                        }
                        LabelPorcentaOficina.setText("" + formato.format(porcentaje));
                        LabelPorcentajeCamara.setText("" + formato.format(porcentaje));
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                        }
                    }
                    case 3 -> {
                        LabelImagenCam.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\bateria\\red.jpg"));
                        LabelImagenOficina.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\bateria\\red.jpg"));
                        porcentaje = Double.parseDouble(LabelPorcentaOficina.getText());
                        porcentaje = porcentaje - 0.3;
                        if (porcentaje < 0) {
                            porcentaje = 0.00;
                        }
                        LabelPorcentaOficina.setText("" + formato.format(porcentaje));
                        LabelPorcentajeCamara.setText("" + formato.format(porcentaje));
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                        }
                    }
                    case 4 -> {
                        LabelImagenCam.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\bateria\\red2.jpg"));
                        LabelImagenOficina.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\bateria\\red2.jpg"));
                        porcentaje = Double.parseDouble(LabelPorcentaOficina.getText());
                        porcentaje = porcentaje - 0.4;
                        if (porcentaje < 0) {
                            porcentaje = 0.00;
                        }
                        LabelPorcentaOficina.setText("" + formato.format(porcentaje));
                        LabelPorcentajeCamara.setText("" + formato.format(porcentaje));
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                        }
                    }
                    case 5 -> {
                        LabelImagenCam.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\bateria\\red2.jpg"));
                        LabelImagenOficina.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\bateria\\red2.jpg"));
                        porcentaje = Double.parseDouble(LabelPorcentaOficina.getText());
                        porcentaje = porcentaje - 0.5;
                        if (porcentaje < 0) {
                            porcentaje = 0.00;
                        }
                        LabelPorcentaOficina.setText("" + formato.format(porcentaje));
                        LabelPorcentajeCamara.setText("" + formato.format(porcentaje));
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                        }
                    }
                }
            } else {
                LabelImagenCam.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\bateria\\nousage.jpg"));
                LabelImagenOficina.setIcon(new ImageIcon("C:\\Users\\Luis Andres Varela\\Desktop\\archivo de proyecto\\Five Nights at Freddy’s\\--fnaf 1--\\bateria\\nousage.jpg"));
                try {
                    Thread.sleep(0);
                } catch (InterruptedException ex) {
                }
                break;
            }

        }
    }

}
