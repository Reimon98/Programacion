package UT2Practica2;
import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		int edad;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduzca su edad.");
		edad = entrada.nextInt();
		if (edad<12) {
			System.out.println("Usted está clasificado como niño.");
		}else {
			if (edad>13&&edad<17) {
				System.out.println("Usted está clasificado como adolescente.");
			}else {
				if (edad>18&&edad<64) {
					System.out.println("Usted está clasificado como adulto.");
				}else {
					if (edad>=65) {
						System.out.println("Usted está clasificado como adulto mayor.");
					}
				}
			}

	}
	}
}
