package actividades;

import java.util.Scanner;

public class Ejer5 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		String producto;
		float precio;

		System.out.print("Escriba el nombre del producto: ");
		producto = entrada.nextLine();

		System.out.print("Escriba el precio del producto: ");
		precio = entrada.nextFloat();

		System.out.print("Escriba el descuento a hacer: ");
		float porcentaje = entrada.nextFloat();

		float precioFinal = precio - precio * porcentaje / 100;

		System.out.println("Producto seleccionado: " + producto + "\nPrecio del producto: " + precio + " €\nDescuento: "
				+ porcentaje + " %\nPrecio final: " + precioFinal + " €.");

	}

}