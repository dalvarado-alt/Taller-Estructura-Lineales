package matrices;

public class Ejercicio14 {

    public static void main(String[] args) {

        int m = 2;
        int n = 3;

        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] transpuesta = new int[n][m];

        // Calcular transpuesta
        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                transpuesta[j][i] = matriz[i][j];

            }
        }

        // Imprimir matriz original
        System.out.println("Matriz original:");

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                System.out.print(matriz[i][j] + " ");

            }

            System.out.println();
        }

        // Imprimir matriz transpuesta
        System.out.println("\nMatriz transpuesta:");

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < m; j++) {

                System.out.print(transpuesta[i][j] + " ");

            }

            System.out.println();
        }

    }
}