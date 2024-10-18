package hoja1;

import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("¿Cuánto vale el producto?");
		float precio = teclado.nextFloat();

		if (precio > 80) {
			float descuento = precio * 10 / 100;
			precio = precio - descuento;
			System.out.println("¡Tienes derecho a descuento!");
		}

		System.out.println("Tendrás que pagar " + precio + " euros.");

	}

}
