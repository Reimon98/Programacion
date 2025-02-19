package UT5_EjercicioCoche;

import java.util.ArrayList;

public class Monovolumen extends Coche {
	private int plazas;

	public Monovolumen(String marca, int numero, float precioCoste, float precioVenta, Carroceria carroceria,
			Motor motor, ArrayList<Rueda> ruedas, ArrayList<Reparacion> reparaciones, int plazas) {
		super(marca, numero, precioCoste, precioVenta, carroceria, motor, ruedas, reparaciones);
		this.plazas = plazas;
	}

	public int getPlazas() {
		return plazas;
	}

	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}
	
	

	
	

}
