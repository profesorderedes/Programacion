package actividades;

import java.util.Scanner;

public class Ejer6 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Escribe el nombre del producto: ");
		String nombreproducto = entrada.nextLine();

		System.out.println("Escribe el precio: ");
		float precio = entrada.nextFloat();

		System.out.println("Escribe la cantidad de veces que lo quieres comprar: ");
		int cantidad = entrada.nextInt();

		System.out.println("Nombre del producto en venta: " + nombreproducto);
		System.out.println("La factura de la compra sale por un total de: " + precio * cantidad + " €");

	}

}