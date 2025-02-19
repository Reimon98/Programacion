package UT3Metodos2;
import java.util.Scanner;

public class Recursivo1 {
	public static int Potencia (int num1, int num2) {
		if (num2==0) {
			return 1;
		}
		return num1*Potencia(num1,num2-1);
	}

	public static void main(String[] args) {
		int num1;
		int num2;
		do {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Los números solicitados deben ser positivos");
		System.out.println("Introduzca la base de la potencia");
		num1 = entrada.nextInt();
		System.out.println("Introduzca el exponente de la potencia");
		num2= entrada.nextInt();
		}while (num1<0||num2<0);
		int resultado = Potencia(num1,num2);
		System.out.println("El resultado es: " +resultado);

	}

}
