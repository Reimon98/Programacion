package UT5_EjercicioAgenda;
import java.util.ArrayList;

public class Pagina {
	private int dia;
	private int mes;
	private int numeroPagina;
	private ArrayList <Cita> citas = new ArrayList<>();
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public ArrayList<Cita> getCitas() {
		return citas;
	}
	public void setCitas(ArrayList<Cita> citas) {
		this.citas = citas;
	}
	
	public Pagina(int dia, int mes, int numeroPagina, ArrayList<Cita> citas) {
		super();
		this.dia = dia;
		this.mes = mes;
		this.numeroPagina = numeroPagina;
		this.citas = citas;
	}
	public void agregarCita (Cita c) {
		citas.add(c);
	}
	
	public void borrarCita (Cita c) {
		citas.remove(c);
	}
	
	public Cita buscarCita(String titulo) {
		for (Cita cita : citas) {
			if (cita.getTitulo().equalsIgnoreCase(titulo)) {
				return cita;
			}
		}
		return null;
	}
	
	public void verCitas () {
		System.out.println("Hay un total de: " +citas.size()+ " citas.");
	}
	
	public String listarCitas() {
		String resultado = " ";
		for (Cita c : citas) {
			resultado += c.toString()+ ", ";
		}
		return resultado;
	}
	@Override
	public String toString() {
		return "Pagina [dia=" + dia + ", mes=" + mes + ", numeroPagina=" + numeroPagina + ", citas=" + citas.size() + "]";
	}
	public int getNumeroPagina() {
		return numeroPagina;
	}
	public void setNumeroPagina(int numeroPagina) {
		this.numeroPagina = numeroPagina;
	}
	
	

}
