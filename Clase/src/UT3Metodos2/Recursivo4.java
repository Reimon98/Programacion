package UT3Metodos2;
import java.util.Scanner;

public class Recursivo4 {
	public static boolean esBinario (int num) {
		if (num==0) {
			return true;
		}
		int binario= num%10;
		if (binario!=0&&binario!=1) {
			return false;
		}
		return esBinario (num/10);
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduzca un número");
		int num = entrada.nextInt();
		if (esBinario(num)) {
			System.out.println("El número es binario!");
		}else {
			System.out.println("El número no es binario");
		}

	}

}
