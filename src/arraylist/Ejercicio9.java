package arraylist;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ejercicio9 {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = generarDatos(20);

        ArrayList<Integer> ascendente = new ArrayList<>(numeros);
        Collections.sort(ascendente);

        ArrayList<Integer> descendente = new ArrayList<>(numeros);
        Collections.sort(descendente, Collections.reverseOrder());

        ArrayList<Integer> pares = new ArrayList<>();
        ArrayList<Integer> impares = new ArrayList<>();

        separarNumeros(numeros, pares, impares);

        imprimirLista("Lista original", numeros);
        imprimirLista("Orden ascendente", ascendente);
        imprimirLista("Orden descendente", descendente);
        imprimirLista("Números pares", pares);
        imprimirLista("Números impares", impares);
    }

    // Generar números aleatorios
    public static ArrayList<Integer> generarDatos(int n) {

        Random random = new Random();
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            numeros.add(random.nextInt(100) + 1);
        }

        return numeros;
    }

    // Separar pares e impares
    public static void separarNumeros(ArrayList<Integer> numeros,
                                      ArrayList<Integer> pares,
                                      ArrayList<Integer> impares) {

        for (int n : numeros) {

            if (n % 2 == 0) {
                pares.add(n);
            } else {
                impares.add(n);
            }

        }
    }

    // Imprimir listas
    public static void imprimirLista(String titulo, ArrayList<Integer> lista) {

        System.out.println(titulo + ":");

        for (int n : lista) {
            System.out.print(n + " ");
        }

        System.out.println("\n");
    }
}