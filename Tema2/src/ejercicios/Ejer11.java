package ejercicios;

import java.util.Scanner;

public class Ejer11 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// Crea un programa que pregunte el precio de un producto y el número de
		// unidades compradas.
		// Si el coste de la compra es menor de 100 €, el cliente no tiene derecho a un
		// descuento. Si el coste
		// sobrepasa los 200 €, el descuento será del 15%. De lo contrario será del 10%
		// solamente.

		System.out.println("¿Cuánto cuesta este producto? ");
		double precio = entrada.nextDouble();

		System.out.println("¿Cuántas unidades se van a comprar? ");
		int unidades = entrada.nextInt();

		double precioCompra = precio * unidades;

		double precioDescontado;
		double descuento;
		if (precioCompra < 100) {

			precioDescontado = precioCompra;
			System.out.println("No tienes descuento :(");
		}

		else if (precioCompra > 200) {

			descuento = precioCompra * 15 / 100;
			precioDescontado = precioCompra - descuento;

			System.out.println("¡Descuento del 15%!");

		}

		else {

			descuento = precioCompra * 10 / 100;
			precioDescontado = precioCompra - descuento;

			System.out.println("¡Descuento del 10%!");

		}

		System.out.println("El precio final es: " + precioDescontado);

	}

}