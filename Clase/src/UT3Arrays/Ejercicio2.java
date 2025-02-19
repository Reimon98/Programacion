package UT3Arrays;

public class Ejercicio2 {
	static void Largo (String...cadenas) {
		String largo1="";
		String largo2="";
		largo1.equals(cadenas[0].length());
		for (int i=1; i<cadenas.length; i++) {
			if (cadenas[i].length()>cadenas[i-1].length()) {
				largo1.equals(cadenas[i].length());
				largo2.equals(cadenas[i]);
			}
		}
		System.out.println("La cadena de texto más larga es:" +largo2);
	}

	public static void main(String[] args) {
		Largo("abd", "abcdf", "jksbdhfbakfs", "mnsabd");

	}

}
