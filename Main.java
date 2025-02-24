import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        InscripcionesPersonas inscripciones = new InscripcionesPersonas();
        CursosProfesores cursosProf = new CursosProfesores();
        CursosInscritos cursosInsc = new CursosInscritos();

        Servicios servicios = new ServiciosImpl(inscripciones, cursosProf, cursosInsc);

        // Escribir en un archivo
        try (FileWriter writer = new FileWriter("servicios_output.txt")) {
            writer.write("### Resultados de los Servicios PRUEBAAAAAAAAAAAAAAAA DOOOOOOOOOOOSSSSSSSSSSSSSSSSSS TRREESSSSSSSSSSSSSSSSSSSSSSSS ###\n");
            writer.write(servicios.imprimirPosicion(2) + "\n");
            writer.write("Cantidad actual de registros: " + servicios.cantidadActual() + "\n");
            writer.write("Listado de elementos:\n\n");

            for (String item : servicios.imprimirListado()) {
                writer.write(item + "\n");
            }

            System.out.println("Los servicios han sido escritos en 'servicios_output.txt'");
        } catch (IOException e) {
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }
    }
}
