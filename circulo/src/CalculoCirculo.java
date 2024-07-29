import java.util.Scanner;

public class CalculoCirculo {

    public static void main(String[] args) {
        // Definir la constante pi
        final double PI = 3.14159;

        // Crear un objeto Scanner para la entrada de datos
        Scanner sc = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingresa el radio del círculo: ");
        double radio = sc.nextDouble();

        // Cálculo de la longitud de la circunferencia
        double longitudCircunferencia = 2 * PI * radio;

        // Cálculo del área del círculo
        double areaCirculo = PI * radio * radio;

        // Mostrar resultados
        System.out.println("Longitud de la circunferencia: " + longitudCircunferencia);
        System.out.println("Área del círculo: " + areaCirculo);
    }
}
