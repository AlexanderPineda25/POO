import java.util.ArrayList;
import java.util.List;

public class CursosInscritos {
    private final List<Inscripcion> listado;

    public CursosInscritos() {
        this.listado = new ArrayList<>();
        guardarInformacion();
    }

    public void inscribirCurso(Inscripcion inscripcion) {
        listado.add(inscripcion);
        System.out.println("Inscripción agregada: " + inscripcion);
    }

    public void eliminar(Inscripcion inscripcion) {
        if (listado.remove(inscripcion)) {
            System.out.println("Inscripción eliminada: " + inscripcion);
        } else {
            System.out.println("No se encontró la inscripción para eliminar: " + inscripcion);
        }
    }

    public void actualizar(Inscripcion inscripcion) {
        for (int i = 0; i < listado.size(); i++) {
            Inscripcion actual = listado.get(i);
            if (actual.getEstudiante().getCodigo() == inscripcion.getEstudiante().getCodigo() &&
                actual.getCurso().getId() == inscripcion.getCurso().getId()) {
                listado.set(i, inscripcion);
                System.out.println("Inscripción actualizada: " + inscripcion);
                return;
            }
        }
        System.out.println("No se encontró la inscripción para actualizar: " + inscripcion);
    }

    private void guardarInformacion() {
    }

    public void cargarDatos() {
        System.out.println("Datos de inscripciones cargados.");
    }

    public List<String> toStringList() {
        List<String> listaString = new ArrayList<>();
        for (Inscripcion inscripcion : listado) {
            listaString.add(inscripcion.toString());
        }
        return listaString;
    }

    public List<Inscripcion> getListado() {
        return listado;
    }
}
