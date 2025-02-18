import java.util.ArrayList;
import java.util.List;

class ServiciosImpl implements Servicios {
    private final InscripcionesPersonas inscripciones;
    private final CursosProfesores cursosProfesores;
    private final CursosInscritos cursosInscritos;

    public ServiciosImpl(InscripcionesPersonas inscripciones, CursosProfesores cursosProfesores, CursosInscritos cursosInscritos) {
        this.inscripciones = inscripciones;
        this.cursosProfesores = cursosProfesores;
        this.cursosInscritos = cursosInscritos;
    }

    @Override
    public String imprimirPosicion(int posicion) {
        List<Persona> personas = inscripciones.getListado();
        List<CursoProfesor> cursosProf = cursosProfesores.getListado();
        List<Inscripcion> cursosInsc = cursosInscritos.getListado();

        int total = personas.size() + cursosProf.size() + cursosInsc.size();
        if (posicion < 0 || posicion >= total) {
            return "Posición fuera de rango.";
        }

        if (posicion < personas.size()) {
            return "Persona en posición " + posicion + ": " + personas.get(posicion);
        }

        posicion -= personas.size();
        if (posicion < cursosProf.size()) {
            return "Curso-Profesor en posición " + posicion + ": " + cursosProf.get(posicion);
        }

        posicion -= cursosProf.size();
        return "Inscripción en posición " + posicion + ": " + cursosInsc.get(posicion); // Cambio de CursoInscrito a Inscripcion
    }

    @Override
    public int cantidadActual() {
        return inscripciones.getListado().size() + cursosProfesores.getListado().size() + cursosInscritos.getListado().size();
    }

    @Override
    public List<String> imprimirListado() {
    List<String> salida = new ArrayList<>();
    for (Persona p : inscripciones.getListado()) {
        salida.add("Persona: " + p);
    }
    for (CursoProfesor cp : cursosProfesores.getListado()) {
        salida.add("Curso-Profesor: " + cp);
    }
    for (Inscripcion ci : cursosInscritos.getListado()) { // Cambio de CursoInscrito a Inscripcion
        salida.add("Inscripción: " + ci);
    }
    return salida;
    }
}