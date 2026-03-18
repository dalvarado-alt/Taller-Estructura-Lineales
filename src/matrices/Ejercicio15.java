package matrices;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio15 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingrese número de filas (m): ");
        int m = sc.nextInt();

        System.out.print("Ingrese número de columnas (n): ");
        int n = sc.nextInt();

        int[][] matriz = new int[m][n];

        // Llenar matriz con números aleatorios
        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                matriz[i][j] = random.nextInt(50);

            }
        }

        System.out.println("\nMatriz original:");

        imprimirMatriz(matriz, m, n);

        // Intercambiar primera fila con segunda
        for (int j = 0; j < n; j++) {

            int temp = matriz[0][j];
            matriz[0][j] = matriz[1][j];
            matriz[1][j] = temp;

        }

        System.out.println("\nMatriz después de intercambiar filas:");

        imprimirMatriz(matriz, m, n);

        sc.close();
    }

    public static void imprimirMatriz(int[][] matriz, int m, int n) {

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                System.out.print(matriz[i][j] + "\t");

            }

            System.out.println();
        }
        
    }

}
