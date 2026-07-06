package Hilos;

import Control.ColaMensajes;
import Modelo.Mensaje;
import Modelo.Mensajero;
import Vista.ClienteChatForm;

public class HiloConectividad extends Thread{
    private ColaMensajes cola;
    private Mensajero mensajero;
    private ClienteChatForm vista;

    public HiloConectividad(ColaMensajes cola, Mensajero mensajero, ClienteChatForm vista) {
        this.cola = cola;
        this.mensajero = mensajero;
        this.vista = vista;
    }

    @Override
    public void run() {
        while(true) {
            try {
                if (!mensajero.isOnline()) {
                    sleep(300);
                    continue;
                }
                
                while(!cola.estaVacio() && mensajero.isOnline()) {
                    Mensaje mensaje = cola.desencolar();
                    if (mensaje == null) {
                        sleep(1000);
                        continue;
                    }
                    
                    mensaje.setEnviado(true);
                    vista.agregarHistorial("[ENVIADO] "+mensaje.getTexto());
                    sleep(1000);
                }
                sleep(300);
            } catch (Exception e) {
                break;
            }
        }
    }
    
    
}
