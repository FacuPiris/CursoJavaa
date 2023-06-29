import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al competidor 1 que elija una opción
        System.out.println("Competidor 1, elija una opción:");
        System.out.println("0 - Piedra");
        System.out.println("1 - Papel");
        System.out.println("2 - Tijera");
        int opcionCompetidor1 = scanner.nextInt();

        // Solicitar al competidor 2 que elija una opción
        System.out.println("Competidor 2, elija una opción:");
        System.out.println("0 - Piedra");
        System.out.println("1 - Papel");
        System.out.println("2 - Tijera");
        int opcionCompetidor2 = scanner.nextInt();

        // Determinar el ganador
        if (opcionCompetidor1 == opcionCompetidor2) {
            System.out.println("Empate");
        } else if ((opcionCompetidor1 == 0 && opcionCompetidor2 == 2) ||
                   (opcionCompetidor1 == 1 && opcionCompetidor2 == 0) ||
                   (opcionCompetidor1 == 2 && opcionCompetidor2 == 1)) {
            System.out.println("Gana el competidor 1");
        } else {
            System.out.println("Gana el competidor 2");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
