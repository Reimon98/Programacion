package UT5_1;

public class UT5_1_main {

	public static void main(String[] args) {
		DVDCine Avatar = new DVDCine ("Avatar", "James Cameron", "Ciencia ficción", 162, "Entramos en el mundo Avatar de la mano de Jake Sully, un ex-Marine en silla de ruedas, que ha sido reclutado para viajar a Pandora, donde existe un mineral raro y muy preciado que puede solucionar la crisis energética existente en la Tierra.");
		
		Avatar.muestraDVDCine();
		
		if (Avatar.esThriller()) {System.out.println("El género de la película es thriller");
		}else {System.out.println("El género de la película no es thriller");

	}
		if (Avatar.tieneResumen()) {System.out.println("La película tiene resumen");
		}else {System.out.println("La película no tiene resumen");

	}
		Avatar.muestraDuracion();

}
}