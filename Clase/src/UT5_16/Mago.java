package UT5_16;

public class Mago extends Personaje {
	 String poder;

	    public Mago(String nombre, String poder) {
	        super(nombre, 100);
	        this.poder = poder;
	    }

	    public String encantar() {
	        energia -= 2;
	        return "Poder: " + poder;
	    }

}
