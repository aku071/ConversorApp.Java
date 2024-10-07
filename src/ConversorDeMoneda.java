import java.util.Scanner;

public class ConversorDeMoneda {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("************************************");
            System.out.println("Conversor de Moneda =]");
            System.out.println("************************************");
            System.out.println("1) Dólar => Peso argentino");
            System.out.println("2) Peso argentino => Dólar");
            System.out.println("3) Dólar => Real brasileño");
            System.out.println("4) Real brasileño => Dólar");
            System.out.println("5) Dólar => Peso colombiano");
            System.out.println("6) Peso colombiano => Dólar");
            System.out.println("7) Salir");
            System.out.println("************************************");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    convertirDolarAPesoArgentino(scanner);
                    break;
                case 2:
                    convertirPesoArgentinoADolar(scanner);
                    break;
                case 3:
                    convertirDolarAReal(scanner);
                    break;
                case 4:
                    convertirRealADolar(scanner);
                    break;
                case 5:
                    convertirDolarAPesoColombiano(scanner);
                    break;
                case 6:
                    convertirPesoColombianoADolar(scanner);
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 7);

        scanner.close();
    }

    public static void convertirDolarAPesoArgentino(Scanner scanner) {
        System.out.print("Ingrese la cantidad en Dólares: ");
        double cantidad = scanner.nextDouble();
        double resultado = cantidad * 350;  // Ejemplo de tasa de conversión
        System.out.println("Equivale a: " + resultado + " Pesos argentinos.");
    }

    public static void convertirPesoArgentinoADolar(Scanner scanner) {
        System.out.print("Ingrese la cantidad en Pesos argentinos: ");
        double cantidad = scanner.nextDouble();
        double resultado = cantidad / 350;  // Ejemplo de tasa de conversión
        System.out.println("Equivale a: " + resultado + " Dólares.");
    }

    public static void convertirDolarAReal(Scanner scanner) {
        System.out.print("Ingrese la cantidad en Dólares: ");
        double cantidad = scanner.nextDouble();
        double resultado = cantidad * 5.2;  // Ejemplo de tasa de conversión
        System.out.println("Equivale a: " + resultado + " Reales brasileños.");
    }

    public static void convertirRealADolar(Scanner scanner) {
        System.out.print("Ingrese la cantidad en Reales brasileños: ");
        double cantidad = scanner.nextDouble();
        double resultado = cantidad / 5.2;  // Ejemplo de tasa de conversión
        System.out.println("Equivale a: " + resultado + " Dólares.");
    }

    public static void convertirDolarAPesoColombiano(Scanner scanner) {
        System.out.print("Ingrese la cantidad en Dólares: ");
        double cantidad = scanner.nextDouble();
        double resultado = cantidad * 4200;  // Ejemplo de tasa de conversión
        System.out.println("Equivale a: " + resultado + " Pesos colombianos.");
    }

    public static void convertirPesoColombianoADolar(Scanner scanner) {
        System.out.print("Ingrese la cantidad en Pesos colombianos: ");
        double cantidad = scanner.nextDouble();
        double resultado = cantidad / 4200;  // Ejemplo de tasa de conversión
        System.out.println("Equivale a: " + resultado + " Dólares.");
    }
}
