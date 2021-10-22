package ejerciciosCondicionales;

import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce un precio: ");
		float precio = entrada.nextFloat();

		float precioFinal = precio;
		if (precio > 80) {
			precioFinal = precio - precio * 10 / 100;
		}

		System.out.println("Precio final: " + precioFinal);

	}
}