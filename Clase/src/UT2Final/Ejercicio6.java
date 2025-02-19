package UT2Final;
import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int superior;
		int inferior;
		int num;
		int suma=0;
		int fuera=0;
		int igual=0;
		do {
			System.out.println("Introduzca el límite superior y el límite inferior de un intervalo");
			superior = entrada.nextInt();
			inferior = entrada.nextInt();
		}while (superior<inferior||inferior>superior);
		do {
			System.out.println("Introduzca un número, el 0 en caso de que quiera finalizar el programa y obtener los resultados");
			num = entrada.nextInt();
			if (num<superior&&num>inferior) {
				suma = suma+num;
			}else {
				if (num>superior||num<inferior) {
					fuera++;
				}else {
					if (num==superior||num==inferior) {
						igual++;
					}
				}
			}
		}while (num!=0);
		System.out.println("La suma de los números introducidos es " +suma+ ", la cantidad de números que ha quedado fuera del intervalo es " +fuera+ ", y las veces que se ha repetido un límite del intervalo han sido " +igual);
		

	}

}
