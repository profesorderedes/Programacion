package ejemplos;

import java.util.Scanner;

public class Ejemplo13aSemaforos {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.print("Introduce la contraseña: ");
		String password = entrada.nextLine();

		// Variable semáforo. Su valor hará que el bucle se ejecute o no.
		// Inicialmente le damos un valor que hará que el bucle se ejecute.
		boolean denegar = true;

		// Si el password es correcto le damos un valor a denegar que
		// haga que no se ejecute el bucle que viene después.
		if (password.equals("1234")) {
			denegar = false;
		}

		// El valor de la variable semáforo denegar hace que el bucle se ejecute
		// o no.
		while (denegar == true) {

			System.out.println("La contraseña no es correcta.");
			System.out.print("Introduce la contraseña: ");
			password = entrada.nextLine();

			// Si el usuario ha acertado la contraseña por fin, cambiamos el valor
			// de la variable semáforo denegar para hacer que el bucle termine.
			if (password.equals("1234")) {
				denegar = false;
			}
		}

		System.out.println("\nAcceso concedido.");

	}

}
