package ejercicioCuenta;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Date;

public class main {
	private static Scanner scanner = new Scanner(System.in);
	private static ArrayList<Cliente> clientes = new ArrayList<>();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Cliente> clientes = new ArrayList<>();
		while (true) {
            mostrarMenuPrincipal();
            String opcion = scanner.nextLine();

            if (opcion.equals("1")) {
                menuClientes();
            } else if (opcion.equals("2")) {
                menuCuentas();
            } else if (opcion.equals("0")) {
                System.out.println("Saliendo...");
                break;
            } else {
                System.out.println("Opción no válida.");
            }
        }
    }

    public static void mostrarMenuPrincipal() {
        System.out.println("MENÚ PRINCIPAL");
        System.out.println("1.- Mantenimiento de Clientes (Altas, Bajas, Modificaciones)");
        System.out.println("2.- Mantenimiento de Cuentas");
        System.out.println("0.- Salir");
        System.out.print("Seleccione una opción: ");
    }

    public static void menuClientes() {
        System.out.println("\nCLIENTES");
        System.out.println("1.- Altas");
        System.out.println("2.- Bajas");
        System.out.println("3.- Modificaciones");
        System.out.println("4.- Listado");
        System.out.print("Seleccione una opción: ");
        String opcion = scanner.nextLine();

        switch (opcion) {
            case "1":
                altaCliente();
                break;
            case "2":
                bajaCliente();
                break;
            case "3":
                modificarCliente();
                break;
            case "4":
                listarClientes();
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    public static void menuCuentas() {
        System.out.print("Introduzca el nombre del cliente: ");
        String nombre = scanner.nextLine();
        System.out.print("Introduzca los apellidos del cliente: ");
        String apellidos = scanner.nextLine();

        Cliente cliente = buscarCliente(nombre, apellidos);
        if (cliente != null) {
            System.out.print("Introduzca el número de cuenta: ");
            long numeroCuenta = Long.parseLong(scanner.nextLine());
            Cuenta cuenta = buscarCuenta(cliente, numeroCuenta);
            if (cuenta == null) {
                System.out.println("Cuenta no encontrada. ¿Desea crearla? (sí/no): ");
                String respuesta = scanner.nextLine();
                if (respuesta.equalsIgnoreCase("sí")) {
                    System.out.print("Saldo inicial: ");
                    float saldo = Float.parseFloat(scanner.nextLine());
                    System.out.print("Interés anual: ");
                    float interesAnual = Float.parseFloat(scanner.nextLine());
                    cuenta = new Cuenta(numeroCuenta, cliente, saldo, interesAnual);
                    cliente.getCuentas().add(cuenta);
                    System.out.println("Cuenta creada.");
                }
            } else {
                menuSubCuenta(cuenta);
            }
        } else {
            System.out.println("Cliente no encontrado.");
        }
    }

    public static void menuSubCuenta(Cuenta cuenta) {
        while (true) {
            System.out.println("\nSubmenú de Cuenta:");
            System.out.println("1.- Ingresar cantidad");
            System.out.println("2.- Hacer reintegro");
            System.out.println("3.- Ver saldo");
            System.out.println("4.- Listar movimientos");
            System.out.println("0.- Volver al menú principal");
            System.out.print("Seleccione una opción: ");
            String opcion = scanner.nextLine();

            switch (opcion) {
                case "1":
                    System.out.print("Cantidad a ingresar: ");
                    float cantidadIngreso = Float.parseFloat(scanner.nextLine());
                    cuenta.Ingreso(cantidadIngreso);
                    break;
                case "2":
                    System.out.print("Cantidad a retirar: ");
                    float cantidadReintegro = Float.parseFloat(scanner.nextLine());
                    cuenta.Reintegro(cantidadReintegro);
                    break;
                case "3":
                    System.out.println("Saldo actual: " + cuenta.getSaldo());
                    break;
                case "4":
                    System.out.println("Movimientos de la cuenta:");
                    for (Movimiento movimiento : cuenta.getMovimientos()) {
                        System.out.println(movimiento);
                    }
                    break;
                case "0":
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }

    public static Cliente buscarCliente(String nombre, String apellidos) {
        for (Cliente cliente : clientes) {
            if (cliente.getNombre().equals(nombre) && cliente.getApellido().equals(apellidos)) {
                return cliente;
            }
        }
        return null;
    }

    public static Cuenta buscarCuenta(Cliente cliente, long numeroCuenta) {
        for (Cuenta cuenta : cliente.getCuentas()) { 
            if (cuenta.getNumero() == numeroCuenta) {
                return cuenta;
            }
        }
        return null;
    }

  
    public static void altaCliente() {
        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();
        System.out.print("Apellido: ");
        String apellido = scanner.nextLine();
        System.out.print("Dirección: ");
        String direccion = scanner.nextLine();
        System.out.print("Localidad: ");
        String localidad = scanner.nextLine();
        System.out.print("Fecha de nacimiento (dd/MM/yyyy): ");
        String fechaNacimiento = scanner.nextLine();

        Cliente cliente = new Cliente(nombre, apellido, direccion, localidad, new Date());
        clientes.add(cliente);
        System.out.println("Cliente agregado.");
    }

    public static void bajaCliente() {
        System.out.print("Nombre del cliente a eliminar: ");
        String nombre = scanner.nextLine();
        System.out.print("Apellido del cliente a eliminar: ");
        String apellido = scanner.nextLine();

        Cliente cliente = buscarCliente(nombre, apellido);
        if (cliente != null) {
            System.out.print("Introduzca el número de cuenta a eliminar: ");
            long numeroCuenta = Long.parseLong(scanner.nextLine());
            Cuenta cuenta = buscarCuenta(cliente, numeroCuenta);
            if (cuenta != null) {
                cliente.getCuentas().remove(cuenta);
                System.out.println("Cuenta eliminada.");
            } else {
                System.out.println("Cuenta no encontrada.");
            }
        } else {
            System.out.println("Cliente no encontrado.");
        }
    }

    public static void modificarCliente() {
        System.out.println("Modificar Cliente (funcionalidad aún no implementada).");
    }

    public static void listarClientes() {
        System.out.println("Listado de clientes:");
        for (Cliente cliente : clientes) {
            System.out.println("Nombre: " + cliente.getNombre() + ", Apellido: " + cliente.getApellido());
        }
    }


	}


