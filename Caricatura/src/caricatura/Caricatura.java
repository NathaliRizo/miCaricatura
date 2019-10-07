package caricatura;

import java.util.Date;

public class Caricatura {

    private String nombre;
    private boolean tieneRopa;
    private int numeroDeVidas;

    public Caricatura(String nombre, boolean tieneRopa, int numeroDeVidas) {
        this.nombre = nombre;
        this.tieneRopa = tieneRopa;
        this.numeroDeVidas = numeroDeVidas;
    }
        
    public void herir() {
        this.numeroDeVidas = 0;
    }

    public void herir(int Vidas) {
        if (Vidas <= this.numeroDeVidas) {
            System.out.println("Lastimaron a tu personaje!");
        } else {
            this.numeroDeVidas = Vidas;
            System.out.println("Vidas restantes: " + String.valueOf(Vidas));
        }

    }

}
