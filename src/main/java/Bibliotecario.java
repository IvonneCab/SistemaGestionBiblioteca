public class Bibliotecario {

    // Atributos privados (Encapsulamiento)
    private String idBibliotecario;
    private String nombre;

    // Constructor
    public Bibliotecario(String idBibliotecario, String nombre) {
        this.idBibliotecario = idBibliotecario;
        this.nombre = nombre;
    }

    // Getters y Setters
    public String getIdBibliotecario() {
        return idBibliotecario;
    }

    public void setIdBibliotecario(String idBibliotecario) {
        this.idBibliotecario = idBibliotecario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}