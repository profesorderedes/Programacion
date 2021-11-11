package ejercicios1;

import java.util.Scanner;

public class Ejer01 {

	public static void main(String[] args) {

		final String CLAVE_REQUERIDA = "java8";

		Scanner entrada = new Scanner(System.in);

		System.out.println("Introduce la clave:");
		String clave = entrada.nextLine();

		if (clave.equals(CLAVE_REQUERIDA)) {
			System.out.println("Acceso permitido.");
		} else {
			System.out.println("Acceso denegado.");
		}

	}

}