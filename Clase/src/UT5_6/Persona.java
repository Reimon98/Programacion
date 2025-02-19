package UT5_6;
import java.util.Scanner;

public class Persona {
	private String nombre;
    private int edad;

    public void cargarDatos() {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el nombre: ");
        nombre = entrada.nextLine();
        System.out.print("Ingrese la edad: ");
        edad = entrada.nextInt();
    }

    public void imprimirDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}


