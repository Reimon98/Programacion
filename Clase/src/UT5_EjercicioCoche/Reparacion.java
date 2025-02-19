package UT5_EjercicioCoche;
import java.time.LocalDate;

public class Reparacion {
	private LocalDate fecha;
	
	public Reparacion (LocalDate date) {
		this.fecha=date;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Reparacion [fecha=" + fecha + "]";
	}
	

}
