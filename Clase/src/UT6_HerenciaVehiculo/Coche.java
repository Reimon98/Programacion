package UT6_HerenciaVehiculo;

public class Coche extends Vehiculo {
	private String marca;
	public Coche (String nombre, String marca) {
		super (nombre);
		this.marca=marca;
	}
	
	public String mostrarDetalles () {
		return "Nombre: " +this.getNombre()+ " Marca: " +marca;
	}

}
