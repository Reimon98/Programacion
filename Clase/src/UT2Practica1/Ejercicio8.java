package UT2Practica1;
import java.util.Scanner;
public class Ejercicio8 {
public static void main (String[]args) {
	double horas;
	double minutos;
	double segundos;
	Scanner entrada = new Scanner (System.in);
	System.out.println("Ingrese una cantidad de horas");
	horas = entrada.nextDouble();
	minutos = horas*60;
	segundos = horas*3600;
	System.out.println("Hay " +minutos+ " minutos en las horas introducidas");
	System.out.println("Hay " +segundos+ " segundos en las horas introducidas");
}
}