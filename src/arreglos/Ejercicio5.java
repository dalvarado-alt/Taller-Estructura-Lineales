package arreglos;

import java.util.Random;

public class Ejercicio5 {

    public static void main(String[] args) {

        int[] numeros = generarDatos(20);
        int[] invertidos = invertirNumeros(numeros);

        imprimirResultados(numeros, invertidos);
    }

    // Generación de datos
    public static int[] generarDatos(int n) {

        Random random = new Random();
        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            numeros[i] = random.nextInt(900) + 100; // números entre 100 y 999
        }

        return numeros;
    }

    // Procesamiento: invertir números
    public static int[] invertirNumeros(int[] numeros) {

        int[] invertidos = new int[numeros.length];

        for (int i = 0; i < numeros.length; i++) {
            invertidos[i] = invertirNumero(numeros[i]);
        }

        return invertidos;
    }

    // Método para invertir un número
    public static int invertirNumero(int numero) {

        int invertido = 0;

        while (numero != 0) {
            int digito = numero % 10;
            invertido = invertido * 10 + digito;
            numero = numero / 10;
        }

        return invertido;
    }

    // Impresión
    public static void imprimirResultados(int[] numeros, int[] invertidos) {

        System.out.println("Arreglo original:");

        for (int n : numeros) {
            System.out.print(n + " ");
        }

        System.out.println("\n");

        System.out.println("Arreglo con números invertidos:");

        for (int n : invertidos) {
            System.out.print(n + " ");
        }

        System.out.println();
    }
}