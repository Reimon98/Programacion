package UT5_17;
import java.util.Scanner;

public class MainGestionPlaza {

	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
	        PlazaAparcamiento plaza = new PlazaAparcamiento(1);
	        int opcion;

	        do {
	            System.out.println("\nPLAZA APARCAMIENTO");
	            System.out.println("1. Aparcar coche");
	            System.out.println("2. Sacar coche");
	            System.out.println("3. Ver coche aparcado");
	            System.out.println("4. Salir aplicacion");
	            System.out.print("OPCION: ");
	            opcion = entrada.nextInt();

	            switch (opcion) {
	                case 1: 
	                    if (plaza.isDisponible()) {
	                        System.out.println("Introduce los datos del coche:");
	                        System.out.print("Matrícula: ");
	                        String matricula = entrada.next();
	                        System.out.print("Marca: ");
	                        String marca = entrada.next();
	                        System.out.print("Modelo: ");
	                        String modelo = entrada.next();

	                        Coche coche = new Coche(matricula, marca, modelo);
	                        plaza.aparcarCoche(coche);
	                    } else {
	                        System.out.println("La plaza ya está ocupada por otro coche.");
	                    }
	                    break;
	                case 2: 
	                    plaza.sacarCoche();
	                    break;
	                case 3: 
	                    plaza.verCocheAparcado();
	                    break;
	                case 4: 
	                    plaza.mostrarPlaza();
	                    System.out.println("Saliendo de la aplicación...");
	                    break;
	                default:
	                    System.out.println("Opción no válida, por favor selecciona una opción entre 1 y 4.");
	            }
	        } while (opcion != 4);
	    }

	}


