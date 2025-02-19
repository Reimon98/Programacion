package UT6_HerenciaVehiculo;

public class main {

	public static void main(String[] args) {
		Coche coche = new Coche ("Fiesta", "Ford");
		Conductor pepe = new Conductor ("Pepe", coche);
		pepe.conducir(coche); //Aquí se muestra la relación de dependencia al ver que el método no funcionaría sin un objeto coche existente
		

	}

}
