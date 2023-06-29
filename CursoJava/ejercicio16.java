import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.println("Ingrese un número:");
        int numero = scanner.nextInt();

        // Mostrar la tabla de multiplicar del número ingresado
        System.out.println("Tabla de multiplicar del " + numero + ":");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
