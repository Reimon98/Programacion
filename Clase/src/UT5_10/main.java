package UT5_10;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

      
        Restaurante restaurante = new Restaurante(10.0, 5.0);

       
        restaurante.showPapas();
        restaurante.showChocos();

     
        restaurante.addPapas(5.0);
        restaurante.addChocos(3.0);

      
        restaurante.showPapas();
        restaurante.showChocos();

        
        System.out.println("Número de comensales que puede atender: " + restaurante.getComensales());


	}

}
