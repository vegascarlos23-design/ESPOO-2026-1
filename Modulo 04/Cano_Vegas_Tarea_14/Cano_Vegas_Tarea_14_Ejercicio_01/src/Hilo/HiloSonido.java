package Hilo;

import Modelo.Alarma;
import javax.swing.JOptionPane;

public class HiloSonido extends Thread{

    private Alarma alarmaSonando;

    public HiloSonido(Alarma alarmaSonando) {
        this.alarmaSonando = alarmaSonando;
    }
    
    @Override
    public void run() {
        JOptionPane.showMessageDialog(null, "Sonando Alarma!");
        
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
        }
        
        JOptionPane.showMessageDialog(null, "Fin de la Alarma");
    }
    
}
