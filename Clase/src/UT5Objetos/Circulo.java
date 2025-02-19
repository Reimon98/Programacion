package UT5Objetos;

public class Circulo {
	private double radio;
	private String color;
	private int centroX, centroY;
	public Circulo() {
		radio = 50;
		color = "negro";
		centroX = 100;
		centroY = 100;
	}
	public double getRadio() {
		return radio;
	}
	public void setRadio(double nuevoRadio) {
		radio = nuevoRadio;
	}
	public void decrece() {
		radio = radio/1.3;
	}
	public double area() {
		return Math.PI*radio*radio;
	}
	public String toString() {
		return "Círculo de radio " +radio+ ", color " +color+ " y centro (" +centroX+ "," +centroY+ ")";
	}

}
