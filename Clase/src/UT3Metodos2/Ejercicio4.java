package UT3Metodos2;
import java.util.Scanner;

public class Ejercicio4 {
	static String vacio = "";
	static String generarEstrellas (String vacio, int num) {
		for (int i=1; i<=num;i++) {
			vacio+="*";
			
		}
		return vacio;
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int num;
		do {
		System.out.println("Introduzca un número entero");
		num=entrada.nextInt();
		}while (num<0);
		String estrellas = generarEstrellas(vacio,num);
		System.out.println(estrellas);
		

	}

}
