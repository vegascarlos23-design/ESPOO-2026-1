package Hilos;

import Modelo.Mensajero;
import Vista.ClienteChatForm;
import java.util.Random;

public class HiloSimulacionRed extends Thread{
    private Mensajero mensajero;
    private ClienteChatForm vista;
    private Random random;
    
    private String[] usuarios = {
        "Juan",
        "Maria",
        "Pedro",
        "Ana",
        "Luis",
        "Valentino",
        "Daniela",
        "Renk",
        "Armas"
    };

    private String[] mensajes = {
        "Hola!",
        "Como estás?",
        "Ya terminaste la tarea?",
        "Nos vemos luego",
        "Buenos días",
        "Que haces?",
        "Todo bien por aqui",
        "Vamos a jugar!",
        "Terminaste de comer?",
        "Me pasas la tarea?",
        "Hoy fue un dia duro"
    };

    public HiloSimulacionRed(Mensajero mensajero, ClienteChatForm vista) {
        this.mensajero = mensajero;
        this.vista = vista;
        random = new Random();
    }

    @Override
    public void run() {
        while(true) {
            try {
                sleep(5000);
                if (mensajero.isOnline()) {
                    String usuario = usuarios[random.nextInt(usuarios.length)];
                    String mensaje = mensajes[random.nextInt(mensajes.length)];
                    vista.agregarHistorial(usuario + ": " + mensaje);                       
                }
 
            } catch (Exception e) {
                break;
            }            
        }
    }        
}
