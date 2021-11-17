package ejercicios1;

import java.util.Scanner;

public class Ejer02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		final String NOMBRE_REQUERIDO = "Jaume";
		final String PASSWORD_REQUERIDO = "java8";

		System.out.println("Escriba el usuario: ");
		String usuario = entrada.nextLine();

		System.out.println("Escriba la contraseña: ");
		String clave = entrada.nextLine();

		if (usuario.equals(NOMBRE_REQUERIDO) && clave.equals(PASSWORD_REQUERIDO)) {

			System.out.println("Acceso permitido.");

		} else {

			System.out.println("Acceso denegado.");

		}

	}

}