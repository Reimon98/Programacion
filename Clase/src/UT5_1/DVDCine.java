package UT5_1;

public class DVDCine {
	private String titulo;
	private String director;
	private String genero;
	private int duracion;
	private String resumen;
	
	public DVDCine (String titulo, String director, String genero, int duracion, String resumen) {
		this.titulo=titulo;
		this.director=director;
		this.genero=genero;
		this.duracion=duracion;
		this.resumen=resumen;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getDuracion() {
		return duracion;
	}
	
	public void muestraDuracion() {
		System.out.println(duracion+ " min.");
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public String getResumen() {
		return resumen;
	}

	public void setResumen(String resumen) {
		this.resumen = resumen;
	}

	public void muestraDVDCine() {
		System.out.println(titulo+ ", De: " +director);
		System.out.println(genero+ " - " +duracion+ " min.");
		System.out.println(resumen);
	}
	public boolean tieneResumen() {
		if (!resumen.equalsIgnoreCase(null)) {
			return true;} else {return false;}
	}
	
	public boolean esThriller () {
		if (genero.equalsIgnoreCase("thriller")) {
			return true; }else{return false;}
	}
}
