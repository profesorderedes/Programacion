package hoja1;
/*

2.- Escribe un programa que pregunte el precio de un producto. Si vale más de 80 €, le hará un
descuento del 10%. Se mostrará en pantalla el precio final.

*/

import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("¿Cuál es el precio del producto?");
		float precio = entrada.nextFloat();

		if (precio > 80) {

			float descuento = precio * 10 / 100;
			precio = precio - descuento;

		}

		System.out.println("Tiene un descuento, el precio es de " + precio + "€.");

	}

}