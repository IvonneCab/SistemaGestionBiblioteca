public class Prestamo {

    // Atributos privados
    private String idPrestamo;
    private Libro libro;
    private Usuario usuario;
    private Bibliotecario bibliotecario;

    // Constructor
    public Prestamo(String idPrestamo, Libro libro, Usuario usuario, Bibliotecario bibliotecario) {
        this.idPrestamo = idPrestamo;
        this.libro = libro;
        this.usuario = usuario;
        this.bibliotecario = bibliotecario;
    }

    // Getter y Setter de idPrestamo
    public String getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(String idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    // Getter y Setter de libro
    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    // Getter y Setter de usuario
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    // Getter y Setter de bibliotecario
    public Bibliotecario getBibliotecario() {
        return bibliotecario;
    }

    public void setBibliotecario(Bibliotecario bibliotecario) {
        this.bibliotecario = bibliotecario;
    }

    // Método para prestar el libro
    public void prestarLibro() {
        if (libro.isDisponible()) {
            libro.setDisponible(false);
            System.out.println("El libro ha sido prestado correctamente.");
        } else {
            System.out.println("El libro no está disponible.");
        }
    }

    // Método para devolver el libro
    public void devolverLibro() {
        if (!libro.isDisponible()) {
            libro.setDisponible(true);
            System.out.println("El libro ha sido devuelto correctamente.");
        } else {
            System.out.println("El libro ya está disponible.");
        }
    }
}