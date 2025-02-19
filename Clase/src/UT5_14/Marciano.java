package UT5_14;

public class Marciano {
	boolean vivo = false;
    String nombre;
    static int numMarcianos = 0;

    public Marciano(String nombre) {
        this.nombre = nombre;
        this.vivo = true;
        numMarcianos++;
        nace();
    }

    public void nace() {
        System.out.println("Hola, he nacido y soy el marciano " + nombre);
        System.out.println("Número de marcianos vivos: " + numMarcianos);
    }

    public void muere() {
        if (vivo) {
            vivo = false;
            numMarcianos--;
            System.out.println("El marciano " + nombre + " ha muerto");
        } else {
            System.out.println("El marciano " + nombre + " ya está muerto");
        }
    }

    public boolean estaVivo() {
        return vivo;
    }

    public static void cuentaMarcianos() {
        System.out.println("Número de marcianos vivos: " + numMarcianos);
    }

}
