import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el puesto en el torneo
        System.out.print("Ingrese el puesto en el torneo (1, 2 o 3): ");
        int puesto = scanner.nextInt();

        // Mostrar el mensaje correspondiente al puesto en el torneo
        if (puesto == 1) {
            System.out.println("Medalla de oro");
        } else if (puesto == 2) {
            System.out.println("Medalla de plata");
        } else if (puesto == 3) {
            System.out.println("Medalla de bronce");
        } else {
            System.out.println("Siga participando");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}