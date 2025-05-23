package Sucio;

public class Punto {
	private int x;
	private int y;
	public Punto (int x, int y) throws PuntoNoValidoException
	{
	this.x = x;
	this.y = y;
	if (x < 0 || y < 0) throw new PuntoNoValidoException(this);
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "]";
	}
	
	}


