package ejercicioAvanzadoObjetos;

/**
 * Clase que representa a un empleado asalariado.
 * Esta clase hereda de la clase Empleado y tiene un salario semanal fijo.
 */
public class EmpleadoAsalariado extends Empleado {
    
    private double salarioSemanal;

    /**
     * Constructor de la clase EmpleadoAsalariado.
     * Inicializa los atributos del empleado, incluidos nombre, primer apellido, NSS,
     * y el salario semanal.
     *
     * @param nombre El nombre del empleado.
     * @param primerApellido El primer apellido del empleado.
     * @param nSS El número de seguridad social del empleado.
     * @param salarioSemanal El salario semanal del empleado.
     */
    public EmpleadoAsalariado(String nombre, String primerApellido, int nSS, double salarioSemanal) {
        super(nombre, primerApellido, nSS);
        this.salarioSemanal = salarioSemanal;
    }

    /**
     * Obtiene el salario semanal del empleado.
     *
     * @return El salario semanal del empleado.
     */
    public double getSalarioSemanal() {
        return salarioSemanal;
    }

    /**
     * Establece el salario semanal del empleado.
     *
     * @param salarioSemanal El nuevo salario semanal del empleado.
     */
    public void setSalarioSemanal(double salarioSemanal) {
        this.salarioSemanal = salarioSemanal;
    }

    /**
     * Representación en forma de cadena de un objeto EmpleadoAsalariado.
     * 
     * @return Una cadena que representa el objeto EmpleadoAsalariado con el salario semanal.
     */
    @Override
    public String toString() {
        return "EmpleadoAsalariado [salarioSemanal=" + salarioSemanal + "]";
    }
    
    /**
     * Método para mostrar los ingresos del empleado.
     * Este método imprime el salario semanal del empleado.
     */
    public void Ingresos () {
        System.out.println("Los ingresos del empleado son: " + salarioSemanal);
    }
}