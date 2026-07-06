package Control;

import Modelo.Mensaje;
import java.util.LinkedList;
import java.util.Queue;

public class ColaMensajes {
    private Queue<Mensaje> cola = new LinkedList<>();
    
    public synchronized void encolar(Mensaje elemento) {
        cola.offer(elemento);
        notifyAll();
    }
    
    public synchronized Mensaje desencolar() {
        while(cola.isEmpty()) {
            try {
                wait();
            } catch (Exception e) {
            }
        }
        return cola.poll();
    }
    
    public synchronized boolean estaVacio() {
        return cola.isEmpty();
    }
}
