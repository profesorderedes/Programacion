package ejercicios1;

import java.util.Scanner;

public class Ejer10b {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		float compra[] = new float[100];

		System.out.print("Precio 1: ");
		compra[0] = entrada.nextFloat();

		int i = 1;
		while (i < compra.length && compra[i - 1] != 0) {

			System.out.print("Precio " + (i + 1) + ": ");

			compra[i] = entrada.nextFloat();

			i++;

		}

		System.out.println("\nProductos:");
		i = 0;
		while (i < compra.length && compra[i] != 0) {

			System.out.println("Producto " + (i + 1) + ": " + compra[i] + " €");
			i++;

		}

		System.out.println("\nGracias por comprar aquí.");

	}

}
