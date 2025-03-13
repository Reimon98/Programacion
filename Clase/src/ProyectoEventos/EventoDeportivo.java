package ProyectoEventos;
import java.time.LocalDate; 
import java.util.ArrayList;

public abstract class EventoDeportivo implements Ganador {
	
	private String nombre;
	private LocalDate fecha;
	private String lugar;
	public ArrayList <Participante> participantes;
	
	public EventoDeportivo(String nombre, LocalDate fecha, String lugar, ArrayList<Participante> participantes) {
		super();
		this.nombre = nombre;
		this.fecha = fecha;
		this.lugar = lugar;
		this.participantes = participantes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public ArrayList<Participante> getParticipantes() {
		return participantes;
	}

	public void setParticipantes(ArrayList<Participante> participantes) {
		this.participantes = participantes;
	}
	
	public void inscribirParticipante (Participante participante) {
		participantes.add(participante);
	}
	
	public abstract void obtenerGanador();
	
	
	
	
	

}
