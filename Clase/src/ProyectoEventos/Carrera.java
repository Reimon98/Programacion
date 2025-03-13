package ProyectoEventos;

import java.time.LocalDate;
import java.util.ArrayList;

public class Carrera extends EventoDeportivo implements Ganador {
	
	private double distancia;

	public Carrera(String nombre, LocalDate fecha, String lugar, ArrayList<Participante> participantes,
			double distancia) {
		super(nombre, fecha, lugar, participantes);
		this.distancia = distancia;
	}

	public double getDistancia() {
		return distancia;
	}

	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}
	
	public void inscribirParticipante(Participante participante, int tiempo) {
		participante.setTiempo(tiempo);
		this.participantes.add(participante);
	}
	
	public void obtenerGanador() {
		int mejorTiempo = 0;
		String ganador;
		for (Participante participante : participantes) {
			if (participante.getTiempo()>mejorTiempo) {
				mejorTiempo = participante.getTiempo();
				ganador = (participante.getNombre()+ " " +participante.getApellido());
			}
		}
	}

}
