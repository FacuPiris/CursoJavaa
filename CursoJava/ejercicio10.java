import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número:");
        int numero1 = scanner.nextInt();

        System.out.println("Ingrese el segundo número:");
        int numero2 = scanner.nextInt();

        System.out.println("Ingrese el tercer número:");
        int numero3 = scanner.nextInt();

        int mayor = numero1;  // Asignamos el primer número como el mayor inicialmente

        if (numero2 > mayor && numero2 > numero3) {
            mayor = numero2;  // Si el segundo número es mayor que el actual mayor y el tercer número, lo asignamos como el nuevo mayor
        }

        if (numero3 > mayor && numero3 > numero2) {
            mayor = numero3;  // Si el tercer número es mayor que el actual mayor y el segundo número, lo asignamos como el nuevo mayor
        }

        System.out.println("El mayor de los tres números es: " + mayor);
    }
}
