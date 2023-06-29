import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el nombre del mes
        System.out.print("Ingrese el nombre del mes: ");
        String nombreMes = scanner.nextLine();

        // Convertir el nombre del mes a minúsculas para facilitar la comparación
        nombreMes = nombreMes.toLowerCase();

        // Determinar la cantidad de días según el nombre del mes
        int cantidadDias;

        switch (nombreMes) {
            case "enero":
            case "marzo":
            case "mayo":
            case "julio":
            case "agosto":
            case "octubre":
            case "diciembre":
                cantidadDias = 31;
                break;
            case "abril":
            case "junio":
            case "septiembre":
            case "noviembre":
                cantidadDias = 30;
                break;
            case "febrero":
                cantidadDias = 28;
                break;
            default:
                cantidadDias = -1; // Valor inválido para manejar casos no reconocidos
                break;
        }

        // Mostrar la cantidad de días correspondiente
        if (cantidadDias != -1) {
            System.out.println("El mes de " + nombreMes + " tiene " + cantidadDias + " días.");
        } else {
            System.out.println("Nombre de mes inválido.");
        }

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
