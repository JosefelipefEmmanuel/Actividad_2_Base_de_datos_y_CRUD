import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("¿Qué operación desea realizar? (sumar, restar, multiplicar, dividir)");
            String operacion = scanner.nextLine();

            System.out.println("Ingrese el primer número: ");
            int num1 = Integer.parseInt(scanner.nextLine());

            System.out.println("Ingrese el segundo número: ");
            int num2 = Integer.parseInt(scanner.nextLine());

            if (validarNumero(num1) && validarNumero(num2)) {
                int resultado = realizarOperacion(operacion, num1, num2);
                if (resultado != Integer.MIN_VALUE) {
                    System.out.println("El resultado de la operación es: " + resultado);
                } else {
                    System.out.println("Operación no válida.");
                }
            } else {
                System.out.println("Los números ingresados no son válidos.");
            }

            System.out.println("¿Desea realizar otra operación? (s/n): ");
            String opcion = scanner.nextLine();
            if (!opcion.equalsIgnoreCase("s")) {
                continuar = false;
            }
        }
    }

    public static boolean validarNumero(int numero) {
        return numero > 0;
    }

    public static int realizarOperacion(String operacion, int num1, int num2) {
        int resultado;

        switch (operacion.toLowerCase()) {
            case "sumar":
                resultado = num1 + num2;
                break;
            case "restar":
                resultado = num1 - num2;
                break;
            case "multiplicar":
                resultado = num1 * num2;
                break;
            case "dividir":
                resultado = num1 / num2;
                break;
            default:
                resultado = Integer.MIN_VALUE;
        }

        return resultado;
    }
}