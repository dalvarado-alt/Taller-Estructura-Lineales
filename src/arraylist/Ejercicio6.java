package arraylist;

import java.util.ArrayList;
import java.util.Random;

public class Ejercicio6 {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = generarDatos();

        int suma = calcularSuma(numeros);
        double media = calcularMedia(numeros, suma);

        imprimirResultados(numeros, suma, media);
    }

    // Generación de datos
    public static ArrayList<Integer> generarDatos() {

        Random random = new Random();
        ArrayList<Integer> numeros = new ArrayList<>();

        int numero;

        do {
            numero = random.nextInt(21) - 10; // -10 a 10
            numeros.add(numero);
        } while (numero != 10);

        return numeros;
    }

    // Procesamiento: suma
    public static int calcularSuma(ArrayList<Integer> numeros) {

        int suma = 0;

        for (int n : numeros) {
            suma += n;
        }

        return suma;
    }

    // Procesamiento: media
    public static double calcularMedia(ArrayList<Integer> numeros, int suma) {

        return (double) suma / numeros.size();
    }

    // Impresión
    public static void imprimirResultados(ArrayList<Integer> numeros, int suma, double media) {

        System.out.println("Números leídos:");

        for (int n : numeros) {
            System.out.print(n + " ");
        }

        System.out.println("\n");

        System.out.println("Suma: " + suma);
        System.out.println("Media: " + media);
    }
}