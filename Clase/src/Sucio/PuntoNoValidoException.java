package Sucio;

public class PuntoNoValidoException extends Exception {
	private Punto punto;
	public PuntoNoValidoException (Punto punto) { this.punto = punto; }
	public String toString() { return "Punto(" + punto.getX() + ", " + punto.getY() + ") no válido"; }
	}


