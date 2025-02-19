package UT2Practica2;
import java.util.Scanner;
public class Ejercicio9 {

	public static void main(String[] args) {
		int nota;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduzca la nota del examen");
		nota = entrada.nextInt();
		if (nota>=90) {
			System.out.println("Resultado excelente");
		}else {
			if (nota>=70&&nota<=89) {
				System.out.println("Resultado bueno");
			}else {
				if (nota>=50&&nota<=69) {
					System.out.println("Resultado regular");
				}else {
					if (nota<50) {
						System.out.println("Suspenso");
					}else {
						if (nota>100||nota<0) {
							System.out.println("Nota inválida");
						}
					}
				}
			}
		
	}
}
}