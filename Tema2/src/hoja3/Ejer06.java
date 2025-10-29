package hoja3;

import java.util.Scanner;

public class Ejer06 {

	public static void main(String[] args) {

// 6.- Añade al programa anterior una comprobación del número introducido, de manera 
// que si el usuario escribe "1", el programa le responda "No seas tonto" y vuelva a 
// empezar el bucle, sin mostrar la tabla. Utiliza la palabra clave continue.

		Scanner input = new Scanner(System.in);

		System.out.println("TABLAS DE MULTIPLICAR\n----------------------");
		int num;

		do {

			System.out.print("\nNúmero\n> ");
			num = input.nextInt();

			if (num == 1) {

				System.out.println("No seas tonto");
				continue;

			}

			System.out.println("\nTabla del número " + num + ":");

			for (int i = 1; i <= 10; i++) {

				System.out.println("\t" + num + " x " + i + " = " + num * i);

			}

		} while (num != 0);

	}

}