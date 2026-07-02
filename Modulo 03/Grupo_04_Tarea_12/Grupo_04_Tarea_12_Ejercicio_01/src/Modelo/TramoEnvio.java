package Modelo;

import Control.NodoCentroLogistico;
import java.util.ArrayList;

public class TramoEnvio {

    private NodoCentroLogistico destino;
    private ArrayList<DetalleModalidad> detalles_modalidades;

    public TramoEnvio(NodoCentroLogistico destino) {
        this.destino = destino;
        this.detalles_modalidades = new ArrayList<>();
    }

    public void agregarModalidad(DetalleModalidad detalle) {
        for (int i = 0; i < detalles_modalidades.size(); i++) {
            if (detalles_modalidades.get(i).getTipo_modalidad().equals(detalle.getTipo_modalidad())) {
                detalles_modalidades.set(i, detalle);
                return;
            }
        }
        if (detalles_modalidades.size() < 3) {
            detalles_modalidades.add(detalle);
        }
    }

    public void eliminarModalidad(String tipo_modalidad) {
        for (int i = 0; i < detalles_modalidades.size(); i++) {
            if (detalles_modalidades.get(i).getTipo_modalidad().equals(tipo_modalidad)) {
                detalles_modalidades.remove(i);
                return;
            }
        }
    }

    public DetalleModalidad buscarModalidad(String tipo_modalidad) {
        for (DetalleModalidad d : detalles_modalidades) {
            if (d.getTipo_modalidad().equals(tipo_modalidad)) {
                return d;
            }
        }
        return null;
    }

    public double obtenercosto(int criterio, String modalidad, double tiempo, double huella) {
        double mejorcosto = Double.MAX_VALUE;
        for (DetalleModalidad d : detalles_modalidades) {
            if (modalidad != null && !d.getTipo_modalidad().equalsIgnoreCase(modalidad)) {
                continue;
            }
            double costo;
            costo = switch (criterio) {
                case 1 -> d.getTiempo_transito();
                case 2 -> d.getHuella_carbono();
                case 3 -> tiempo * d.getTiempo_transito() + huella * d.getHuella_carbono();
                default -> Double.MAX_VALUE;
            };
            if (costo < mejorcosto) {
                mejorcosto = costo;
            }
        }
        return mejorcosto;
    }

    public NodoCentroLogistico getDestino() {
        return destino;
    }

    public void setDestino(NodoCentroLogistico destino) {
        this.destino = destino;
    }

    public ArrayList<DetalleModalidad> getDetalles_modalidades() {
        return detalles_modalidades;
    }

    public void setDetalles_modalidades(ArrayList<DetalleModalidad> detalles_modalidades) {
        this.detalles_modalidades = detalles_modalidades;
    }
}
