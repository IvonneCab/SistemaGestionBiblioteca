public class Main {

    public static void main(String[] args) {

        // Crear un libro
        Libro libro = new Libro(
                "978-84-376-0494-7",
                "Cien años de soledad",
                "Gabriel García Márquez"
        );

        // Crear un usuario
        Usuario usuario = new Usuario(
                "U001",
                "Nelson",
                "Estudiante"
        );

        // Crear un bibliotecario
        Bibliotecario bibliotecario = new Bibliotecario(
                "B001",
                "Carlos"
        );

        // Crear un préstamo
        Prestamo prestamo = new Prestamo(
                "P001",
                libro,
                usuario,
                bibliotecario
        );

        // Mostrar información inicial
        System.out.println("=== SISTEMA DE GESTIÓN DE BIBLIOTECA ===");
        System.out.println("Libro: " + libro.getTitulo());
        System.out.println("Autor: " + libro.getAutor());
        System.out.println("Usuario: " + usuario.getNombre());
        System.out.println("Bibliotecario: " + bibliotecario.getNombre());
        System.out.println("Disponible: " + libro.isDisponible());

        // Realizar préstamo
        System.out.println("\n--- REALIZANDO PRÉSTAMO ---");
        prestamo.prestarLibro();
        System.out.println("Disponible después del préstamo: " + libro.isDisponible());

        // Realizar devolución
        System.out.println("\n--- REALIZANDO DEVOLUCIÓN ---");
        prestamo.devolverLibro();
        System.out.println("Disponible después de la devolución: " + libro.isDisponible());
    }
}