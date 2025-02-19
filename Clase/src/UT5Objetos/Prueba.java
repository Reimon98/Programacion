package UT5Objetos;

public class Prueba {
	private static int x = 3;
	private int y;
	public Prueba (int y) {
		this.y=y;
	}
	
	public void MostrarValores() {
		System.out.println("X = " +x+ " Y = " +y);
	}
	public void setY (int num) {
		y = num;
	}
	

}
