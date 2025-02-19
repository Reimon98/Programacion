package UT5Objetos;
import java.util.ArrayList;

public class PruebaClase {

	public static void main(String[] args) {
		ArrayList <Integer> numeros = new ArrayList();
		numeros.add(3);
		numeros.add(8);
		numeros.add(10);
		System.out.println(numeros.toString());
		numeros.remove(Integer.valueOf(3));
		System.out.println(numeros.toString());

	}

}
