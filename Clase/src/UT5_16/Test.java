package UT5_16;

public class Test {

	public static void main(String[] args) {
		Guerrero guerrero = new Guerrero("Thor", "Martillo", 50);
        Mago mago = new Mago("Gandalf", "Luz blanca");

        System.out.println(guerrero.nombre + " tiene " + guerrero.energia + " de energía.");
        System.out.println(guerrero.combatir(20));
        System.out.println(guerrero.nombre + " ahora tiene " + guerrero.energia + " de energía.");

        System.out.println(mago.nombre + " tiene " + mago.energia + " de energía.");
        System.out.println(mago.encantar());
        System.out.println(mago.nombre + " ahora tiene " + mago.energia + " de energía.");
    }

	}


