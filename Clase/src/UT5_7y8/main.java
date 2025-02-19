package UT5_7y8;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

        
        Alumno alumno1 = new Alumno("Juan", 20);
        Alumno alumno2 = new Alumno("Ana", 22);
        Alumno alumno3 = new Alumno("Pedro", 21);

      
        Asignatura asignatura1 = new Asignatura("Matemáticas", 6.5);
        Asignatura asignatura2 = new Asignatura("Historia", 4.3);
        Asignatura asignatura3 = new Asignatura("Inglés", 7.8);

       
        alumno1.setAsignatura(asignatura1);
        alumno2.setAsignatura(asignatura2);
        alumno3.setAsignatura(asignatura3);

        
        imprimirAlumno(alumno1);
        imprimirAlumno(alumno2);
        imprimirAlumno(alumno3);
        
        
    }

    public static void imprimirAlumno(Alumno alumno) {
        System.out.println("Nombre del alumno: " + alumno.getNombre());
        System.out.println("Edad: " + alumno.getEdad());

        Asignatura asignatura = alumno.getAsignatura();
        System.out.println("Asignatura cursada: " + asignatura.getNombre());
        System.out.println("Nota obtenida: " + asignatura.getNota());
        System.out.println("Estado: " + asignatura.estado());
        System.out.println();
    }

	}


