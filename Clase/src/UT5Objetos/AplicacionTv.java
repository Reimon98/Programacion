package UT5Objetos;

public class AplicacionTv {

	public static void main(String[] args) {
		Televisor tv1 = new Televisor();
		Televisor tv2 = new Televisor ();
		tv1.subirCanal();
		tv2.setCanal(50);
		tv1.setVolumen(80);
		tv2.subirVolumen();
		System.out.println("Canal y volumen finales de la TV1: " +tv1.toString());
		System.out.println("Canal y volumen finales de la TV2: " +tv2.toString());

	}

}
