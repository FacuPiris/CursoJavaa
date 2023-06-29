import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un carácter
        System.out.println("Ingrese un carácter:");
        char caracter = scanner.next().charAt(0);

        // Verificar si el carácter es una vocal utilizando la operación lógica OR
        boolean esVocalOr = (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u' ||
                caracter == 'A' || caracter == 'E' || caracter == 'I' || caracter == 'O' || caracter == 'U');

        // Verificar si el carácter es una vocal utilizando la operación lógica AND
        boolean esVocalAnd = (caracter == 'a' && caracter == 'e' && caracter == 'i' && caracter == 'o' && caracter == 'u' &&
                caracter == 'A' && caracter == 'E' && caracter == 'I' && caracter == 'O' && caracter == 'U');

        // Mostrar los resultados
        System.out.println("Usando OR: El carácter ingresado " + (esVocalOr ? "es una vocal." : "no es una vocal."));
        System.out.println("Usando AND: El carácter ingresado " + (esVocalAnd ? "es una vocal." : "no es una vocal."));

        // Cerrar el objeto Scanner
        scanner.close();
    }
}