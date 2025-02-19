package UT3Métodos;

public class Ejercicio5 {
	static String par (int num1)
	{
		if (num1%2==0) {
			return "Es par";
		}else {
				return "Es impar";
		}
	}

	public static void main(String[] args) {
		int num1=4;
		System.out.println(par(num1));

	}

}
