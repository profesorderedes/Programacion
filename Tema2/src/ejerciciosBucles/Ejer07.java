// Crea un programa que escriba los 50 primeros números pares. 
package ejerciciosBucles;

import java.util.Scanner;

public class Ejer07 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int contador = 1;
		int par = 0;

		while (contador <= 50) {
			System.out.println(contador + ")" + "Numero: " + par);
			contador = contador + 1;
			par = par + 2;
		}

	}

}