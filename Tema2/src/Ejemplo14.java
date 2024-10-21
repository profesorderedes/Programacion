import java.util.Scanner;

public class Ejemplo14 {

	public static void main(String[] args) {

		// Programa que va pidiendo contraseñas hasta que el usuario
		// acierte.

		final String CONTRASENYA_BUENA = "java";

		Scanner entrada = new Scanner(System.in);

		// Variable semáforo. Mientras valga true, se ejecutará el bucle.
		// Cuando cambie a false, el bucle terminará.
		boolean incorrecta = true;

		while (incorrecta == true) {

			System.out.print("Password: ");
			String password = entrada.nextLine();

			if (password.equals(CONTRASENYA_BUENA)) {
				incorrecta = false;
			}

		}

		System.out.println("Adelante.");

	}
}
