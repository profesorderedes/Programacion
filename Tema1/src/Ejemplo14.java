
// Programa que lee un precio, lo muestra después en pantalla
// y le hace un 10% de descuento. Además, muestra la cantidad
// descontada.

import java.util.Scanner;

public class Ejemplo14 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe un precio y te haré el " + "10% de descuento:");
		float precio = entrada.nextFloat();

		System.out.println("El precio es: " + precio + " €.");

		float descuento = precio * 10 / 100;

		float precioRebajado = precio - descuento;

		// Don't Repeat Yourself

		System.out.println("El precio rebajado es: " + precioRebajado + " €.");
		System.out.println("Se te han descontado " + descuento + " euros.");

	}

}
