package hoja1;

import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {

		final String NOMBRE_REQUERIDO = "user";
		final String CLAVE_REQUERIDA = "java8";

		Scanner entrada = new Scanner(System.in);

		System.out.println("Para entrar a este ordenador escriba el nombre de usuario:");
		String usuario = entrada.nextLine();

		System.out.println("Para entrar a este ordenador escriba la clave:");
		String password = entrada.nextLine();

		if (usuario.equals(NOMBRE_REQUERIDO) && password.equals(CLAVE_REQUERIDA)) {
			System.out.println("Acceso permitido");
		} else {
			System.out.println("Acceso denegado");
		}

	}

}