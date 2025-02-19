package ejercicioStreaming;

public class Musica implements Reproducible {
	
	private String nombre;
	private TipoContenido tipo = TipoContenido.MUSICA;
	private boolean encendido = true;
	public Musica(String nombre) {
		super();
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public TipoContenido obtenerTipoContenido() {
		return tipo;
	}
	public void setTipo(TipoContenido tipo) {
		this.tipo = tipo;
	}
	
	public void reproducir () {
		if (encendido) {
			System.out.println("La canción: " +this.getNombre()+ " se está reproduciendo.");
		}else {
			System.out.println("La reproducción se encuentra pausada, reanudando.");
			encendido = true;
			System.out.println("La canción: " +this.getNombre()+ " se está reproduciendo.");
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
