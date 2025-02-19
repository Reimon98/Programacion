package UT2Switch;
import java.util.Scanner;
public class Ejercicio7 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		String nivel;
		int categoria;
		double impuestos;
		impuestos=0;
		System.out.println("Introduzca su categoría de impuestos");
		categoria = entrada.nextInt();
		switch (categoria) {
		case 1: impuestos = 0.05; break;
		case 2: impuestos = 0.10; break;
		case 3: impuestos = 0.15; break;
		case 4: impuestos = 0.20; break;
		default: System.out.println("Categoría inválida");
		}
		nivel = (impuestos < 0.10) ? "Impuesto bajo" : (impuestos <= 0.15) ? "Impuesto medio" : "Impuesto alto";
		System.out.println("Le corresponden un " +impuestos+ "% de impuestos, y se considera un " +nivel);
	}

}
