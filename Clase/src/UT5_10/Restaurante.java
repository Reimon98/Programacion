package UT5_10;

public class Restaurante {
	private double papas;
    private double chocos;

    public Restaurante(double papas, double chocos) {
        this.papas = papas;
        this.chocos = chocos;
    }

    public void addChocos(double x) {
        this.chocos += x;
    }

    public void addPapas(double x) {
        this.papas += x;
    }

    public int getComensales() {
        
        int comensalesPorPapas = (int)(papas / 1); 
        int comensalesPorChocos = (int)(chocos / 0.5); 

        
        return Math.min(comensalesPorPapas, comensalesPorChocos);
    }

    public void showChocos() {
        System.out.println("Kilos de chocos en el almacén: " + chocos);
    }

    public void showPapas() {
        System.out.println("Kilos de papas en el almacén: " + papas);
    }


}
