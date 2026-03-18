package matrices;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int m = 4; // filas
        int n = 5; // columnas

        int[][] matriz = new int[m][n];

        // Llenar matriz con números aleatorios
        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                matriz[i][j] = random.nextInt(50) + 1;

            }
        }

        // Imprimir matriz
        System.out.println("Matriz generada:");

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                System.out.print(matriz[i][j] + "\t");

            }

            System.out.println();
        }

        // Leer número a buscar
        System.out.print("\nIngrese número a buscar: ");
        int numero = sc.nextInt();

        boolean encontrado = false;

        // Buscar en la matriz
        for (int i = 0; i < m && !encontrado; i++) {

            for (int j = 0; j < n; j++) {

                if (matriz[i][j] == numero) {

                    System.out.println("Número encontrado en posición: fila "
                            + i + ", columna " + j);

                    encontrado = true;
                    break;
                }

            }

        }

        if (!encontrado) {

            System.out.println("El número no se encuentra en la matriz");

        }
        sc.close();

    }
}