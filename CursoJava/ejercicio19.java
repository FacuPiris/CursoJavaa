import java.util.Random;

public class Ejercicio19 {
    public static void main(String[] args) {
        // Crear un objeto Random para generar números al azar
        Random random = new Random();

        int contador = 0;
        int suma = 0;

        // Generar 10 números al azar
        while (contador < 10) {
            int numero = random.nextInt(100); // Generar un número entre 0 y 99
            System.out.println("Número generado: " + numero);
            suma += numero; // Acumular la suma de los números generados
            contador++; // Incrementar el contador
        }

        double promedio = (double) suma / 10; // Calcular el promedio

        // Mostrar la suma y el promedio
        System.out.println("Suma: " + suma);
        System.out.println("Promedio: " + promedio);
    }
}
