public class Ejercicios22 {
    public static void main(String[] args) {
        int contador = 0;

        while (contador < 10) {
            // Generar la categoría al azar (A, B, C)
            char categoria = generarCategoriaAzar();

            // Generar la antigüedad al azar (entre 1 y 15 años)
            int antiguedad = generarAntiguedadAzar();

            // Generar el sueldo bruto al azar (entre 1000 y 5000)
            double sueldoBruto = generarSueldoBrutoAzar();

            // Determinar el sueldo neto
            double sueldoNeto = calcularSueldoNeto(categoria, antiguedad, sueldoBruto);

            // Mostrar los datos del empleado
            System.out.println("Empleado " + (contador + 1));
            System.out.println("Categoría: " + categoria);
            System.out.println("Antigüedad: " + antiguedad + " años");
            System.out.println("Sueldo bruto: $" + sueldoBruto);
            System.out.println("Sueldo neto: $" + sueldoNeto);
            System.out.println("--------------------------------");

            contador++;
        }
    }

    public static char generarCategoriaAzar() {
        char[] categorias = {'A', 'B', 'C'};
        int indice = (int) (Math.random() * categorias.length);
        return categorias[indice];
    }

    public static int generarAntiguedadAzar() {
        return (int) (Math.random() * 15) + 1;
    }

    public static double generarSueldoBrutoAzar() {
        return Math.random() * 4000 + 1000;
    }

    public static double calcularSueldoNeto(char categoria, int antiguedad, double sueldoBruto) {
        double porcentajeAumento = 0.0;
        if (antiguedad >= 1 && antiguedad <= 5) {
            porcentajeAumento = 0.05;
        } else if (antiguedad >= 6 && antiguedad <= 10) {
            porcentajeAumento = 0.1;
        } else if (antiguedad > 10) {
            porcentajeAumento = 0.3;
        }

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

        double aumentoSueldo = sueldoBruto * porcentajeAumento;
        double sueldoNeto = sueldoBruto + aumentoSueldo + plusCategoria;

        return sueldoNeto;
    }
}
