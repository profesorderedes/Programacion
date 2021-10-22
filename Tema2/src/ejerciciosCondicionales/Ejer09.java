package ejerciciosCondicionales;

import java.util.Scanner;

public class Ejer09 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// Preguntamos el precio y cuántas unidades del producto.

		System.out.print("Dime el precio del producto: ");

		float precio = entrada.nextFloat();

		System.out.print("Dime cuántas unidades son: ");

		int unidades = entrada.nextInt();

		// Empezamos el bucle con descuentos.

		float precioIntermedio = precio * unidades;

		if (precioIntermedio < 100) {

			System.out.println("No tiene derecho a descuento. Precio final es de "

					+ precioIntermedio + " euros.");

		} else if (precioIntermedio < 200) {

			float precioFinal1 = precioIntermedio * 0.90F;

			System.out.println("Tiene un descuento de un 10%. Precio final es de "

					+ precioFinal1 + " euros.");

		} else {

			float precioFinal2 = precioIntermedio * 0.85F;

			System.out.println("Tiene un descuento de un 20%. Precio final es de "

					+ precioFinal2 + " euros.");

		}

		System.out.println("Gracias a por venir.");

	}

}