package UT6_HerenciaVehiculo;

public abstract class Vehiculo {
	private String nombre;
	public Vehiculo (String nombre) {this.nombre=nombre;}
	public abstract String mostrarDetalles();
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
		
	

}
