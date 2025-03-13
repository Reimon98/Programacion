package ProyectoEventos;
import java.util.*;
import java.time.LocalDate;

public class Main {
	
	public void crearParticipante(Scanner scanner) {
		try {
		System.out.println("Inserte el nombre del participante.");
		String nombre = scanner.next();
		System.out.println("Inserte el apellido del participante.");
		String apellido = scanner.next();
		System.out.println("Inserte la edad del participante");
		int edad = scanner.nextInt();
		Participante participante = new Participante (nombre, apellido, edad);
		} catch (ParticipanteNoValidoException e) {
			System.out.println("Error: " +e.getMessage());
			scanner.nextLine();
		}
	}
	
	public void crearCarrera (Scanner scanner) {
		try {
			System.out.println("Inserte el nombre de la carrera.");
			String nombre = scanner.next();
			System.out.println("Introduzca el año de la carrera");
			int año = scanner.nextInt();
			System.out.println("Introduzca el mes de la carrera.");
			int mes = scanner.nextInt();
			System.out.println("Introduzca el día de la carrera.");
			int dia = scanner.nextInt();
			LocalDate fecha = LocalDate.of(año, mes, dia);
			System.out.println("Introduzca el lugar donde se hará la carrera.");
			String lugar = scanner.next();
			ArrayList <Participante> participantes = new ArrayList<>();
			System.out.println("Introduzca la distancia de la carrera.");
			double distancia = scanner.nextDouble();
			Carrera carrera = new Carrera (nombre, fecha, lugar, participantes, distancia);
		}catch(InputMismatchException e) {
			System.out.println("Error: Tipo de dato introducido incorrecto.");
			scanner.nextLine();
		}
	}
	
	public void crearTorneo (Scanner scanner) {
		try {
			System.out.println("Inserte el nombre del torneo.");
			String nombre = scanner.next();
			System.out.println("Introduzca el año del torneo.");
			int año = scanner.nextInt();
			System.out.println("Introduzca el mes del torneo.");
			int mes = scanner.nextInt();
			System.out.println("Introduzca el día del torneo.");
			int dia = scanner.nextInt();
			LocalDate fecha = LocalDate.of(año, mes, dia);
			System.out.println("Introduzca el lugar donde se hará el torneo.");
			String lugar = scanner.next();
			ArrayList <Participante> participantes = new ArrayList<>();
			ArrayList <Equipo> equipos = new ArrayList<>();
			TorneoDeFutbol torneo = new TorneoDeFutbol (nombre, fecha, lugar, participantes, equipos);
		}catch(InputMismatchException e) {
			System.out.println("Error: Tipo de dato introducido incorrecto.");
			scanner.nextLine();
		}
	}
	
	public void crearEquipo (Scanner scanner) {
		try {
		System.out.println("Introduzca el nombre del equipo.");
		String nombre = scanner.next();
		ArrayList <Participante> jugadores = new ArrayList<>();
		Equipo equipo = new Equipo (nombre, jugadores);
		}catch(InputMismatchException e) {
			System.out.println("Error: Tipo de dato introducido incorrecto.");
			scanner.nextLine();
			}
		}
	
	public static void main(String[] args) {
		boolean menu = true;
		
		while (menu) {
			System.out.println("Bienvenido al menú, seleccione la opción que desea realizar:");
		}
		
	}
}
