package hoja1Condicionales;

import java.util.Scanner;

public class Ejer11 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("*** INSERTE PRECIO DEL PRODUCTO ***");
		float precio = entrada.nextFloat();

		System.out.println("*** ¿CUÁNTAS UNIDADES HA COMPRADO? ***");
		int uni = entrada.nextInt();

		double total = precio * uni;

		double precioFinal = total;

		if (total > 0 && total < 100) {

			System.out.println("No ha obtenido descuento");

		} else if (total >= 100 && total <= 200) {

			System.out.println(
					"Ha obtenido 10% de descuento, y el " + "total sin aplicarlo seria de " + total + " euros.");

			precioFinal = total - (total * 10) / 100;

		} else if (total > 200) {

			System.out.println(
					"Ha obtenido un 15% de descuento, " + "y el total sin aplicarlo seria de " + total + " euros.");

			precioFinal = total - (total * 15) / 100;

		}

		System.out.println("Su total a pagar es de " + precioFinal + " euros.");

		System.out.println("\nGracias por su compra.");

		entrada.close();

	}

}