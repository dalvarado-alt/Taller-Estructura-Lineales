package arreglos;

public class Ejercicio1 {

    public static void main(String[] args) {

        int[] primos = generarDatos();   // generación de datos
        procesarDatos(primos);           // procesamiento
        imprimirResultados(primos);      // impresión
    }

    // Generación de datos
    public static int[] generarDatos() {
        int[] primos = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};
        return primos;
    }

    // Procesamiento
    public static void procesarDatos(int[] arreglo) {
        System.out.println("Cantidad de números primos: " + arreglo.length);
    }

    // Impresión de resultados
    public static void imprimirResultados(int[] arreglo) {

        System.out.println("Primeros 10 números primos:");

        for (int numero : arreglo) {
            System.out.print(numero + " ");
        }
    }
}