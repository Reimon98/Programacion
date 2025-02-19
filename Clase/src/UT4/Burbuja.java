package UT4;

import java.util.Arrays;

public class Burbuja {
	static void burbuja (int [] array) {
		
		for (int i=0; i<array.length-1; i++) {
			for (int j=0; j<array.length-1-i; j++) { //Creamos un bucle for anidado para recorrer el array, en cada bucle se restará 1 más al recorrido, porque al final de cada el número más grande quedará a la derecha
				if (array [j] > array [j+1]) { //Comparamos los valores para ir moviendo el número mayor hacia la derecha
					int mayor = array[j]; //Variable int auxiliar para guardar el valor que va a ser intercambiado
					array[j]= array[j+1];
					array[j+1]=mayor;
					System.out.println(Arrays.toString(array)); //He puesto un print aquí para que en el ejemplo se viera el proceso de ordenación uno por uno
					
				}
			}
		}
	}

	public static void main(String[] args) {
		int [] numeros = {23, 50, 31, 97, 89, 2, 55, 38};
		burbuja (numeros);

	}

}
