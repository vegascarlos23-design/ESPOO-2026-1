package Modelo;

public class RegistroPrestamo {
    private Libro libroSolicitado;
    private SalaEstudio salaAsignada;
    private String nombreEstudiante;
    private int diasPrestamo;


    public RegistroPrestamo(Libro libroSolicitado, SalaEstudio salaAsignada, String nombreEstudiante, int diasPrestamo) {
        this.libroSolicitado = libroSolicitado;
        this.salaAsignada = salaAsignada;
        this.nombreEstudiante = nombreEstudiante;
        this.diasPrestamo = diasPrestamo;
    }

    public RegistroPrestamo(String nombreEstudiante, int diasPrestamo) {
        this.nombreEstudiante = nombreEstudiante;
        this.diasPrestamo = diasPrestamo;
    }
    

    public Object[] getRegistro() {
        return new Object[]{libroSolicitado.getIsbn(),salaAsignada.getIdSala(),nombreEstudiante,diasPrestamo};
    }

    public Libro getLibroSolicitado() {
        return libroSolicitado;
    }

    public void setLibroSolicitado(Libro libroSolicitado) {
        this.libroSolicitado = libroSolicitado;
    }

    public SalaEstudio getSalaAsignada() {
        return salaAsignada;
    }

    public void setSalaAsignada(SalaEstudio salaAsignada) {
        this.salaAsignada = salaAsignada;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public int getDiasPrestamo() {
        return diasPrestamo;
    }

    public void setDiasPrestamo(int diasPrestamo) {
        this.diasPrestamo = diasPrestamo;
    }
    
    
}
