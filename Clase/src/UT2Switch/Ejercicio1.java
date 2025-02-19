package UT2Switch;
import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		int dia;
		Scanner entrada =  new Scanner (System.in);
		System.out.println("Introduzca un número del 1 al 7");
		dia = entrada.nextInt();
		switch (dia) {
		case 1: System.out.println("Lunes"); break;
		case 2: System.out.println("Martes"); break;
		case 3: System.out.println("Miércoles"); break;
		case 4: System.out.println("Jueves"); break;
		case 5: System.out.println("Viernes"); break;
		case 6: System.out.println("Sábado"); break;
		case 7: System.out.println("Domingo"); break;
		default: System.out.println("Número inválido"); break;
		
		}
		

	}

}
