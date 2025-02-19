package UT2Practica1;
import java.util.Scanner;
public class Ejercicio4 {
public static void main (String[]args) {
	double suma;
	double resta;
	double multiplicacion;
	double division;
	double a;
	double b;
	System.out.println("Introduzca dos números: ");
	Scanner entrada = new Scanner (System.in);
	a = entrada.nextInt();
	b = entrada.nextInt();
	suma = a+b;
	resta = a-b;
	multiplicacion = a*b;
	division = a/b;
	
	System.out.println("El resultado de la suma es: " +suma);
	System.out.println("El resultado de la resta es: " +resta);
	System.out.println("El resultado de la multiplicacion es: " +multiplicacion);
	System.out.println("El resultado de la división es: " +division);
}
}