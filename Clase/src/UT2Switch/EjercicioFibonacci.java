package UT2Switch;
import java.util.Scanner;
public class EjercicioFibonacci {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int num;
		int j=0;
		int k=0;
		System.out.println("Inserte un número");
		num = entrada.nextInt();
		for (int i=1; i<=num;) {
			System.out.println(i);
			k=i+j;
			j=i;
			i=k;

	}

}
}