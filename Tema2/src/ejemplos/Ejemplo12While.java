package ejemplos;

import java.util.Scanner;

public class Ejemplo12While {

	public static void main(String[] args) {

		final String PASSWORD_CORRECTO = "1234";

		// Programa que pide al usuario una contraseña. Si se equivoca, se le
		// informa y se le vuelve a preguntar indefinidamente, hasta que acierte.

		Scanner entrada = new Scanner(System.in);

		// Hacemos la pregunta la primera vez, y la repetimos en un bucle a
		// continuación.
		System.out.print("Escribe la contraseña, por favor: ");
		String password = entrada.nextLine();

		// Si no ha escrito bien el password se le va a repetir la pregunta hasta que
		// acierte.
		while (!password.equals(PASSWORD_CORRECTO)) {
			System.out.println("¡Contraseña incorrecta.");
			System.out.print("Escribe la contraseña, por favor: ");
			password = entrada.nextLine();
		}

		System.out.println("¡¡¡Adelante!!!");

	}

}
