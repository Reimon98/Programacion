package ejercicioStreaming;

public class Pelicula implements Reproducible {
	
	private String nombre;
	private TipoContenido tipo = TipoContenido.PELICULA;
	private boolean encendido = true;
	
	public Pelicula(String nombre) {
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

	public boolean isEncendido() {
		return encendido;
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}
	
	public void reproducir () {
		if (encendido) {
			System.out.println("La película: " +this.getNombre()+ " se está reproduciendo.");
		}else {
			System.out.println("La reproducción se encuentra pausada, reanudando.");
			encendido = true;
			System.out.println("La película: " +this.getNombre()+ " se está reproduciendo.");
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
