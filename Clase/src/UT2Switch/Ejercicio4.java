package UT2Switch;
import java.util.Scanner;
public class Ejercicio4 {

	public static void main(String[] args) {
		int num;
		String votacion;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduzca su edad");
		num = entrada.nextInt();
		votacion = num>=18 ? "Puede votar" : "No puede votar";
		System.out.println(votacion);

	}

}
