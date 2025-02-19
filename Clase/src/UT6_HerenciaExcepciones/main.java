package UT6_HerenciaExcepciones;

public class main {

	public static void main(String[] args) {
		Punto2D p1 = new Punto2D (0,0);
		Punto2D p2 = new Punto2D (1,0);
		Punto2D p3 = new Punto2D (0,1);
		
		Triangulo triangulo = new Triangulo(p1, p2, p3);
		System.out.println(triangulo.area());
		System.out.println(triangulo.esTriangulo());
		System.out.println(triangulo.tipoTriangulo());
		System.out.println((triangulo.toString()));

	}

}
