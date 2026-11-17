import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // Carga de los 20 registros iniciales indicados en la guía
        List<Estudiante> estudiantes = new ArrayList<>(List.of(
            new Estudiante("E014", "Ana",    20, 8.5, "Computacion"),
            new Estudiante("E003", "Luis",   19, 7.8, "Electronica"),
            new Estudiante("E018", "Maria",  21, 9.2, "Computacion"),
            new Estudiante("E007", "Pedro",  20, 8.5, "Mecatronica"),
            new Estudiante("E001", "Sofia",  18, 9.5, "Computacion"),
            new Estudiante("E012", "Diego",  22, 6.8, "Electronica"),
            new Estudiante("E005", "Ana",    19, 8.5, "Computacion"),
            new Estudiante("E020", "Carlos", 21, 7.8, "Mecatronica"),
            new Estudiante("E009", "Lucia",  20, 9.2, "Electronica"),
            new Estudiante("E016", "Mateo",  18, 7.0, "Computacion"),
            new Estudiante("E002", "Elena",  22, 8.0, "Mecatronica"),
            new Estudiante("E011", "Pablo",  21, 9.5, "Electronica"),
            new Estudiante("E006", "Sara",   19, 6.8, "Computacion"),
            new Estudiante("E019", "Juan",   20, 8.0, "Mecatronica"),
            new Estudiante("E004", "Diana",  18, 9.2, "Electronica"),
            new Estudiante("E015", "Bruno",  22, 7.0, "Computacion"),
            new Estudiante("E008", "Carla",  21, 8.5, "Mecatronica"),
            new Estudiante("E017", "Andres", 19, 9.5, "Electronica"),
            new Estudiante("E010", "Ana",    20, 8.5, "Computacion"),
            new Estudiante("E013", "Luis",   19, 7.8, "Electronica")
        ));

        // 1. Orden natural por código ascendente
        List<Estudiante> copia1 = new ArrayList<>(estudiantes);
        Collections.sort(copia1);
        System.out.println("--- 1. Orden Natural (Código Ascendente) ---");
        for (Estudiante e : copia1) {
            System.out.println(e);
        }
        System.out.println();

        // 2. Nota descendente, y en caso de empate, nombre ascendente
        List<Estudiante> copia2 = new ArrayList<>(estudiantes);
        copia2.sort(
            Comparator.comparingDouble(Estudiante::getNota).reversed()
                      .thenComparing(Estudiante::getNombre)
        );
        System.out.println("--- 2. Nota (Descendente) y Nombre (Ascendente) ---");
        for (Estudiante e : copia2) {
            System.out.println(e);
        }
        System.out.println();

        // 3. Carrera ascendente, edad descendente, y código ascendente
        List<Estudiante> copia3 = new ArrayList<>(estudiantes);
        copia3.sort(
            Comparator.comparing(Estudiante::getCarrera)
                      .thenComparing(Comparator.comparingInt(Estudiante::getEdad).reversed())
                      .thenComparing(Estudiante::getCodigo)
        );
        System.out.println("--- 3. Carrera (Asc) + Edad (Desc) + Código (Asc) ---");
        for (Estudiante e : copia3) {
            System.out.println(e);
        }
    }
}