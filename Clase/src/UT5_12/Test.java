package UT5_12;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);

	        Empleado[] empleados = new Empleado[3];

	        for (int i = 0; i < 3; i++) {
	            System.out.println("Empleado " + (i + 1) + ":");
	            System.out.print("Introduce el nombre: ");
	            String nombre = entrada.nextLine();
	            System.out.print("Introduce el número de horas trabajadas: ");
	            int horasTrabajadas = entrada.nextInt();
	            System.out.print("Introduce la tarifa por hora: ");
	            double tarifaPorHora = entrada.nextDouble();
	            entrada.nextLine();
	          

	            empleados[i] = new Empleado(nombre, horasTrabajadas, tarifaPorHora);
	        }

	        for (int i = 0; i < 3; i++) {
	            System.out.println(empleados[i].nombre + " tiene un sueldo bruto de: " + empleados[i].calcularSueldo() + " euros.");
	        }
	    }

	}


