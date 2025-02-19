package UT5Objetos;
import java.time.LocalDate;
import java.util.Date;

public class Cliente {
private String nombre, apellidos;
private String direccion, localidad;
private Date fNacimiento;
Cliente (String aNombre, String aApellidos, String aDireccion,
String alocalidad, Date aFNacimiento) {
nombre = aNombre;
apellidos = aApellidos;
direccion = aDireccion;
localidad = alocalidad;
fNacimiento = aFNacimiento;
}

String nombreCompleto () { return nombre + " " + apellidos; }
String direccionCompleta () { return direccion + ", " + localidad; }
}