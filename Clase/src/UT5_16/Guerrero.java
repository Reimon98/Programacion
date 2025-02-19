package UT5_16;

public class Guerrero extends Personaje {
	String arma;

    public Guerrero(String nombre, String arma, int energiaInicial) {
        super(nombre, energiaInicial);
        this.arma = arma;
    }

    public String combatir(int energiaAtaque) {
        energia -= energiaAtaque;
        return "Arma: " + arma + ", Energía gastada: " + energiaAtaque;
    }

}
