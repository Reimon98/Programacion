package UT3Metodos2;
import java.util.Scanner;

public class Recursivo7 {
	public static int num2=1;
	public static int sumaNumeros (int num1,int num2) {
		if (num2>num1) {
			return 0;
		}
		if (num2<num1) {
			System.out.print(num2+ "+");
		}else {
			System.out.print(num2);
		}
		return num2 + sumaNumeros(num1, num2+1);
	}

	public static void main(String[] args) {
		Scanner entrada= new Scanner (System.in);
		System.out.println("Introduzca un número");
		int num1=entrada.nextInt();
		int resultado = sumaNumeros(num1,num2);
		System.out.println("");
		System.out.println("La suma de todos los números desde 1 hasta " +num1+ " es: " +resultado);

	}

}
