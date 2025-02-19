package ProyectoProfesor;
import java.util.ArrayList;

public class Profesor {
	public Profesor(String nombre, ArrayList<Curso>cursos) {
		this.nombre = nombre;
		this.cursos= cursos;
	}
	private String nombre;
	private ArrayList <Curso> cursos;
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Curso> getCursos() {
		return cursos;
	}
	public void setCursos(ArrayList<Curso> cursos) {
		this.cursos = cursos;
	}
	
	public void agregarCurso (Curso curso) {
		cursos.add(curso);
	}
	
	public void eliminarCurso (Curso curso) {
		cursos.remove(curso);
	}
	
	public String toString() {
		return "Profesor [nombre=" + nombre + ", cursos=" + cursos + "]";
	}
	
	
	
	

}



