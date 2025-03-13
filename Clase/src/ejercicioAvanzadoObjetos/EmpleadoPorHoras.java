package ejercicioAvanzadoObjetos;

/**
 * Clase que representa a un empleado que trabaja por horas.
 * Esta clase hereda de la clase Empleado y calcula el sueldo total en función de las horas trabajadas.
 */
public class EmpleadoPorHoras extends Empleado {
    
    private double sueldo;
    private int horas;
    private double sueldoTotal;
    
    /**
     * Constructor de la clase EmpleadoPorHoras.
     * Inicializa los atributos del empleado, incluidos nombre, primer apellido, NSS,
     * sueldo por hora y cantidad de horas trabajadas.
     *
     * @param nombre El nombre del empleado.
     * @param primerApellido El primer apellido del empleado.
     * @param nSS El número de seguridad social del empleado.
     * @param sueldo El sueldo por hora del empleado.
     * @param horas El número de horas trabajadas por el empleado.
     */
    public EmpleadoPorHoras(String nombre, String primerApellido, int nSS, double sueldo, int horas) {
        super(nombre, primerApellido, nSS);
        this.sueldo = sueldo;
        this.horas = horas;
    }

    /**
     * Obtiene el sueldo por hora del empleado.
     *
     * @return El sueldo por hora del empleado.
     */
    public double getSueldo() {
        return sueldo;
    }

    /**
     * Establece el sueldo por hora del empleado.
     *
     * @param sueldo El nuevo sueldo por hora del empleado.
     */
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    /**
     * Obtiene el número de horas trabajadas por el empleado.
     *
     * @return El número de horas trabajadas por el empleado.
     */
    public int getHoras() {
        return horas;
    }

    /**
     * Establece el número de horas trabajadas por el empleado.
     *
     * @param horas El nuevo número de horas trabajadas.
     */
    public void setHoras(int horas) {
        this.horas = horas;
    }

    /**
     * Representación en forma de cadena de un objeto EmpleadoPorHoras.
     * 
     * @return Una cadena que representa el objeto EmpleadoPorHoras con el sueldo por hora
     *         y las horas trabajadas.
     */
    @Override
    public String toString() {
        return "EmpleadoPorHoras [sueldo=" + sueldo + ", horas=" + horas + "]";
    }
    
    /**
     * Método para calcular los ingresos del empleado.
     * El sueldo total se calcula dependiendo de las horas trabajadas, considerando
     * el pago normal hasta 40 horas y un pago adicional (1.5x) por las horas extra.
     * El salario total se imprime en la consola.
     */
    public void Ingresos () {
        if (horas <= 40) {
            sueldoTotal = sueldo * horas;
        } else {
            sueldoTotal = (sueldo * 40) + ((sueldo * (horas - 40)) * 1.5);
        }
        System.out.println("Los ingresos de este empleado son: " + sueldoTotal);
    }
}