package UT5_17;

public class PlazaAparcamiento {
	 private int numeroPlaza;
	    private Coche coche;
	    private boolean disponible;
	    private int numCochesAparcados;

	    public PlazaAparcamiento(int numeroPlaza) {
	        this.numeroPlaza = numeroPlaza;
	        this.coche = null;
	        this.disponible = true;
	        this.numCochesAparcados = 0;
	    }

	    public int getNumeroPlaza() {
	        return numeroPlaza;
	    }

	    public void setNumeroPlaza(int numeroPlaza) {
	        this.numeroPlaza = numeroPlaza;
	    }

	    public Coche getCoche() {
	        return coche;
	    }

	    public void setCoche(Coche coche) {
	        this.coche = coche;
	    }

	    public boolean isDisponible() {
	        return disponible;
	    }

	    public void setDisponible(boolean disponible) {
	        this.disponible = disponible;
	    }

	    public int getNumCochesAparcados() {
	        return numCochesAparcados;
	    }

	    public void setNumCochesAparcados(int numCochesAparcados) {
	        this.numCochesAparcados = numCochesAparcados;
	    }

	    public void mostrarPlaza() {
	        if (coche != null) {
	            System.out.println("Plaza " + numeroPlaza + " ocupada por el coche:");
	            coche.mostrarCoche();
	        } else {
	            System.out.println("La plaza " + numeroPlaza + " está libre.");
	        }
	        System.out.println("Total de coches que han aparcado en esta plaza: " + numCochesAparcados);
	    }

	    public void aparcarCoche(Coche coche) {
	        if (this.disponible) {
	            this.coche = coche;
	            this.disponible = false;
	            this.numCochesAparcados++;
	            System.out.println("El coche se ha aparcado.");
	        } else {
	            System.out.println("¡Plaza ya ocupada por otro coche!");
	        }
	    }

	    public void sacarCoche() {
	        if (this.coche != null) {
	            System.out.println("La plaza " + numeroPlaza + " está libre. El coche " + coche.getMarca() + " " + coche.getModelo() + " ha salido de la plaza.");
	            this.coche = null;
	            this.disponible = true;
	        } else {
	            System.out.println("ERROR, NO HAY COCHE EN LA PLAZA DE APARCAMIENTO. LA PLAZA ESTÁ LIBRE.");
	        }
	    }

	    public void verCocheAparcado() {
	        if (this.coche != null) {
	            this.coche.mostrarCoche();
	        } else {
	            System.out.println("La plaza está libre.");
	        }
	    }

}
