package matrices;
import java.util.Random;

public class Ejercicio13 {

    public static void main(String[] args) {

        int n = 4;

        int[][] matriz = new int[n][n];

        Random random = new Random();

        // Llenar matriz con números aleatorios
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                matriz[i][j] = random.nextInt(20);

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

        // Verificar si es simétrica
        boolean simetrica = true;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                if (matriz[i][j] != matriz[j][i]) {

                    simetrica = false;
                    break;

                }

            }

        }

        if (simetrica) {

            System.out.println("\nLa matriz es simétrica");

        } else {

            System.out.println("\nLa matriz NO es simétrica");

        }

        // Imprimir esquinas
        System.out.println("\nNúmeros de las esquinas:");

        System.out.println("Esquina superior izquierda: " + matriz[0][0]);
        System.out.println("Esquina superior derecha: " + matriz[0][n-1]);
        System.out.println("Esquina inferior izquierda: " + matriz[n-1][0]);
        System.out.println("Esquina inferior derecha: " + matriz[n-1][n-1]);

    }
}