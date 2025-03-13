package Sucio;

public class main {

	public static void main(String[] args) {
		try { Punto p = new Punto(1,-1); }
		catch (PuntoNoValidoException e) { System.out.println("Error: " + e); }
		}
		//Salida del main → Error: Punto(1, -1) no válido

	}


