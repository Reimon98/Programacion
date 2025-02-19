package UT5Objetos;

public class Televisor {
	private int canal;
	private int volumen;
	private int color;
	public Televisor () {canal = 1; volumen = 5; color = 7;}
	public Televisor (int valorCanal) {
		setCanal (valorCanal);
	}
	public void subirCanal() {
		setCanal(canal+1);
		}
	public void bajarCanal() {
		setCanal(canal-1);
		}
	public void subirVolumen() {
		setVolumen(volumen+1);
		}
	public void subirColor() {
		setColor(color+1);
	}
	public void bajarColor() {
		setColor(color-1);
	}
	public void bajarVolumen() {
		setVolumen(volumen-1);
		}
	public int getCanal() {return canal;}
	public void setCanal (int valorCanal) {
		if (valorCanal<0) {
			canal=10;
		}else {
			if (valorCanal>10) {
				canal=0;
			}else {
				canal = valorCanal;
			}
		}
		
		System.out.println("Canal: " +canal);
	}
	public void setColor (int valorColor) {
		if (valorColor<1) {
			color=1;
		}else {
			if (valorColor>7) {
				color=7;
			}else {
				color = valorColor;
			}
		}
		
		System.out.println("Color: " +color);
	}
	public void setVolumen (int valorVolumen) {
		if (valorVolumen<0) {
			volumen=0;
		}else {
			if (valorVolumen>15) {
				volumen=15;
			}else {
				volumen = valorVolumen;
			}
		}
		
		System.out.println("Volumen: " +volumen);
	}
	public String toString() {
		return "Canal: " +canal+ " Volumen: " +volumen+ "Color: " +color;
	}

}
