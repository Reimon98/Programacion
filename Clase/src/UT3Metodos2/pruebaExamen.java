package UT3Metodos2;
import java.util.Scanner;

public class pruebaExamen {
	static void Menu () {
		System.out.println("Bienvenido a la calculadora de operaciones");
		System.out.println("1. Comprobar si un número es mágico");
		System.out.println("2. Verificar cuántos digitos son únicos en el número");
		System.out.println("3. Invertir un número");
		System.out.println("4. Cerrar el programa.");
	}
	static boolean Magico (int num) {
		int suma = 0;
		while (num>0) {
			int digito = 0;
			digito = num%10;
			suma += digito;
			num /= 10;
		}
		if (suma%7==0) {
			return true;
		}else {
			return false;
		}
		
		}
	static void convertirArray (int num) {
		String num1 = String.valueOf(num); //Creamos un String con el valor del int dado por parámetro
		int [] numeros = new int [num1.length()]; //Creamos un array con el tamaño del String creado
		for (int i = 0; i<num1.length(); i++) { 
			numeros[i]= Character.getNumericValue(num1.charAt(i)); // Rellenamos el array con los números del String uno por uno
		}
		System.out.println("Los números únicos son:");
		for (int j = 0; j<numeros.length; j++) {
			boolean unico = true;
			for (int z = 0;z<numeros.length; z++) {
				if (j!=z && numeros [j] == numeros [z]) {
					unico = false;
					break;
				}
				
				}
			if (unico) {
				System.out.println(numeros [j]);
			}
		}
	}
	static String invertido (int num) {
		String invertido = "";
		while (num>0) {
			int digito;
			digito = num%10;
			num /= 10;
			invertido += digito;
		}
		return invertido;
	}
	
	

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		Menu();
		boolean continuar = true;
		while (continuar) {
		System.out.println("Introduzca el número de la función que quiera realizar");
		int opcion=0;
		int num;
		opcion = entrada.nextInt();
		switch (opcion) {
		case (1): System.out.println("Introduzca el número a comprobar");
		num = entrada.nextInt();
		if (Magico(num)) {
			System.out.println("El número es mágico");
		}else {
			System.out.println("El número no es mágico");
		}
		break;
		case (2): System.out.println("Introduzca el número a comprobar");
		num = entrada.nextInt();
		convertirArray(num); break;
		case (3): System.out.println("Introduzca el número a comprobar");
		num = entrada.nextInt();
		String resultado = invertido (num);
		System.out.println("El número invertido es: " +resultado);
		break;
		case (4): System.out.println("Finalizando programa");
		continuar = false;
		break;
		default: System.out.println("Opción inválida");
		break;
		}
		}
		
		}
		

	}


