package UT5_11;

public class Triangulo {
	 double long_lado1;
	    double long_lado2;
	    double long_lado3;

	    public Triangulo(double l1, double l2, double l3) {
	        this.long_lado1 = l1;
	        this.long_lado2 = l2;
	        this.long_lado3 = l3;
	    }

	    public boolean compareTo_Triangulos(Triangulo a, Triangulo b) {
	        return a.long_lado1 == b.long_lado1 && a.long_lado2 == b.long_lado2 && a.long_lado3 == b.long_lado3;
	    }

	    public boolean compareTo_VTriangulos(Triangulo[] v) {
	        for (int i = 0; i < v.length; i++) {
	            if (this.long_lado1 == v[i].long_lado1 && this.long_lado2 == v[i].long_lado2 && this.long_lado3 == v[i].long_lado3) {
	                return true;
	            }
	        }
	        return false;
	    }

	    public int tipo_Triangulo() {
	        if (long_lado1 == long_lado2 && long_lado2 == long_lado3) {
	            return 1; 
	        } else if (long_lado1 == long_lado2 || long_lado2 == long_lado3 || long_lado1 == long_lado3) {
	            return 2; 
	        } else {
	            return 3; 
	        }

}
}
