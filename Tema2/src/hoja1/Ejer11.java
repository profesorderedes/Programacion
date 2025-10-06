package hoja1;

import java.util.Scanner;

public class Ejer11 {

	public static void main(String[] args) {

// Crea un programa que pregunte el precio de un producto y el número de unidades compradas.
// Si el coste de la compra es menor de 100 €, el cliente no tiene derecho a un descuento. Si el coste
// sobrepasa los 200 €, el descuento será del 15%. De lo contrario será del 10% solamente.

		Scanner input = new Scanner(System.in);

		System.out.print("Dime el precio de un producto: ");
		float precio = input.nextFloat();

		System.out.print("\n\nDime cuántas se han comprado: ");
		int cantidad = input.nextInt();

		float total = precio * cantidad;

		if (total < 100) {

			System.out.println("\n\nTienes que pagar: " + total + " €.");

		} else if (total < 200) {

			System.out.println("\n\nCompra superior a 100€. Tienes que pagar: " + total * 0.90 + " €.");

		} else {

			System.out.println("\n\nCompra superior a 200€. Tienes que pagar: " + total * 0.85 + " €.");

		}

	}

}