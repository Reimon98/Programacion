package UT5_6;
import java.util.Scanner;

public class Empleado extends Persona {
	private double sueldo;

    public void cargarSueldo() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el sueldo: ");
        sueldo = entrada.nextDouble();
    }

    public void imprimirSueldo() {
        System.out.println("Sueldo: " + sueldo);
    }
}


