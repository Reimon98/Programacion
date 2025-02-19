package UT2Final;
import java.util.Scanner;

public class Ejercicio17 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int mayor1=-900000000;
		int mayor2=-900000000;
		int mayores=0;
		int menores=0;
		System.out.println("Introduzca un número");
		int baliza=entrada.nextInt();
		System.out.println("Introduzca la cantidad de números que desea comparar con el anterior");
		int cantidad=entrada.nextInt();
		for (int i=1; i<=cantidad; i++) {
			System.out.println("Introduzca uno de los números");
			int num=entrada.nextInt();
			if (num>baliza) {
				mayores++;
			}else {
				menores++;
			}
			if (num>mayor1) {
				mayor2=mayor1;
				mayor1=num;
			}else {
				if (num>mayor2) {
					mayor2=num;
				}
			}
		}
		int suma=mayor1+mayor2;
		System.out.println("La cantidad de números introducidos mayores al inicial son " +mayores+ " los menores son " +menores+ " y la suma de los dos números más grandes es " +suma);
		

	}

}
