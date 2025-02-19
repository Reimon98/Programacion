package UT3Metodos2;
import java.util.Scanner;

public class Ejercicio7 {
	static boolean esBisiesto (int num) {
		if (num%4==0) {
			return true;
		}else {
			if (num%100!=0&&num%400==0) {
				return true;
			}else {
				return false;
			}
		}
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduzca un año");
		int año = entrada.nextInt();
		boolean bisiesto = esBisiesto(año);
		if (bisiesto) {
			System.out.println("El año introducido es bisiesto");
		}else {
			System.out.println("El año introducido no es bisiesto");
		}

	}

}
