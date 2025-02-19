package UT3Metodos2;
import java.util.Scanner;

public class Recursivo5 {
	public static String convertirBinario(int num) {
		if (num==0) {
			return "";
		}
		String num1= convertirBinario(num/2);
		return num1+(num%2);
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduzca un número");
		int num1=entrada.nextInt();
		String binario=convertirBinario(num1);
		System.out.println("El número " +num1+ " convertido en binario sería: " +binario);
	}

}
