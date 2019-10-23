package caricatura;

import java.util.Date;

/**
 *
 * @author Alumno
 */
public class Caricatura {

    private String nombre;
    private boolean tieneRopa;
    private int numeroDeVidas;
    private Date fechaDeCreacion;
    private String especie;

    public Caricatura(String nombre, boolean tieneRopa, int numeroDeVidas, Date fechaDeCreacion, String especie) {
        this.nombre = nombre;
        this.tieneRopa = tieneRopa;
        this.numeroDeVidas = numeroDeVidas;
        this.fechaDeCreacion = fechaDeCreacion;
        this.especie = especie;
    }

        
    public void herir() {
        this.numeroDeVidas = 0;
    }

    public void herir(int vidas) {
        if (vidas < this.numeroDeVidas) {
            System.out.println("Lastimaron a tu personaje!");
            this.numeroDeVidas = vidas;
        } else {
            System.out.println("El personaje no ha sido herido");
        }

    }

}
