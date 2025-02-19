package UT5_12;

public class Empleado {
	String nombre;
    int horasTrabajadas;
    double tarifaPorHora;

    public Empleado(String nombre, int horasTrabajadas, double tarifaPorHora) {
        this.nombre = nombre;
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    public double calcularSueldo() {
        double sueldo;
        if (horasTrabajadas <= 40) {
            sueldo = horasTrabajadas * tarifaPorHora;
        } else {
            sueldo = (40 * tarifaPorHora) + ((horasTrabajadas - 40) * tarifaPorHora * 1.5);
        }
        return sueldo;
    }

}
