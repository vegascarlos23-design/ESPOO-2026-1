package Modelo;

public class Reserva {
    private int numeroMaquina;
    private String nombreCliente;
    private String tipoMembresia;
    private int codigoActividad;
    private int costoSesion;

    public Reserva(int numeroMaquina, String nombreCliente, String tipoMembresia, int codigoActividad, int costoSesion) {
        this.numeroMaquina = numeroMaquina;
        this.nombreCliente = nombreCliente;
        this.tipoMembresia = tipoMembresia;
        this.codigoActividad = codigoActividad;
        this.costoSesion = costoSesion;
    }
    
    public Object[] getRegistro() {
        return new Object[] {numeroMaquina,nombreCliente};
    }
    
    public String ParseActividad(int cod) {
        if (cod == 1) {
            return "Cardio";
        } else if( cod == 2) {
            return "Pesas";
        } 
        return "Funcional";
    }
    
    public String getDetalles() {
        return new String("Numero de maquina: " + numeroMaquina +
                "\nMembresia: " + tipoMembresia +
                "\nActividad: " + ParseActividad(codigoActividad) +
                "\nCosto: " + costoSesion);
    }

    public int getNumeroMaquina() {
        return numeroMaquina;
    }

    public void setNumeroMaquina(int numeroMaquina) {
        this.numeroMaquina = numeroMaquina;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getTipoMembresia() {
        return tipoMembresia;
    }

    public void setTipoMembresia(String tipoMembresia) {
        this.tipoMembresia = tipoMembresia;
    }

    public int getCodigoActividad() {
        return codigoActividad;
    }

    public void setCodigoActividad(int codigoActividad) {
        this.codigoActividad = codigoActividad;
    }

    public int getCostoSesion() {
        return costoSesion;
    }

    public void setCostoSesion(int costoSesion) {
        this.costoSesion = costoSesion;
    }
    
    
}
