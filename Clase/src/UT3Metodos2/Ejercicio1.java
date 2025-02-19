package UT3Metodos2;
import java.util.Scanner;

public class Ejercicio1 {
	static double calcularPromedio (double num1, double num2, double num3) {
		return (num1+num2+num3)/3;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduzca tres números para calcular su promedio");
		double num1 = entrada.nextInt();
		double num2 = entrada.nextInt();
		double num3 = entrada.nextInt();
		double promedio = calcularPromedio(num1,num2,num3);
		System.out.println("El promedio es: " +promedio);
		

	}

}
