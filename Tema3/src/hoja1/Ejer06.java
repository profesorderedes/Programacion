package hoja1;

import java.util.Scanner;

public class Ejer06 {

	public static void main(String[] args) {

// 6.- Escribe un programa que pida por consola los precios de diez productos y los guarde en un array.
// Haz que después se muestren todos los valores mediante un bucle for.

		Scanner input = new Scanner(System.in);

		float[] precios = new float[10];

		for (int i = 0; i < precios.length; i++) {

			System.out.print("Precio " + (i + 1) + ": ");
			precios[i] = input.nextFloat();

		}

		System.out.println("\nPrecios guardados en el array: ");

		for (int i = 0; i < precios.length; i++) {

			System.out.println("- " + precios[i] + " €");

		}

	}

}