package UT2Final;
import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduzca el número obtenido al lanzar el dado");
		int num = entrada.nextInt();
		if (num>6||num<0) {
			System.out.println("El número introducido no es válido");
		}else {
		
		switch (num) {
		case (1): System.out.println("La cara opuesta es seis"); break;
		case (2): System.out.println("La cara opuesta es cinco"); break;
		case (3): System.out.println("La cara opuesta es cuatro"); break;
		case (4): System.out.println("La cara opuesta es tres"); break;
		case (5): System.out.println("La cara opuesta es dos"); break;
		case (6): System.out.println("La cara opuesta es uno"); break;
		
		}
		
		}

	}
}


