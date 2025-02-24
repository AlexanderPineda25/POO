import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class InscripcionesPersonas {
    List<Persona> listaInscripcion = new ArrayList<>();

    public InscripcionesPersonas(List<Persona> listaInscripcion){
        this.listaInscripcion = listaInscripcion;
    }


    public void leerDesdeArchivo(String datos) {
        try (BufferedReader br = new BufferedReader(new FileReader(datos))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] dat = linea.split(",");
                if (dat.length == 4) {
                    double ID = Integer.parseInt(dat[0]);
                    String nombre = dat[1];
                    String apellidos = dat[2];
                    String email = dat[3];

                    Persona persona = new Persona(ID, nombre, apellidos, email);
                    listaInscripcion.add(persona);
                }
            }
            System.out.println("Datos cargados desde el archivo correctamente.");
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Error en el formato del ID: " + e.getMessage());
        }
    }

    public void inscribir(double id, String nombre, String Apellidos, String email){
        Persona nuevaPersona = new Persona(id, nombre, Apellidos, email);
        listaInscripcion.add(nuevaPersona);
        System.out.println("Persona inscrita: " + nuevaPersona);
    }

    public void actualizar(int id, String nuevoNombre, String nuevoApellido, String nuevoEmail){
        for (Persona p1 : listaInscripcion) {
            if (p1.getID() == id) {
                p1.setNombre(nuevoNombre);
                p1.setApellidos(nuevoApellido);
                p1.setEmail(nuevoEmail);
                System.out.println("Persona actualizada: " + p1);
                return;
            }
        }
        System.out.println("Persona con ID " + id + " no encontrada.");
    }

    public void eliminar(int id) {
        listaInscripcion.removeIf(p -> p.getID() == id);
        System.out.println("Persona con ID " + id + " eliminada (si existía).");
    }

    public void guardarInformacion(String archivo) {
        try (FileWriter fw = new FileWriter(archivo)) {
            for (Persona p : listaInscripcion) {
                fw.write(p.getID() + "," + p.getNombre() + "," + p.getApellidos() + "," + p.getEmail() + "\n");
            }
            System.out.println("Datos guardados correctamente en " + archivo);
        } catch (IOException e) {
            System.out.println("Error al guardar los datos: " + e.getMessage());
        }
    }

}
