package UT4;

public class EjerciciosMatrices1 {
	static int [][] crearMatriz (int n){
		int matriz [][]= new int [n][n];
		for (int i = 0; i < matriz.length; i++) {
	            for (int j = 0; j < matriz.length; j++) {
	                matriz[i][j] = (int)(Math.random()*9)+1;
	            }
		 }
		 return matriz;
	}
	static void imprimirMatriz(int[][]m) {
		for (int[] i : m) {
	        for (int j : i) {
	            System.out.print(j + " ");
	        }
	        System.out.println();
		}
		
	}
	
	static void DiagonalInvertida (int [][]m) {
		System.out.println("La diagonal invertida de derecha a izquierda sería:");
		for (int i = m.length-1; i>=0; i--) {
			System.out.println(m[i][i]);
		}
	}
	
	static void DiagonalInvertida2 (int[][]m) {
		System.out.println("La diagonal invertida de izquierda a derecha sería:");
		 for (int i = m.length-1; i>=0; i--) {
		        System.out.println(m[i][m.length - 1 - i]);
		    }
				
		}
	
		
	public static void main(String[] args) {
	 int[][] matriz = crearMatriz (4);
	 imprimirMatriz (matriz);
	 DiagonalInvertida(matriz);
	 DiagonalInvertida2(matriz);

	}

}
