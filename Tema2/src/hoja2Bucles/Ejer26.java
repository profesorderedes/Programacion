package hoja2Bucles;

import java.util.Scanner;

/*
 * Crea un programa que vaya pidiendo cinco números para mostrar sus tablas de
 * multiplicar. Si el número introducido es 1, el programa escribirá el mensaje
 * y contará com intento. "¡No seas tonto!" y se volverá a formular la pregunta.
 * Usando continue
 */

public class Ejer26 {

	public static void main(String[] args) {

		Scanner escaner = new Scanner(System.in);
		int numero = 0;

		// Usamos for para que el programa pregunte 5 veces por un número

		for (int i = 0; i < 5; i++) {

			System.out.println("Introduce un número para mostrar su tabla de multiplicar: ");
			numero = escaner.nextInt();

			// Usamos un if para que si el usuario introduce un 1, el programa le diga que
			// no sea tonto y vuelva a preguntar
			if (numero == 1) {
				System.out.println("¡No seas tonto!");

				// Al usar continue vovlerá a ejecutrarse el bucle for.
				continue;
			}

			System.out.println("Tabla de multiplicar del " + numero + ":");

			// Usamos for para que se muestre la tabla de multiplicar del número introducido
			for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
				System.out.println(numero + " x " + multiplicador + " = " + (numero * multiplicador));
			}

		}

		escaner.close();
	}
}