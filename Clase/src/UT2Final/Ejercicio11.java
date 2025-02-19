package UT2Final;
import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int decision;
		do {
			
		int suma1=0;
		int suma2=0;
		System.out.println("Introduzca dos números");
		int num1= entrada.nextInt();
		int num2= entrada.nextInt();
		for (int i=1; i<num1; i++) {
			if (num1%i==0) {
				suma1=suma1+i;
			}
		}
		for (int j=1; j<num2; j++) {
			if (num2%j==0) {
				suma2=suma2+j;
			}
		}
		if (suma1==num2&&suma2==num1) {
			System.out.println("Los números introducidos son amigos");
		}else {
			System.out.println("Los números introducidos no son amigos");
		}
		System.out.println("Introduzca un 1 si quiere finalizar el programa o un 0 si desea continuar");
		decision=entrada.nextInt();
		}while (decision==0);
		

	}

}
