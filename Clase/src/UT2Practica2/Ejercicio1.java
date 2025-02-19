package UT2Practica2;
import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		int num;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduzca un número.");
		num = entrada.nextInt();
		if (num%2==0) {
			System.out.println("El número es par");
		}else {
				System.out.println("El número introducido es impar.");
		}
		

	}

}
