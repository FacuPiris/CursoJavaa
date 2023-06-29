import java.util.Random;

public class Ejercicio20 {
    public static void main(String[] args) {
        // Crear un objeto Random para generar números al azar
        Random random = new Random();

        int contador = 0;
        int maximo = Integer.MIN_VALUE;
        int minimo = Integer.MAX_VALUE;

        // Generar 10 números al azar
        do {
            int numero = random.nextInt(100); // Generar un número entre 0 y 99
            System.out.println("Número generado: " + numero);

            // Actualizar el máximo y mínimo
            maximo = Math.max(maximo, numero);
            minimo = Math.min(minimo, numero);

            contador++; // Incrementar el contador
        } while (contador < 10);

        // Mostrar el máximo y mínimo
        System.out.println("Máximo: " + maximo);
        System.out.println("Mínimo: " + minimo);
    }
}
