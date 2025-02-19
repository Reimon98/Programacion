package UT2Final;
import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner (System.in);
		int num1;
		int num2;
		int operacion;
		int resultado;
		System.out.println("Introduzca dos números");
		num1= entrada.nextInt();
		num2= entrada.nextInt();
		do {
		System.out.println("A continuación, introduzca 1 si quiere sumarlos, 2 si quiere restarlos, 3 para multiplicarlos, 4 para dividirlos y 5 para finalizar el programa");
		operacion = entrada.nextInt();
		switch (operacion) {
		case (1): resultado=num1+num2; System.out.println("El resultado es " +resultado);break;
		case (2): resultado=num1-num2; System.out.println("El resultado es " +resultado);break;
		case (3): resultado=num1*num2; System.out.println("El resultado es " +resultado);break;
		case (4):
			if (num2!=0) {
				resultado=num1/num2; System.out.println("El resultado es " +resultado);break;
			}else {
				System.out.println("No es posible dividir por 0");break;
			}
		case (5): System.out.println("Programa finalizado");break;
		default: System.out.println("Número introducido inválido");break;
		}
		}while (operacion!=5);

	}

}
