
// Deberes: Modificar el programa para que pida también qué
// descuento queremos aplicar.

import java.util.Scanner;

public class Ejemplo15 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe un precio y te haré " + "un descuento:");
		float precio = entrada.nextFloat();

		System.out.println("Escribe el descuento a aplicar:");
		float porcentajeDescuento = entrada.nextFloat();

		System.out.println("El precio es: " + precio + " €.");
		System.out.println("El descuento es: " + porcentajeDescuento + "%.");

		float descuento = precio * porcentajeDescuento / 100;

		float precioRebajado = precio - descuento;

		// Don't Repeat Yourself

		System.out.println("El precio rebajado es: " + precioRebajado + " €.");
		System.out.println("Se te han descontado " + descuento + " euros.");

	}

}
