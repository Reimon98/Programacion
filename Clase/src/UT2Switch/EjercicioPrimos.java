package UT2Switch;
import java.util.Scanner;
public class EjercicioPrimos {

	public static void main(String[] args) {
		int num;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduzca un número");
        num = entrada.nextInt();
        for (int i = 2; i < num; i++) {
            int divisores = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    divisores++;
                }
            }
            if (divisores == 2) {
                System.out.println(i);
				
			}
		}
        System.out.println("Estos son los números primos existentes hasta llegar al número introducido");

	}
}

