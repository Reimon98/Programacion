package UT3Metodos2;
import java.util.Scanner;

public class Ejercicio2 {
	static String concatenar (String frase1, String frase2) {
		return (frase1+frase2);
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduzca dos frases");
		String frase1 = entrada.next();
		String frase2 = entrada.next();
		String frasefinal = concatenar(frase1,frase2);
		System.out.println("Resultado: " +frasefinal);

	}

}
