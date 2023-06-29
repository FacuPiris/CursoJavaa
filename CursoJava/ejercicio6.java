import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el número de curso
        System.out.print("Ingrese el número de curso: ");
        int numeroCurso = scanner.nextInt();

        // Determinar el tipo de curso y mostrar el mensaje correspondiente
        if (numeroCurso == 0) {
            System.out.println("Jardín de infantes");
        } else if (numeroCurso >= 1 && numeroCurso <= 6) {
            System.out.println("Primaria");
        } else if (numeroCurso >= 7 && numeroCurso <= 12) {
            System.out.println("Secundaria");
        } else {
            System.out.println("Curso no reconocido");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}