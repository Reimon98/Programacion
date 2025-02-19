package UT3Arrays;

public class Ejercicio3 {
	static void Comparar (char a, String...cadenas) {
		int contador=0;
		for (int i=0; i<cadenas.length; i++) {
			if (a==cadenas[i].charAt(0));
			contador++;
				
			}
		System.out.println("El carácter aparece en primer lugar un total de :" +contador+ "veces");
		}

	

	public static void main(String[] args) {
		char a='a';
		Comparar(a, "abcdf", "cdfg", "kjhgs", "akj");

	}

}
