package hoja2;
import java.util.Arrays;
import java.util.Scanner;

public class Ejer11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int[] edades = new int[10];
        int aux;
        int posMin;

        for (int i = 0; i < edades.length; i++) {

            System.out.println("Dime una edad: ");
            edades[i] = entrada.nextInt();
        }

        for (int i = 0; i < edades.length - 1; i++) {

            posMin = i;
            for (int j = i + 1; j < edades.length; j++) {

                if (edades[j] < edades[posMin]) {
                    posMin = j;
                }
            }
            
            aux = edades[i];
            edades[i] = edades[posMin];
            edades[posMin] = aux;

            System.out.println(Arrays.toString(edades));
        }
        
        System.out.println("El array ordenado ha quedado");
        System.out.println(Arrays.toString(edades));

    }
}