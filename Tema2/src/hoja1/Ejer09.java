package hoja1;

import java.util.Scanner;

public class Ejer09 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		final String CLAVE_REQUERIDA = "java8";

		System.out.println("Contraseña:");
		String passwd = entrada.nextLine();

		if (passwd.equals(CLAVE_REQUERIDA)) {

			System.out.println("Acceso permitido");

		} else {

			System.out.println("Acceso denegado");

		}

	}

}