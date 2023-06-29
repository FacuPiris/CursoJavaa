import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número entero
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        // Verificar si el número es par o impar
        if (numero % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}