
// Programa que lee un precio, lo muestra después en pantalla
// y le hace un 10% de descuento.

import java.util.Scanner;

public class Ejemplo13 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe un precio y te haré el " + "10% de descuento:");
		float precio = entrada.nextFloat();

		System.out.println("El precio es: " + precio + " €.");

		float precioRebajado = precio - precio * 10 / 100;

		System.out.println("El precio rebajado es: " + precioRebajado + " €.");

	}

}
