package UT2Switch;
import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		int num;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduzca un número del 1 al 4");
		num = entrada.nextInt();
		switch (num) {
		case 1: System.out.println("Primavera");
		case 2: System.out.println("Verano");
		case 3: System.out.println("Otoño");
		case 4: System.out.println("Invierno");
		default: System.out.println("Número inválido");
		}

	}

}
