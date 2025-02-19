package UT4;

public class ejercicioExamen1 {
	static void mostrarMatriz (int [][] matriz) {
		for (int fila[]:matriz) {
			for (int elemento:fila) {
				System.out.print(elemento + " ");
			}
			System.out.println();
			
		}
	}

	public static void main(String[] args) {
		int [][] matriz = {
			new int [4],
			new int [2],
			new int [5],
		};
		
		for (int i = 0; i<matriz.length; i++) {
			for (int j=0; j<matriz[i].length; j++) {
				matriz [i][j] = (int)(Math.random()*10);
			}
		}
		mostrarMatriz (matriz);
		int notaAlta = -1;
		int notaBaja = 11;
		for (int i=0; i<matriz.length; i++) {
			int suma = 0;
			double promedio = 0;
			int contador = 0;
			for (int j=0; j<matriz[i].length; j++) {
				suma += matriz [i][j];
				contador++;
				if (contador==matriz[i].length) {
					promedio = (double)suma/matriz[i].length;
					System.out.println("El promedio de la asignatura " +(i+1)+ " es " +promedio);
				}
				if (matriz [i][j]>notaAlta) {
					notaAlta = matriz [i][j];
				}
				if (matriz [i][j]<notaBaja) {
					notaBaja = matriz [i][j];
				}
				
			}
		}
		System.out.println("La nota más alta de todas ha sido un " +notaAlta);
		System.out.println("La nota más baja de todas ha sido un " +notaBaja);
		

	}

}
