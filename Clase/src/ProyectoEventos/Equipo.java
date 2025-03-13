package ProyectoEventos;
import java.util.ArrayList;
import java.util.Scanner;

public class Equipo {
	Scanner entrada = new Scanner (System.in);
	
	private String nombre;
	private ArrayList <Participante> jugadores;
	private int puntos;
	
	public Equipo(String nombre, ArrayList<Participante> jugadores) {
		this.nombre = nombre;
		this.jugadores = jugadores;
		puntos = 0;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public ArrayList<Participante> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<Participante> jugadores) {
		this.jugadores = jugadores;
	}

	public int getPuntos() {
		return puntos;
	}

	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	
	public void añadirJugador (Participante participante) {
		jugadores.add(participante);
	}
	
	public void eliminarJugador () throws JugadorNoEncontradoException {
		
		System.out.println("Introduzca el nombre del jugador");
		String n = entrada.next();
		System.out.println("Introduzca el apellido del jugador");
		String a = entrada.next();
		
		Participante eliminado = null;
		
		for (Participante participante : jugadores) {
			if (participante.getNombre().equalsIgnoreCase(n)&&participante.getApellido().equalsIgnoreCase(a)) {
				eliminado = participante;
				break;
			}
		}
		
		if (eliminado == null) {
			throw new JugadorNoEncontradoException ("El jugador buscado no existe");
		} else {
			jugadores.remove(eliminado);
		}
		
	
		
	}

	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", jugadores=" + jugadores + ", puntos=" + puntos + "]";
	}
	
	
	
	
	

}
