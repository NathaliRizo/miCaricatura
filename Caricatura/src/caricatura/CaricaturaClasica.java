package caricatura;

import java.util.Date;


public class CaricaturaClasica extends Caricatura{

    private int ropaVieja;

    public CaricaturaClasica(int ropaVieja, String nombre, boolean tieneRopa, int numeroDeVidas) {
        super(nombre, tieneRopa, numeroDeVidas);
        this.ropaVieja = ropaVieja;
    }
        
}

    
