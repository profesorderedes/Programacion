package ejercicios;

import java.util.Scanner;

public class Ejer06 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Producto: ");
		String nombre = entrada.nextLine();

		System.out.println("Precio: ");
		float precio = entrada.nextFloat();

		System.out.println("Unidades: ");
		int unidades = entrada.nextInt();

		System.out.println("Coste total " + (precio * unidades) + " €.");

	}

}