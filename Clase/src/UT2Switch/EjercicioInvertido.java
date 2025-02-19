package UT2Switch;
import java.util.Scanner;
public class EjercicioInvertido {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduzca un número");
		String num = entrada.next();
		String reverse = "";
		
		for (int i = num.length()-1;i >= 0;i--) {
			reverse = reverse + num.charAt(i);
		}
		System.out.println(reverse);
	}

}
