package cajaRegistradora;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		final double LIMITE_PARA_DESCUENTO = 50;

		double[] precios = new double[10];
		double precio, suma = 0;
		int posFinDatos = precios.length;

		System.out.println("Caja registradora");
		System.out.println("=========================");

		// Leemos los precios.

		for (int i = 0; i < precios.length; i++) {

			System.out.println("Precio " + i + ": ");
			precio = entrada.nextDouble();

			if (precio < 0) {
				posFinDatos = i;
				break;
			}

			if (suma > LIMITE_PARA_DESCUENTO) {
				precio = precio * 0.9;
			}

			precios[i] = precio;
			suma = suma + precio;

		}

		// Mostramos los precios.
		System.out.println("\nTicket de la compra:");
		for (int i = 0; i < posFinDatos; i++) {
			System.out.println(precios[i]);
		}

		System.out.println("\nTotal a pagar: " + suma + " €.");
		System.out.println("Gracias por la compra.");

	}

}
