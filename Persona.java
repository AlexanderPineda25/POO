public class Persona {
    private Double ID;
    private String nombre;
    private String apellidos;
    private String email;

    public Persona(Double ID, String nombre, String apellidos, String email) {
        this.ID = ID;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
    }

    public Double getID() { return ID; }
    public void setID(Double ID) { this.ID = ID; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getApellidos() { return apellidos; }
    public void setApellidos(String apellidos) { this.apellidos = apellidos; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    @Override
    public String toString() {
        return "Persona{" +
                "ID=" + ID +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}