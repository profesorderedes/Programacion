package hoja1;

import java.util.Scanner;

public class Ejer23 {

	public static void main(String[] args) {

// Modifica el programa anterior para que si además el número introducido es el 3, se informe al
// usuario de que lo ha acertado.

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduzca un nº entero entre el 1 y 10.");

		if (entrada.hasNextInt()) {

			int numero = entrada.nextInt();

			if (numero >= 1 && numero <= 10 && numero != 3) {

				System.out.println("El número escrito es: " + numero);

			} else if (numero == 3) {

				System.out.println("¡Has acertado!");

			} else {

				System.out.println("Error, el numero debe estar entre 1 y 10");
			}
		} else {

			System.out.println("Debe escribir un numero entero.");
		}

	}

}