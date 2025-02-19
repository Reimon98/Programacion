package Sucio;
import java.util.Scanner;

public class clase {
	static void menu(){
		System.out.println("Menú de opciones para la poción:");
		System.out.println("añade: Incrementa el poder en 10 unidades");
		System.out.println("quita: Resta 5 unidades de poder");
		System.out.println("duplica: Multiplica el poder actual por 2");
		System.out.println("divide: Divide el poder actual por 2 (si el poder es impar redondea hacia abajo)");
		System.out.println("invoca: Añade un valor aleatorio entre 1 y 15 unidades a la poción");
		System.out.println("finaliza: Acaba el programa y comprueba si la poción es suficiente");
	}
	static double pocion=0;
	static double añade() {
		return (pocion=pocion+10);
	}
	static double quita() {
		return (pocion=pocion-5);
	}
	static double duplica() {
		return (pocion=pocion*2);
	}
	static double divide () {
		return (pocion=pocion/2);
	}
	static double invoca () {
		return pocion=pocion+(int)(Math.random()*15)+1;
	}
	
	
	public static void main (String[] args) {
		Scanner entrada= new Scanner (System.in);
		String comando;
		menu();
		do {
			System.out.println("Introduzca el comando a realizar");
			comando=entrada.next();
			switch(comando){
			case ("añade"): System.out.println("Comando introducido: " +comando);
			añade();
			System.out.println("Poder actual: " +pocion);break;
			case ("quita"): System.out.println("Comando introducido: " +comando);
			quita();
			System.out.println("Poder actual " +pocion);break;
			case ("duplica"): System.out.println("Comando introducido: " +comando);
			duplica();
			System.out.println("Poder actual " +pocion);break;
			case ("divide"): System.out.println("Comando introducido: " +comando);
			divide();
			System.out.println("Poder actual " +pocion);break;
			case ("invoca"): System.out.println("Comando introducido: " +comando);
			invoca();
			System.out.println("Poder actual " +pocion);break;
			case ("finaliza"): System.out.println("Comando introducido: " +comando);
			System.out.println("Operaciones finalizadas");break;
			default: System.out.println("Comando inválido");break;
			
			}
		}while (!comando.equals("finaliza"));
		if (pocion>=100) {
			System.out.println("La poción es suficiente! ");
		}else {
			System.out.println("La poción no ha sido suficiente para enfrentarse al dragón");
		}
		
		
	}
	}

