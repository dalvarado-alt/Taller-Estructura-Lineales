package arreglos;
import java.util.Random;
public class Ejercicio4 {
    public static void main(String[] args) {

        int[] numeros = generarDatos(25);

        int menor = EncontrarMenor(numeros);
        int mayor = EncontrarMayor(numeros);

        imprimirResultados(numeros, menor, mayor);
    }
    public static int[] generarDatos(int n){

        Random random = new Random();
        int [] numeros = new int[n];
        for( int i = 0  ; i<n;i++){
            numeros[i] = random.nextInt(101)-50;
        }
        return numeros;

    }
    
    public static int EncontrarMenor(int[] arreglo){
        int menor = arreglo[0];
        for (int numero : arreglo) {
            if (numero < menor) {
                menor = numero;
            }
        }
        return menor;
    }
    public static int EncontrarMayor(int[] arreglo){
        int mayor = arreglo[0];
        for (int numero : arreglo) {
            if (numero > mayor) {
                mayor = numero;
            }
        }
        return mayor;
    }
    public static void imprimirResultados(int[] arreglo, int menor, int mayor){
        System.out.println("Números generados:");

        for (int n : arreglo) {
            System.out.print(n + " ");
        }
        System.out.println("\n");
        System.out.println("Menor número: " + menor);
        System.out.println("Mayor número: " + mayor);
    }

}

