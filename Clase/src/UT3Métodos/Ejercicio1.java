package UT3Métodos;
import java.util.Scanner;
public class Ejercicio1 {
	static String nombre ( String nom)
	{
		return "Bienvenido " +nom;
	}
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduzca su nombre");
		String nom = entrada.next();
		System.out.println(nombre(nom));
		

	}
}


