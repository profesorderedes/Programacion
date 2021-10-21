
// Programa que pregunta un precio de producto y si es mayor 
// de 50 euros, te dice que tienes un descuento.

import java.util.Scanner;

public class Ejemplo05 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// Preguntar el precio del producto.
		System.out.print("Precio del producto: ");
		float precio = entrada.nextFloat();

		// Comprobamos si el precio supera los 50 euros y
		// en tal caso, indicamos que tendrá descuento.
		if (precio > 50) {
			System.out.println("¡Tiene derecho a descuento!");
		} else {
			System.out.println("No tiene derecho a descuento.");
		}

		System.out.println("\nGracias por su compra.");

	}

}
