package hoja1;

import java.util.Scanner;

public class Ejer06 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Dime el precio de un producto: ");
		float precio = input.nextFloat();

		System.out.print("\n\nDime cuantas unidades se han comprado: ");
		int cantidad = input.nextInt();

		float importe = precio * cantidad;

		if (importe > 75.00) {

			float descuento = 0.85f;
			float total = importe * descuento;

			System.out.println("\n\n" + importe + " con un 15% de descuento: " + total + " €.");

		} else {

			float descuento = 0.95f;
			float total = importe * descuento;

			System.out.println("\n\n" + importe + " con un 5% de descuento: " + total + " €.");

		}

	}

}