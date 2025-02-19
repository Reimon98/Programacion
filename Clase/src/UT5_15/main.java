package UT5_15;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
	        Cuenta cuenta = null;
	        int opcion;

	        do {
	            System.out.println("\nMenu:");
	            System.out.println("1.- Crear cuenta vacía.");
	            System.out.println("2.- Crear cuenta con saldo inicial.");
	            System.out.println("3.- Ingresar dinero.");
	            System.out.println("4.- Sacar dinero.");
	            System.out.println("5.- Ver saldo.");
	            System.out.println("6.- Salir.");
	            System.out.print("Seleccione una opción: ");
	            opcion = entrada.nextInt();

	            switch (opcion) {
	                case 1:
	                    cuenta = new Cuenta();
	                    System.out.println("Cuenta creada con saldo 0.");
	                    break;
	                case 2:
	                    System.out.print("Introduce el saldo inicial: ");
	                    float saldoInicial = entrada.nextFloat();
	                    cuenta = new Cuenta(saldoInicial);
	                    System.out.println("Cuenta creada con saldo inicial de " + saldoInicial + " euros.");
	                    break;
	                case 3:
	                    if (cuenta == null) {
	                        System.out.println("Primero debe crear una cuenta.");
	                    } else {
	                        System.out.print("Introduce la cantidad a ingresar: ");
	                        float cantidadIngreso = entrada.nextFloat();
	                        cuenta.ingresar(cantidadIngreso);
	                        System.out.println("Has ingresado " + cantidadIngreso + " euros.");
	                    }
	                    break;
	                case 4:
	                    if (cuenta == null) {
	                        System.out.println("Primero debe crear una cuenta.");
	                    } else {
	                        System.out.print("Introduce la cantidad a extraer: ");
	                        float cantidadExtraccion = entrada.nextFloat();
	                        cuenta.extraer(cantidadExtraccion);
	                        System.out.println("Has extraído " + cantidadExtraccion + " euros.");
	                    }
	                    break;
	                case 5:
	                    if (cuenta == null) {
	                        System.out.println("Primero debe crear una cuenta.");
	                    } else {
	                        System.out.println("El saldo actual es: " + cuenta.getSaldo() + " euros.");
	                    }
	                    break;
	                case 6:
	                    System.out.println("Saliendo del programa...");
	                    break;
	                default:
	                    System.out.println("Opción no válida, por favor seleccione una opción del 1 al 6.");
	            }
	        } while (opcion != 6);
	    }

	}


