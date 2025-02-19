package UT2Final;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int contadorPos=0;
		int sumaPos=0;
		int contadorNeg=0;
		int sumaNeg=0;
		int contadorCeros=0;
		int num;
		System.out.println("Introduzca diez números");
		for (int i=1; i<=10; i++) {
			num = entrada.nextInt();
			if (num<0){
				contadorNeg++;
				sumaNeg=sumaNeg+num;
			}else {
				if (num==0) {
					contadorCeros++;
				}else {
					if (num>0) {
						contadorPos++;
						sumaPos=sumaPos+num;
					}
				}
			}
		}
		int totalPos=sumaPos/contadorPos;
		int totalNeg=sumaNeg/contadorNeg;
		System.out.println("La media de los números positivos introducidos es " +totalPos+ ", la de los negativos " +totalNeg+ ", y la cantidad de ceros introducidos es " +contadorCeros);

	}

}
