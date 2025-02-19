package UT2Final;
import java.util.Scanner;

public class Ejercicio15 {

	public static void main(String[] args) {
		int mayor1=-900000000;
		int mayor2=-900000000;
		Scanner entrada = new Scanner (System.in);
		System.out.println("¿Cuántos números desea introducir?");
		int cantidad=entrada.nextInt();
		for (int i=1; i<=cantidad; i++) {
			System.out.println("Introduzca un número");
			int num= entrada.nextInt();
			if (num>mayor1) {
				mayor2=mayor1;
				mayor1=num;
			}else {
				if (num>mayor2) {
					mayor2=num;
				}
			}
		}
		System.out.println("Los dos números mayores introducidos son " +mayor1+ " y " +mayor2);

	}

}
