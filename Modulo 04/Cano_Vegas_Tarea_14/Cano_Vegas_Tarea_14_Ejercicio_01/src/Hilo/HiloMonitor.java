package Hilo;

import Control.GestorAlarmas;
import Modelo.Alarma;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class HiloMonitor extends Thread{

    private GestorAlarmas objAlarmas;

    public HiloMonitor(GestorAlarmas objAlarmas) {
        this.objAlarmas = objAlarmas;
    }    
    
    @Override
    public void run() {
        while(true) {
            LocalTime horaAct = LocalTime.now().withSecond(0).withNano(0);
            int diaAct = LocalDate.now().getDayOfWeek().getValue();
            
            List<Alarma> alarmas = objAlarmas.buscarAlarmas(horaAct, diaAct);
            
            for(Alarma cur : alarmas) {
                new HiloSonido(cur).start();
            }
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
    
}
