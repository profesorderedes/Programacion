package ejerciciosCondicionales;

import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Añade un precio a un producto");
		float precio = entrada.nextFloat();

		float precioFinal = precio;

		if (precio < 5) {
			precioFinal = precio + 2;
		}

		if (precio > 80) {
			precioFinal = precio - precio * 10 / 100;
		}

		System.out.println("El precio final es " + precioFinal);

	}

}