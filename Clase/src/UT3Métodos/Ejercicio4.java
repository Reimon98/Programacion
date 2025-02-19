package UT3Métodos;

public class Ejercicio4 {
	static int tabla (int num1, int i)
	{
		return (num1*i);
	}

	public static void main(String[] args) {
		int num1=5;
		for (int i=1; i<=10; i++) {
			int resultado = tabla(num1,i);
			System.out.println(resultado);
		}

	}

}
