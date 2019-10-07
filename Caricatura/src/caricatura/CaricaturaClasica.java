package caricatura;

import java.util.Date;


public class CaricaturaClasica extends Caricatura{

    private int ropaVieja;

    public CaricaturaClasica(int ropaVieja, String nombre, boolean tieneRopa, int numeroDeVidas, Date fechaDeCreacion, String especie) {
        super(nombre, tieneRopa, numeroDeVidas, fechaDeCreacion, especie);
        this.ropaVieja = ropaVieja;
    }
        
}

    
