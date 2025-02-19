package UT2Practica2;
import java.util.Scanner;
public class Ejercicio7 {

	public static void main(String[] args) {
		int num;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduzca un número entero");
		num = entrada.nextInt();
		if (num==0) {
			System.out.println("El número es 0");
		}else {
			if (num<0) {
				System.out.println("El número es negativo");
			}else {
				if (num>0&&num%2==0) {
					System.out.println("El número es positivo y par");
				}else {
					if (num>0&&num%2!=0) {
						System.out.println("El número es positivo e impar");
					}
				}
			}
		}

	}

}
