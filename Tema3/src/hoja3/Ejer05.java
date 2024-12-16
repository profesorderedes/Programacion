package hoja3;

import java.util.Scanner;

public class Ejer05 {

	public static void main(String[] args) {

		final double MARGEN_DESCUENTO = 50; // Total a partir del que haremos descuento
		Scanner entrada = new Scanner(System.in);

		double[] precios = new double[50];

		System.out.println("### CAJA REGISTRADORA ###");
		System.out.println("=========================");

		double total = 0;

		// Leemos los precios y los almacenamos en el array, calculando el 
		// el coste total.
		for (int i = 0; i < precios.length; i++) {

			System.out.println("Precio " + (i + 1) + ": ");
			precios[i] = entrada.nextDouble();

			// Si se escribe un número negativo, se acaba la cuenta.
			// Y si se supera un total de compra de MARGEN_DESCUENTO euros,
			// se hace rebaja.
			if (precios[i] < 0) {
				precios[i] = 0;
				break;
			} else if (total > MARGEN_DESCUENTO) {
				precios[i] = precios[i] - precios[i] * 0.1;
			}

			total = total + precios[i];
			
		}

		System.out.println("\nTicket de la compra");

		for (int i = 0; i < precios.length; i++) {

			if (precios[i] == 0) {
				break;
			}

			System.out.println(precios[i]);

		}

		System.out.println();

		System.out.println("Total a pagar: " + total + "€");
		System.out.println("Gracias por la compra.");
	}

}
