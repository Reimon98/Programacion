package UT3Metodos2;
import java.util.Scanner;

public class Ejercicio3 {
	static double convertirACelsius (double num) {
		return (num-32)*0.555;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduzca la temperatura en grados Fahrenheit");
		double gradosF = entrada.nextDouble();
		double gradosC = convertirACelsius(gradosF);
		System.out.println("La temperatura en grados Celsius sería: " +gradosC);

	}

}
