package UT3Metodos2;
import java.util.Scanner;

public class Ejercicio8 {
	static boolean esPalindromo (String palabra) {
		palabra=palabra.toLowerCase();
		String palabra2 = "";
		for (int i=palabra.length()-1; i>=0; i--) {
			palabra2+= palabra.charAt(i);
			}
		if (palabra.equals(palabra2)) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduzca una palabra");
		String palabra= entrada.next();
		boolean palindromo = esPalindromo(palabra);
		if (palindromo) {
			System.out.println("La palabra es un palíndromo!");
		}else {
			System.out.println("La palabra no es un palíndromo");
		}

	}

}
