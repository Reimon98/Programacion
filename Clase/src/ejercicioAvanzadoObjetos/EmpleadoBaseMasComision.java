package ejercicioAvanzadoObjetos;

/**
 * Clase que representa a un empleado con un salario base más una comisión.
 * Esta clase hereda de EmpleadoPorComision y agrega el salario base al cálculo de ingresos.
 */
public class EmpleadoBaseMasComision extends EmpleadoPorComision {
    
    private double salarioBase;
    private double salarioTotal;
    
    /**
     * Constructor de la clase EmpleadoBaseMasComision.
     * Inicializa los atributos del empleado, incluidos nombre, primer apellido, NSS, 
     * ventas brutas, tarifa de comisión y salario base.
     *
     * @param nombre El nombre del empleado.
     * @param primerApellido El primer apellido del empleado.
     * @param nSS El número de seguridad social del empleado.
     * @param ventasBrutas El total de las ventas realizadas por el empleado.
     * @param tarifaComision La tarifa de comisión que recibe el empleado por sus ventas.
     * @param salarioBase El salario base del empleado.
     */
    public EmpleadoBaseMasComision(String nombre, String primerApellido, int nSS, int ventasBrutas,
            double tarifaComision, double salarioBase) {
        super(nombre, primerApellido, nSS, ventasBrutas, tarifaComision);
        this.salarioBase = salarioBase;
    }

    /**
     * Métodos getter y setter para los atributos salarioBase y salarioTotal.
     * 
     * @return El valor actual de los atributos o el valor actualizado de los mismos.
     * @param salarioBase El nuevo salario base del empleado.
     * @param salarioTotal El nuevo salario total del empleado.
     */
    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getSalarioTotal() {
        return salarioTotal;
    }

    public void setSalarioTotal(double salarioTotal) {
        this.salarioTotal = salarioTotal;
    }

    /**
     * Representación en forma de cadena de un objeto EmpleadoBaseMasComision.
     * 
     * @return Una cadena que representa el objeto EmpleadoBaseMasComision con el salario base
     *         y el salario total.
     */
    @Override
    public String toString() {
        return "EmpleadoBaseMasComision [salarioBase=" + salarioBase + ", salarioTotal=" + salarioTotal + "]";
    }
    
    /**
     * Método para calcular los ingresos del empleado.
     * Calcula el salario total sumando el salario base y la comisión generada por las ventas brutas.
     * El salario total se almacena en el atributo salarioTotal.
     */
    public void Ingresos () {
        salarioTotal = (this.getVentasBrutas() * this.getTarifaComision()) + this.getSalarioBase();
    }
}