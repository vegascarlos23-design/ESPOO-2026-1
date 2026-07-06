package Modelo;

public class Mensajero {
    private volatile boolean online;

    public Mensajero() {
        online = false;
    }

    public boolean isOnline() {
        return online;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }
}
