package matrices;
import java.util.Random;

public class Ejercicio12 {

    public static void main(String[] args) {

        int n = 4;

        int[][] matriz = new int[n][n];

        Random random = new Random();

        // Llenar matriz con números aleatorios entre -50 y 50
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                matriz[i][j] = random.nextInt(101) - 50;

            }
        }

        // Imprimir matriz
        System.out.println("Matriz generada:");

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                System.out.print(matriz[i][j] + "\t");

            }

            System.out.println();
        }

        // Sumar diagonal opuesta
        int suma = 0;

        for (int i = 0; i < n; i++) {

            suma += matriz[i][n - 1 - i];

        }

        System.out.println("\nSumatoria de la diagonal opuesta: " + suma);

    }
}