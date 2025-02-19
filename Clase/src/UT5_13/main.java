package UT5_13;

public class main {

	public static void main(String[] args) {

		Alimento manzana = new Alimento("Manzana", 0.5, 25.0, 0.3, false, 'A', 'B');
      
        Alimento carne = new Alimento("Carne de res");
        carne.lipidos = 15.0;
        carne.hidratosCarbono = 0.0;
        carne.proteínas = 20.0;
        carne.origenAnimal = true;
        carne.vitaminas = 'M';
        carne.minerales = 'A';

      
        System.out.println(manzana.muestraAlimento());
        System.out.println("Es dietético: " + manzana.esDietetico());
        System.out.println();
        
        System.out.println(carne.muestraAlimento());
        System.out.println("Es dietético: " + carne.esDietetico());
    }
		

	}


