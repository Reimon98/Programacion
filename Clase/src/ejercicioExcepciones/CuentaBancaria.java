package ejercicioExcepciones;

/**
 * Representa una cuenta bancaria con saldo y operaciones de depósito y retiro.
 */
public class CuentaBancaria {
    
    /** El saldo actual de la cuenta. */
    private double saldo;

    /**
     * Crea una nueva cuenta bancaria con un saldo inicial.
     *
     * @param saldoInicial El saldo inicial de la cuenta.
     * @throws IllegalArgumentException Si el saldo inicial es negativo.
     */
    public CuentaBancaria(double saldoInicial) {
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("El saldo inicial no puede ser negativo.");
        }
        this.saldo = saldoInicial;
    }

    /**
     * Deposita una cantidad de dinero en la cuenta.
     *
     * @param cantidad La cantidad a depositar.
     * @throws IllegalArgumentException Si la cantidad es negativa.
     */
    public void depositar(double cantidad) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("No se puede depositar una cantidad negativa.");
        }
        saldo += cantidad;
    }

    /**
     * Retira una cantidad de dinero de la cuenta.
     *
     * @param cantidad La cantidad a retirar.
     * @throws IllegalArgumentException Si la cantidad es negativa o si no hay saldo suficiente.
     */
    public void retirar(double cantidad) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("No se puede retirar una cantidad negativa.");
        }
        if (cantidad > saldo) {
            throw new IllegalArgumentException("Saldo insuficiente.");
        }
        saldo -= cantidad;
    }

    /**
     * Obtiene el saldo actual de la cuenta.
     *
     * @return El saldo actual de la cuenta.
     */
    public double getSaldo() {
        return saldo;
    }
}

