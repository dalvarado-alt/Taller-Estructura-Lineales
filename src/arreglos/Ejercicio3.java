package arreglos;

import java.util.Random;

public class Ejercicio3 {

    public static void main(String[] args) {

        int n = 10; // cantidad de números

        int[] numeros = generarDatos(n);
        long[] factoriales = calcularFactoriales(numeros);

        imprimirResultados(numeros, factoriales);
    }

    // Generación de números aleatorios
    public static int[] generarDatos(int n) {

        Random random = new Random();
        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            numeros[i] = random.nextInt(10) + 1; // números entre 1 y 10
        }

        return numeros;
    }

    // Procesamiento: calcular factoriales
    public static long[] calcularFactoriales(int[] numeros) {

        long[] factoriales = new long[numeros.length];

        for (int i = 0; i < numeros.length; i++) {
            factoriales[i] = factorial(numeros[i]);
        }

        return factoriales;
    }

    // Método para calcular factorial
    public static long factorial(int numero) {

        long resultado = 1;

        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }

        return resultado;
    }

    // Impresión de resultados
    public static void imprimirResultados(int[] numeros, long[] factoriales) {

        System.out.println("Arreglo de números:");

        for (int n : numeros) {
            System.out.print(n + " ");
        }

        System.out.println("\n");

        System.out.println("Arreglo de factoriales:");

        for (long f : factoriales) {
            System.out.print(f + " ");
        }

        System.out.println();
    }
}