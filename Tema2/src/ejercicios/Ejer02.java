package ejercicios;

import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.println("¿Cuánto vale el producto?");
		float precio = teclado.nextFloat();

		float resultado = precio * 20 / 100;

		float solucion = precio - resultado;

		if (precio > 80) {
			System.out.println("Tendrás que pagar " + solucion);
		}

	}

}
