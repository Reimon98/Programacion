package UT5_9;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

        Direccion direccion1 = new Direccion("Calle Falsa", 123, 3, "Madrid");
        Direccion direccion2 = new Direccion("Avenida Siempre Viva", 456, 2, "Barcelona");
        Direccion direccion3 = new Direccion("Calle Real", 789, 1, "Valencia");

        Empleado empleado1 = new Empleado("Juan", 2500, direccion1);
        Empleado empleado2 = new Empleado("Ana", 3000, direccion2);
        Empleado empleado3 = new Empleado("Pedro", 2200, direccion3);

        mostrarDatosEmpleado(empleado1);
        mostrarDatosEmpleado(empleado2);
        mostrarDatosEmpleado(empleado3);

    }

    public static void mostrarDatosEmpleado(Empleado empleado) {
        System.out.println("Nombre: " + empleado.getNombre());
        System.out.println("Salario: " + empleado.getSalario());
        System.out.println("Dirección:");
        System.out.println("Calle: " + empleado.getDireccion().getCalle());
        System.out.println("Número: " + empleado.getDireccion().getNumero());
        System.out.println("Piso: " + empleado.getDireccion().getPiso());
        System.out.println("Ciudad: " + empleado.getDireccion().getCiudad());
        System.out.println();
    }

	}


