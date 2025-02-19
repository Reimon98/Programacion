package ProyectoProfesor;
import java.util.ArrayList;

public class main {

	public static void main(String[] args) {
		ArrayList<Curso> cursos = new ArrayList();
		Profesor Juan = new Profesor ("Juan", cursos);
		Curso BaseDatos = new Curso ("Base de datos", 123);
		Curso Lenguaje = new Curso ("Lenguaje de marcas", 456);
		Juan.agregarCurso(BaseDatos);
		Juan.agregarCurso(Lenguaje);
		
		String cadena = Juan.toString();
		System.out.println(cadena);

	}

}
