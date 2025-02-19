package UT2Final;

public class Ejercicio8 {

	public static void main(String[] args) {
		int pares=0;
		int impares=0;
		for (int i=1; i<100; i++) {
			if (i%2==0) {
				pares=pares+i;
			}else {
				impares=impares+i;
			}
		}
		System.out.println("La suma de los números pares entre 1 y 100 es: " +pares+ ", y la de los impares: " +impares);
		

	}

}
