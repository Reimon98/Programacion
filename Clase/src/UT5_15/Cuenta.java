package UT5_15;

public class Cuenta {
	private float saldo;

    public Cuenta() {
        this.saldo = 0;
    }

    public Cuenta(float saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void ingresar(float c) {
        saldo += c;
    }

    public void extraer(float c) {
        saldo -= c;
    }

    public float getSaldo() {
        return saldo;
    }

}
