package arraylist;
import java.util.ArrayList;
import java.util.Random;

public class Ejercicio8 {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = generarDatos(100);

        int[] frecuencias = calcularFrecuencias(numeros);

        imprimirResultados(numeros, frecuencias);
    }

    // Generar 100 números entre 1 y 20
    public static ArrayList<Integer> generarDatos(int n) {

        Random random = new Random();
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            numeros.add(random.nextInt(20) + 1);
        }

        return numeros;
    }

    // Calcular frecuencias
    public static int[] calcularFrecuencias(ArrayList<Integer> numeros) {

        int[] frecuencias = new int[21];

        for (int numero : numeros) {
            frecuencias[numero]++;
        }

        return frecuencias;
    }

    // Imprimir tabla y número más frecuente
    public static void imprimirResultados(ArrayList<Integer> numeros, int[] frecuencias) {

        System.out.println("Lista generada:");
        for (int n : numeros) {
            System.out.print(n + " ");
        }

        System.out.println("\n");
        System.out.println("Número | Frecuencia");

        int maxFrecuencia = 0;
        int numeroMasFrecuente = 0;

        for (int i = 1; i <= 20; i++) {

            System.out.println(i + " | " + frecuencias[i]);

            if (frecuencias[i] > maxFrecuencia) {
                maxFrecuencia = frecuencias[i];
                numeroMasFrecuente = i;
            }
        }

        System.out.println("\nNúmero más frecuente: " + numeroMasFrecuente);
        System.out.println("Frecuencia: " + maxFrecuencia);
    }
}