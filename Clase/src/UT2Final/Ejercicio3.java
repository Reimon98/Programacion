package UT2Final;
import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int num;
		int divisores;
		int primos = 0;
		do {
			System.out.println("Introduzca un número positivo (Máximo 100)");
			num = entrada.nextInt();
		}while (num>100||num<0);
		for (int i=2; i<=num; i++)
		{
			divisores=0;
			for (int j=1; j<=i; j++)
			{
				if (i%j==0) {
					divisores = divisores+1;
			}
			}
			if (divisores==2) {
				primos = primos+1;
			}
		}
		System.out.println("Hay un total de " +primos+ " números primos hasta el número introducido.");

	}

}
