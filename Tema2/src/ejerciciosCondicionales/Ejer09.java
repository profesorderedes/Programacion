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

		float coste = precio * unidades;
		float precioFinal = coste;
		if (coste < 100) {

			System.out.println("No tiene derecho a descuento. ");

		} else if (coste <= 200) {

			precioFinal = coste * 0.90F;
			System.out.println("Tiene un descuento de un 10%.");
			
		} else {

			precioFinal = coste * 0.85F;
			System.out.println("Tiene un descuento de un 15%.");

		}
		
		System.out.println("El precio final es " + precioFinal 
				+ " €.");

		System.out.println("Gracias a por venir.");

	}

}