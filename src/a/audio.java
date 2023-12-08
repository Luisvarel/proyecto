package a;

import java.io.File;
import javax.sound.sampled.*;

public class audio extends Thread {

    private String rutaAudio;

    public audio(String rutaAudio) {
        this.rutaAudio = rutaAudio;
    }

    @Override
    public void run() {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(rutaAudio));
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
            Thread.sleep(clip.getMicrosecondLength() / 1000);
        } catch (UnsupportedAudioFileException | LineUnavailableException | InterruptedException | java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
