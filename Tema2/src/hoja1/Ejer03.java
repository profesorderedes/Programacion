package hoja1;

import java.util.Scanner;

public class Ejer03 {

	public static void main(String[] args) {

// Escribe un programa que pregunte el precio de un producto. Si vale más de

// 80€, le hará un descuento del 10%.Se mostrará en pantalla el precio final

		Scanner valor = new Scanner(System.in);

		System.out.println("Introduzca el precio");
		float precio = valor.nextFloat();

		if (precio > 80) {

			float descuento = precio * 10 / 100;
			float precioReducido = precio - descuento;

			System.out.println("El precio es superior a 80€, por lo que se le aplicará un descuento.");
			precio = precioReducido;

		}

// Modifica el ejercicio anterior de manera que si la compra es inferior a 5 €,

// se sumen 2 euros a la factura por gastos de gestión.

		if (precio < 5) {

			float precioConGastosGestion = precio + 2;
			System.out.println("Se sumarán 2€ como gastos de gestión.");
			precio = precioConGastosGestion;

		}

		System.out.println("El precio de la compra es de " + precio + "€.");

	}

}