package UT5_2;

public class Vehiculo {
	private String modelo;
	private double potencia;
	private boolean cRuedas;
	
	public Vehiculo(String modelo, double potencia, boolean cRuedas) {
		super();
		this.modelo = modelo;
		this.potencia = potencia;
		this.cRuedas = cRuedas;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPotencia() {
		return potencia;
	}

	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}

	public boolean iscRuedas() {
		return cRuedas;
	}

	public void setcRuedas(boolean cRuedas) {
		this.cRuedas = cRuedas;
	}
	
	public void imprimir () {
		System.out.println("Modelo: " +modelo+ "Potencia: " +potencia);
	}
	
	

}
