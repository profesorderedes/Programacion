package hoja1;

import java.util.Scanner;

public class Ejer16 {

	public static void main(String[] args) {
		/*
		 * Un profesor quiere una aplicación que muestre las notas de un examen con
		 * diferente color según este esquema:
		 * 
		 * • Nota < 4: Rojo. • 4 <= Nota < 5: Verde. • Nota >= 5: Azul.
		 * 
		 * El programa pedirá una nota (puede tener decimales) y devolverá el nombre del
		 * color a usar. Utiliza las instrucciones if y else if. La salida del programa
		 * debe ser el nombre del color con que se mostraría la nota (no tienes que
		 * hacer que la letra salga coloreada).
		 */

		Scanner entrada = new Scanner(System.in);
		System.out.println("Inserte una nota: ");
		float nota = entrada.nextFloat();

		if (nota < 4) {
			System.out.println("Rojo.");

		} else if (nota >= 4 && nota < 5) {
			System.out.println("Verde");

		} else {
			System.out.println("Azul");
		}
	}

}