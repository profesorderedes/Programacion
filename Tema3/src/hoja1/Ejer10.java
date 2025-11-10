package hoja1;

import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double precios[] = new double[100];
		int fin = 0; // Indica la posición donde empiezan los ceros en el array.

		for (int i = 0; i < precios.length; i++) {

			System.out.print("Introduce el precio del producto: ");
			precios[i] = sc.nextDouble();

			if (precios[i] == 0) {

				break;

			}
			fin++;

		}

		System.out.println("Lista de precios: ");

		for (int i = 0; i < fin; i++) {

			System.out.println(precios[i]);

		}

	}
}