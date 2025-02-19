package UT4;

import java.util.Arrays;

public class ejercicioExamen2 {
	static void mostrarEdades (int [] array) {
		for (int i=0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int [] edades = new int [15];
		int edadAlta = 17;
		int edadBaja = 61;
		for (int i=0; i<edades.length; i++) {
			edades [i] = (int)((Math.random()*42)+18);
		}
		mostrarEdades(edades);
		Arrays.sort(edades);
		mostrarEdades(edades);
		
		for (int i=0; i<edades.length; i++) {
			if (edades[i]>edadAlta) {
				edadAlta=edades[i];
			}
			if (edades [i]<edadBaja) {
				edadBaja=edades[i];
			}
		}
		int contador1=0;
		int edad1=0;
		int contador2=0;
		int edad2=0;
		int contador3=0;
		int edad3=0;
		int contador=0;
		for (int i=0; i<edades.length; i++) {
			if (contador>contador1) {
				contador1=contador;
				edad1= edades[i];
			}else {
				if (contador>contador2) {
					contador2=contador;
					edad2= edades[i];
			}else {
				if (contador>contador3) {
					contador3=contador;
					edad3=edades[i];
			
			}
			
			}
		}
			for (int j=0; j<edades.length; j++) {
				contador=0;
				if (edades[j]==edades[i]) {
					contador++;
				}
				
		}
		}
		System.out.println("La edad más alta es " +edadAlta);
		System.out.println("La edad más baja es " +edadBaja);
		if (edad1==edad2||edad2==edad3||edad3==edad1) {
			System.out.println("Hay un empate en la cantidad de veces que se repite una edad.");
		}
		System.out.println("Las edades más repetidas son " +edad1+ " un total de " +contador1+ " veces, " +edad2+ " un total de " +contador2+ " veces, y " +edad3+ " un total de " +contador3+ " veces.");

	

}
}
