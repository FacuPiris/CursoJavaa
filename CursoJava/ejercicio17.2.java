public class Ejercicio17 sin if {
    public static void main(String[] args) {
        int[] valores = {2, 5, 8, 10, 7, 6, 3, 4, 9};
        int sumaPares = 0;

        for (int valor : valores) {
            sumaPares += valor * (1 - valor % 2);
        }

        System.out.println("La suma de los valores pares es: " + sumaPares);
    }
}
