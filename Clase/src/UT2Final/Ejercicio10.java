package UT2Final;
import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int num;
		int aleatorio= (int)(Math.random()*100)+1;
		System.out.println("Intenta adivinar el número! Está entre 1 y 100");
		do {
			num = entrada.nextInt();
			if (num<1||num>100){
				System.out.println("El número introducido está fuera del rango, prueba de nuevo");
			}else {
				if (num<aleatorio) {
					System.out.println("El número secreto es más grande, prueba de nuevo!");
				}else {
					if (num>aleatorio) {
						System.out.println("El número secreto es más pequeño, prueba de nuevo!");
					}
				}
			}
		}while (num!=aleatorio);
		System.out.println("Acertaste!");

	}

}
