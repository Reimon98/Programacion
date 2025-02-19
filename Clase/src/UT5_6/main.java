package UT5_6;

public class main {

	public static void main(String[] args) {
		 Persona persona = new Persona();
	        persona.cargarDatos(); 
	        persona.imprimirDatos(); 

	        System.out.println();

	        Empleado empleado = new Empleado();
	        empleado.cargarDatos();
	        empleado.cargarSueldo(); 
	        empleado.imprimirDatos(); 
	        empleado.imprimirSueldo();
	    }
	

	}


