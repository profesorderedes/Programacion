package hoja1Condicionales;

import java.util.Scanner;

public class Ejer06 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("¿Cuál es el precio del producto?");
		float precio = entrada.nextFloat();

		System.out.println("Número de únidades compradas");
		int cantidad = entrada.nextInt();

		float totalCompra = precio * cantidad;

		float cantidadDescontada;

		if (totalCompra > 75) {

			System.out.println("Se aplica un 15% de descuento.");

			cantidadDescontada = 15 * totalCompra / 100;

			totalCompra = totalCompra - cantidadDescontada;

		} else {

			System.out.println("Se aplica un 5% de descuento.");

			cantidadDescontada = 5 * totalCompra / 100;

			totalCompra = totalCompra - cantidadDescontada;

		}

		System.out.println("El precio final es de " + totalCompra + " euros.");

		System.out.println("Fin del programa.");

		entrada.close();

	}

}