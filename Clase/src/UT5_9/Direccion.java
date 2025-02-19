package UT5_9;

public class Direccion {
	 private String calle;
	    private int numero;
	    private int piso;
	    private String ciudad;

	    public Direccion(String calle, int numero, int piso, String ciudad) {
	        this.calle = calle;
	        this.numero = numero;
	        this.piso = piso;
	        this.ciudad = ciudad;
	    }

	    public String getCalle() {
	        return calle;
	    }

	    public int getNumero() {
	        return numero;
	    }

	    public int getPiso() {
	        return piso;
	    }

	    public String getCiudad() {
	        return ciudad;
	    }

}
