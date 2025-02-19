package UT5_EjercicioAgenda;

public class Cita {
	private int hora;
	private int minutos;
	private String titulo;
	private String texto;
	public int getHora() {
		return hora;
	}
	public void setHora(int hora) {
		this.hora = hora;
	}
	public int getMinutos() {
		return minutos;
	}
	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTexto() {
		return texto;
	}
	public Cita(int hora, int minutos, String titulo, String texto) {
		super();
		this.hora = hora;
		this.minutos = minutos;
		this.titulo = titulo;
		this.texto = texto;
	}
	
	public void modificarTexto (String texto2) {
		texto = texto2;
	}
	@Override
	public String toString() {
		return "Cita [hora=" + hora + ", minutos=" + minutos + ", titulo=" + titulo + ", texto=" + texto + "]";
	}
	

}
