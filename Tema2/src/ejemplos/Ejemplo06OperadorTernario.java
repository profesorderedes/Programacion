package ejemplos;

import java.util.Scanner;

public class Ejemplo06OperadorTernario {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		// El operador ternario (?) se usa para expresar un if/else de forma más corta.
		// Sólo sirve cuando en el if/else lo único que se hace es darle un valor u
		// otro a una variable.

		System.out.println("Escribe el precio del producto:");
		float precio = entrada.nextFloat();

//		if (precio < 100) {
//			precio = precio * 0.95F;
//		} else {
//			precio = precio * 0.9F;
//		}

		// Sintaxis del operador ternario:
		// variable = condición ? valor si true : valor si false;

		precio = precio < 100 ? precio * 0.95F : precio * 0.9F;

		System.out.println("Tu precio, con el descuento pertinente, es " + precio + " euros.");

	}

}
