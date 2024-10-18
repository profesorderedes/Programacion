package hoja1;

import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("¿Cuál es el precio del producto?");
		float precio = entrada.nextFloat();

		if (precio > 80) {

			float precioRebajado = precio - (precio * 10) / 100;
			System.out.println("El precio rebajado será " + precioRebajado + ".");

		}

		if (precio >= 5 && precio <= 80) {

			System.out.println("El precio será " + precio + ".");

		}

		if (precio < 5) {

			float precioAumentado = precio + 2;
			System.out.println("Al ser menos de 5€, se aumenta en 2€ por gastos de gestión, por lo tanto es "
					+ precioAumentado + ".");

		}

	}

}