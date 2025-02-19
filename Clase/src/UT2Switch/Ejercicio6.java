package UT2Switch;
import java.util.Scanner;
public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		String medida, resultado;
		int num;
		System.out.println("Introduzca la unidad de medida");
		medida = entrada.next();
		System.out.println("Introduzca el número de unidades");
		num = entrada.nextInt();
		switch (medida) {
		case "cm": num = num * 100;
		medida = "m";
		break;
		case "m": num = num * 1000;
		medida = "km";
		break;
		case "km": num = num/100000;
		medida = "cm";
		break;
		default: num=0;
		medida="X";
		}
		resultado = (medida!="cm" && medida!="m" && medida!="km")? "Unidad de medida o conversión no permitida" : "Operación posible";
		System.out.println(resultado);
		System.out.println("Tras la conversión serían " +num+ " " +medida);
		

	}

}
