package arreglos;


public class Ejercicio2 {
    public static void main(String[] args) {
        
        int[] pares = generarDatos();   // generación de datos

        imprimirUnaLinea(pares);       // impresión en una sola línea
        imprimirDiezLineas(pares);     // impresión en diez líneas
    }
    public static int[] generarDatos() {

        int[] pares = new int [100];

        for (int i = 0; i < pares.length; i++) {
            pares[i] = (i + 1) * 2; // Genera números pares del 2 al 200
        }
        return pares;
    }
    public static void imprimirUnaLinea(int[] arreglo) {

        System.out.println("Numeros pares en una sola linea: " );

        for(int numero : arreglo){
            System.out.print(numero + " ");
        }
        System.out.println("\n");
    }
    public static void imprimirDiezLineas(int[] arreglo) {

        System.out.println("Numeros pares en diez lineas: " );

        int indice = 0;

        for (int linea = 0; linea < 10; linea++) {

            System.out.print("Linea " + linea + ": ");

            for (int i = 0; i < 10; i++) {
                System.out.print(arreglo[indice] + " ");
                indice++;

              }
            System.out.println();
                        }
        }
    }

    

    
