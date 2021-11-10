package ejerciciosBucles;

// Versión usando do-while.
import java.util.Scanner;

public class Ejer05b {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int contador = 1;

        System.out.println("Dime un numero de una tabla de "
        		+ "multiplicación");
        int numero = entrada.nextInt();

        do {
           
            int resultado = numero * contador;
            System.out.println(numero + " x " + contador + " = " 
            		+ resultado);
            contador++;

        } while (contador <= 10);

    }

}