
package caricatura;

import java.util.Date;

public class CaricaturaModerna extends Caricatura {
    private String metodoDeAnimacion;
    private int calificacion;
    private Boolean top10;

    public CaricaturaModerna(String nombre, boolean tieneRopa, int numeroDeVidas, Date fechaDeCreacion, String especie) {
        super(nombre, tieneRopa, numeroDeVidas, fechaDeCreacion, especie);
    }

    public String getMetodoDeAnimacion() {
        return metodoDeAnimacion;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public Boolean getTop10() {
        return top10;
    }

    public void setMetodoDeAnimacion(String metodoDeAnimacion) {
        this.metodoDeAnimacion = metodoDeAnimacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public void setTop10(Boolean top10) {
        this.top10 = top10;
    }


    
}
