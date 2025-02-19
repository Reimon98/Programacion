package UT2Final;
import java.util.Scanner;
public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		double suma=0;
		double media;
		double nota;
		for (int i=1; i<=6; i++)
		{
			System.out.println("Introduzca la nota de una asignatura");
			nota = entrada.nextDouble();
			suma = suma + nota;
		}
		media = suma/6;
		System.out.println("Su media final es " +media);

	}

}
