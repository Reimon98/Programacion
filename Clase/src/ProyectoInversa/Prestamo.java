package ProyectoInversa;

/**
 * La clase Prestamo representa un préstamo de un libro a un usuario.
 * Asocia un libro con un usuario y cambia el estado de disponibilidad del libro a no disponible.
 */
public class Prestamo {
    
    private Libro libro;  // El libro que está siendo prestado
    private Usuario usuario; // El usuario que está tomando el libro
    
    /**
     * Constructor de la clase Prestamo.
     * Inicializa el préstamo asociando un libro a un usuario y marca el libro como no disponible.
     * 
     * @param libro El libro que se va a prestar
     * @param usuario El usuario que va a recibir el libro
     */
    public Prestamo(Libro libro, Usuario usuario) {
        this.libro = libro;
        this.usuario = usuario;
        libro.setDisponible(false); // El libro ya no está disponible
    }
    
    /**
     * Devuelve el libro, cambiando su estado de disponibilidad a disponible nuevamente.
     */
    public void devolver() {
        libro.setDisponible(true); // El libro se marca como disponible de nuevo
    }
}
