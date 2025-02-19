package UT2Final;
import java.util.Scanner;

public class Ejercicio14 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		System.out.println("Introduzca su sueldo bruto");
		int sueldo= entrada.nextInt();
		System.out.println("Introduzca el importe total de su ventas");
		int ventas= entrada.nextInt();
		double comision= ventas*0.05;
		System.out.println("Introduzca el kilometraje realizado");
		int kilometraje= entrada.nextInt();
		System.out.println("Introduzca los días totales de desplazamiento");
		int dias= entrada.nextInt();
		int dietas=dias*60;
		double sueldofinal= sueldo*0.82;
		double sumafinal=sueldofinal+comision+kilometraje+dietas;
		sumafinal=sumafinal-150;
		System.out.println("Su sueldo final a percibir es de " +sumafinal+ " euros.");
		

	}

}
