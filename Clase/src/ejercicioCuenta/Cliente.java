package ejercicioCuenta;

import java.util.Date;
import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String apellido;
    private String direccion;
    private String localidad;
    private Date fnacimiento;
    private ArrayList<Cuenta> cuentas;

    
    public Cliente(String nombre, String apellido, String direccion, String localidad, Date fnacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.localidad = localidad;
        this.fnacimiento = fnacimiento;
        this.cuentas = new ArrayList<>(); 
    }

   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public Date getFnacimiento() {
        return fnacimiento;
    }

    public void setFnacimiento(Date fnacimiento) {
        this.fnacimiento = fnacimiento;
    }


    public ArrayList<Cuenta> getCuentas() {
        return cuentas;
    }

   
    public void setCuentas(ArrayList<Cuenta> cuentas) {
        this.cuentas = cuentas;
    }

 
    public void addCuenta(Cuenta cuenta) {
        this.cuentas.add(cuenta);
    }
}