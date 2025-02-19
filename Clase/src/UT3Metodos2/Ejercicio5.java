package UT3Metodos2;
import java.util.Scanner;

public class Ejercicio5 {
	static double calcularRaizSuma (int num1, int num2) {
		return Math.sqrt(num1+num2);
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduzca dos números");
		int num1= entrada.nextInt();
		int num2= entrada.nextInt();
		double resultado = calcularRaizSuma(num1,num2);
		System.out.println("La raíd cuadrada de la suma de los números introducidos es: " +resultado);

	}

}
