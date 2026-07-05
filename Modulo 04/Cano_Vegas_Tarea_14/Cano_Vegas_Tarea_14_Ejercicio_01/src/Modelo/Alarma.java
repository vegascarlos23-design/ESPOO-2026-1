package Modelo;

import java.time.LocalTime;

public class Alarma {
    private int dayOfWeek;
    private LocalTime time;
    private boolean active, ringing;
    
    public Alarma() {
    }
  
    public Alarma(int dayOfWeek, LocalTime time) {
        this.dayOfWeek = dayOfWeek;
        this.time = time;
        active = true;
        ringing = false;
    }
    
    public Object[] getRegistro() {
        String estado = active ? "Si" : "No";
        return new Object[]{dayOfWeek,time,estado};
    }

    public int getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(int dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public boolean isActive() {
        return active;
    }

    public void setIsActive(boolean isActive) {
        this.active = isActive;
    }

    public boolean isRinging() {
        return ringing;
    }

    public void setRinging(boolean ringing) {
        this.ringing = ringing;
    }
    
    
}
