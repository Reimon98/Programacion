package UT6_HerenciaExcepciones;

public class Triangulo extends Figura2D {
	private Punto2D p1, p2, p3;
	public Triangulo (Punto2D p1, Punto2D p2, Punto2D p3) {
		super (3);
		this.p1=p1;
		this.p2=p2;
		this.p3=p3;
	}
	public double area () {
		double a = Punto2D.distancia(p1, p2);
		double b = Punto2D.distancia(p2, p3);
		double c = Punto2D.distancia(p3, p1);
		double s = (a + b + c) / 2;
		return (Math.sqrt(s * (s - a) * (s - b) * (s - c)));
	}
	public double perimetro () {
		double a = Punto2D.distancia(p1, p2);
		double b = Punto2D.distancia(p2, p3);
		double c = Punto2D.distancia(p3, p1);
		double s = (a + b + c);
		return s;
	}
	public boolean esTriangulo() {
		if (p1==p2||p1==p3||p2==p3) {
			return false;
		}else {
			return true;
		}
	}
	
	public String tipoTriangulo() {
		double a = Punto2D.distancia(p1, p2);
		double b = Punto2D.distancia(p2, p3);
		double c = Punto2D.distancia(p3, p1);
		if (!this.esTriangulo()) {
			return "NO_TRIANGULO";
		}else {
			if (a==b&&a==c&&b==c) {
				return "EQUILATERO";
			}else {
				if (a==b||a==c||b==c) {
					return "ISOSCELES";
				}else {
					return "ESCALENO";
				}
			}
		}
	}
	
	public String toString() {
		return "El triángulo es de tipo " +(this.tipoTriangulo())+ ", de área " +(this.area())+ " y perímetro " +(this.perimetro())+ ". Sus puntos son: " +(this.p1.toString())+ ", " +(this.p2.toString())+ ", " +(this.p3.toString());	}
}
