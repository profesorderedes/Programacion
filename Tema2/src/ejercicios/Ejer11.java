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

		System.out.println("¿Cuanto cuesta este producto? ");
		double precio = entrada.nextDouble();

		System.out.println("¿Cuantas unidades se van a comprar? ");
		int unidades = entrada.nextInt();

		double precioFinal = precio * unidades;
		double descuentoPequenyo = precioFinal * 10 / 100;
		double descuentoGrande = precioFinal * 15 / 100;
		double precioDescontadoPequenyo = precioFinal - descuentoPequenyo;
		double precioDescontadoGrande = precioFinal - descuentoGrande;

		if (precioFinal < 100) {

			System.out.println("No tienes descuento :(");
			System.out.println("El precio final es: " + precioFinal);

		}

		else if (precioFinal > 200) {

			System.out.println("¡Descuento del 15%!");
			System.out.println("El precio final es: " + precioDescontadoGrande);

		}

		else {

			System.out.println("¡Descuento del 10%!");
			System.out.println("El precio final es: " + precioDescontadoPequenyo);

		}

	}

}