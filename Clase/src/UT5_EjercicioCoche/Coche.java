package UT5_EjercicioCoche;
import java.util.ArrayList;
import java.time.LocalDate;

public abstract class Coche {
	private String marca;
	private int numero;
	private float precioCoste;
	private float precioVenta;
	private Carroceria carroceria;
	private Motor motor;
	private ArrayList <Rueda> ruedas = new ArrayList<>();
	private ArrayList <Reparacion> reparaciones = new ArrayList<>();
	public Coche(String marca, int numero, float precioCoste, float precioVenta, Carroceria carroceria, Motor motor,
			ArrayList<Rueda> ruedas, ArrayList<Reparacion> reparaciones) {
		this.marca = marca;
		this.numero = numero;
		this.precioCoste = precioCoste;
		this.precioVenta = precioVenta;
		this.carroceria = carroceria;
		this.motor = motor;
		this.ruedas = ruedas;
		this.reparaciones = reparaciones;
	}
	@Override
	public String toString() {
		return "Coche [marca=" + marca + ", numero=" + numero + ", precioCoste=" + precioCoste + ", precioVenta="
				+ precioVenta + ", carroceria=" + carroceria.toString() + ", motor=" + motor.toString() + ", ruedas=  " +this.showRuedas()+
				", reparaciones= " +this.showReparaciones()+"]";
	}
	public void nuevaReparacion(int año, int mes, int dia) {
		LocalDate fecha = LocalDate.of(año, mes, dia);
		Reparacion reparacion1 = new Reparacion (fecha);
		reparaciones.add(reparacion1);
	}
	
	public void añadirReparacion (Reparacion reparacion) {
		reparaciones.add(reparacion);
	}
	
	public String showReparaciones () {
		String resultado= " ";
		for (Reparacion repara : reparaciones) {
			resultado += repara.toString()+ ", ";
		}
		return resultado;
	}
	
	public void nuevaRueda (float tamaño, String condicion) {
		Rueda rueda1 = new Rueda (tamaño, condicion);
		ruedas.add(rueda1);
	}
	
	public void añadirRueda (Rueda rueda) {
		ruedas.add(rueda);
	}
	
	
	public String showRuedas () {
		String resultado = " ";
		 for (Rueda rueda : ruedas) {
			resultado += rueda.toString()+ ", ";
		}
		 return resultado;
	}
	
	

}

class Carroceria {
	private String color;
	private String condicion;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCondicion() {
		return condicion;
	}

	public void setCondicion(String condicion) {
		this.condicion = condicion;
	}

	public Carroceria (String color, String condicion) {
		this.color=color;
		this.condicion=condicion;
	}

	@Override
	public String toString() {
		return "Carroceria [color=" + color + ", condicion=" + condicion + "]";
	}
}

class Motor {
	private String numeroBastidor;

	public Motor(String numeroBastidor) {
		this.numeroBastidor = numeroBastidor;
	}

	public String getNumeroBastidor() {
		return numeroBastidor;
	}

	public void setNumeroBastidor(String numeroBastidor) {
		this.numeroBastidor = numeroBastidor;
	}

	@Override
	public String toString() {
		return "Motor [numeroBastidor=" + numeroBastidor + "]";
	}
	
}

class Rueda {
	private float tamaño;
	private String condicion;
	public Rueda(float tamaño, String condicion) {
		super();
		this.tamaño = tamaño;
		this.condicion = condicion;
	}
	public float getTamaño() {
		return tamaño;
	}
	public void setTamaño(float tamaño) {
		this.tamaño = tamaño;
	}
	public String getCondicion() {
		return condicion;
	}
	public void setCondicion(String condicion) {
		this.condicion = condicion;
	}
	@Override
	public String toString() {
		return "Rueda [tamaño=" + tamaño + ", condicion=" + condicion + "]";
	}
	
}
