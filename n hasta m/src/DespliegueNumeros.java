public class DespliegueNumeros {
    public static void desplegarNumerosDesdeNHastaM(int n, int m) {
        for (int i = n; i <= m; i++) {
            System.out.println(i);
        }
    }

    // Ejemplo de uso
    public static void main(String[] args) {
        int n = 1;
        int m = 10;
        desplegarNumerosDesdeNHastaM(n, m);
    }
}