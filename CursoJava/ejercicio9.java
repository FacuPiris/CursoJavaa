import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Jugador 1 - Ingrese su elección:");
        System.out.println("0 - Piedra");
        System.out.println("1 - Papel");
        System.out.println("2 - Tijera");
        int jugador1 = scanner.nextInt();

        System.out.println("Jugador 2 - Ingrese su elección:");
        System.out.println("0 - Piedra");
        System.out.println("1 - Papel");
        System.out.println("2 - Tijera");
        int jugador2 = scanner.nextInt();

        if ((jugador1 == 0 && jugador2 == 2) || (jugador1 == 1 && jugador2 == 0) || (jugador1 == 2 && jugador2 == 1)) {
            System.out.println("¡El jugador 1 es el ganador!");
        } else if ((jugador2 == 0 && jugador1 == 2) || (jugador2 == 1 && jugador1 == 0) || (jugador2 == 2 && jugador1 == 1)) {
            System.out.println("¡El jugador 2 es el ganador!");
        } else {
            System.out.println("¡Es un empate!");
        }
    }
}
