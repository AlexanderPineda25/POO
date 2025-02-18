public class Profesor extends Persona {
    private String tipoContrato;

    public Profesor(double id, String nombres, String apellidos, String email, String tipoContrato) {
        super(id, nombres, apellidos, email);
        this.tipoContrato = tipoContrato;
    }

    public String getTipoContrato() {
        return tipoContrato;
    }

    public void setTipoContrato(String tipoContrato) {
        this.tipoContrato = tipoContrato;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "id=" + getID() +
                ", nombres='" + getNombre() + " " + getApellidos() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", tipoContrato='" + tipoContrato + '\'' +
                '}';
    }
}