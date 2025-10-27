package hoja2;

import java.util.Scanner;

public class Ejer24 {

	public static void main(String[] args) {

// Escribe una aplicación que solicite cinco notas. Si el usuario escribe una nota que no está entre
// 0 y 10 se le informará del error y se le volverá a pedir el dato.

		Scanner input = new Scanner(System.in);

		float suma = 0;

		for (int i = 1; i <= 5; i++) {

			int nota = 0;

			System.out.println("Nota " + i + ": ");
			nota = input.nextInt();

			while (nota < 0 || nota > 10) {

				System.out.println("¡Tiene que ser un valor entre 1 y 10!");
				System.out.println("Nota " + i + ": ");

				nota = input.nextInt();

			}

			suma = suma + nota;

		}

		System.out.println("La nota media es " + (suma / 5) + ".");

	}

}