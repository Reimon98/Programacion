package ProyectoInversa;

/**
 * La clase Usuario representa a un usuario de la biblioteca.
 * Cada usuario tiene un nombre y un DNI único que lo identifica.
 */
public class Usuario {
    
    private String nombre; // Nombre del usuario
    private String dni;    // DNI del usuario
    
    /**
     * Constructor de la clase Usuario.
     * Inicializa un usuario con su nombre y DNI.
     * 
     * @param nombre El nombre del usuario
     * @param dni El DNI del usuario
     */
    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    /**
     * Obtiene el nombre del usuario.
     * 
     * @return El nombre del usuario
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Obtiene el DNI del usuario.
     * 
     * @return El DNI del usuario
     */
    public String getDni() {
        return dni;
    }
}
