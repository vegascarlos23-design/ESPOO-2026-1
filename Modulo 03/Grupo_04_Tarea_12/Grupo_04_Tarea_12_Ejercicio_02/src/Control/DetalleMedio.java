package Control;

public class DetalleMedio {
    private String tipoSoporte;
    private double latenciaMs;
    private double tasaPerdida;

    public DetalleMedio(String tipoSoporte, double latenciaMs, double tasaPerdida) {
        this.tipoSoporte = tipoSoporte;
        this.latenciaMs = latenciaMs;
        this.tasaPerdida = tasaPerdida;
    }

    public String getTipoSoporte() {
        return tipoSoporte;
    }

    public void setTipoSoporte(String tipoSoporte) {
        this.tipoSoporte = tipoSoporte;
    }

    public double getLatenciaMs() {
        return latenciaMs;
    }

    public void setLatenciaMs(double latenciaMs) {
        this.latenciaMs = latenciaMs;
    }

    public double getTasaPerdida() {
        return tasaPerdida;
    }

    public void setTasaPerdida(double tasaPerdida) {
        this.tasaPerdida = tasaPerdida;
    }
    
    
}
