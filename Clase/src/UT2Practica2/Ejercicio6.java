package UT2Practica2;
import java.util.Scanner;
public class Ejercicio6 {

	public static void main(String[] args) {
		int lado1, lado2, lado3;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduzca las longitudes de los lados del triángulo");
		lado1 = entrada.nextInt();
		lado2= entrada.nextInt();
		lado3= entrada.nextInt();
		if (lado1==lado2&&lado1==lado3&&lado2==lado3){
			System.out.println("El triángulo es equilátero");
		}else {
			if (lado1==lado2||lado1==lado3||lado2==lado3) {
				System.out.println("El triángulo es isósceles");
			}else {
				if (lado1!=lado2&&lado1!=lado3&&lado2!=lado3) {
					System.out.println("El triángulo es escaleno");
				}
			}
		}
		

	}

}
