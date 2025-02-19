package UT2Final;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		String num;
		do {
			System.out.println("Introduzca un número de 4 cifras");
			num = entrada.next();
		} while (num.length()!=4);
		for (int i=0; i<num.length(); i++) {
			System.out.println("La cifra " + (i + 1)+ " es " +num.charAt(i));
		}

	}

}
