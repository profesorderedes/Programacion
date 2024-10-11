
package ejercicios;

import java.util.Scanner;

public class Ejer16 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Nota: ");
		float nota = entrada.nextFloat();

		// Versión suponiendo que el número que introduce el 
		// usuario está entre 0 y 10 (no se equivoca).
				
		if (nota < 4) {
			System.out.println("Rojo");
		} else if (nota < 5) {
			System.out.println("Verde");
		} else {
			System.out.println("Azul");
		}

	}
}
