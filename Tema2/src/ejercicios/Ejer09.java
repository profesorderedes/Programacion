package ejercicios;

import java.util.Scanner;

public class Ejer09 {

	public static void main(String[] args) {

		final String CLAVE_REQUERIDA = "java8";

		Scanner entrada = new Scanner(System.in);

		System.out.println("Para entrar a este ordenador escriba la clave");

		String respuesta = entrada.nextLine();

		if (respuesta.equals(CLAVE_REQUERIDA)) {

			System.out.println("Acceso permitido");

		} else {

			System.out.println("Acceso denegado");

		}

	}

}