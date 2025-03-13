package ejercicioAvanzadoObjetos;

import java.util.Scanner;
import java.util.ArrayList;

/**
 * Clase principal para gestionar los empleados de una empresa.
 * Permite crear, mostrar, calcular ingresos y eliminar empleados, entre otras funcionalidades.
 */
public class main {

    // Lista estática que almacena todos los empleados
    public static ArrayList <Empleado> empleados = new ArrayList<>();

    /**
     * Crea un empleado que se paga por horas y lo agrega a la lista de empleados.
     *
     * @param scanner El objeto Scanner utilizado para leer entradas del usuario.
     * @return El objeto EmpleadoPorHoras recién creado.
     */
    public static EmpleadoPorHoras crearEmpleadoPorHoras (Scanner scanner) {
        System.out.println("Introduzca el nombre");
        String nombre = scanner.next();
        System.out.println("Introduzca el primer apellido");
        String apellido = scanner.next();
        System.out.println("Introduzca el número de la seguridad social");
        int NSS = scanner.nextInt();
        System.out.println("Introduzca el sueldo por horas");
        double sueldo = scanner.nextDouble();
        System.out.println("Introduzca las horas trabajadas");
        int horas = scanner.nextInt();
        EmpleadoPorHoras porhoras = new EmpleadoPorHoras(nombre, apellido, NSS, sueldo, horas);
        empleados.add(porhoras);
        return porhoras;
    }

    /**
     * Crea un empleado asalariado y lo agrega a la lista de empleados.
     *
     * @param scanner El objeto Scanner utilizado para leer entradas del usuario.
     * @return El objeto EmpleadoAsalariado recién creado.
     */
    public static EmpleadoAsalariado crearEmpleadoAsalariado (Scanner scanner) {
        System.out.println("Introduzca el nombre");
        String nombre = scanner.next();
        System.out.println("Introduzca el primer apellido");
        String apellido = scanner.next();
        System.out.println("Introduzca el número de la seguridad social");
        int NSS = scanner.nextInt();
        System.out.println("Introduzca el salario semanal");
        double sueldo = scanner.nextDouble();
        EmpleadoAsalariado asalariado = new EmpleadoAsalariado(nombre, apellido, NSS, sueldo);
        empleados.add(asalariado);
        return asalariado;
    }

    /**
     * Crea un empleado que recibe una comisión por ventas y lo agrega a la lista de empleados.
     *
     * @param scanner El objeto Scanner utilizado para leer entradas del usuario.
     * @return El objeto EmpleadoPorComision recién creado.
     */
    public static EmpleadoPorComision crearEmpleadoPorComision (Scanner scanner) {
        System.out.println("Introduzca el nombre");
        String nombre = scanner.next();
        System.out.println("Introduzca el primer apellido");
        String apellido = scanner.next();
        System.out.println("Introduzca el número de la seguridad social");
        int NSS = scanner.nextInt();
        System.out.println("Introduzca el total de ventas realizadas");
        int ventas = scanner.nextInt();
        System.out.println("Introduzca la tarifa de comisión");
        double tarifa = scanner.nextInt();
        EmpleadoPorComision porcomision = new EmpleadoPorComision(nombre, apellido, NSS, ventas, tarifa);
        empleados.add(porcomision);
        return porcomision;
    }

    /**
     * Crea un empleado con salario base más comisión y lo agrega a la lista de empleados.
     *
     * @param scanner El objeto Scanner utilizado para leer entradas del usuario.
     * @return El objeto EmpleadoBaseMasComision recién creado.
     */
    public static EmpleadoBaseMasComision crearEmpleadoBaseMasComision (Scanner scanner) {
        System.out.println("Introduzca el nombre");
        String nombre = scanner.next();
        System.out.println("Introduzca el primer apellido");
        String apellido = scanner.next();
        System.out.println("Introduzca el número de la seguridad social");
        int NSS = scanner.nextInt();
        System.out.println("Introduzca el total de ventas realizadas");
        int ventas = scanner.nextInt();
        System.out.println("Introduzca la tarifa de comisión");
        double tarifa = scanner.nextInt();
        System.out.println("Introduzca el salario base");
        double salario = scanner.nextDouble();
        EmpleadoBaseMasComision basemascomision = new EmpleadoBaseMasComision(nombre, apellido, NSS, ventas, tarifa, salario);
        empleados.add(basemascomision);
        return basemascomision;
    }

    /**
     * Método principal que ejecuta el programa. Muestra un menú de opciones al usuario.
     * Permite crear, mostrar, calcular ingresos y eliminar empleados.
     *
     * @param args Argumentos de la línea de comandos (no utilizados en este caso).
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        boolean continuar = true;
        System.out.println("Bienvenido/a al sistema de gestión de la empresa.");
        System.out.println("Introduzca el número acorde a la opción que desea realizar.");
        
        // Menú principal del programa
        while (continuar) {
            System.out.println(" ");
            System.out.println("======= MENÚ DE OPCIONES =======");
            System.out.println("1. Crear un empleado.");
            System.out.println("2. Mostrar los empleados existentes.");
            System.out.println("3. Mostrar el salario de un empleado.");
            System.out.println("4. Eliminar un empleado.");
            System.out.println("5. Finalizar el programa");
            System.out.println(" ");
            int decision = entrada.nextInt();
            
            // Acciones según la opción elegida por el usuario
            switch (decision) {
                case (1): 
                    boolean menu = true;
                    while (menu) {
                        System.out.println("Seleccione el tipo de empleado.");
                        System.out.println("1. Empleado asalariado.");
                        System.out.println("2. Empleado por horas.");
                        System.out.println("3. Empleado por comisión.");
                        System.out.println("4. Empleado con salario base más comisión.");
                        System.out.println("5. Volver al menú principal");
                        
                        int decision2 = entrada.nextInt();
                        switch (decision2) {
                            case (1):
                                try {
                                    crearEmpleadoAsalariado(entrada);
                                } catch (Exception e) {
                                    System.out.println("Algún dato introducido es inválido.");
                                }
                                break;
                            
                            case (2):
                                try {
                                    crearEmpleadoPorHoras(entrada);
                                } catch (Exception e) {
                                    System.out.println("Algún dato introducido es inválido.");
                                }
                                break;
                            
                            case (3):
                                try {
                                    crearEmpleadoPorComision(entrada);
                                } catch (Exception e) {
                                    System.out.println("Algún dato introducido es inválido.");
                                }
                                break;
                            
                            case (4):
                                try {
                                    crearEmpleadoBaseMasComision(entrada);
                                } catch (Exception e) {
                                    System.out.println("Algún dato introducido es inválido.");
                                }
                                break;
                            
                            case (5): 
                                menu = false;
                                break;
                            
                            default: 
                                System.out.println("Opción introducida inválida");
                                break;
                        }
                    }
                    break;

                case (2):
                    for (Empleado e : empleados) {
                        System.out.println(e.toString());
                    }
                    break;

                case (3):
                    System.out.println("Introduzca el número de la seguridad social del empleado buscado.");
                    int numero = 0;
                    try {
                        numero = entrada.nextInt();
                    } catch (Exception e) {
                        System.out.println("El valor introducido no es válido");
                    }
                    for (Empleado e : empleados) {
                        if (numero == e.getNSS()) {
                            e.Ingresos();
                            break;
                        } else {
                            System.out.println("El empleado que busca no existe.");
                        }
                    }
                    break;

                case (4):
                    System.out.println("Introduzca el número de la seguridad social del empleado buscado.");
                    numero = 0;
                    try {
                        numero = entrada.nextInt();
                    } catch (Exception e) {
                        System.out.println("El valor introducido no es válido");
                    }
                    for (Empleado e : empleados) {
                        if (numero == e.getNSS()) {
                            empleados.remove(e);
                            System.out.println("Empleado borrado satisfactoriamente.");
                            break;
                        } else {
                            System.out.println("El empleado que busca no existe.");
                        }
                    }
                    break;

                case (5): 
                    continuar = false;
                    break;

                default: 
                    System.out.println("Opción introducida no válida");
                    break;
            }
        }
        System.out.println("Finalizando programa");
    }
}