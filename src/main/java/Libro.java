public class Libro {

    // Atributos privados (Encapsulamiento)
    private String isbn;
    private String titulo;
    private String autor;
    private boolean disponible;

    // Constructor con inicialización de atributos
    public Libro(String isbn, String titulo, String autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true; // Todo libro inicia estando disponible por defecto
    }

    // Métodos Getters y Setters
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // Método para mostrar la información básica del libro
    public void mostrarInfo() {
        String estado = disponible ? "Disponible" : "Prestado";
        System.out.println("Libro: " + titulo + " | Autor: " + autor + " | ISBN: " + isbn + " | Estado: " + estado);
    }
}
