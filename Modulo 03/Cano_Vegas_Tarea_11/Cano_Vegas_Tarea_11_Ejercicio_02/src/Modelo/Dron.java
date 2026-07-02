package Modelo;

public class Dron {
    private String matricula;
    private int autonomiaMinutos;
    private double cargaMaximaKg;

    public Dron(String matricula, int autonomiaMinutos, double cargaMaximaKg) {
        this.matricula = matricula;
        this.autonomiaMinutos = autonomiaMinutos;
        this.cargaMaximaKg = cargaMaximaKg;
    }

    public Object[] getRegistro() {
        return new Object[]{matricula,autonomiaMinutos,cargaMaximaKg};
    }
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getAutonomiaMinutos() {
        return autonomiaMinutos;
    }

    public void setAutonomiaMinutos(int autonomiaMinutos) {
        this.autonomiaMinutos = autonomiaMinutos;
    }

    public double getCargaMaximaKg() {
        return cargaMaximaKg;
    }

    public void setCargaMaximaKg(double cargaMaximaKg) {
        this.cargaMaximaKg = cargaMaximaKg;
    }
    
    
}
