package UT2Practica2;
import java.util.Scanner;
public class Ejercicio10 {

	public static void main(String[] args) {
		int num;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduzca sus ingresos anuales");
		num = entrada.nextInt();
		if (num<10000) {
			System.out.println("No debe pagar impuestos");
		}else {
			if (num>=10000&&num<20000) {
				System.out.println("Debe pagar un 10% de impuestos");
			}else {
				if (num>=20000&&num<30000) {
					System.out.println("Debe pagar un 15% de impuestos");
				}else {
					if (num>=30000) {
						System.out.println("Debe pagar un 20% de impuestos");
					}
				}
			}
		}

	}

}
