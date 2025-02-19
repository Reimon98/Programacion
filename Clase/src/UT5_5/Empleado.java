package UT5_5;

public class Empleado {
	private String NIF;
	private float sueldoBase;
	private float pagoExtra;
	private float horaExtra;
	private float IRPF;
	private boolean casado;
	private int hijos;
	public Empleado(String nIF, float sueldoBase, float pagoExtra, float horaExtra, boolean casado,
			int hijos) {
		super();
		NIF = nIF;
		this.sueldoBase = sueldoBase;
		this.pagoExtra = pagoExtra;
		this.horaExtra = horaExtra;
		this.casado = casado;
		this.hijos = hijos;
		if (sueldoBase<12451) {
			IRPF = 9.5f;
		}else {
			if (sueldoBase>=12451&&sueldoBase<=20200) {
				IRPF = 12f;
			}else {
				if (sueldoBase>=20201&&sueldoBase<=35200) {
					IRPF = 15f;
				}else {
					if (sueldoBase>=35201) {
						IRPF = 18.5f;
					}
				}
			}
		}
		if (casado) {
			IRPF-=2;
		}
		IRPF-=hijos;
	}
	
	
	public String getNIF() {
		return NIF;
	}


	public void setNIF(String nIF) {
		NIF = nIF;
	}


	public float getSueldoBase() {
		return sueldoBase;
	}


	public void setSueldoBase(float sueldoBase) {
		this.sueldoBase = sueldoBase;
	}


	public float getPagoExtra() {
		return pagoExtra;
	}


	public void setPagoExtra(float pagoExtra) {
		this.pagoExtra = pagoExtra;
	}


	public float getHoraExtra() {
		return horaExtra;
	}


	public void setHoraExtra(float horaExtra) {
		this.horaExtra = horaExtra;
	}


	public float getIRPF() {
		return IRPF;
	}


	public void setIRPF(float iRPF) {
		IRPF = iRPF;
	}


	public boolean isCasado() {
		return casado;
	}


	public void setCasado(boolean casado) {
		this.casado = casado;
	}


	public int getHijos() {
		return hijos;
	}


	public void setHijos(int hijos) {
		this.hijos = hijos;
	}
	public float sueldoNeto() {
		return sueldoBase*(100-IRPF);
	}
	public Empleado copia(Empleado empleado) {
		Empleado empleado2 = new Empleado();
		empleado2=empleado;
		return empleado2;
	}
	
	public Empleado() {
		super();
	}


	public void printAll() {
		System.out.println( "Empleado [NIF= " + NIF + ", sueldoBase= " + sueldoBase + ", pagoExtra= " + pagoExtra + ", horaExtra= "
				+ horaExtra + ", IRPF= " + IRPF + ", casado= " + casado + ", hijos= " + hijos + ", suedoNeto= " +this.sueldoNeto()+ "]");
	}


	public void println() {
		System.out.println("Empleado [NIF= " + NIF + ", casado= " + casado + ", hijos= " + hijos + "]");
	}
	
	
	

}
