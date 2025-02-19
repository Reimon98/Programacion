package UT5_11;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
Scanner entrada = new Scanner(System.in);
        
        System.out.print("Introduce el primer lado del triángulo: ");
        double l1 = entrada.nextDouble();
        System.out.print("Introduce el segundo lado del triángulo: ");
        double l2 = entrada.nextDouble();
        System.out.print("Introduce el tercer lado del triángulo: ");
        double l3 = entrada.nextDouble();
        
        Triangulo t1 = new Triangulo(l1, l2, l3);
        
        System.out.println("Tipo de triángulo: " + t1.tipo_Triangulo());
        
        System.out.print("Introduce el primer lado del segundo triángulo: ");
        double l4 = entrada.nextDouble();
        System.out.print("Introduce el segundo lado del segundo triángulo: ");
        double l5 = entrada.nextDouble();
        System.out.print("Introduce el tercer lado del segundo triángulo: ");
        double l6 = entrada.nextDouble();
        
        Triangulo t2 = new Triangulo(l4, l5, l6);
        
        System.out.println("¿Son iguales los dos triángulos? " + t1.compareTo_Triangulos(t1, t2));
        
        Triangulo[] triangulos = { t1, t2 };
        System.out.println("¿El primer triángulo está en el conjunto? " + t1.compareTo_VTriangulos(triangulos));
    }

	}


