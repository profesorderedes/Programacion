package hoja2;

import java.util.Scanner;

public class Ejer26 {

	public static void main(String[] args) {

// Crea un programa que vaya pidiendo cinco números para mostrar sus tablas de multiplicar. Si
// el número introducido es 1, el programa escribirá el mensaje "¡No seas tonto!" y se volverá a
// formular la pregunta. Utiliza la instrucción continue.

		Scanner input = new Scanner(System.in);

		int num = 1;

		// Solicitamos cinco números para mostrar sus tablas.
		for (int i = 1; i <= 5; i++) {

			// Leemos el número del que se quiere mostrar la tabla.
			System.out.println("Número: ");
			num = input.nextInt();

			// Si el usuario pide la tabla del 1, se le muestra un comentario y vuelve a
			// empezar el bucle.
			if (num == 1) {

				System.out.println("¡No seas tonto!");
				i--;
				continue;

			}

			System.out.println("\nTabla " + i + ". Tabla de multiplicación del número " + num + ".");

			// Muestra la tabla del número num.
			for (int j = 1; j <= 10; j++) {

				System.out.println("\t" + j + " x " + num + " = " + j * num);
			}

		}

	}

}