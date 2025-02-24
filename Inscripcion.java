public class Inscripcion {
    Curso curso;
    int anio, semestre;
    Estudiante estudiante;

    public Inscripcion(Curso curso, int anio, int semestre, Estudiante estudiante){
        this.curso = curso;
        this.anio = anio;
        this.semestre = semestre;
        this.estudiante = estudiante;
    }

    @Override
    public String toString() {
        return "Curso: " + curso.getNombre() +
                "\nAño: " + anio +
                "\nSemestre: " + semestre +
                "\nEstudiante: " + estudiante.getNombre();
    }

    // Obtener toda la información de la inscripción
    public String getInscripciones() {
        return this.toString();
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Inscripcion that = (Inscripcion) obj;
        return anio == that.anio &&
                semestre == that.semestre &&
                curso.equals(that.curso) &&
                estudiante.equals(that.estudiante);
    }

    @Override
    public int hashCode() {
        return curso.hashCode() + Integer.hashCode(anio) + Integer.hashCode(semestre) + estudiante.hashCode();
    }
}
