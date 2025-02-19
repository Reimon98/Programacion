package UT2Practica1;
import java.util.Scanner;
public class Ejercicio9 {
public static void main (String[]args) {
	double num;
	double r1;
	double r2;
	Scanner entrada = new Scanner (System.in);
	System.out.println("Inserte un número decimal");
	num = entrada.nextDouble();
	r1 = (Math.ceil(num));
	r2 = (Math.floor(num));
	System.out.println("El número redondeado hacia arriba es: " +r1);
	System.out.println("El número redondeado hacia abajo es: " +r2);
}
}