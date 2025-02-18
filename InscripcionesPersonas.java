import java.util.ArrayList;
import java.util.List;

public class InscripcionesPersonas {
    private final List<Persona> listado;

    public InscripcionesPersonas() {
        this.listado = new ArrayList<>();
        guardarInformacion(); // Se llena la lista automáticamente
    }

    public void inscribir(Persona persona) {
        listado.add(persona);
    }

    public void eliminar(Persona persona) {
        listado.remove(persona);
    }

    public void actualizar(Persona persona) {
        for (int i = 0; i < listado.size(); i++) {
            if (listado.get(i).getID() == persona.getID()) {
                listado.set(i, persona);
                break;
            }
        }
    }

    private void guardarInformacion() {
        listado.add(new Persona(1.0, "Juan", "Pérez", "juan.perez@email.com"));
        listado.add(new Persona(2.0, "María", "Gómez", "maria.gomez@email.com"));
        listado.add(new Persona(3.0, "Carlos", "Rodríguez", "carlos.rodriguez@email.com"));
        listado.add(new Persona(4.0, "Ana", "Martínez", "ana.martinez@email.com"));
        listado.add(new Persona(5.0, "Luis", "Fernández", "luis.fernandez@email.com"));
        listado.add(new Persona(6.0, "Sofía", "Ramírez", "sofia.ramirez@email.com"));
        listado.add(new Persona(7.0, "Diego", "Torres", "diego.torres@email.com"));
        listado.add(new Persona(8.0, "Elena", "Díaz", "elena.diaz@email.com"));
        listado.add(new Persona(9.0, "Ricardo", "Mendoza", "ricardo.mendoza@email.com"));
        listado.add(new Persona(10.0, "Gabriela", "Ortiz", "gabriela.ortiz@email.com"));
    }

    public void cargarDatos() {
        System.out.println("Datos de personas cargados.");
    }

    public List<Persona> getListado() {
        return listado;
    }
}












