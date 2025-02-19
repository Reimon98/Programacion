package UT2Final;
import java.util.Scanner;

public class Ejercicio12 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int contador1=0;
		int contador2=0;
		int contador3=0;
		int contador4=0;
		int contador5=0;
		int contador6=0;
		int dado;
		System.out.println("¿Cuántas veces va a querer tirar el dado?");
		int num= entrada.nextInt();
		for (int i=1; i<=num; i++) {
			dado = (int)(Math.random()*6)+1;
			switch (dado) {
			case (1): contador1++;break;
			case (2): contador2++;break;
			case (3): contador3++;break;
			case (4): contador4++;break;
			case (5): contador5++;break;
			case (6): contador6++;break;
			}
		}
		contador1=(contador1*100)/num; System.out.println("El 1 ha salido el " +contador1+ "% de las veces.");
		contador2=(contador2*100)/num; System.out.println("El 2 ha salido el " +contador2+ "% de las veces.");
		contador3=(contador3*100)/num; System.out.println("El 3 ha salido el " +contador3+ "% de las veces.");
		contador4=(contador4*100)/num; System.out.println("El 4 ha salido el " +contador4+ "% de las veces.");
		contador5=(contador5*100)/num; System.out.println("El 5 ha salido el " +contador5+ "% de las veces.");
		contador6=(contador6*100)/num; System.out.println("El 6 ha salido el " +contador6+ "% de las veces.");
		

	}

}
