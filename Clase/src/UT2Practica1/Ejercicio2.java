package UT2Practica1;
import java.util.Scanner;
public class Ejercicio2 {
public static void main (String[]args) {
	double celsius;
	Scanner temperatura = new Scanner(System.in);
	System.out.println("Ingrese la temperatura en grados Celsius");
	celsius = temperatura.nextDouble();
	double fahrenheit = (celsius * 9/5) + 32;
	System.out.println("La temperatura en grados Fahrenheit es: " +fahrenheit);
	

}
}
