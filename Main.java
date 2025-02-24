import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Persona> personas = new ArrayList<>();
        InscripcionesPersonas inscripcionPersonas = new InscripcionesPersonas(personas);
        CursosInscritos cursosInscritos = new CursosInscritos();
        CursosProfesores cursosProfesores = new CursosProfesores();

        while (true) {
            System.out.println("\n--- MENÚ DE GESTIONN ---");
            System.out.println("1. Gestión de Personas");
            System.out.println("2. Gestión de Cursos");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            int opcionPrincipal = scanner.nextInt();
            scanner.nextLine();

            switch (opcionPrincipal) {
                case 1:
                    menuPersonas(scanner, inscripcionPersonas, personas);
                    break;
                case 2:
                    menuCursos(scanner, cursosInscritos);
                    break;
                case 3:
                    System.out.println("Saliendo del sistema...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

    private static void menuPersonas(Scanner scanner, InscripcionesPersonas inscripcionPersonas, List<Persona> personas) {
        while (true) {
            System.out.println("\n--- GESTIÓN DE PERSONAS ---");
            System.out.println("1. Inscribir Persona");
            System.out.println("2. Actualizar Persona");
            System.out.println("3. Eliminar Persona");
            System.out.println("4. Mostrar Inscripciones");
            System.out.println("5. Guardar Inscripciones");
            System.out.println("6. Cargar Inscripciones");
            System.out.println("7. Volver al menú principal");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Apellido: ");
                    String apellido = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    inscripcionPersonas.inscribir(id, nombre, apellido, email);
                    break;
                case 2:
                    System.out.print("ID de la persona a actualizar: ");
                    int idActualizar = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nuevo Nombre: ");
                    String nuevoNombre = scanner.nextLine();
                    System.out.print("Nuevo Apellido: ");
                    String nuevoApellido = scanner.nextLine();
                    System.out.print("Nuevo Email: ");
                    String nuevoEmail = scanner.nextLine();
                    inscripcionPersonas.actualizar(idActualizar, nuevoNombre, nuevoApellido, nuevoEmail);
                    break;
                case 3:
                    System.out.print("ID de la persona a eliminar: ");
                    int idEliminar = scanner.nextInt();
                    scanner.nextLine();
                    inscripcionPersonas.eliminar(idEliminar);
                    break;
                case 4:
                    System.out.println("Listado de inscripciones: ");
                    for (Persona p : personas) {
                        System.out.println(p);
                    }
                    break;
                case 5:
                    System.out.print("Ingrese el nombre del archivo: ");
                    String archivoGuardar = scanner.nextLine();
                    inscripcionPersonas.guardarInformacion(archivoGuardar);
                    break;
                case 6:
                    System.out.print("Ingrese el nombre del archivo a cargar: ");
                    String archivoCargar = scanner.nextLine();
                    inscripcionPersonas.leerDesdeArchivo(archivoCargar);
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

    private static void menuCursos(Scanner scanner, CursosInscritos cursosInscritos) {
        while (true) {
            System.out.println("\n--- GESTIÓN DE CURSOS ---");
            System.out.println("1. Inscribir en Curso");
            System.out.println("2. Mostrar Inscripciones en Cursos");
            System.out.println("3. Volver al menú principal");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Funcionalidad de inscripción en curso pendiente de implementar.");
                    break;
                case 2:
                    System.out.println(cursosInscritos);
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }
}
