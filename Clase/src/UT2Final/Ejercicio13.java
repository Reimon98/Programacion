package UT2Final;
import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner (System.in);
		int dia1;
		int dia2;
		int hora1;
		int hora2;
		int minutos1;
		int minutos2;
		do {
			System.out.println("Introduzca el día de salida como número, siendo 1 el lunes y 7 el domingo");
			dia1=entrada.nextInt();
		}while (dia1<1||dia1>7);
		do {
			System.out.println("Introduzca la hora de salida en formato digital");
			hora1=entrada.nextInt();
		}while (hora1<0||hora1>23);
		do {
			System.out.println("Introduzca el minuto de salida");
			minutos1=entrada.nextInt();
		}while (minutos1<0||minutos1>59);
		do {
			System.out.println("Introduzca el día de llegada como número, siendo 1 el lunes y 7 el domingo");
			dia2=entrada.nextInt();
		}while (dia2<1||dia2>7);
		do {
			System.out.println("Introduzca la hora de llegada en formato digital");
			hora2=entrada.nextInt();
		}while (hora2<0||hora2>23);
		do {
			System.out.println("Introduzca el minuto de llegada");
			minutos2=entrada.nextInt();
		}while (minutos2<0||minutos2>59);
		dia1=(dia1-1)*24*60;
		minutos1=dia1+(hora1*60)+minutos1;
		dia2=(dia2-1)*24*60;
		minutos2=dia2+(hora2*60)+minutos2;
		if (minutos2<minutos1) {
			System.out.println("La hora de llegada no puede ser antes que la de salida");
		}else {
			int llegada=minutos2-minutos1;
			int horafinal= llegada/60;
			int minutosfinal=llegada -(horafinal*60);
			System.out.println("El viaje tardará " +horafinal+ " horas y " +minutosfinal+ " minutos.");
		}

	}

}
