package ProyectoInversa;

/**
 * La clase Libro representa un libro en una biblioteca.
 * Contiene información básica sobre el libro como su título, autor y si está disponible para ser prestado.
 */
public class Libro {
    
    private String titulo; // Título del libro
    private String autor;  // Autor del libro
    private boolean disponible; // Estado de disponibilidad del libro
    
    /**
     * Constructor de la clase Libro.
     * Inicializa un libro con su título, autor y lo marca como disponible por defecto.
     * 
     * @param titulo El título del libro
     * @param autor El autor del libro
     */
    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true; // El libro está disponible al principio
    }
    
    /**
     * Obtiene el título del libro.
     * 
     * @return El título del libro
     */
    public String getTitulo() {
        return titulo;
    }
    
    /**
     * Obtiene el autor del libro.
     * 
     * @return El autor del libro
     */
    public String getAutor() {
        return autor;
    }
    
    /**
     * Obtiene el estado de disponibilidad del libro.
     * 
     * @return true si el libro está disponible, false si no lo está
     */
    public boolean isDisponible() {
        return disponible;
    }
    
    /**
     * Establece el estado de disponibilidad del libro.
     * 
     * @param disponible El nuevo estado de disponibilidad del libro
     */
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}

