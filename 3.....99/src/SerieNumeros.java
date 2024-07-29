public class SerieNumeros {
    public static void main(String[] args) {
        int suma = 0;
        int numero = 3;

        while (numero <= 99) {
            System.out.print(numero + " ");
            suma += numero;
            numero += 3;
        }

        System.out.println("\nLa suma total es: " + suma);
    }
}
