package arraylist;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = generarDatos();

        imprimirLista(numeros);

        insertarNumero(numeros);
        imprimirLista(numeros);

        eliminarNumero(numeros);
        imprimirLista(numeros);
    }

    // Generación de los 20 primeros pares
    public static ArrayList<Integer> generarDatos() {

        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 1; i <= 20; i++) {
            numeros.add(i * 2);
        }

        return numeros;
    }

    // Insertar número en posición correcta
    public static void insertarNumero(ArrayList<Integer> numeros) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número para insertar: ");
        int numero = sc.nextInt();

        int i = 0;

        while (i < numeros.size() && numeros.get(i) < numero) {
            i++;
        }

        numeros.add(i, numero);
        sc.close();
    }

    // Eliminar número solicitado
    public static void eliminarNumero(ArrayList<Integer> numeros) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número a eliminar: ");
        int numero = sc.nextInt();

        if (numeros.remove(Integer.valueOf(numero))) {
            System.out.println("Número eliminado.");
        } else {
            System.out.println("El número no existe en la lista.");
        }
        sc.close();
    }

    // Imprimir ArrayList
    public static void imprimirLista(ArrayList<Integer> numeros) {

        System.out.println("ArrayList:");

        for (int n : numeros) {
            System.out.print(n + " ");
        }

        System.out.println("\n");
    }
}