package ejerciciosBucles;

import java.util.Scanner;

public class Ejer15 {

	public static void main(String[] args) {

		// Pedir cuatro precios.
		Scanner entrada = new Scanner(System.in);

		float precio;
		float total = 0;

		for (int i = 1; i <= 4; i++) {

			System.out.print("Precio " + i + ": ");
			precio = entrada.nextFloat();
			total = total + precio;

		}
		
		System.out.println("\nTotal de la compra: " + total 
				+ " €.");

	}

}
