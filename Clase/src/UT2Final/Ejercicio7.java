package UT2Final;
import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int num;
		int impar;
		int contador=0;
		do {
			System.out.println("Introduzca un número mayor que 0");
			num= entrada.nextInt();
			if (num<=0) {
				System.out.println("Número inválido");
			}
		}while (num<=0);
		for (int i=1; i<num; i++) {
			if (i%3==0) {
				System.out.println(i);
				contador++;
			}
		}
		System.out.println("Estos son todos los múltiplos de 3 existentes entre 1 y el número introducido, son un total de " +contador);

	}

}
