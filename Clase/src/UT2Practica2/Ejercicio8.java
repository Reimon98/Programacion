package UT2Practica2;
import java.util.Scanner;
public class Ejercicio8 {

	public static void main(String[] args) {
		String membresia;
		double num;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduzca su tipo de membresía");
		membresia = entrada.next();
		System.out.println("Introduzca el valor de su compra");
		num = entrada.nextDouble();
		switch (membresia) {
		case "A": System.out.println("Usted tiene un 30% de descuento");
		num = num * 0.3;
		System.out.println("Equivalente a: " +num);
		break;
		case "B": System.out.println("Usted tiene un 20% de descuento");
		num = num * 0.2;
		System.out.println("Equivalente a: " +num);
		break;
		case "C": System.out.println("Usted tiene un 10% de descuento");
		num = num * 0.1;
		System.out.println("Equivalente a: " +num);
		break;
		default: System.out.println("Tipo de membresía inválido.");
		}
		
		
		
		
		
		

	}

}
