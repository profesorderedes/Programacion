package ejercicios;

import java.util.Scanner;

public class Ejer05 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("¿Nombre del producto? ");
		String nombreProducto = entrada.nextLine();

		System.out.println("¿Cuanto cuesta el producto? ");
		Double precio = entrada.nextDouble();

		System.out.println("¿Cuanto se descuenta del producto? ");
		Double descuento = entrada.nextDouble();

		Double precioFinal = precio - (descuento * precio) / 100;

		System.out.println(
				"El precio con descuento del siguiente producto: " + nombreProducto + ". es de: " + precioFinal);

	}

}