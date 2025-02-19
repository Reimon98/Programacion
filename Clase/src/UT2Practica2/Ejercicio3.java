package UT2Practica2;
import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		int nota;
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduza su nota.");
		nota = entrada.nextInt();
		if (nota>100||nota<0) {
			System.out.println("La nota introducida no es válida.");
		}else {
			if (nota>=90&&nota<=100) {
				System.out.println("Su calificación es una A.");
			}else {
				if (nota>=80&&nota<=89) {
					System.out.println("Su calificación es una B.");
			}else {
				if (nota>=70&&nota<=79) {
					System.out.println("Su calicifación es una C.");
			}else {
				if  (nota>=60&&nota<=69) {
					System.out.println("Su calificación es una D.");
				}else {
					if (nota<60) {
						System.out.println("Su calificación es una F.");
					}
				}
			}
		}
	}

}
}
}