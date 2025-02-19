package UT5_13;

public class Alimento {
	String nombre;
    double lipidos; 
    double hidratosCarbono; 
    double proteínas; 
    boolean origenAnimal;
    char vitaminas; 
    char minerales; 

   
    public Alimento(String nombre) {
        this.nombre = nombre;
    }

   
    public Alimento(String nombre, double lipidos, double hidratosCarbono, double proteínas, boolean origenAnimal, char vitaminas, char minerales) {
        this.nombre = nombre;
        this.lipidos = lipidos;
        this.hidratosCarbono = hidratosCarbono;
        this.proteínas = proteínas;
        this.origenAnimal = origenAnimal;
        this.vitaminas = vitaminas;
        this.minerales = minerales;
    }

   
    public boolean esDietetico() {
        return lipidos < 20 && vitaminas != 'B';
    }

   
    public String muestraAlimento() {
        return "Nombre: " + nombre + "\n" +
               "Lípidos: " + lipidos + "%\n" +
               "Hidratos de Carbono: " + hidratosCarbono + "%\n" +
               "Proteínas: " + proteínas + "%\n" +
               "Origen Animal: " + (origenAnimal ? "Sí" : "No") + "\n" +
               "Vitaminas: " + vitaminas + "\n" +
               "Minerales: " + minerales;
    }

}
