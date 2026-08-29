public class Usuario {
    private String idUsuario;
    private String nombre;
    private String tipoUsuario;

    public Usuario(String idUsuario, String nombre, String tipoUsuario) {
        this.idUsuario = idUsuario;
        this.nombre = nombre;
        this.tipoUsuario = tipoUsuario;
    }

    public String getIdUsuario() { return idUsuario; }
    public void setIdUsuario(String idUsuario) { this.idUsuario = idUsuario; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getTipoUsuario() { return tipoUsuario; }
    public void setTipoUsuario(String tipoUsuario) { this.tipoUsuario = tipoUsuario; }
}

