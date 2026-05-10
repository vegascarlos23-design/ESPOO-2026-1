package Control;

public class Lista_Transaccion {

    private Nodo_Transaccion inicio, fin;

    public Lista_Transaccion() {
        inicio = fin = null;
    }

    public Nodo_Transaccion getInicio() {
        return inicio;
    }

    public void setInicio(Nodo_Transaccion inicio) {
        this.inicio = inicio;
    }

    public Nodo_Transaccion getFin() {
        return fin;
    }

    public void setFin(Nodo_Transaccion fin) {
        this.fin = fin;
    }
    
    
}
