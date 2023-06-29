import java.util.Scanner;

public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la clase del auto (a, b, c):");
        char clase = scanner.next().charAt(0);

        System.out.println("Características del auto:");

        switch (clase) {
            case 'a':
                System.out.println("- 4 ruedas");
                System.out.println("- Un motor");
                break;
            case 'b':
                System.out.println("- 4 ruedas");
                System.out.println("- Un motor");
                System.out.println("- Cierre centralizado");
                System.out.println("- Aire acondicionado");
                break;
            case 'c':
                System.out.println("- 4 ruedas");
                System.out.println("- Un motor");
                System.out.println("- Cierre centralizado");
                System.out.println("- Aire acondicionado");
                System.out.println("- Airbag");
                break;
            default:
                System.out.println("Clase de auto inválida");
                break;
        }
    }
}
