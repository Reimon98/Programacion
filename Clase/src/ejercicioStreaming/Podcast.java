package ejercicioStreaming;

public class Podcast {
	
	private String nombre;
	private int episodio;
	private TipoContenido tipo = TipoContenido.PODCAST;
	private boolean encendido = true;
	public Podcast(String nombre, int episodio) {
		super();
		this.nombre = nombre;
		this.episodio = episodio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEpisodio() {
		return episodio;
	}
	public void setEpisodio(int episodio) {
		this.episodio = episodio;
	}
	public TipoContenido obtenerTipoContenido() {
		return tipo;
	}
	public void setTipo(TipoContenido tipo) {
		this.tipo = tipo;
	}
	public boolean isEncendido() {
		return encendido;
	}
	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}
	
	public void reproducir () {
		if (encendido) {
			System.out.println("El podcast: " +this.getNombre()+ " se está reproduciendo.");
		}else {
			System.out.println("La reproducción se encuentra pausada, reanudando.");
			encendido = true;
			System.out.println("El podcast: " +this.getNombre()+ " se está reproduciendo.");
		}
	}
	
	public void pausar () {
		if (encendido) {
			encendido = false;
			System.out.println("Reproducción pausada.");
		}else {
			System.out.println("La reproducción ya se encuentra pausada.");
		}
	}

}
