package ejercicioAvanzadoObjetos;

/**
 * Clase abstracta que representa un empleado.
 * Esta clase sirve como base para las subclases que representan tipos específicos de empleados.
 * Contiene información básica del empleado, como su nombre, primer apellido y número de seguridad social (NSS).
 */
public abstract class Empleado {
    
    private String nombre;
    private String primerApellido;
    private int NSS;
    
    /**
     * Constructor de la clase Empleado.
     * Inicializa el nombre, primer apellido y número de seguridad social (NSS) del empleado.
     *
     * @param nombre El nombre del empleado.
     * @param primerApellido El primer apellido del empleado.
     * @param nSS El número de seguridad social del empleado.
     */
    public Empleado(String nombre, String primerApellido, int nSS) {
        super();
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        NSS = nSS;
    }

    /**
     * Métodos getter y setter para los atributos nombre, primerApellido y NSS.
     * 
     * @return El valor actual de los atributos o el valor actualizado de los mismos.
     * @param nombre El nuevo nombre del empleado.
     * @param primerApellido El nuevo primer apellido del empleado.
     * @param nSS El nuevo número de seguridad social del empleado.
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrimerApellido() {
        return primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public int getNSS() {
        return NSS;
    }

    public void setNSS(int nSS) {
        NSS = nSS;
    }

    /**
     * Representación en forma de cadena de un objeto Empleado.
     * 
     * @return Una cadena que representa el objeto Empleado con su nombre, primer apellido y NSS.
     */
    @Override
    public String toString() {
        return "Empleado [nombre=" + nombre + ", primerApellido=" + primerApellido + ", NSS=" + NSS + "]";
    }

    /**
     * Método abstracto para calcular los ingresos del empleado.
     * Este método debe ser implementado por las subclases de Empleado.
     */
    public abstract void Ingresos ();
}