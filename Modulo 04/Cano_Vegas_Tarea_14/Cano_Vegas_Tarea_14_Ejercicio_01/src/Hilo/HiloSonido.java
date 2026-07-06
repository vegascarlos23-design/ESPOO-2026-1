package Hilo;

import Modelo.Alarma;
import javax.swing.JOptionPane;
import java.net.URL;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class HiloSonido extends Thread{

    private Alarma alarmaSonando;
    private Clip clip;

    public HiloSonido(Alarma alarmaSonando) {
        this.alarmaSonando = alarmaSonando;
    }
    
    @Override
    public void run() {
        reproducir("renk.wav");
        JOptionPane.showMessageDialog(null, "Sonando Alarma!");    
        
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
        }
        
        detener();
        JOptionPane.showMessageDialog(null, "Fin de la Alarma");
        
    }
    
    private void reproducir(String nombreArchivo) {
        try {
            URL url = getClass().getResource("/Audio/" + nombreArchivo);
            if (url == null) {
                JOptionPane.showMessageDialog(null, "No se encontro ruta");
                return;
            }
            
            AudioInputStream audio = AudioSystem.getAudioInputStream(url);
            clip = AudioSystem.getClip();
            clip.open(audio);
            clip.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void detener() {
        if (clip != null && clip.isRunning()) {
            clip.stop();
            clip.close();
        }
    }
    
}
