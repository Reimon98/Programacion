package UT5_9;

public class Empleado {
	 private String nombre;
	    private int salario;
	    private Direccion direccion;

	    public Empleado(String nombre, int salario, Direccion direccion) {
	        this.nombre = nombre;
	        this.salario = salario;
	        this.direccion = direccion;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public int getSalario() {
	        return salario;
	    }

	    public Direccion getDireccion() {
	        return direccion;
	    }

}
