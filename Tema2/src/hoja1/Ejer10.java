package hoja1;

import java.util.Scanner;

public class Ejer10 {

	public static void main(String[] args) {

//Vamos a perfeccionar la aplicación anterior pidiendo un nombre de usuario y una contraseña
//para permitir el acceso al ordenador.

//El programa guardará el nombre de usuario y la contraseña necesarias en las constantes
//NOMBRE_REQUERIDO, PASSWORD_REQUERIDO.

//Si el nombre de usuario y la contraseña introducidas coinciden con los de estas constantes,
//aparecerá el mensaje "Acceso permitido". En caso contrario se escribirá "Acceso denegado".

		Scanner scanner = new Scanner(System.in);

		System.out.println("Inserte el usuario");
		String usuario = scanner.nextLine();

		System.out.println("Inserte la contraseña: ");
		String contrasenya = scanner.nextLine();

		final String NOMBRE_REQUERIDO = "Hola";
		final String PASSWORD_REQUERIDA = "java8";

		if (usuario.equals(NOMBRE_REQUERIDO) && contrasenya.equals(PASSWORD_REQUERIDA)) {

			System.out.println("Acceso permitido");

		} else {

			System.out.println("Acceso denegado");

		}

	}

}