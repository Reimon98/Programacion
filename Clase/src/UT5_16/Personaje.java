package UT5_16;

public class Personaje {
	 String nombre;
	    int energia;

	    public Personaje(String nombre, int energia) {
	        this.nombre = nombre;
	        this.energia = energia;
	    }

	    public void alimentarse(int energiaRecibida) {
	        energia += energiaRecibida;
	    }

}
