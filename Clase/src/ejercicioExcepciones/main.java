package ejercicioExcepciones;

/**
 * Clase principal que ejecuta un ejemplo de uso de la clase CuentaBancaria.
 */
public class main {

    /**
     * Método principal que simula operaciones bancarias de depósito y retiro.
     * 
     * @param args Argumentos de la línea de comandos (no se utilizan en este caso).
     */
    public static void main(String[] args) {
        try {
            // Crear una cuenta bancaria con saldo inicial de 100
            CuentaBancaria cuenta = new CuentaBancaria(100);
            cuenta.depositar(50);  // Depositar 50
            System.out.println("Depósito exitoso. Saldo actual: " + cuenta.getSaldo());
            cuenta.retirar(30);  // Retirar 30
            System.out.println("Retiro exitoso. Saldo actual: " + cuenta.getSaldo());
            cuenta.depositar(-10);  // Intentar depositar una cantidad negativa
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            // Crear una segunda cuenta bancaria con saldo inicial de 50
            CuentaBancaria cuenta2 = new CuentaBancaria(50);
            cuenta2.retirar(100);  // Intentar retirar más dinero del disponible
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

