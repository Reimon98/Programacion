package UT6_HerenciaVehiculo;

public class Conductor {
	private String nombre;

	public Conductor(String nombre, Coche coche) {
		this.nombre = nombre;
		
	}
	
	public void conducir(Coche coche) {
		System.out.println("El conductor: " +nombre+ " conduce el coche: " +coche.mostrarDetalles());
	}

}
