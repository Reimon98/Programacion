package UT3Arrays;

public class Ejercicio1 {
	static void Contador (int num, int...nums) {
		int contador=0;
		for (int i=0; i<nums.length; i++) {
			if (num==nums[i]) {
				contador++;
			}
			
		}
		System.out.println("El número aparece un total de " +contador+ " veces.");
	}

	public static void main(String[] args) {
		Contador (4, 5,8,9,4,3,2,4,1,4);

	}

}
