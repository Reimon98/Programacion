package UT2Practica1;
import java.util.Scanner;
public class Ejercicio7 {
public static void main (String[]args) {
	int num;
	int absoluto;
	int resto;
	System.out.println("Introduzca un número entero");
	Scanner entrada = new Scanner (System.in);
	num = entrada.nextInt();
	absoluto = Math.abs(num);
	resto = num%2;
	System.out.println("El valor absoluto del número introducido es: " +absoluto);
	System.out.println("El cociente de dividir el número por 2 es: " +resto);
}
}