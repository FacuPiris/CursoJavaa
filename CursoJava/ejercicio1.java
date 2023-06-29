import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese las tres notas
        System.out.print("Ingrese la nota 1: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Ingrese la nota 2: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Ingrese la nota 3: ");
        double nota3 = scanner.nextDouble();

        // Calcular el promedio
        double promedio = (nota1 + nota2 + nota3) / 3;

        // Verificar si el alumno aprobó o reprobó
        if (promedio >= 7) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}