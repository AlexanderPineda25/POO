import java.util.ArrayList;
import java.util.List;

public class CursosProfesores {
    private final List<CursoProfesor> listado;

    public CursosProfesores() {
        this.listado = new ArrayList<>();
        guardarInformacion();
    }

    public void inscribir(CursoProfesor cursoProfesor) {
        listado.add(cursoProfesor);
    }

    private void guardarInformacion() {
    }


    public List<CursoProfesor> toStringList() {
        return listado;
    }

    public void cargarDatos() {
        System.out.println("Datos de cursos-profesores cargados.");
    }

    public List<CursoProfesor> getListado() {
        return listado;
    }
}
