package Modelo;

public class Tienda {
    private int IdTienda;
    private String Rubro;
    private String local;
    private double totalVentasAcumuladas;
    private int IdCentro;

    public Tienda(String Rubro, String local,int IdCentro) {
        this.Rubro = Rubro;
        this.local = local;
        totalVentasAcumuladas = 0;
        this.IdCentro = IdCentro;
    }
    
    public Object[] getRegistro() {
        return new Object[]{IdTienda,Rubro,local,totalVentasAcumuladas,IdCentro};
    }

    public int getIdTienda() {
        return IdTienda;
    }

    public void setIdTienda(int IdTienda) {
        this.IdTienda = IdTienda;
    }

    public String getRubro() {
        return Rubro;
    }

    public void setRubro(String Rubro) {
        this.Rubro = Rubro;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public double getTotalVentasAcumuladas() {
        return totalVentasAcumuladas;
    }

    public void setTotalVentasAcumuladas(double totalVentasAcumuladas) {
        this.totalVentasAcumuladas = totalVentasAcumuladas;
    }

    public int getIdCentro() {
        return IdCentro;
    }

    public void setIdCentro(int IdCentro) {
        this.IdCentro = IdCentro;
    }

   
    
    
}
