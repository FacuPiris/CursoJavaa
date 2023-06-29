import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número
        System.out.println("Ingrese un número:");
        int numero = scanner.nextInt();

        // Determinar a qué docena pertenece el número utilizando la operación lógica AND
        boolean primeraDocenaAnd = (numero >= 1 && numero <= 12);
        boolean segundaDocenaAnd = (numero >= 13 && numero <= 24);
        boolean terceraDocenaAnd = (numero >= 25 && numero <= 36);

        // Determinar a qué docena pertenece el número utilizando la operación lógica OR
        boolean perteneceADocenaOr = (numero >= 1 && numero <= 12) || (numero >= 13 && numero <= 24) || (numero >= 25 && numero <= 36);

        // Mostrar el resultado utilizando la operación lógica AND
        if (primeraDocenaAnd) {
            System.out.println("El número " + numero + " pertenece a la primera docena.");
        } else if (segundaDocenaAnd) {
            System.out.println("El número " + numero + " pertenece a la segunda docena.");
        } else if (terceraDocenaAnd) {
            System.out.println("El número " + numero + " pertenece a la tercera docena.");
        } else {
            System.out.println("El número " + numero + " está fuera de rango.");
        }

        // Mostrar el resultado utilizando la operación lógica OR
        if (perteneceADocenaOr) {
            if (numero >= 1 && numero <= 12) {
                System.out.println("El número " + numero + " pertenece a la primera docena.");
            } else if (numero >= 13 && numero <= 24) {
                System.out.println("El número " + numero + " pertenece a la segunda docena.");
            } else {
                System.out.println("El número " + numero + " pertenece a la tercera docena.");
            }
        } else {
            System.out.println("El número " + numero + " está fuera de rango.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
