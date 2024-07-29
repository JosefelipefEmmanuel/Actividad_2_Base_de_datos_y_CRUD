import java.util.Scanner;

public class MCD_Euclides {
    public static int calcularMCD(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return calcularMCD(n2, n1 % n2);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Ingresa el primer número entero positivo (n1): ");
            int n1 = scanner.nextInt();
            
            System.out.print("Ingresa el segundo número entero positivo (n2): ");
            int n2 = scanner.nextInt();
            
            if (n1 <= 0 || n2 <= 0) {
                System.out.println("Ambos números deben ser enteros positivos.");
            } else {
                if (n1 < n2) {
                    int temp = n1;
                    n1 = n2;
                    n2 = temp;
                }
                
                int mcd = calcularMCD(n1, n2);
                System.out.println("El máximo común divisor (MCD) es: " + mcd);
            }
        }
    }
}
