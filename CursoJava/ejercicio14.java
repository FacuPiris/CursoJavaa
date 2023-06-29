import java.util.Scanner;

public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el puesto obtenido: ");
        int puesto = scanner.nextInt();

        switch (puesto) {
            case 1:
                System.out.println("Medalla de oro");
                break;
            case 2:
                System.out.println("Medalla de plata");
                break;
            case 3:
                System.out.println("Medalla de bronce");
                break;
            default:
                System.out.println("Siga participando");
                break;
        }
    }
}
