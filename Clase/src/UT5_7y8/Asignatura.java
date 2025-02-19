package UT5_7y8;

public class Asignatura {
	private String nombre;
    private double nota;

    public Asignatura(String nombre, double nota) {
        this.nombre = nombre;
        this.nota = nota;
    }

  
    public void setNota(double nota) {
        this.nota = nota;
    }

  
    public double getNota() {
        return this.nota;
    }

  
    public String estado() {
        return this.nota >= 5 ? "Aprobado" : "Suspenso";
    }

  
    public String getNombre() {
        return this.nombre;
    }

}
