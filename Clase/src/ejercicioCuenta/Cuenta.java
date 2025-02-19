package ejercicioCuenta;

import java.util.LinkedList;
import java.util.Date;

public class Cuenta {
    private long numero;
    private float saldo;
    private Cliente titular;
    private float interesAnual;
    private LinkedList<Movimiento> movimientos;

    public Cuenta(long numero, Cliente titular, float saldo, float interesAnual) {
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
        this.interesAnual = interesAnual;
        this.movimientos = new LinkedList<>();
    }

    public void Ingreso(float num) {
        saldo += num;
        movimientos.add(new Movimiento(new Date(), 'I', num, saldo));
    }

    public void Reintegro(float num) {
        if (saldo >= num) {
            saldo -= num;
            movimientos.add(new Movimiento(new Date(), 'R', num, saldo));
        } else {
            System.out.println("Saldo insuficiente para el reintegro.");
        }
    }

    public Cliente leerTitular() {
        return titular;
    }

    public boolean enRojos() {
        return saldo < 0;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public float getInteresAnual() {
        return interesAnual;
    }

    public void setInteresAnual(float interesAnual) {
        this.interesAnual = interesAnual;
    }

    public LinkedList<Movimiento> getMovimientos() {
        return movimientos;
    }
}