package UT3Metodos2;
import java.util.Scanner;

public class ejercicioFInal {
	static int calcularMCD (int aaa, int bbb) {
		if (bbb==0) return aaa;
		return calcularMCD (bbb, aaa%bbb);
	}
	static boolean calcularSumaDigitos (String num) {
		int suma=0;
		for (int i=0; i<=num.length()-1; i++) {
			suma += num.charAt(i);
		}
		if (suma%2==0) {
			return true;
		}else {
			return false;
		}
	}
	static boolean esNumeroMagico (int mmm) {
		int divisores=0;
		for (int i=1; i<=mmm; i++) {
			if (mmm%i==0) {
				divisores++;
			}
		}
		if (divisores==3) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		String num="";
		int a=0;
		int b=0;
		int c=0;
		do {
			System.out.println("Introduce un número, la suma de sus dígitos debe ser un número par para pasar a la siguiente prueba");
			num=entrada.next();
			if ((calcularSumaDigitos(num))==false) {
				System.out.println("El requisito no se ha cumplido.");
			}
		}while ((calcularSumaDigitos(num))==false);
		System.out.println("¡Lo has conseguido!");
		do {
		System.out.println("Para la siguiente prueba deberás introducir dos números cuyo máximo común divisor sea mayor que 1");
		a=entrada.nextInt();
		b=entrada.nextInt();
		if ((calcularMCD (a,b)<=1)) {
			System.out.println("El requisito no se ha cumplido.");
		}
		}while ((calcularMCD (a,b)<=1));
		System.out.println("¡Muy bien! Ya sólo queda una prueba");
		do {
			System.out.println("Por último, introduce un número que sólo tenga tres divisores");
			c=entrada.nextInt();
			if ((esNumeroMagico(c))==false) {
				System.out.println("El requisito no se ha cumplido.");
			}
		}while ((esNumeroMagico(c))==false);
		System.out.println("¡Lo lograste!");

	}

}
