package UT5_EjercicioCoche;
import java.util.ArrayList;
import java.time.LocalDate;

public class main {

	public static void main(String[] args) {
		ArrayList <Rueda> ruedas = new ArrayList<>();
		ArrayList <Reparacion> reparaciones = new ArrayList <>();
		Estandar miEstandar = new Estandar ("BMW", 4, 13000f, 28000f,
				new Carroceria ("Roja", "Buena"),
				new Motor ("12345A"),
				ruedas,
				reparaciones,
				4);
				
				
		miEstandar.nuevaReparacion(2010,11,04);	
		miEstandar.nuevaReparacion(2018,01,20);	
		miEstandar.nuevaRueda(18f, "Buena");
		miEstandar.nuevaRueda(18f, "Buena");
		miEstandar.nuevaRueda(18f, "Buena");
		miEstandar.nuevaRueda(18f, "Buena");
		System.out.println(miEstandar.toString());
	}

}
