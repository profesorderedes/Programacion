package ejercicios;

import java.util.Scanner;

public class Ejer06 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Precio del producto: ");
		float precio = entrada.nextFloat();

		System.out.print("Unidades vendidas: ");
		int unidades = entrada.nextInt();

		float compra = precio * unidades;

		double descuento;

		if (compra > 75) {
			// Compra > 75 € => Descuento del 15%.
			descuento = compra * 15 / 100;
		} else {
			// Si no => Descuento del 5%.
			descuento = compra * 5 / 100;
		}

		double total = compra - descuento;
		System.out.println("Total a pagar: " + total + " €.");

	}

}
