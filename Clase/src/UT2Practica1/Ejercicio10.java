package UT2Practica1;
import java.util.Scanner;
public class Ejercicio10 {
public static void main (String[]args) {
	Scanner entrada = new Scanner (System.in);
	int año1;
	int año2 = 2024;
	int año3;
	System.out.println("Inserte su año de nacimiento");
	año1 = entrada.nextInt();
	año3 = año2-año1;
	System.out.println("Tu edad actual es: " +año3+ " años.");
}
}