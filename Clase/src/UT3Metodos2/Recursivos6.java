package UT3Metodos2;
import java.util.Scanner;

public class Recursivos6 {
	public static boolean alfabeto (String cadena) {
		if (cadena.length()<=1) {
			return true;
		}
		if (cadena.charAt(0)>cadena.charAt(1)) {
			return false;
		}
		return alfabeto (cadena.substring(1));
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduzca una palabra");
		String palabra = entrada.next();
		if (alfabeto(palabra)) {
			System.out.println("La palabra está ordenada alfabéticamente");
		}else {
			System.out.println("La palabra no está ordenada");
		}
	}

}
