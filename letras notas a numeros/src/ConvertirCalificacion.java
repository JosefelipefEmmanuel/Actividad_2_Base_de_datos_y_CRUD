import java.util.Scanner;

public class ConvertirCalificacion {
    public static String convertirCalificacion(int nota) {
        if (nota >= 19 && nota <= 20) {
            return "A";
        } else if (nota >= 16 && nota <= 18) {
            return "B";
        } else if (nota >= 13 && nota <= 15) {
            return "C";
        } else if (nota >= 10 && nota <= 12) {
            return "D";
        } else if (nota >= 1 && nota <= 9) {
            return "E";
        } else {
            return "Nota no válida";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la calificación numérica (entre 1 y 20): ");
        int notaNumerica = scanner.nextInt();

        String calificacionLetra = convertirCalificacion(notaNumerica);
        System.out.println("La calificación " + notaNumerica + " se convierte en: " + calificacionLetra);
    }
}
