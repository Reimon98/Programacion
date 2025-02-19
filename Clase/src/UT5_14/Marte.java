package UT5_14;

public class Marte {

	public static void main(String[] args) {
		Marciano et1 = new Marciano("ET1");
        Marciano et2 = new Marciano("ET2");
        Marciano et3 = new Marciano("ET3");

        et2.muere();

        Marciano et4 = new Marciano("ET4");

        et2.muere();

        Marciano.cuentaMarcianos();

        System.out.println("ET1 está vivo: " + et1.estaVivo());
        System.out.println("ET2 está vivo: " + et2.estaVivo());
        System.out.println("ET3 está vivo: " + et3.estaVivo());
        System.out.println("ET4 está vivo: " + et4.estaVivo());
    }

	}


