package UT3Métodos;

public class Ejercicio6 {
	static String menu (int num1)
	{
		for (int i=1; i<=num1; i++) {
			System.out.println("Opción " +i);
		}
		return "Opción " +(num1+1)+ ": Finalizar programa.";
		}
	

	public static void main(String[] args) {
		int num1=5;
		System.out.println(menu(num1));

	}

}
