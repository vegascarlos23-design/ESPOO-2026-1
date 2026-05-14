package Modelo;

public class Partido {
    private int idPartido;
    private int idEquipoLocal;
    private int idEquipoVisitante;
    private int golesLocal;
    private int golesVisitante;

    public Partido(int idPartido, int idEquipoLocal, int idEquipoVisitante, int golesLocal, int golesVisitante) {
        this.idPartido = idPartido;
        this.idEquipoLocal = idEquipoLocal;
        this.idEquipoVisitante = idEquipoVisitante;
        this.golesLocal = golesLocal;
        this.golesVisitante = golesVisitante;
    }

    
    public Object[] getRegistro() {
        return new Object[]{idPartido,idEquipoLocal,idEquipoVisitante,golesLocal,golesVisitante};
    }

    public int getIdPartido() {
        return idPartido;
    }

    public void setIdPartido(int idPartido) {
        this.idPartido = idPartido;
    }

    public int getIdEquipoLocal() {
        return idEquipoLocal;
    }

    public void setIdEquipoLocal(int idEquipoLocal) {
        this.idEquipoLocal = idEquipoLocal;
    }

    public int getIdEquipoVisitante() {
        return idEquipoVisitante;
    }

    public void setIdEquipoVisitante(int idEquipoVisitante) {
        this.idEquipoVisitante = idEquipoVisitante;
    }

    public int getGolesLocal() {
        return golesLocal;
    }

    public void setGolesLocal(int golesLocal) {
        this.golesLocal = golesLocal;
    }

    public int getGolesVisitante() {
        return golesVisitante;
    }

    public void setGolesVisitante(int golesVisitante) {
        this.golesVisitante = golesVisitante;
    }
    
    
}
