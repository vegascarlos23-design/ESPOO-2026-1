package Control;


public class LineaTension {
    private NodoEstacionElectrica destino;
    private double perdidaKw;
    private double longitudMetros;

    public LineaTension(NodoEstacionElectrica destino, double perdidaKw, double longitudMetros) {
        this.destino = destino;
        this.perdidaKw = perdidaKw;
        this.longitudMetros = longitudMetros;
    }

    public NodoEstacionElectrica getDestino() {
        return destino;
    }

    public void setDestino(NodoEstacionElectrica destino) {
        this.destino = destino;
    }
    
    public double getPerdidaKw() {
        return perdidaKw;
    }

    public void setPerdidaKw(double perdidaKw) {
        this.perdidaKw = perdidaKw;
    }

    public double getLongitudMetros() {
        return longitudMetros;
    }

    public void setLongitudMetros(double longitudMetros) {
        this.longitudMetros = longitudMetros;
    }
    
    
}
