package UT3Metodos2;
import java.util.Scanner;

public class Recursivo2 {
	public static void Invertido (int num1) {
		if (num1==0) {
			return;
		}
		System.out.print(num1%10);
		Invertido(num1/10);
		
		
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduzca un número");
		int num = entrada.nextInt();
		System.out.println("El número invertido es:");
		Invertido(num);
		
		

	}

}
