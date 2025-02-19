package UT5_7y8;

public class Alumno {
	private String nombre;
    private int edad;
    private Asignatura asignatura;

    public Alumno(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return this.edad;
    }

  
    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

   
    public Asignatura getAsignatura() {
        return this.asignatura;
    }

}
