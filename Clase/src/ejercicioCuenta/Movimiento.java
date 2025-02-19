package ejercicioCuenta;

import java.util.Date;

public class Movimiento {
    private Date fecha;
    private char tipo;
    private float importe;
    private float saldo;

    public Movimiento(Date fecha, char tipo, float importe, float saldo) {
        this.fecha = fecha;
        this.tipo = tipo;
        this.importe = importe;
        this.saldo = saldo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Fecha: " + fecha + ", Tipo: " + tipo + ", Importe: " + importe + ", Saldo: " + saldo;
    }
}