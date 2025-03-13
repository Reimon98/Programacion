package ejercicioAvanzadoObjetos;

/**
 * Clase que representa a un empleado que trabaja por comisión.
 * Esta clase hereda de la clase Empleado y agrega funcionalidad específica relacionada
 * con las ventas y las tarifas de comisión.
 */
public class EmpleadoPorComision extends Empleado{
    
    private int ventasBrutas;
    private double tarifaComision;
    private double salario;
    
    /**
     * Constructor de la clase EmpleadoPorComision.
     * Inicializa los atributos del empleado, incluidos nombre, primer apellido, NSS,
     * ventas brutas y tarifa de comisión.
     *
     * @param nombre El nombre del empleado.
     * @param primerApellido El primer apellido del empleado.
     * @param nSS El número de seguridad social del empleado.
     * @param ventasBrutas El total de las ventas realizadas por el empleado.
     * @param tarifaComision La tarifa de comisión que recibe el empleado por sus ventas.
     */
    public EmpleadoPorComision(String nombre, String primerApellido, int nSS, int ventasBrutas, double tarifaComision) {
        super(nombre, primerApellido, nSS);
        this.ventasBrutas = ventasBrutas;
        this.tarifaComision = tarifaComision;
    }

    /**
     * Métodos getter y setter para los atributos ventasBrutas y tarifaComision.
     * 
     * @return El valor actual de los atributos o el valor actualizado de los mismos.
     * @param ventasBrutas El nuevo valor de ventas brutas del empleado.
     * @param tarifaComision La nueva tarifa de comisión del empleado.
     */
    public int getVentasBrutas() {
        return ventasBrutas;
    }

    public void setVentasBrutas(int ventasBrutas) {
        this.ventasBrutas = ventasBrutas;
    }

    public double getTarifaComision() {
        return tarifaComision;
    }

    public void setTarifaComision(double tarifaComision) {
        this.tarifaComision = tarifaComision;
    }

    /**
     * Representación en forma de cadena de un objeto EmpleadoPorComision.
     * 
     * @return Una cadena que representa el objeto EmpleadoPorComision con sus ventas brutas
     *         y la tarifa de comisión.
     */
    @Override
    public String toString() {
        return "EmpleadoPorComision [ventasBrutas=" + ventasBrutas + ", tarifaComision=" + tarifaComision + "]";
    }
    
    /**
     * Método para calcular los ingresos del empleado en función de las ventas brutas
     * y la tarifa de comisión.
     * 
     * Este método imprime el salario calculado del empleado.
     */
    public void Ingresos () {
        salario = tarifaComision * ventasBrutas;
        System.out.println("Los ingresos de este empleado son: " + salario);
    }
}