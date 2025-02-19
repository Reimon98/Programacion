package UT4;

public class EjerciciosMatrices2 {
	static int [][] crearMatriz (int n){ //Creamos un método para obtener una matriz con el tamaño dado por n
		int matriz [][]= new int [n][n];
		for (int i = 0; i < matriz.length; i++) {
	            for (int j = 0; j < matriz.length; j++) {
	                matriz[i][j] = (int)(Math.random()*9)+1; //La rellenamos utilizando números aleatorios según la vamos recorriendo
	            }
		 }
		 return matriz;
	}
	
	static int [][] fusion (int [][] m1, int [][] m2) {
		int m3 [][]= new int [m1.length][m1.length];
		for (int i = 0; i < m3.length; i++) {
			for (int j = 0; j < m3.length; j++) {
				int relleno = (m1[i][j]>m2[i][j])?m1[i][j]:m2[i][j]; //Dentro del bucle que recorrerá la matriz utilizamos un operador ternario para obtener el valor más alto de las dos matrices dadas por parámetro, y otorgárselo a relleno, que se utilizará para rellenar, como su nombre indica, la nueva matriz
				m3[i][j]=relleno;
			}
		}
		return m3;
	}
	
	static void imprimirMatriz(int[][]m) { //Método para imprimir las matrices
		for (int[] i : m) {
	        for (int j : i) {
	            System.out.print(j + " ");
	        }
	        System.out.println();
		}
	}

	public static void main(String[] args) {
		int [][] matriz1 = crearMatriz(4);
		int [][] matriz2 = crearMatriz(4);
		int [][] matriz3 = fusion (matriz1, matriz2);
		imprimirMatriz(matriz1);
		System.out.println(" ");
		imprimirMatriz(matriz2);
		System.out.println(" ");
		imprimirMatriz(matriz3);
	}

}
