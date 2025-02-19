package UT5_3;

public class Cuenta {
	private static long proximoID = 100001;
	private float IDCuenta;
	private float DNICliente;
	private float saldo;
	private float interes;
	public Cuenta(float iDCuenta, float dNICliente, float saldo, float interes) {
		super();
		this.IDCuenta = proximoID++;
		this.DNICliente = dNICliente;
		this.saldo = saldo;
		this.interes = interes;
	}
	public Cuenta(float dNICliente, float saldo, float interes) {
		super();
		DNICliente = dNICliente;
		this.saldo = saldo;
		this.interes = interes;
	}
	public float getDNICliente() {
		return DNICliente;
	}
	public void setDNICliente(float dNICliente) {
		DNICliente = dNICliente;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public float getInteres() {
		return interes;
	}
	public void setInteres(float interes) {
		this.interes = interes;
	}
	public void setIDCuenta(float iDCuenta) {
		IDCuenta = iDCuenta;
	}
	
	public void actualizarSaldo() {
		saldo+=(interes/365);
	}
	
	public void ingresar (double num) {
		saldo+=num;
	}
	
	public void retirar (double num) {
		if ((saldo-=num)<0) {
			System.out.println("La operación no fue posible debido a falta de saldo");
		}else {saldo-=num;}
	}
	
	public void mostrarCuenta() {
		System.out.println("Cuenta [IDCuenta=" + IDCuenta + ", DNICliente=" + DNICliente + ", Saldo=" + saldo + ", Interes="
				+ interes + "]");
	}
	
	

}
