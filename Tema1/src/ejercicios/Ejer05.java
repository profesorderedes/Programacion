package ejercicios;

import java.util.Scanner;

public class Ejer05 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("¿Nombre del producto? ");
		String nombreProducto = entrada.nextLine();

		System.out.println("¿Cuánto cuesta el producto? ");
		double precio = entrada.nextDouble();

		System.out.println("¿Cuánto se descuenta del producto? ");
		double descuento = entrada.nextDouble();

		double precioFinal = precio - (descuento * precio) / 100;

		System.out.println(
				"El precio con descuento del siguiente producto, " + nombreProducto + ", es de: " + precioFinal);

	}

}