public class Ejercicio17 con if {
    public static void main(String[] args) {
        int[] valores = {2, 5, 8, 10, 7, 6, 3, 4, 9};
        int sumaPares = 0;

        for (int valor : valores) {
            if (valor % 2 == 0) {
                sumaPares += valor;
            }
        }

        System.out.println("La suma de los valores pares es: " + sumaPares);
    }
}
