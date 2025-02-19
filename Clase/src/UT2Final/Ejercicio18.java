package UT2Final;
import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduzca el número hasta el que quiere buscar centros numéricos");
		int num=entrada.nextInt();
		int contador=0;
		for (int i=1; i<=num; i++) {
				int suma1=0;
				int suma2=0;
				for (int x=1; x<i; x++) {
					suma1=suma1+x;
				}
				for (int z=i+1; suma2<suma1; z++) {
					suma2=suma2+z;
					if (suma1==suma2) {
						System.out.println(i+ " es un centro numérico.");
						contador++;
					
				}
				
				
				}
			

	}
		System.out.println("Hay un total de " +contador+ " centro/s numéricos en ese intervalo.");
		

}
}
