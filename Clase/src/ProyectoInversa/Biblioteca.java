package ProyectoInversa;

/**
 * La clase Biblioteca contiene el método main donde se simula el proceso de préstamo y devolución de libros.
 * Crea un libro, un usuario y realiza un préstamo, devolviendo el libro al final.
 */
public class Biblioteca {

    public static void main(String[] args) {
        // Se crea un libro con título "1984" y autor "George Orwell"
        Libro libro = new Libro("1984", "George Orwell");
        
        // Se crea un usuario con nombre "Ana Pérez" y DNI "12345678A"
        Usuario usuario = new Usuario("Ana Pérez", "12345678A");
        
        // Se crea un préstamo entre el libro y el usuario
        Prestamo prestamo = new Prestamo(libro, usuario);
        
        // Se devuelve el libro, marcando su disponibilidad como verdadera
        prestamo.devolver();
    }
}


