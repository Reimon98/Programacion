package UT2Practica2;
import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		int num1, num2, num3;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduzca tres números.");
		num1  = entrada.nextInt();
		num2 = entrada.nextInt();
		num3 = entrada.nextInt();
		if (num1>num2&&num1>num3) {
			System.out.println(num1+" es el número más grande.");
		}else {
			if (num2>num1&&num2>num3) {
				System.out.println(num2+ " es el número más grande.");
			}else {
				if (num3>num1&&num3>num2) {
					System.out.println(num3+ " es el número más grande.");
				}
			}
		}
		

	}

}
