import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la categoría del empleado (A, B, C): ");
        char categoria = scanner.next().charAt(0);

        System.out.print("Ingrese la antigüedad del empleado en años: ");
        int antiguedad = scanner.nextInt();

        System.out.print("Ingrese el sueldo bruto del empleado: ");
        double sueldoBruto = scanner.nextDouble();

        // Determinar el porcentaje de aumento basado en la antigüedad
        double porcentajeAumento = 0.0;
        if (antiguedad >= 1 && antiguedad <= 5) {
            porcentajeAumento = 0.05;
        } else if (antiguedad >= 6 && antiguedad <= 10) {
            porcentajeAumento = 0.1;
        } else if (antiguedad > 10) {
            porcentajeAumento = 0.3;
        }

        // Determinar el plus por categoría
        double plusCategoria = 0.0;
        switch (categoria) {
            case 'A':
                plusCategoria = 1000.0;
                break;
            case 'B':
                plusCategoria = 2000.0;
                break;
            case 'C':
                plusCategoria = 3000.0;
                break;
        }

        // Calcular el sueldo neto
        double aumentoSueldo = sueldoBruto * porcentajeAumento;
        double sueldoNeto = sueldoBruto + aumentoSueldo + plusCategoria;

        // Mostrar el sueldo neto
        System.out.println("El sueldo neto del empleado es: " + sueldoNeto);
    }
}
