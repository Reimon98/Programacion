package UT5Objetos;

public class Ejercicio_Inmutables {
	public static void Modificar (int num) {
		num = 10;
	}

	public static void main(String[] args) {
		int num = 5; //Ejercicio 2: Creamos un int que va a ser modificado con el método de más arriba para hacer el paso por valor
		System.out.println("Valor inicial de num: " +num);
		Modificar (num);
		System.out.println("Valor de num después del método: " +num);
		Prueba Prueba = new Prueba(4); 
		Prueba Prueba2 = new Prueba(10);
		//Creamos objetos para mostrar el paso por referencia y su diferencia con el de valor, además, el valor X que mostrará es un static para ver su uso como pide el Ejercicio 1. 
		Prueba.MostrarValores();
		Prueba2.MostrarValores();
		String cadena = "ABCDEF";
		String cadena2 = cadena;
		// Ejercicio 3: Creamos dos strings, en el que el segundo apuntará al primero.
		cadena += "JKLM";
		// Al hacer este cambio, lo que está haciendo es crear un nuevo String llamado cadena con las nuevas letras añadidas en lugar de modificar el anterior, como vemos al imprimir cadena2.
		System.out.println(cadena);
		System.out.println(cadena2);
		

	}

}
