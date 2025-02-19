package UT2Practica1;
import java.util.Scanner;
public class Ejercicio6 {
public static void main (String[]args) {
	double cateto1;
	double cateto2;
	double hipotenusa;
	Scanner entrada = new Scanner (System.in);
	System.out.println("Introduzca los dos catetos");
	cateto1 = entrada.nextDouble();
	cateto2 = entrada.nextDouble();
	hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
	System.out.println("La hipotenusa del triángulo es: " +hipotenusa);
}
}