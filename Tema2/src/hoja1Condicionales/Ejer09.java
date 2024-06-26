package hoja1Condicionales;

import java.util.Scanner;

public class Ejer09 {

	public static void main(String[] args) {

		final String CLAVE_REQUERIDA = "java8";

		Scanner entrada = new Scanner(System.in);

		System.out.println("*** INGRESE CLAVE DE ACCESO ***");
		String clave = entrada.nextLine();

		// Recuerda que para comparar dos cadenas no podemos
		// usar "==", hay que usar
		// Tuvariable.equals(cadena).
		if (clave.equals(CLAVE_REQUERIDA)) {
			System.out.println("Acceso permitido.");
		} else {
			System.out.println("Acceso denegado.");
		}

		entrada.close();
	}
}