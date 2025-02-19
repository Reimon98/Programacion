package ejercicioStreaming;

public class Serie implements Reproducible {
	
	private String nombre;
	private int capitulo;
	private TipoContenido tipo = TipoContenido.SERIE;
	private boolean encendido = true;
	public Serie(String nombre, int capitulo) {
		super();
		this.nombre = nombre;
		this.capitulo = capitulo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCapitulo() {
		return capitulo;
	}
	public void setCapitulo(int capitulo) {
		this.capitulo = capitulo;
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
			System.out.println("La serie: " +this.getNombre()+ " se está reproduciendo.");
		}else {
			System.out.println("La reproducción se encuentra pausada, reanudando.");
			encendido = true;
			System.out.println("La serie: " +this.getNombre()+ " se está reproduciendo.");
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
