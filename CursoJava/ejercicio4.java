import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese la categoría
        System.out.print("Ingrese la categoría (a, b o c): ");
        String categoria = scanner.nextLine();

        // Verificar la categoría ingresada y mostrar la palabra correspondiente
        switch (categoria) {
            case "a":
                System.out.println("Hijo");
                break;
            case "b":
                System.out.println("Padres");
                break;
            case "c":
                System.out.println("Abuelos");
                break;
            default:
                System.out.println("Categoría inválida");
                break;
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}