package hoja2;

import java.util.Scanner;

public class Ejer19 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Inserte los precios de 4 productos");
		float total = 0;

		for (int i = 0; i < 4; i++) {

			float precio = entrada.nextFloat();

			if (precio < 0) {
				System.out.println("Por favor, inserte un precio válido");
			} else {
				total = total + precio;
			}

		}

		System.out.println("El total es : " + total + " €");

	}

}