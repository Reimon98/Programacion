package ProyectoEventos;
import java.time.LocalDate;
import java.util.ArrayList;

public class TorneoDeFutbol extends EventoDeportivo implements Ganador {
	
	public ArrayList <Equipo> equipos;

	public TorneoDeFutbol(String nombre, LocalDate fecha, String lugar, ArrayList<Participante> participantes,
			ArrayList<Equipo> equipos) {
		super(nombre, fecha, lugar, participantes);
		this.equipos = equipos;
	}

	public ArrayList<Equipo> getEquipos() {
		return equipos;
	}

	public void setEquipos(ArrayList<Equipo> equipos) {
		this.equipos = equipos;
	}

	public void obtenerGanador () {
		int mejorPuntuacion = 0;
		String ganador;
		for (Equipo equipo : equipos) {
			if (equipo.getPuntos()>mejorPuntuacion) {
				mejorPuntuacion = equipo.getPuntos();
				ganador = equipo.getNombre();
			}
		}
	}
	

}
