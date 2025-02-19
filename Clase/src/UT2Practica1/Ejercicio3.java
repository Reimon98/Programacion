package UT2Practica1;
import java.util.Scanner;
public class Ejercicio3 {
public static void main (String[]args) {
	double area;
	double radio;
	Scanner entrada = new Scanner (System.in);
	System.out.println("Introduzca el radio del círculo");
	radio = entrada.nextDouble();
	area = Math.PI * Math.pow(radio, 2);
	System.out.println("El área del círculo es " +area);
	
}
}