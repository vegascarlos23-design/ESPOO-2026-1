package Modelo;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Medicamento {
    private String nombreDroga;
    private String dosis;
    private Date horaAplicacion;

    public Medicamento(String nombreDroga, String dosis, Date horaAplicacion) {
        this.nombreDroga = nombreDroga;
        this.dosis = dosis;
        this.horaAplicacion = horaAplicacion;
    }
    
    public Object[] getRegistro() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        return new Object[]{nombreDroga,dosis,sdf.format(horaAplicacion)};
    }

    public String getNombreDroga() {
        return nombreDroga;
    }

    public void setNombreDroga(String nombreDroga) {
        this.nombreDroga = nombreDroga;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public Date getHoraAplicacion() {
        return horaAplicacion;
    }

    public void setHoraAplicacion(Date horaAplicacion) {
        this.horaAplicacion = horaAplicacion;
    }
    
    
}
