public class Ejercicio18 {
    public static void main(String[] args) {
        // Mostrar todas las tablas de multiplicar del 1 al 10
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabla de multiplicar del " + i + ":");

            for (int j = 1; j <= 10; j++) {
                int resultado = i * j;
                System.out.println(i + " x " + j + " = " + resultado);
            }

            System.out.println(); // Agregar una línea en blanco entre cada tabla
        }
    }
}
